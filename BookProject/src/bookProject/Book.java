package bookProject;

import java.io.Serializable;

public class Book implements Serializable
{
    private String bookTitle;
    private String bookAuthor;
    private int booId;
    private int bookCost;
    private int noOfPages;
    
    public Book() {}

	public Book(String bookTitle, String bookAuthor, int booId, int bookCost, int noOfPages) {
		this.bookTitle = bookTitle;
		this.bookAuthor = bookAuthor;
		this.booId = booId;
		this.bookCost = bookCost;
		this.noOfPages = noOfPages;
	}

	public String getBookTitle() {
		return bookTitle;
	}

	public void setBookTitle(String bookTitle) {
		this.bookTitle = bookTitle;
	}

	public String getBookAuthor() {
		return bookAuthor;
	}

	public void setBookAuthor(String bookAuthor) {
		this.bookAuthor = bookAuthor;
	}

	public int getBooId() {
		return booId;
	}

	public void setBooId(int booId) {
		this.booId = booId;
	}

	public int getBookCost() {
		return bookCost;
	}

	public void setBookCost(int bookCost) {
		this.bookCost = bookCost;
	}

	public int getNoOfPages() {
		return noOfPages;
	}

	public void setNoOfPages(int noOfPages) {
		this.noOfPages = noOfPages;
	}
    
    public void display()
    {
    	System.out.println("Book Title: "+getBookTitle());
    	System.out.println("Book Author: "+getBookAuthor());
    	System.out.println("Book bookId: "+getBooId());
    	System.out.println("Book Cost: "+getBookCost());
    	System.out.println("Book noOfPages: "+getNoOfPages());
    	
    }

    @Override
	public String toString()
	{
		return "\n name of the title:"+getBookTitle()+
			   "\n name of the author:"+getBookAuthor()+
			   "\n name of the cost:"+getBookCost()+
			   "\n name of the getnoofpages:"+getNoOfPages()+
			   "\n name of the id:"+getBooId();
	}
    
    
}
