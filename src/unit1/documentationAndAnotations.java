package unit1;

/**
 * This class is the introduction point to the program.
 * 
 * It contains the <code>main</code> method, which is used for 
 * starting the program. The <code>main</code> method creates 
 * automatically all necessary objects and executes all tasks
 * 
 * @author Dianasgit
 * @version 1.0
 * */

public class documentationAndAnotations {

	/**
	 * The used OnlineShop
	 */
	public OnlineShop onlineShop = null;

	/**
	 * Creates a new book and informs the
	 * administration objects.
	 * 
	 * @param author Name of Authors of the new book
	 * @param title Title of the new book
	 * @param manufacturer Manufacturer of the new book
	 * @param stock Quantity of the new book
	 * 
	 * @return new book instance
	 * 
	 * @throws RuntimeException if updating stocks fails
	 */
	public static Book newBook(String author, String title, String manufacturer, int stock){
		Book newBookToBeCreated = new Book();
		newBookToBeCreated.setAuthor(author);
		newBookToBeCreated.setTitle(title);
		newBookToBeCreated.setManufacturer(manufacturer);
		newBookToBeCreated.setStock(stock);
		
		return newBookToBeCreated;
	}
	
	
	/*The execution of the program starts here*/
	public static void main(String[] args) {
		//here is your play area. Create Books, add them to the OnlineShop, get an item at specific index
		
		//You can use the static method newBook() from this class :
		String author_01 = "John Doe 01";
		String title_01 = "Great book 01";
		String manufacturer_01 = " Publishing house 01";
		
		String author_02 = "John Doe 02";
		String title_02 = "Great book 02";
		String manufacturer_02 = " Publishing house 02";
		
		String author_03 = "John Doe 03";
		String title_03 = "Great book 03";
		String manufacturer_03 = " Publishing house 03";
		
		String author_04 = "John Doe 04";
		String title_04 = "Great book 04";
		String manufacturer_04 = " Publishing house 04";
		
		Book book_01 = newBook(author_01,title_01,manufacturer_01, 11);
		Book book_02 = newBook(author_02,title_02,manufacturer_02, 22);
		Book book_03 = newBook(author_03,title_03,manufacturer_03, 33);
		Book book_04 = newBook(author_04,title_04,manufacturer_04, 44);
		
		
		
		OnlineShop myOnlineShop = new OnlineShop();
		myOnlineShop.addProduct(book_01);
		myOnlineShop.addProduct(book_02);
		myOnlineShop.addProduct(book_03);
		myOnlineShop.addProduct(book_04);
		
		//You can use the constructor from the class Book:
		Book book_05 = new Book();
		book_05.setAuthor("Author 05");
		book_05.setTitle("Great book 05");
		book_05.setManufacturer("Unknown");
		book_05.setStock(55);
		
		//Exercise for the students- try to display some of the books at the console
		
		
		/**
		 * Test method - just print some stuff
		 */
		System.out.println("Autor: "+ book_05.getAuthor() + " | Quantidade em estoque: " +  book_05.getStock()); //What should you do here?
		
		
		
	}//main
}