package com.sakha.asgmt;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import java.util.Scanner;

public class ConnectionManager {

public static void ec() throws ClassNotFoundException, SQLException{
		
		//Load The Driver,establish The Connection To DB
		Class.forName("oracle.jdbc.driver.OracleDriver");//load the driver
		Connection con = DriverManager.getConnection("jdbc:oracle:thin:@localhost:1521:xe","hr","hr");//establish the conn to db
		java.sql.Statement stmt=con.createStatement(); //The object of statement is responsible to execute queries with the database.
		
		Scanner sc=new Scanner(System.in);
		System.out.println("Connected To DB Successfully");
		PreparedStatement ps=con.prepareStatement("insert into DB values(?,?,?)");//used to insert rows in db,? rep no of col
		ps.setString(1,Registration.fn);
		ps.setString(2,Registration.ln);
		ps.setInt(3,Registration.mn);
		int a = ps.executeUpdate();
		if(a==0){
			System.out.println("NotInserted");
		}
		else
		{
			System.out.println("Inserted");
		}
		ps.close();
		con.close();		
	}
		
		//String sql="insert into DB(FIRST_NAME,LAST_NAME,MOBILE_NUMBER) values('Vijay','Rao',9901364326)";
		//stmt.executeUpdate(sql);
		 //System.out.println("Successfully Inserted");
		
		//ResultSet rs=stmt.executeQuery("select * from DB");
		//while(rs.next())
		/*{
			System.out.println(rs.getString("FIRST_NAME")
					+rs.getString("LAST_NAME")+rs.getString("MOBILE_NUMBER"));  
		}
		*/	
		

	
	
	
	
	
	
	
	
	
}
