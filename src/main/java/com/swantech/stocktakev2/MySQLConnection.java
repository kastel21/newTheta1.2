/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.swantech.stocktakev2;

/**
 *
 * @author theta
 */
import java.sql.*;
public class MySQLConnection {
    
    
    private static Connection conn;
    
    
    public static Connection connect(){
        
    String username="root";
    String password ="ratarata";
    String temp = "jdbc:mysql://10.0.100.190:3306/mainDB";
    
    try{

    Class.forName("com.mysql.jdbc.Driver");
    conn = DriverManager.getConnection(temp,username,password);
    
    return conn;
    
    }catch(Exception e){System.out.println(e.getMessage());
      return null;
      
    }
      }
    
    
    public static boolean isConnected(){
        
        try{
        return !conn.isClosed();
        }catch(SQLException e){
            
            return false;
        
        }
            
    }
}
