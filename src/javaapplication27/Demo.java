/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package javaapplication27;

/**
 *
 * @author Moazam
 */
/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author Moazam
 */
import java.sql.*;
import java.util.*;

class Demo
{
	public static void main(String args[])
	{
		System.out.println("Hello");
		try {
    
    			Class.forName("com.mysql.jdbc.Driver");  
    			Connection con=DriverManager.getConnection("jdbc:mysql://localhost:3306/new_data","root",""); 
    		Statement stmt=con.createStatement();  
    
  		String sql=("INSERT INTO customer( cname, phno, place) VALUES ('moazam','999990000','pune')");

		stmt.execute(sql);
		stmt.close();
		con.close();
                System.out.println("record inserted successfully");
		
  }
  catch(Exception e){ e.printStackTrace();
  System.out.println(e);
  
  }  


	}

}
