package unit4;

public class MainInterface implements MyInterface03 {
	//when declared the "implements" this line you reposr an error.. to corrert just select the option, import the non emplemented method... and it will import an override version of ALL methods of the interface imported and all its inherited as well out of the main scope, but inside the end of the class scope.
	//in java a class CAN achive multiple inheritance of INTERFACES... you can write several implements using the key work implements (instead of extends) sepered by comma.. it is the only whay.. class can NOT inherite for more then one generation 

	public static void main(String[] args) {
	}//main

	
	@Override
	public void printOneLine(String line) {
	}

	@Override
	public void printOneNumber(int numberToPrint) {
	}

	@Override
	public void print() {
	}

}
