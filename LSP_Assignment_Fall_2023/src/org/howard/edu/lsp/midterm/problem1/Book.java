package org.howard.edu.lsp.midterm.problem1;

/**
 * 
 * @author Aniya Wilson
 * 
 */
public class Book {
	private String title;
	private String author;
	private int year;
	
	public Book(String title, String author, int year) {
		this.title = title;
		this.author = author;
		this.year = year;
	}
	
	public Book(Book book) {
		this.title = book.title;
		this.author = book.author;
		this.year = book.year;
	}
	
	public boolean equals(Book book2) {		
		if (this.title == book2.title && this.author == book2.author) {
			return true;
		}
		return false;
	}
	
	public String toString() {
		return String.format(this.author) + " " + String.format(this.title)
		+ " " + String.format("%d", this.year);
	}
	
}
