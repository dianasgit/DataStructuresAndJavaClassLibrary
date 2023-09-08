package unit4;


public class Main{
	
//	private Customer[] customer;//Only declaration, no memory reserved at this time
//	private CustomerStorage customerStorage;
//	
////	public CustomerAdministration(){
//		//(only) instantiating the array customer with capacity of 42 customers 
////		customer = new Customer[42];
////		System.out.println(customer[0]); // prints null
////		System.out.println(customer[41]); //will print null because the element was only instantiated but not initialized
//		//System.out.println(customer[42]); //why is there an error here? exceptionOutofBouends
//		
//		//instantiation combined with initialization 
//		customer = new Customer[]{
//				new Customer("Ulf", "Koll"),
//				new Customer("Ilse", "Stahl"),
//				new Customer("Rita", "Kafka")//The capacity is set implicitly by the initialization 
//		};//initialization cannot be done later, or on its own. It is done with the instantiation
//		
//		System.out.println(customer[0]);
//		System.out.println(customer[1]);
//		System.out.println(customer[2]);
//		//System.out.println(customer[3]);
//		
//		customerStorage =  new CustomerStorage();
//	}//constructor
//	
//	public void updateAllCustomers(){
//		for(int index = 0; index < customer.length; index ++){
//			if(customer[index] != null){
//				customerStorage.update(customer[index]);
//			}
//		}
//	}//updateAllCustomers
	
