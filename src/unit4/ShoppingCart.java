package unit4;

public class ShoppingCart {
	private int numberProducts;
	private double productsSum;
	private boolean voucherHonored;
	
	public ShoppingCart() {}
	
	public ShoppingCart(int numberOfProducts, double productsSum, boolean voucherHonored){
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
	
	public String toString() {
		return "This basket contains:\n" +
				"numberProducts=" + numberProducts + "\n" + 
				"productsSum=" + productsSum + "\n" + 
				"voucherHonored=" + voucherHonored + "\n";
	}
	
	/*Task for the students: Implement the equals()-method for this class
	 *Can you use the '=='-operator for the comparison?
	 *Justify your answer*/
	@Override
	public boolean equals(Object obj) {
		if( this == obj) return true;//Is it already the same object?
		//If the compared objects have the same reference, then it is clear that they contain the same attribute values.
		
		if(obj instanceof ShoppingCart){//Check if the transferred object has the expected type 
			ShoppingCart newCart = (ShoppingCart) obj;//Typecast the correct type
			return ((this.numberProducts == newCart.numberProducts) 
					&& (this.productsSum == newCart.productsSum) 
					&& (this.voucherHonored == newCart.voucherHonored));//Comparison of the relevant attributes(all 3)
		}else{
			return super.equals(obj);//If obj does not have the correct type, call the equals method of the superclass
			/*this is always needed. It is included with the hope that if our method fails to compare,
			then maybe some more general equals()-method will be able to perform the compare successfully*/ 
		}
	}
}
