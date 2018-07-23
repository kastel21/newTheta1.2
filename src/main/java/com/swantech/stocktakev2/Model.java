/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.swantech.stocktakev2;

import java.net.URL;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.util.ResourceBundle;
import javafx.fxml.Initializable;
import javafx.scene.image.Image;
import java.util.*;
import javafx.scene.Node;
import javafx.scene.control.TreeItem;
import javafx.scene.image.ImageView;

/**
 *
 * @author theta
 */


public class Model implements Initializable {
    
    public  Image folder = new Image(getClass().getResourceAsStream("/img/folder.png"));
    public  Image file = new Image(getClass().getResourceAsStream("/img/index.jpg"));
    
    private Connection con;
    private PreparedStatement ps = null;
    private ResultSet rs;
    
    
    
    
    public Model(){
        con = MySQLConnection.connect();
        
        if(con == null)
            System.exit(1);
     
    }
    
    
    public boolean addUser(String name,String sname,String username,String pass,String gender) throws Exception {
    	
    	String q = "insert into users values(?,?,?,?,?)";
    	ps = con.prepareStatement(q);
    	ps.setString(1, name);
    	ps.setString(2, sname);
    	ps.setString(3, username);
    	ps.setString(4, pass);
    	ps.setString(5, gender);
    	
    	ps.execute();
    	
    	
    	if(isAdded(username))
    		return true;
    	else
    		return false;
    	
    	
    }

	private boolean isAdded(String username)throws Exception {
		// TODO Auto-generated method stub
		
		String q = "select * from users where username = ?";
		ps = con.prepareStatement(q);
		ps.setString(1, username);
		rs = ps.executeQuery();
		
		
		if(rs.next())
			return true;
		else
			return false;
	}
    
	public List<String[]> getAll()throws Exception{
		List<String[]> li = new LinkedList<>();
		
		String q = "select * from users";
		ps = con.prepareStatement(q);
		rs = ps.executeQuery();
		
		while(rs.next()) {
			li.add(new String[] {"name: "+rs.getString(1),"surname: "+rs.getString(2),"username: "+rs.getString(3),"password: "+rs.getString(4),"gender: "+rs.getString(5)});
				
			
		}
		
		
		return li;
	}
        
        
        
        public List<TreeItem<String>> getTreeItems(String parent) {
        
            
            if(parent.equals("Main"))
                parent = "mainTable";
            System.out.println("in get tree items "+ parent);
            


            if(parent.contains(" ")){
                parent = parent.replace(" ","_").toLowerCase();
            }
            
            
            
            String q = "select * from "+parent;
            List<TreeItem<String>> lst = new LinkedList<>();
    	
    	try {
    		System.out.println("after psremt print "+q);
    		ps = con.prepareStatement(q);
    		//ps.setString(1, parent);
    		
    		
    		rs = ps.executeQuery();
    		//rs.next();
    		while (rs.next()) {
                    if(rs.getInt(2)== 1){
                        TreeItem ti = new TreeItem<>(rs.getString(1)+"b",new ImageView(folder));
                        
                        lst.add(ti);
                        
                    }else{
                       
                        lst.add(new TreeItem<>(rs.getString(1)+"l",new ImageView(file)));
                        
                    }
                    //System.out.println(rs.getArray(1));
    		}
                //close();
    		return lst;
    			
    	}catch(Exception e) {
    		System.out.println("era here "+e.getMessage());
    		return null;
    		
    	}
        
        
        }
	
	public void close(){
		
		try {
			
			ps.close();
			con.close();
			
		}catch(Exception e) {System.out.println(e.getMessage());}
		
		
	}
        
        
    public void createTable(String tableName){
        

    }

    @Override
    public void initialize(URL location, ResourceBundle resources) {
         
    }
    
    
    public boolean islogin(String user,String pass) {
    	
    	
    	String q = "select * from users where username = ? and password = ?";
    	
    	
    	try {
    		
    		ps = con.prepareStatement(q);
    		ps.setString(1, user);
    		ps.setString(2, pass);
    		
    		rs = ps.executeQuery();
    		
    		if (rs.next()) {
    			
    			return true;
    		}else return false;
    		
    			
    	}catch(Exception e) {
    		System.out.println(e.getMessage());
    		return false;
    		
    	}
    	
    }
    
    
}
