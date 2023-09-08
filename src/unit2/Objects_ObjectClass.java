package unit2;

import unit2.Address;
import unit2.Customer;
import unit2.ShoppingBasket;

/**
 * This class propose the study of the <code>OBJECT CLASS </code> from java.. all java classes implicitly inherit their fields and methods. The Object class defines some useful methods, as: <code> String toString() , Boolean equals(Objectobj) , int hashCode() , Object clone(). </code> These methods can be overwritten as needed.
 * 
 * @author dianasgit
 * @version 1.0
 *
 */
public class Objects_ObjectClass {

	public static void main(String[] args) {


		//new object of the type Customer FOT TEST
		Customer customer1 = new Customer("Carl" , "Marx" , "x " , " 13.10.1986" );
			
		
		/**
		 * A bad way to get de description of the object is concatenating strings manually as follows
		 * BUT you will nees to make it all times... so do do it. 
		 */
		System.out.println("This description is make manually step by step in a bad way. \n This Object costumer was created with the following data: \n" + 
		 "First name: " + customer1.getFirstName() + " | " +
		 "Surname: " + customer1.getName() + " | " +
		 "Gender: " + customer1.getSex() + " | " +
		 "Birthdate: " + customer1.getBirthdate() + ". \n" +
		 "*** END of the manually gerated description **** \n");
		
		System.out.println("\n\n=================================================================");
		
		
		//new object for testing the toString method
		Object myObject_01 =  new Customer("Ralf" , "Hermann" , "m" , "15.05.1978");
		
		
		//Customer myObject_01 =  new Customer("Ralf" , "Hermann" , "m" , "15.05.1978");
		
		System.out.println("Explicit call = S.O.PLN(myObject_01.toString()) :\n" + myObject_01.toString());//explicit call of the toString()-method
		
		System.out.println("\n\n=================================================================");
		
		System.out.println("Implicit call = S.O.PLN(myObject_01): \n" + myObject_01);//implicit call of the toString() method 
		
		
		System.out.println("\n implicit: " + customer1);
		
		System.out.println("\n explicit: " + customer1.toString());

		System.out.println("\n\n=================================================================");
		
//************************************************************************************************************
//*******************************************************************************************************		
		
		/**
		 * COMPARISSION WITH ==
		 * only works to compare if the objects are both in the same identity/memory area
		 * @return customer1 == myObject_01
		 */
		System.out.println(customer1 == myObject_01);
		//PRINT FALSE BECAUSE THEY ARE NOT IN THE SAME MEMORY AREA NOR HAS THE SAME IDENTITY.
				
		int num01 = 5;
		int num02 = 5;
		if(num01 == num02){
			System.out.println("num01 é 5 == num02 é 5 delivered TRUE because they have the same memory location");
		}else{
			System.out.println("num01 == num02 delivered FALSE because they have different memory location");
		}
		
		float myFloat01 = 3.33f;
		float myFloat02 = myFloat01;
		myFloat01 = 0.33f;
		
		if(myFloat01 == myFloat02){
			System.out.println("\n myFloat01 == myFloat02 delivered TRUE because they have the same memory location");
		}else{
			System.out.println("\n myFloat01 == myFloat02 delivered FALSE because they have different memory location");
		}
		
		
		
		System.out.println("\n\n=================================================================");
		
		
		String str1 = new String("Hello ***************** * * ** * ** ");
		String str2 = new String("Hello ***************** * * ** * ** ");
		String str33 = str2;
		
		String str4 = "Hello ***************** * * ** * ** ";
		String str5 = "Hello ***************** * * ** * ** ";
		String str6 = str5;
		
		if (str1 == str2) {
		  System.out.println("str1 is a object created with an 'new String()' and has the SAME reference as str2 also created with an 'new String(). SO THE == IS TRUE " );
		}
		else {
		  System.out.println("str1 is a object created with an 'new String()' and has the DIFFERENT reference as str2 also created with an 'new String()' =  THE == IS FALSE. AND IF Both objects has the same value writen inside, as they are objects the system DO NOT alocate both in the same memory location, so the == still FALSE ");
		}
		
		if (str33 == str2) {
		  System.out.println("str33 is a object created with an 'new String()' and has the SAME reference as str2 also created with an 'new String()'= SO THE == IS TRUE " );
		}
		else {
		  System.out.println("str33 is a object created with an 'new String()' and has a DIFFERENT reference of str2 also created with an 'new String()' = SO THE == IS FALSE ");
		}
		
		System.out.println("\n\n=================================================================");

		if (str4 == str5) {
		  System.out.println("str4 is a simple var of the type STRING.... It is not an object. It is a VAR created alone. str5 is also an idependent var of type String. In this case STR4 and STR5 has the exact same value write, and the system alocated both in the same memory area to facilitate. SO IN THIS CASE STR4 HAS THE SAME REFERENCE THEN STR5, SO == IS TRUE");
		}
		else {
		  System.out.println("str4 has DIFFERENT reference than str5");
		}
		
		if (str6 == str5) {
		  System.out.println("str6 has the SAME reference as str5");
		}
		else {
		  System.out.println("str6 has DIFFERENT reference than  str5");
		}

		
		System.out.println("\n\n=================================================================");

		
		
		/**
		 * COMPARISSION WITH <code> equals() </code> method
		 * only works to compare if the objects are both in the same identity/memory area
		 * @return customer1 == myObject_01
		 */
		if(str1.equals(str2)){
			 System.out.println("str1 has the SAME content as str2");
		}else {
			 System.out.println("str1 has DIFFERENT content than str2");
		}
	
		
		ShoppingBasket w1 = new ShoppingBasket(2, 126.98d, true);
		ShoppingBasket w2 = new ShoppingBasket(5, 754.97d, false);
		ShoppingBasket w3 = new ShoppingBasket(5, 754.97d, false);
		ShoppingBasket w4 = w3;//w4 refers to the same area of the memory where w3 is stored.

/* With the '=='-operator the objects are compared in terms of their identity, 
 * not their content*/

		System.out.println("Comparison w1 == w2 is evaluated to :" + (w1 == w2)); //false
		System.out.println("Comparison w2 == w3 is evaluated to :" + (w2 == w3)); //false
		System.out.println("Comparison w3 == w4 is evaluated to :" + (w3 == w4)); //true
		System.out.println("Comparison w2 == w4 is evaluated to :" + (w2 == w4)); //false
		
		
		System.out.println("\n\n=================================================================");


		/*
		 * Since w3 and w4 refer(point) to the same object, every change to w3 will also change w4, 
		 * and every change of w4 will change w3.
		 * Here are some examples of this behavior
		 */
		w3.setNumberProducts(18);
		System.out.println("Printing w3:" + w3.toString());
		System.out.println("Printing w4:" + w4.toString());
		
		w4.setNumberProducts(9);
		System.out.println("Printing w4:" + w4.toString());
		System.out.println("Printing w3:" + w3.toString());
		
		
		/* how can you make w4 NOT to refer to w3?
		 * In other words: the values contained in the object w3 to be the same as the values contained in w4
		 * but the  (w3 == w4)-comparison to return false?*/
		
		System.out.println("Comparison w3 == w4 is evaluated to :" + (w3 == w4));//make this to return false 
		
		
		
		System.out.println("\n\n================================================================="
				+ "\n Comparison with the OVERRIDED equals()");


		/*--------------------Customer comparison--------------------------*/
		System.out.println("Customer comparison START");
		Customer cust01 =  new Customer("Paul", "Walker", "Male","01.Jan.1991");
		Customer cust02 =  new Customer("Jane", "Stone", "Female","01.Feb.1991");
		Customer cust03 = cust01;
		Customer cust04 = new Customer("Jane", "Stone", "Female","01.Feb.1991");
		
//		cust01.setCustomerNumber(555);
//		cust02.setCustomerNumber(555);
		
		System.out.println("Comparison cust01 == cust02 result is:" + (cust01 == cust02));
		System.out.println("Comparison cust01.equals(cust02) result is:" + cust01.equals(cust02) + " - if true means that they have the exactly same content");
		
		System.out.println("\n\n");
		System.out.println("Comparison cust02 == cust04 result is:" + (cust02 == cust04));
		System.out.println("Comparison cust02.equals(cust04) result is:" + cust02.equals(cust04) + " - if true means that they have the exactly same content");
		System.out.println("\n\n");
		
		System.out.println("Customer comparison END");
	

		
		System.out.println("\n\n=================================================================");
		System.out.println("\n\n============== hashCode() KEY METHOD ==================="
				+ "\n This method returns a KEY that identifies objects uniquely based on its content!. "
				+ "Java has a base formula to calculate this key, but you can override you own. BUT to override make sure your formula meets the following rules: STABLE identical contente make identical key + the calculation MUST MATH (INCLUDE THE SAME ATTIBUTES) of the method EQUALS() + to avoid error generate ir with you IDE - Source menu on eclipse.\n");

		str1 = new String("Hello");
		str2 = new String("Hello");
		
		int hashCode01 = str1.hashCode();
		int hashCode02 = str2.hashCode();
		
		System.out.println("hashCode01=" + hashCode01);
		System.out.println("hashCode02=" + hashCode02 + "   - IDENTICAL HASH CODE BECAUSE THE CONTENT IS IDENTICAL EVEN IF THEY ARE DIFERRENT OBJECTS IN DIFERENT MEMORY LOCATION \n");

		
		
		ShoppingBasket basket01 = new ShoppingBasket(22, 45.09, true);
		ShoppingBasket basket02 = new ShoppingBasket(22, 45.09, true);
		
		int hash_c1 = basket01.hashCode();
		int hash_c2 = basket02.hashCode();
		
		System.out.println("hash_c1=" + hash_c1);
		System.out.println("hash_c2=" + hash_c2 + "   - identical hashCode even if they are diferent objects and memory location... is equal because the equal() is true.. ALL parameter are equal \n");
		
		/*
		 * Question for student:
		 * What is the result displayed on the console?
		 * Is it what you expected?
		 * If yes - change something, check the result
		 * If not - what do you have to change in this program, 
		 * in order to get the behavior which you are expecting?
		 * */
				
		String test01 = "Test" ;
		String test02 = "test" ;
		
		System.out.println("test01.hashCode()=" + test01.hashCode());
		System.out.println("test02.hashCode()=" + test02.hashCode() + "  in this case only one diferent uppercase letter");
		
		//Java bitwise operators - read the explanation in ShoppingBasket 
		int a = 60;
		int b = a >>> 2;
		System.out.println("\n b=" + b);
		
		
		
		System.out.println("\n\ncust01.hashCode()=" + cust01.hashCode());
		System.out.println("cust01.hashCode()=" + cust01);
		

		
		
		System.out.println("\n\n==============THE INTERFACE COMPARABLE AND =====================");
		System.out.println("\n====== THE  compareTo(Object obj) METHOD  - INT order of objects ========");
		

		String str03 = "a";
		String str04 = "A";
		
		int comparisonResult_IgnoreCase = str03.compareToIgnoreCase(str04);
		System.out.println("comparisonResult_IgnoreCase=" + str03.compareToIgnoreCase(str04));
		
				if(comparisonResult_IgnoreCase == 0){
					System.out.println("The Strings are lexicographically equal");
				}else if(comparisonResult_IgnoreCase < 0){
					System.out.println("str03 is lexicographically before str04");
				}else if(comparisonResult_IgnoreCase > 0){
					System.out.println("str04 is lexicographically before str03");
				}

		
		String myStr01 = "A";
		String myStr02 = "B";
		String myStr03 = "a";
		
		System.out.println("Comparison myStr01.compareTo(myStr02)=" + myStr01.compareTo(myStr02)); //myStr01 is before myStr02 in the alphabet
		System.out.println("Comparison myStr02.compareTo(myStr01)=" + myStr02.compareTo(myStr01)); //myStr02 is after myStr01 in the alphabet 
		System.out.println("Comparison myStr01.compareTo(myStr03)=" + myStr01.compareTo(myStr03)); //myStr01 is before myStr03 in the alphabet
		//Capital letters come lexicographically before small letters
		


//		String test = "Test";
//		int comparisonResult_Test = cust01.compareTo(test);
//		System.out.println("comparisonResult_Test=" + comparisonResult_Test);
		//Discussing the tip on page 37
//		try{
//			int comparisonResult_Test = cust01.compareTo(test);
//			System.out.println("comparisonResult_Test=" + comparisonResult_Test);
//		}catch(ClassCastException exc){
//			System.out.println("There was a ClassCastException! The exception message is:" + exc.getMessage());
//		}
		
		
		System.out.println("\n\n================== CLONING OBJECTS  ======================");
		System.out.println("\n====== COPY CONSTRUCTOR  --- AND OVERRIDE clone()   ========");
		
		/**
		 * CALL BY VALUE == DEEP COPY == override clone() = if a local primitive datatypes are used as param of a method, dis method manipulate this data in a new memory location, so the local data do not change inside the method work. 
		 * 
		 * CALL BY REFERENCE == SHALLOW CPY == DEFAULT USE OF clone() : if an object is manipulated as a method param, the param manipulated inside the method IS a reference to the original memory location, so, manipulations within the method will affect the object itself.
		 * 
		 * Cloning objects involves a great effort just use if absolutelly necessary, not as a safety backup
		 * 
		*/
		
		System.out.println(" to use the method clone() this method must be override for PUBLIC (the original is protected). AND the method only works if the class to be cloned implements the CLONABLE INFERFACE in the class declaration... if it is not implemented will throws a CloneNotSupportedException. (ex: public class Customer implements Clonable{... ) .. implement it in the class you override the method... not necessary implement in the main for ex. "
				+ "\n ****THE DEFAULT VERSION OF CLONE() MAKE A SHALLOW COPY****"
				+ "\n it means, if you do not override the copy will only copy the reference... so changes in the param or in the copy WILL CHANGE THE ORIGINAL version."
				+ "\n\n ***THE OVERRIDE CLONE() WILL MAKE A DEEP COPY*****"
				+ "\n it means a new memory location. like a real copy/past. ");
		
		/*
		 * For the students:
		 * Please make sure you understand these examples very well.
		 * It is very important for your future work to know the difference between deep-copy and shallow-copy
		 * */
		
		
		Customer cust011 =  new Customer("Paul", "Walker", "Male","01.Jan.1991");
		Customer cust021 =  new Customer("Jane", "Stone", "Male","01.Feb.1991");
		
		Address addr01 = new Address(45468, "Muelheim", "Ulrichstrasse", 2);
		Address addr02 = new Address(45468, "Muelheim", "Ulrichstrasse", 2);
		
		cust011.setAddress(addr01);
		cust021.setAddress(addr02);
		
//		System.out.println("\ncust01=\n" + cust01.toString());
//		System.out.println("\ncust02=\n" + cust02.toString());
		
		Customer cust031 = cust021;
		//System.out.println("\ncust03=\n" + cust03.toString());
		
		cust031.setBirthdate("01.Jan.2000");
//		System.out.println("\ncust02=\n" + cust02.toString());
//		System.out.println("\ncust03=\n" + cust03.toString());
		
		/*------------------------------------------------------------------------------------*/
		Customer cust041 = (Customer)cust031.clone();//creates a shallow copy, exchange implementation -deep copy
		
		cust041.setBirthdate("12.April.1995");
		System.out.println("\ncust02=\n" + cust021.toString());//Is cust02.birthday affected? 
		System.out.println("\ncust03=\n" + cust031.toString());//Is cust03.birthday affected? 
		System.out.println("\ncust04=\n" + cust041.toString());
		
		cust041.getAddress().setHouseNumber(99);//
		System.out.println("###################################################");
		System.out.println("After chnaging the address");
		System.out.println("\ncust02=\n" + cust021.toString());//
		System.out.println("\ncust03=\n" + cust031.toString());
		System.out.println("\ncust04=\n" + cust041.toString());
		

		
		
	}
}