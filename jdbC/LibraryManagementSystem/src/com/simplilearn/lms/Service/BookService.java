package com.simplilearn.lms.Service;

import java.sql.*;

import com.simplilearn.lms.Book.Book;
import com.simplilearn.util.jdbcutil;

public class BookService {
	Connection con = null;
	PreparedStatement pstmt = null;
	ResultSet rs = null;	
	String verifyUsers="";

	public String verifyUsers(String user, String password) {
		System.out.println("***************verifying - User****************");
		try {
			 con =jdbcutil.getmysqlConnection();
			pstmt =con.prepareStatement("select * from USER where USER_NAME =? AND USER_PASS = ?");
			pstmt.setString(1, user);
			pstmt.setString(2, password);
			rs=pstmt.executeQuery();
			if (rs.next()) {
				System.out.println("User Logged SuccessFully");
				verifyUsers="User Logged SuccessFully";
			}else {
				System.err.println("Invalid USername Or Password");
				verifyUsers="Invalid USername Or Password";

			}
			
		} catch (Exception e) {
			e.printStackTrace();
		}finally {
			jdbcutil.cleanup(rs, pstmt, con);
		}
		System.out.println("***************END****************");
		return verifyUsers;

	}

	public int addBook(Book book) {
		System.out.println("*************** Adding  - Books ****************");
		int number_of_record =0;

		try {
			con=jdbcutil.getmysqlConnection();
			pstmt =con.prepareStatement("insert into BOOKS values(?,?,?,?,?,?)");
			//int bookid, String bookname, String bookauthor, String bookpublication, int bookprice,String bookisbn
			pstmt.setInt(1, book.getBookid());
			pstmt.setString(2, book.getBookname());
			pstmt.setString(3, book.getBookauthor());
			pstmt.setString(4, book.getBookpublication());
			pstmt.setInt(5, book.getBookprice());
			pstmt.setString(6, book.getBookisbn());
			number_of_record=pstmt.executeUpdate();// it prints the integer value
			
			

		} catch (Exception e) {
			e.printStackTrace();
		} finally {
			jdbcutil.cleanup(pstmt, con);
		}
		System.out.println("***************END****************");
		return number_of_record;
	}

	public Book getBookById(int bookid) {
		System.out.println("***************Start - Get Book by id****************");

		Book book=null;
		try {
			con=jdbcutil.getmysqlConnection();
			pstmt=con.prepareStatement("select * from BOOKS where book_Id=?");
			pstmt.setInt(1,bookid);
			rs=pstmt.executeQuery();
			while(rs.next()) {
				book = new Book();
				book.setBookid(rs.getInt(1));
				book.setBookname(rs.getString(2));
				book.setBookauthor(rs.getString(3));
				book.setBookpublication(rs.getString(4));
				book.setBookprice(rs.getInt(5));
				book.setBookisbn(rs.getString(6));
			}
		} catch (SQLException e) {
			e.printStackTrace();
		}finally {
			jdbcutil.cleanup(rs, pstmt, con);
		}
		System.out.println("***************End****************");

		return book;

		
	}

}
