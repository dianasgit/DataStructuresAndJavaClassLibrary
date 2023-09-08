package unit4;

public class Customer implements Comparable, Cloneable{
//public class Customer implements Comparable<Customer>, Cloneable{
	
	private int customerNumber;
	private String firstName;
	private String name;
	private String sex;
	private String birthdate;
	private int age;
	private Address address;
	private ShoppingCart shoppingCart;
	
	public Customer(String firstName, String name){
		this.firstName = firstName;
		this.name = name;
	}
	
	public Customer(String firstName, String name, String sex, String birthdate, ShoppingCart shoppingCart){
		this.firstName = firstName;
		this.name = name;
		this.sex = sex ;
		this.birthdate = birthdate;
		this.shoppingCart = shoppingCart;
	}
	
	
	public int getCustomerNumber() {
		return customerNumber;
	}



	public void setCustomerNumber(int customerNumber) {
		this.customerNumber = customerNumber;
	}

	public String getFirstName() {
		return firstName;
	}

	public void setFirstName(String firstName) {
		this.firstName = firstName;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getSex() {
		return sex;
	}

	public void setSex(String sex) {
		this.sex = sex;
	}

	public String getBirthdate() {
		return birthdate;
	}

	public void setBirthdate(String birthdate) {
		this.birthdate = birthdate;
	}
	
	public int getAge() {
		return age;
	}


	public void setAge(int age) {
		this.age = age;
	}
	
	public Address getAddress() {
		return address;
	}


	public void setAddress(Address address) {
		this.address = address;
	}
	
	public ShoppingCart getShoppingCart() {
		return shoppingCart;
	}


	public void setShoppingCart(ShoppingCart shoppingCart) {
		this.shoppingCart = shoppingCart;
	}
	
	/* In order to guarantee that we did not forget any of the attributes in the toString method,
	 * go up to the list of attributes and click each of them to get it highlighted
	 * The editor will then show you all occurrences of the corresponding string in the file*/
	public String toString(){
		String customerAsString =
				"Customer object contains following data: " + "\n" +
				"First name:" + firstName + "\n" +
				"Name:"  + name + "\n" +
				"Sex:" + sex + "\n"+
				"Birthdate:" + birthdate ;
		if(this.address != null){
			return customerAsString + this.address.toString();
		}else{
			return customerAsString + "\n No address for this customer yet!!";
		}
				
	}
	
	
//	@Override
//	public boolean equals(Object obj) {
//		if( this == obj) return true;//Is it already the same object?
//		
//		if(obj instanceof Customer){//Check if the transferred object has the expected type 
//			Customer c = (Customer) obj;//Typecast the correct type
//			return customerNumber == c.customerNumber;//Comparison of the relevant attributes(here customer number)
//		}else{
//			return super.equals(obj);//If obj does not have the correct type, call the equals method of the superclass 
//		}
//	}
	
	
	/*Question for students:
	 * In the above implementation the '=='-operator was used
	 * But in the implementation below the equals()-method is used
	 * Please explain why?
	 * Answer: String is a reference type, 
	 * so if we compare this.firstName == c.firstName the result will be FALSE, since they refer to different objects
	 */
	@Override
	public boolean equals(Object obj) {
		if( this == obj) return true;//Is it already the same object?
		
		//Any Object obj of any class can be passed as a parameter, therefore instanceof must be used 
		if(obj instanceof Customer){//Check if the transferred object has the expected type 
			Customer c = (Customer) obj;//Typecast the correct type
			return (this.firstName.equals(c.firstName) 
					&&(this.name.equals(c.name)) 
					&& (this.birthdate.equals(c.birthdate)));//Comparison of the relevant attributes
		}else{
			return super.equals(obj);//If obj does not have the correct type, call the equals method of the superclass 
		}
	}
	
	/*There remain situations where the == operator is not accurate enough
	 * and the equals() method is too complex.
	 * This is the case, for example, when one wants to know if a given object is contained in a very large list.
	 * For such use-cases the hashCode() method of the Object class can be overridden*/
	public int hashCode(){
		String s = name + firstName;//Combine the two Strings into one
		return s.hashCode();//return the hashCode of the obtained String 
	}

	//When we set the parameter  Comparable<Customer>, then we can implement the method with Customer cust
//	@Override
//	public int compareTo(Customer cust) {
//		Customer c = (Customer) cust;
//		
//		//If this.customerNumber < c.customerNumber method returns negative value
//		//If this.customerNumber > c.customerNumber method returns positive value
//		//If this.customerNumber = c.customerNumber method returns zero
//		return this.customerNumber - c.customerNumber;
//	}
	
	//Using compareTo() from the wrapper class
//	@Override
//	public int compareTo(Object obj) {
//		Customer c = (Customer) obj;
//		Integer number = this.customerNumber;
//		return number.compareTo(c.customerNumber);
//	}
	
	//Using lexicographical comparison
	@Override
	public int compareTo(Object obj) {
		Customer c = (Customer) obj;
		if(this.name.equals(c.name)) {//names are equal, compare firstnames
			return this.firstName.compareToIgnoreCase(c.firstName);
		}else{//names are not equal, compare them 
			return this.name.compareToIgnoreCase(c.name);
		}
	}

	
/*Deep and shallow copy example:
 * https://javaconceptoftheday.com/difference-between-shallow-copy-vs-deep-copy-in-java/#:~:text=of%20an%20object.-,To%20create%20the%20deep%20copy%20of%20an%20object%2C%20you%20have,fast%20and%20also%20less%20expensive.
 * */
	
	/* Both shallow copy and deep copy are related to this cloning process. 
	 * The default version of clone() method creates the shallow copy of an object. 
	 * To create the deep copy of an object, you have to override the clone() method. 
	 *
	 *Shallow copy is not 100% disjoint from original object.
	 *Shallow copy is not 100% independent of original object.
	 */
//	@Override
//	public Customer clone(){
//		try {
//			Customer c = (Customer) super.clone();
//			return c;
//		}catch(CloneNotSupportedException ex) {
//			//if the class of the object (in this case Customer) does not implement Cloneable,
//			//this exception will be thrown 
//			System.out.println("That should not have happened!");
//			return null;
//		}
//	}
	
	
	//Shallow Copy -  primitive data-types are passed by value, complex data-types are passed by reference 
//	@Override
//	public Object clone(){
//		try {
//			return super.clone();
//		} catch (CloneNotSupportedException e) {
//			// TODO Auto-generated catch block
//			return null;
//		}
//	}
	
	//Deep Copy
	@Override
	public Object clone(){
		try {
			Customer cust =(Customer) super.clone();
			cust.address = (Address) this.address.clone();
			return cust;
		} catch (CloneNotSupportedException e) {
			return null;
		}
	}
	
	
}
