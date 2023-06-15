package project;
import java.util.Scanner;

public class Main {
	public static Library lib= new Library();
	public static Type child=new ChildBook();
	public static Type novel=new NovelBook();
	public static Type poem=new PoemBook();
	public static Type detective=new DetectiveBook();
	public static Book[] b=new Book[100];
	public static Scanner sc=new Scanner(System.in);
	
	public static void main(String[] args) {
		
		b[0]=new Book("Animal Farm","George Orwell",150,child,true);
	    b[1]=new Book("Olum Sessiz Geldi","Agatha Christie",350,detective,true);
		b[2]=new Book("Harry Potter 1","J.K.Rowling",450,novel,true);
		b[3]=new Book("Harry Potter 2","J.K.Rowling",420,novel,true);
		b[4]=new Book("Goge Bakma Duragi","Turgut Uyar",120,poem,true);
		b[5]=new Book("Sonrasi Kalir","Edip Cansever",80,poem,true);
		b[6]=new Book("Dragon Tattoo Girl","Stieg Larsson",380,detective,true);
		b[0].getType().addBook(b[0]);
		b[1].getType().addBook(b[1]);
		b[2].getType().addBook(b[2]);
		b[3].getType().addBook(b[3]);
		b[4].getType().addBook(b[4]);
		b[5].getType().addBook(b[5]);
		b[6].getType().addBook(b[6]);
		lib.addBook(b[0]);
		lib.addBook(b[1]);
		lib.addBook(b[2]);
		lib.addBook(b[3]);
		lib.addBook(b[4]);
		lib.addBook(b[5]);
		lib.addBook(b[6]);
		book();
	}
	
	public static void book() {
		String mainMenu = ("What do you want to do?\n" +"1.Add Book\n"+"2.List Books\n"+"3.Search Book\n"+"4.Exit");
		System.out.println(mainMenu);
		int choice=sc.nextInt(),i=7;
		
		while(choice!=4) {
			
		switch(choice) {	
		case 1:int a=2;
			while(a==2) {
				System.out.println("Please enter the name of book which you want to add:");
				sc.nextLine();
				String title=sc.nextLine();
				System.out.println("Please enter the name of author:");
				String author = sc.nextLine();
				System.out.println("Please enter the number of pages:");
				int pageCount = sc.nextInt();
				System.out.println("Enter the type: \n 1-Child Book \n 2-Detective Book \n 3-Novel \n 4-Poem");
				int num = sc.nextInt();
				sc.nextLine();
				Type type = null;
				switch (num) {
					case 1:
						type = child;break;
					case 2:
						type = detective;break;
					case 3:
						type = novel;break;
					case 4:
						type = poem;break;
					default:
						System.out.println("Invalid Entry!");
				}
				System.out.println("Is it barrowable?(y/n)");
				char barrow=sc.nextLine().charAt(0);
				boolean status=false;
				if(barrow=='y'||barrow=='Y') {
					status=true;
				}
				b[i] = new Book(title, author, pageCount, type, status);
				System.out.println(b[i].toString());
				System.out.println("Do you approve the informations?(\"1\" for yes/\"2\"for write again)");
				a = sc.nextInt();
				if(a==1){
					System.out.println("The book has been added.");
					lib.addBook(b[i]);
					type.addBook(b[i]);
				}}i++;break;

		case 2:System.out.println("What type of books would you like to see?\n1.Child 2.Detective 3.Novel 4.Poem");
		int ch=sc.nextInt();
		switch(ch) {
		case 1:child.getListBook();break;
		case 2:detective.getListBook();break;
		case 3:novel.getListBook();break;
		case 4:poem.getListBook();break;
		}break;

		case 3:System.out.println("Which book do you want to search?"); 
		sc.nextLine();
		String book=sc.nextLine();
		lib.searchBook(book);break;
		case 4:return;

		default:System.out.println("Please press only 1,2,3 or 4");
		}
		System.out.println(mainMenu);
		choice=sc.nextInt();
	}
}
	}