	public static void main(String[] args) {
		
		
		//************************************************************************************
		//there are tree steps to create an array: DECLARING, INSTANTIATION AND INITIALIZATIONS
		//And there are tree ways to create an array.. step by step or concatenation these steps
		
		
		//Option 1
				int intArray1[];    //declaring array = apenas declarar não reserva nenhum espaço de memoria neste momento
				intArray1 = new int[3];  // instantiation - allocating memory to array for 3 elements 
				intArray1[0] = 99;//initialization
				intArray1[1] = 88;//initialization
				intArray1[2] = 77;//initialization
				
				//Option 2
				int[] intArray2 = new int[25]; // combining declaration + instantiation
				
				//Option 3
				int[] intArray3 = {11,22,33};//declaration, instantiation and initialization all at once

				System.out.println("intArray2.length=" + intArray2.length);
				
				//		int intArray4[] = new int[5];
//				System.out.println("TEST=" + intArray4[0] + "|");
				
				/*
				 * For the students:
				 * Please uncomment some lines and see what happens
				 * 
				 * */

				int[] myArray01; //declaration
				myArray01 = new int[5];//instantiation - memory is reserved
				//make a print here , show what is default 	
				myArray01[0] = 4711;//initialization -memory is filled in with content
				myArray01[1] = 4712;
				myArray01[2] = 4713;
				
				//int[] myArray01 = {1,3,5,6,8}; //declaration + instantiation + initialization 
				
				
//				System.out.println("Element on position 0 is:" + myArray01[0] );
//				System.out.println("Element on position 4 is:" + myArray01[4] );
				//System.out.println("Element on position 5 is:" + myArray01[5] );
				
				for(int number : myArray01){ //this is who to ITERATO = who to go trough the elements
					System.out.println("Next numer is:" + number);
				}
				
				//System.out.println("myArray01.length=" + myArray01.length );
				
//				for(int index = 0; index < myArray01.length ; index ++){
//					System.out.println("The element at position " + index + " is " + myArray01[index]);
//				}
				
//				int [] row0 = new int[] {1,2,3};
//				int [] row1 = new int[] {4,5,6};
//				int [] row2 = new int[] {7,8,9};
//				int [][] myArray02 = new int[][] {row0,row1,row2};
				
				int [][] myArray02 = {{1,2,3},
									  {4,5,6},
									  {7,8,9}};
				System.out.println(" myArray02.length =" + myArray02.length);
				System.out.println("myArray02[0].length=" + myArray02[0].length);
			
				//What is printed on the console with this for-loop?
//				System.out.println("First for-loop START");
//				for(int row = 0; row < myArray02.length; row++){ // Stop condition !! 
//					int numerOfColumnsInThisRow = myArray02[row].length;
//					//System.out.println("col=" + col);
//					for(int col = 0; col < numerOfColumnsInThisRow; col++){
//						//System.out.println("row=" + row);
//						if(row == numerOfColumnsInThisRow - 1){
//							System.out.println(myArray02[row][col]);
//						}else{
//							System.out.println(myArray02[row][col] + ",");
//						}
//						
//					}//inner for
//					System.out.println("=======");
//				}//outer for
//				System.out.println("First for-loop END");
				
				System.out.println("Second for-loop START");
				for(int row = 0; row < myArray02.length; row++){ // Stop condition !! 
					int numerOfColumnsInThisRow = myArray02[row].length;
					//System.out.println("col=" + col);
					for(int col = 0; col < numerOfColumnsInThisRow; col++){
						//System.out.println("row=" + row);
						if(col == numerOfColumnsInThisRow - 1){
							System.out.print(myArray02[row][col]);
						}else{
							System.out.print(myArray02[row][col] + ",");
						}
						
					}//inner for
					System.out.println();
				}//outer for
				System.out.println("Second for-loop END");
				
				
				
				//As usual --this is your playground and test area
				
				
				
				

		
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
		
		
		
		
		
			
//		//Option 1 to create an array
//		int intArray1[];    //1º=declaring array
//		intArray1 = new int[3];  // 2º= instantiation - allocating memory to array for 3 elements 
//		intArray1[0] = 99;//3º ... = initialization
//		intArray1[1] = 88;//initialization
//		intArray1[2] = 77;//initialization
//		
//		
//		//Option 2
//		int[] intArray2 = new int[25]; // combining declaration + instantiation
//		
//		
//		//Option 3
//		int[] intArray3 = {11,22,33}; //declaration +instantiation + initialization  all at once
//
//		
//		//  .length é ATRIBUTO. não tem () pois é atributo e não é método pois em array o tamanho do index não muda.
//		System.out.println("intArray2.length=" + intArray2.length);
//		
//		int intArray4[] = new int[5];
//		intArray4 [3] = 10; 
//		System.out.println("TEST=" + intArray4[0] + "|" + intArray4[3]);
//		


/*		int[] myArray01; //declaration
		myArray01 = new int[5];//instantiation - memory is reserved

		for(int i=0 ; i<myArray01.length ; i++) {
			System.out.println(myArray01[i]);
		}
		
		myArray01[0] = 4711;//initialization -memory is filled in with content
		myArray01[1] = 4712;
		myArray01[2] = 4713;

		for(int i=0 ; i<myArray01.length ; i++) {
			System.out.println(myArray01[i]);
		}
*/		
		
		
		
//		int[] myArray01 = {1,2,3,4,5}; //declaration + instantiation + initialization 
//			
//		System.out.println("Element on position 0 is:" + myArray01[0] );
//		System.out.println("Element on position 4 is:" + myArray01[4] );
//		// IT WILL BE AN EXCEPTION OUT OF BOUNDS =
//		//System.out.println("Element on position 5 is:" + myArray01[5] );
//		
//		//******this is who to ITERATE = who to go trough ALL EACH element
//		//extendet for loop means = for each "i" from the myArray01 do the {} in this case, s.o.pln 
//		for(int i : myArray01){ 
//			System.out.println("Next number is:" + i);
//		}
//		
//		System.out.println("myArray01.length=" + myArray01.length );
//		
//		//for loop tradicional
//		for(int index = 0; index < myArray01.length ; index ++){
//			System.out.println("The element at position " + index + " is " + myArray01[index]);
//		}

		
		
	
//		//one bad way to do two-dimentional array is - it works but looks bad
//		int [] row0 = new int[] {1,2,3,4,5};
//		int [] row1 = new int[] {4,5,6};
//		int [] row2 = new int[] {7,8,9};
//		int [][] myArray02 = new int[][] {row0,row1,row2};
//		
//		//aqui perceba a diferença... o tamanho do index do myArray02 é 3 pois só há 3 listas... e as listas podem ter o tamanho que elas quiserem, inclusive serem diferentes umas das outras já que este é um array de listas
//		
//		System.out.println(" myArray02.length =" + myArray02.length);
//		System.out.println("myArray02[0].length=" + myArray02[0].length);
//		
		
		
		//other way to do it - better - pode-se declarar/criar direto sem precisar da palavra new e sem escrever o tabanho dentro de [] - o java já vai contar o tamanho de acordo com a quantidade de elementos inseridos

		//ARRAYS DE DUAS DIMENÇÕES NÃO PRECISAM QUE CADA LINHA TENHO O MESMO TAMANHO*****
		// veja o array de duas dimenções como uma tabela simples X / Y
		//this exemple is a two dimentional array made of 3 1 dimentional arrays.. each elemento if each array will be a diferent memory location
		int [][] myArray021 = {{1,2,3},
							  {4,5,6,7,8,9,8},
							  {7,8,9}};
		System.out.println(" myArray02.length =" + myArray021.length); // print the quantiti of elemts in this array == tree {arrays} inside
		System.out.println("myArray02[0].length=" + myArray021[1].length); // print the quantity of elemens in the first row (element array on index 1)
	
		//What is printed on the console with this for-loop?
		System.out.println("First for-loop START");
		
		for(int row = 0; row < myArray021.length; row++){ // Stop condition !! 
			int numerOfColumnsInThisRow = myArray021[row].length; // this step help to reed each one dimentional array how can have different .length
			// System.out.println("row=" + row);
			
			for(int col = 0; col < numerOfColumnsInThisRow; col++){
				//System.out.println("row=" + row);
				if(row == numerOfColumnsInThisRow - 1){
					System.out.println(myArray021[row][col]); //if this is the last row just print the element
				}else{
					System.out.println(myArray021[row][col] + ","); // if this is not the last row, print the element and comma
				}
				
			}//inner for
			System.out.println("=======");
		}//outer for
		System.out.println("First for-loop END");
		
		
		
		
		System.out.println("Second for-loop START");
		for(int row = 0; row < myArray021.length; row++){ // Stop condition !! 
			int numerOfColumnsInThisRow = myArray021[row].length;
			System.out.println("row=" + row);
			for(int col = 0; col < numerOfColumnsInThisRow; col++){
				if(col == numerOfColumnsInThisRow - 1){
					System.out.print(myArray021[row][col]);  // just to print the last without comma
				}else{
					System.out.print(myArray021[row][col] + ","); // just pri print with comma
				}
			}//inner for
		System.out.println();
		}//outer for
		System.out.println("Second for-loop END");

		
	}//main
}//class