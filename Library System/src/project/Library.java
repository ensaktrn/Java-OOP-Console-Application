package project;

import java.util.ArrayList;

public class Library {
	private ArrayList<Book> books;

	
	public Library() {
		this.books =new ArrayList<Book>();
	}

	public ArrayList<Book> getBooks() {
		System.out.println(books);
		return books;
	}

	public void setBooks(ArrayList<Book> books) {
		this.books = books;
	}

	public Book searchBook(String s) {
		for(int i=0;i<this.books.size();i++)			//Search books by looking title
		{
			if(this.books.get(i).getTitle().equalsIgnoreCase(s))
			{
				System.out.println(books.get(i));
				return books.get(i);
			}
			
		}
		System.out.println("The book is not avaible");
		return null;
	}

	
	public void addBook(Book b) { 				//Add books to the library 

		books.add(b);
	}
}

