package project;

import java.util.ArrayList;

public abstract class Type {
	protected ArrayList<Book> listBook;
	public Type(ArrayList<Book> listBook) {	//Adds books by their type
		this.listBook =listBook;
	}

	public ArrayList<Book> getListBook() {	//Lists the books titles of selected type
		for(int i=1;i<listBook.size()+1;i++) {
		System.out.println(i+"."+listBook.get(i-1).getTitle());
			}
		return listBook;
	}


	abstract public void setListBook(ArrayList<Book> listbook); 
	
	abstract public void addBook(Book b);
	
		
}

