package bookProject;

import java.util.ArrayList;
import java.util.Iterator;

public class Library 
{
     private Book b;
     ArrayList<Book> book = new ArrayList<Book>();
     
     public void addBook(Book b)
     {
    	 book.add(b);
    	 System.out.println(b.getBookTitle()+" book is added");
     }
     
     public void showBook()
     {
    	 b.display();
     }
     
     public void searchBookById(int bookId)
     {
    	boolean isBookId = false;
    	if(book.isEmpty())
    	{
    		System.out.println("No Book is added");
    	}
    	else
    	{
    		for(Book b:book)
    		{
    			if(b.getBooId()==bookId)
    			{
    				System.out.println(b.getBookTitle()+" book is found");
    				isBookId=true;
    			}
    		}
    	}
    	if(isBookId!=true)
    		System.out.println("The BookId is invalid ");
     }
     public void searchBookByAuthor(String author)
     {
    	boolean isBookAuthor = false;
    	if(book.isEmpty())
    	{
    		System.out.println("No Book is added");
    	}
    	else
    	{
    		for(Book b:book)
    		{
    			if(b.getBookAuthor()==author)
    			{
    				System.out.println(b.getBookTitle()+" book is found");
    				isBookAuthor=true;
    			}
    		}
    	}
    	if(isBookAuthor!=true)
    		System.out.println("The BookAuthor is invalid ");
     } 
     
     public void updateBookCost(String title,int newCost)
     {
    	 boolean isBookTitle = false;
     	if(book.isEmpty())
     	{
     		System.out.println("No Book is added");
     	}
     	else
     	{
     		for(Book b:book)
     		{
     			if(b.getBookTitle().equalsIgnoreCase(title))
     			{
     				b.setBookCost(newCost);
     				System.out.println(b.getBookTitle()+" book new cost is "+b.getBookCost());
     				isBookTitle=true;
     			}
     		}
     	}
     	if(isBookTitle!=true)
     		System.out.println("The BookTitle is invalid ");
     }
     public void removeBook(int bookId)
     {
    	 Iterator <Book> itr= book. iterator();
    	 boolean isRemoved=false;
    	 while(itr.hasNext())
    	 {
    		 Book str=itr.next();
    		 if (b.getBooId()==bookId)
    		 {
    			 itr.remove(); 
    			 isRemoved=true;
    			 
    		 }	
    		
    	 }
    	 if(isRemoved=false) 
    		 System.out.println("The BookId is Invalid");
    }
     
}
