package unit1;

/**
 * Object book class with constructor and getter and setters.
 */
public class Book {
	
	//attributes
	private String author;
	private String title;
	private String manufacturer;
	private int stock;
	
	//constructor
	public Book(){
		//make a test System.out.println() here. In this way you will understand better how it works
	}
	
	//getters and setters - Please do not worry if you dont understand this part. We will have multiple exercises in which this will be explained in details 
	public String getAuthor(){
		return this.author;
	}
	
	public void setAuthor(String author){
		this.author = author;
	}
	
	public String getTitle(){
		return this.title;
	}
	
	public void setTitle(String title){
		this.title = title;
	}
	
	public String getManufacturer(){
		return this.manufacturer;
	}
	
	public void setManufacturer(String manufacturer){
		this.manufacturer = manufacturer;
	}
	
	public int getStock(){
		return this.stock;
	}
	
	public void setStock(int stock){
		this.stock = stock;
	}
}
