package com.simplilearn.lms.Book;

// pojo-- plain java  object Class
public class Book {
	int Bookid;
	String bookname;
	String bookauthor;
	String bookpublication;
	int bookprice;
	String bookisbn;
	
	public Book() {
		// default Constructor
	}

	public Book(int bookid, String bookname, String bookauthor, String bookpublication, int bookprice,
			String bookisbn) {
		super();
		Bookid = bookid;
		this.bookname = bookname;
		this.bookauthor = bookauthor;
		this.bookpublication = bookpublication;
		this.bookprice = bookprice;
		this.bookisbn = bookisbn;
	}

	public int getBookid() {
		return Bookid;
	}

	public void setBookid(int bookid) {
		Bookid = bookid;
	}

	public String getBookname() {
		return bookname;
	}

	public void setBookname(String bookname) {
		this.bookname = bookname;
	}

	public String getBookauthor() {
		return bookauthor;
	}

	public void setBookauthor(String bookauthor) {
		this.bookauthor = bookauthor;
	}

	public String getBookpublication() {
		return bookpublication;
	}

	public void setBookpublication(String bookpublication) {
		this.bookpublication = bookpublication;
	}

	public int getBookprice() {
		return bookprice;
	}

	public void setBookprice(int bookprice) {
		this.bookprice = bookprice;
	}

	public String getBookisbn() {
		return bookisbn;
	}

	public void setBookisbn(String bookisbn) {
		this.bookisbn = bookisbn;
	}

	@Override
	public String toString() {
		return "Book [Bookid=" + Bookid + ", bookname=" + bookname + ", bookauthor=" + bookauthor + ", bookpublication="
				+ bookpublication + ", bookprice=" + bookprice + ", bookisbn=" + bookisbn + "]";
	}
	
}
