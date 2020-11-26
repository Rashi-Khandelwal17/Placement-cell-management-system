/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package admin01;

import java.awt.HeadlessException;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import javax.swing.JOptionPane;

/**
 *
 * @author Rashi
 */
class javaconnect {
     Connection conn=null;
    public static Connection ConnecrDb(){
        try{
            Class.forName("com.mysql.jdbc.Driver");
            Connection conn = DriverManager.getConnection("jdbc:mysql://localhost/placement","rashi","rashi");
           // JOptionPane.showMessageDialog(null,"Connection established");
            return conn;
        }
        catch(HeadlessException | ClassNotFoundException | SQLException e){
        
        JOptionPane.showMessageDialog(null,e);
        return null;
        }
    }
}
