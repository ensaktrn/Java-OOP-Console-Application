package project;

public class Book implements IBOOK {

	private String title;
	private String author;
	private int pageCount;
	private Type type;
	private boolean status;


	public Book(String title, String author,int pageCount,Type type,boolean status) {
		this.title = title;
		this.author = author;						//Get informations about the book
		this.pageCount = pageCount;
		this.type = type;
		this.status=status;
	}

	public String getTitle() {
		return title;
	}

	public void setTitle(String title) {
		this.title = title;
	}

	public String getAuthor() {
		return author;
	}

	public void setAuthor(String author) {
		this.author = author;
	}

	public int getPageCount() {
		return pageCount;
	}

	public void setPageCount(int pageCount) {
		this.pageCount = pageCount;
	}
	public Type getType() {
		return type;
	}

	public void setType(Type type) {
		this.type = type;
	}	
	public boolean isStatus() {
		return status;
	}
	public void setStatus(boolean status) {
		this.status = status;
	}
	
	@Override
	public boolean isAvailable() {
		return this.status;
	}


	@Override
	public String toString() {
		return "Title:" + getTitle() + "\nAuthor:" + getAuthor() + "\nPageCount:" + getPageCount()+"\nType:" + getType() + "\nStatus:" + isStatus()+"\n";
	}
	
}
