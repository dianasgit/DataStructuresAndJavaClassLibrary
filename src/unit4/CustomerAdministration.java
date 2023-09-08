package unit4;

import arrays_01.Customer;

public class CustomerAdministration {
	
	private Customer[] customer;//Only declaration, no memory reserved at this time
	private CustomerStorage customerStorage;
	
	public CustomerAdministration(){
		//(only) instantiating the array customer with capacity of 42 customers 
//		customer = new Customer[42];
//		System.out.println(customer[0]);
//		System.out.println(customer[41]);
		//System.out.println(customer[42]); //why is there an error here? 
		
		//instantiation combined with initialization 
		customer = new Customer[]{
				new Customer("Ulf", "Koll"),
				new Customer("Ilse", "Stahl"),
				new Customer("Rita", "Kafka")//The capacity is set implicitly by the initialization 
		};//initialization cannot be done later, or on its own. It is done with the instantiation
		
		System.out.println(customer[0]);
		System.out.println(customer[1]);
		System.out.println(customer[2]);
		//System.out.println(customer[3]);
		
		customerStorage =  new CustomerStorage();
	}//constructor
	
	public void updateAllCustomers(){
		for(int index = 0; index < customer.length; index ++){
			if(customer[index] != null){
				customerStorage.update(customer[index]);
			}
		}
	}//updateAllCustomers
	
	public static void main(String[] args) {
		
		CustomerAdministration customerAdministration = new CustomerAdministration();
		customerAdministration.updateAllCustomers();
		

//		
		//This following part is showing you some basics about arrays
//		int[][] matrix =  new int[][] {	{7,3,2},
//										{9,2,7},
//										{0,3,3},
//										{1,0,6}};
//		System.out.println("The matrix.length=" + matrix.length);
//		for(int row = 0; row < matrix.length; row++) {//matrix.length is returning 4 -this is the size of the first dimension
//			for(int col = 0; col < matrix[row].length ; col++){//matrix[row].length will return the length of the array located at position "row" in the first dimension 
//				System.out.println("We are at row=" + row + ",col = " + col + ",value=" + matrix[row][col]);
//			}
//		}
		
		
		//As usual --this is your playground and test area
		
		
		
		
	}//main
	
	

}//class
