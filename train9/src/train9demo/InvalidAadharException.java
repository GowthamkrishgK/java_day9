package train9demo;

public class InvalidAadharException extends Exception {
	String text;
	public InvalidAadharException(String e) {
		this.text=e;
	}
	public String toString(){
		return "Invalid Aadhar Number: "+text+" Must contain 12 digits";
	}

}
