package com.simplilearn.lms.Client;

import com.simplilearn.lms.Book.Book;
import com.simplilearn.lms.Service.BookService;

public class LMS_Client {
	public static void main(String[] args) {
		BookService bookservice = new BookService();

		// 1.verifying the User

//				bookservice.verifyUsers("root", "root12345");

		// 2.Add Book

		
		// int bookid, String bookname, String bookauthor, String bookpublication, intbookprice,String bookisbn
//		Book book = new Book(101, "Head First JAVA,2nd Edition", "Katthy Siera", "O really Media", 1500, "97850");
//		int record =bookservice.addBook(book);
//		if (record>0) {
//			System.out.println("book uploaded successfully");
//		} else {
//			System.err.println("book not uploaded");
//		}

				//3. get book info by id
				int bookid=101;
				Book book =bookservice.getBookById(bookid);
				System.out.println(book);
//				System.out.println("BOOK_ID "+book.getBookid()+"BOOK_NAME"+book.getBookname()+"BOOK_Author"+book.getBookauthor());
				
				//4. Update the database
				//5. get all books
				//6. delete the book
	}
}
	