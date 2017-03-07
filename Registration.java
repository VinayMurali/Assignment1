package com.sakha.asgmt;

import java.sql.SQLException;
import java.util.ArrayList;
import java.util.Scanner;

public class Registration {
	
	
	static String fn,ln;
	static int mn;
	static ArrayList al; 
	public static void main(String[] args) throws ClassNotFoundException, SQLException {
		
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the First Name");
		fn=sc.nextLine();
		String fn= "^[A-Za-z0-9+_.-]+@(.+)$ ";
			if(fn.contains(fn)){
				System.out.println("First Name Can Contain Only String,No Spl Characters,Numbers & Space");
				System.out.println("Enter the First Name");
				fn=sc.nextLine();
		}

		System.out.println("Enter the Last Name");
		ln=sc.nextLine();
		if(ln.contains(" ")){
			System.out.println("First Name Can't Be Blank");
		}
		System.out.println("Enter the  Mobile Number");
		mn=sc.nextInt();
		ConnectionManager cm=new ConnectionManager();
		cm.ec();
		
		al=new ArrayList();
		al.add(fn);
	    al.add(ln);
		al.add(mn);
		System.out.println(al);
	}

	
	
	
	
	
	
	
	
	
	
	
	
	

}
