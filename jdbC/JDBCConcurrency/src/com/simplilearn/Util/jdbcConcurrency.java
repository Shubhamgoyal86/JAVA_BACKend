package com.simplilearn.Util;

import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.Statement;

import com.mysql.cj.protocol.Resultset;

public class jdbcConcurrency {
public static void main(String[] args) {
	try {
		
		Connection con =jdbcutil.getmysqlConnection();
		 Statement stmt =con.createStatement(ResultSet.TYPE_SCROLL_INSENSITIVE,ResultSet.CONCUR_UPDATABLE);
		ResultSet rs= stmt.executeQuery("select * from employees1");
		System.out.println("Before Update***********");
		 while (rs.next()) {
				System.out.println(
						"ID -" + rs.getInt("id")+
						" age -"+ rs.getInt("age")+
						" Name -"+ rs.getString("Name")+
						" City -"+ rs.getString("city")
						);				
			}
		 rs.beforeFirst();
		 System.out.println("Updating the Query");
		 while (rs.next()) {
			int age=rs.getInt("age")+20;
			rs.updateInt("age", age);
			rs.updateRow();
}
		 rs.beforeFirst();
		 System.out.println("After Update*********");
		 while (rs.next()) {
				System.out.println(
						"ID -" + rs.getInt("id")+
						" age -"+ rs.getInt("age")+
						" Name -"+ rs.getString("Name")+
						" City -"+ rs.getString("city")
						);				
			}
		 jdbcutil.cleanup(stmt, con);

		 
		
	}catch (Exception e) {
		e.printStackTrace();	
	}
}
}
