package com.swantech.stocktakev2;

import java.io.PrintStream;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;






public class MySQLConnection
{
  private static Connection conn;
  
  public MySQLConnection() {}
  
  public static Connection connect()
  {
    String username = "root";
    String password = "ratarata";
    String temp = "jdbc:mysql://10.0.100.114:3306/mainDB";
    
    try
    {
      Class.forName("com.mysql.jdbc.Driver");
      conn = DriverManager.getConnection(temp, username, password);
      
      return conn;
    } catch (Exception e) {
      System.out.println(e.getMessage()); }
    return null;
  }
  


  public static boolean isConnected()
  {
    try
    {
      return !conn.isClosed();
    }
    catch (SQLException e) {}
    return false;
  }
}
