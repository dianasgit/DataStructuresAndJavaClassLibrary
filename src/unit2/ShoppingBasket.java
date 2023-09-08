package unit2;


public class ShoppingBasket {
	
	private int numberProducts;
	private double productsSum;
	private boolean voucherHonored;
	
	
	/**
	 * OBJECT ShoppingBasket CONSTRUCTOR.
	 * @param numberOfProducts int total of objects in the basket
	 * @param productsSum double total price of the basket
	 * @param voucherHonored  boolean
	 * 
	 * This params are passed as this to local variables with the same name
	 */
	public ShoppingBasket(int numberOfProducts, double productsSum, boolean voucherHonored){
		this.numberProducts = numberOfProducts;
		this.productsSum = productsSum;
		this.voucherHonored = voucherHonored;
	}

	public int getNumberProducts() {
		return numberProducts;
	}
	public void setNumberProducts(int numberProducts) {
		this.numberProducts = numberProducts;
	}
	public double getProductsSum() {
		return productsSum;
	}
	public void setProductsSum(double productsSum) {
		this.productsSum = productsSum;
	}
	public boolean isVoucherHonored() {
		return voucherHonored;
	}
	public void setVoucherHonored(boolean voucherHonored) {
		this.voucherHonored = voucherHonored;
	}

	
	@Override
	public String toString() {
		return "This basket contains:\n" +
				"numberProducts=" + numberProducts + "\n" + 
				"productsSum=" + productsSum + "\n" + 
				"voucherHonored=" + voucherHonored + "\n";
	}

		/**equals methos is used to COMPARE THE CONTENT. It is inherited from the class object and MUST be override in the local class. It is a slow method, so to make it faster inside the scope implement this: 
		 * FIRST IF compare with the == because the equal() itsel is slow, and the == not 
		 * and if the == is true que equals() is obviously also true
		 * SECOND IF verify if the *instanceof* (they are objects of the same class) IS TRUE. 
		 * if the instanceof aplies use the == OR the equals() method to compare each param of the objects (the == is faster)  combined with && in the logic. here compare the relevant attributes for your project
		 * ELSE write directly the equals metrod like:
		 * return super.equals(obj);
		 * 
		 * The equals method developed by you must fulfill these requirements:
		 * REFLECTIVE: object vs. itself must be tru
		 * SYMETRIC: if x=y then y=x
		 * TRANSITIVE: if x=y, and y=z then x=z
		 * CONSISTET: if nothing change in the parameter then the previous result never change
		 * EXISTENT: compare an object with nothing(null) the result must be false
		 */ 
			@Override
	public boolean equals(Object obj) {
		if( this == obj) return true;//Is it already the same object?
		//If the compared objects have the same reference, 
		//then it is clear that they contain the same attribute values, because they "refer" to the same area in the memory
		
		if(obj instanceof ShoppingBasket){//Check if the transferred object has the expected type 
			ShoppingBasket newBasket = (ShoppingBasket) obj;//Type-cast the correct type
			return ((this.numberProducts == newBasket.numberProducts) 
					&& (this.productsSum == newBasket.productsSum) 
					&& (this.voucherHonored == newBasket.voucherHonored));//Comparison of the relevant attributes(all 3)
		}else{
			return super.equals(obj);//If obj does not have the correct type, call the equals method of the superclass
			/*this is always needed. It is included with the hope that if our method fails to compare,
			then maybe some more general equals()-method will be able to perform the compare successfully*/ 
		}
	}

	
			
			

			@Override
			public int hashCode() {
				final int prime = 31;
				int result = 1;
				result = prime * result + numberProducts;
				long temp;
				temp = Double.doubleToLongBits(productsSum);
				result = prime * result + (int) (temp ^ (temp >>> 32));
				result = prime * result + (voucherHonored ? 1231 : 1237);
				return result;
			}
			//Java bitwise operators:
			//Explanation https://www.tutorialspoint.com/java/java_basic_operators.htm#:~:text=Java%20defines%20several%20bitwise%20operators,short%2C%20char%2C%20and%20byte.&text=Binary%20AND%20Operator%20copies%20a,it%20exists%20in%20both%20operands.&text=Binary%20OR%20Operator%20copies%20a%20bit%20if%20it%20exists%20in%20either%20operand.&text=Binary%20Left%20Shift%20Operator.
			/*
			 * a = 0011 1100
			 * b = 0000 1101
			 * a^b = 0011 0001 Binary XOR Operator copies the bit if it is set in one operand but not both.	
			 * >>> (zero fill right shift) a >>>2 will give 15 which is 0000 1111 
			 * */
			
			

	
	
} //class