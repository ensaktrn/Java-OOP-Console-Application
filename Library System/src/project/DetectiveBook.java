package project;

import java.util.ArrayList;

public class DetectiveBook extends Type{

	public DetectiveBook() {
		super(new ArrayList<Book>());
	}
	@Override
	public void setListBook(ArrayList<Book> listBook) {
		this.listBook = listBook;
	}
	@Override
	public  void addBook(Book b) {
		this.listBook.add(b);	
	}

	
}
