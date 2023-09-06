package unit1;

import java.util.ArrayList;

/**
 * Object onlineShop and its methods and ArrayLists
 * 
 * */
public class OnlineShop {	
	
	/*
	 * This is an attribute comment
	 * 
	 * */
	private ArrayList<Book> availableBooks;
	
	//constructor
	public OnlineShop(){
		//make a test System.out.println() here. In this way you will understand better how it works
		this.availableBooks = new ArrayList<Book>();
	}
	
	//methods
	public void addProduct(Book book){
		this.availableBooks.add(book);
	}
	
	/*
	 * This is a method comment
	 * @param indexOfBook  
	 * */
	public Book getBookAtIndex(int indexOfBook){
		Book bookToReturn = this.availableBooks.get(indexOfBook);
		return bookToReturn;
	}
}
