package bookProject;

import java.util.Scanner;

public class BookMainClass 
{
  public static void main(String[] args) 
  {
	Scanner sc=new Scanner(System.in);
	Library l=new Library();
	boolean start=true;
	while(start)
	{
	 System.out.println("press 1 adding book");
	 System.out.println("press 2 show book");
	 System.out.println("press 3 search book by id");
	 System.out.println("press 4 search book by author");
	 System.out.println("press 5 update");
	 System.out.println("press 6 remove");
	 System.out.println("press7  exit");
	 
	  int ch=sc.nextInt();
	  
	  switch (ch)
	  {
	    case 1:
	    {
	  
		  System.out.println("enter the title of book");
		  String title=sc.next();
		  System.out.println("enter the author of book");
		  String author=sc.next();
		  System.out.println("enter the cost");
		  int cost=sc.nextInt();
		  System.out.println("enter the no of pages");
		  int pages=sc.nextInt();
		  System.out.println("enter the id of book");
		int id=sc.nextInt();
	      l.addBook(new Book( title, author, cost, pages, id));
	  break;
	    }
	  
	  case 2:{
	  
		  l.showBook();
		  break;
	  }  
	  case 3:
	  {
		  System.out.println("enter the id");
		  int id=sc.nextInt();
		  l.searchBookById(id);
		  break;
	 
	  }
	  case 4:
	  {
		  System.out.println("enter title");
		  String s=sc.next();
		  l.searchBookByAuthor(s);
		  break;
	  }
	  case 5:
	  {
		  System.out.println("Enter the Title");
		  String title=sc.next();
		  System.out.println("Enter the Cost");
		  int Cost = sc.nextInt();
		  l.updateBookCost(title, Cost);
		  break;
	  }
	  case 6:
	  {
		  System.out.println("Enter the Author: ");
		  int id = sc.nextInt();
		  l.removeBook(id);
		  break;
	  }
	  case 7:
	  {
		  System.out.println("Thank You");
	  }
	}
   }
 }
}
