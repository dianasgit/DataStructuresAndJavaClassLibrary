package unit2;

//public class Address {
public class Address implements Cloneable{
	private int zipCode;
	private String city;
	private String street;
	private int houseNumber;
	
	public Address(int zipCode, String city, String street, int houseNumber){
		this.zipCode = zipCode;
		this.city = city;
		this.street = street;
		this.houseNumber = houseNumber;
	}

	public int getZipCode() {
		return zipCode;
	}

	public void setZipCode(int zipCode) {
		this.zipCode = zipCode;
	}

	public String getCity() {
		return city;
	}

	public void setCity(String city) {
		this.city = city;
	}

	public String getStreet() {
		return street;
	}

	public void setStreet(String street) {
		this.street = street;
	}

	public int getHouseNumber() {
		return houseNumber;
	}

	public void setHouseNumber(int houseNumber) {
		this.houseNumber = houseNumber;
	}
	
	public String toString(){
		String address = "\nAddress:" + this.zipCode + " " 
										+ this.city + "," 
										+ this.street + " "  
										+ this.houseNumber; 
		return address;
	}
	
	protected Object clone() throws CloneNotSupportedException
	{
		return super.clone();
	}
	
}
