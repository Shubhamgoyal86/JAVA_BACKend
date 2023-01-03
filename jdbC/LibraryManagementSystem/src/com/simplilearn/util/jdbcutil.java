package com.simplilearn.util;
import java.sql.*;
public class jdbcutil {
static {
	try {
		Class.forName("com.mysql.cj.jdbc.Driver");
				
	}catch(Exception e) {
		e.printStackTrace();
	}
}
public static Connection getmysqlConnection() throws SQLException{
	Connection con = DriverManager.getConnection("jdbc:mysql://localhost:3306/simplilearn","root","root12345");
	return con;
}
public static void cleanup(Statement st,Connection con) {
	try {
		if(st!=null)
			st.close();
		if(con!= null)
			con.close();
	}catch(Exception e) {
		e.printStackTrace();
	}
}
public static void cleanup(ResultSet rs,Statement st,Connection con) {
	try {
		if(rs!=null)
			rs.close();
		if(st!=null)
			st.close();
		if(con!= null)
			con.close();
	}catch(Exception e) {
		e.printStackTrace();
	}
}

}
