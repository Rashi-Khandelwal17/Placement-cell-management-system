/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author Rashi
 */
import java.awt.HeadlessException;
import java.sql.*;
import javax.swing.JOptionPane;


public class javaconnect {
    
    Connection conn=null;
    public static Connection ConnecrDb(){
        try{
            Class.forName("com.mysql.jdbc.Driver");
            Connection conn = DriverManager.getConnection("jdbc:mysql://localhost/placement","rashi","rashi");
            JOptionPane.showMessageDialog(null,"Connection established");
            return conn;
        }
        catch(HeadlessException | ClassNotFoundException | SQLException e){
        
        JOptionPane.showMessageDialog(null,e);
        return null;
        }
    }
}
    
    
    
    
    
    
    
    
    
    
    
    

