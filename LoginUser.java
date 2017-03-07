package com.sakha.asgmt;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.Scanner;

public class LoginUser {
	
	
	static ArrayList un=new ArrayList();
	static ArrayList pwd=new ArrayList();
	
	public static void Login() throws ClassNotFoundException, SQLException{
		
		Scanner s=new Scanner(System.in);
		System.out.println("Enter The UserName");
		String a = s.nextLine();
		System.out.println("Enter The Password");
		String b = s.nextLine();
		
		Class.forName("oracle.jdbc.driver.OracleDriver");//load the driver
		Connection con = DriverManager.getConnection("jdbc:oracle:thin:@localhost:1521:xe","hr","hr");
		
		java.sql.Statement s1=con.createStatement();
		ResultSet rs=s1.executeQuery("select * from DB");
        		
		while(rs.next()){
			
			un.add(rs.getString(1));
			pwd.add(rs.getString(2));
			}
		if(un.contains(a)&& pwd.contains(b))
			System.out.println("Login Successfull");
		else
			System.out.println("Please Enter The Valid Crederntails");
		
	}
	public static void main(String[] args) throws ClassNotFoundException, SQLException {
		
		//LoginUser obj1=new LoginUser();
		LoginUser.Login();
	}

}
