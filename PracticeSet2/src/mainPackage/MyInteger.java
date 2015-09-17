//Shane Carter Problem set 2
package mainPackage;
public class MyInteger {
	private int value;

	public MyInteger(int value) {
		this.value = value;
	}

	public int getValue() {
		return value;
	}
	
	public boolean isEven(){
		if (this.value % 2 == 0)
			return true;
		else
			return false;
	}
	
	public boolean isOdd(){
		if (this.value % 2 == 1)
			return true;
		else
			return false;
	}
	
	public boolean isPrime(){
		if (this.value < 2)
			return false;
		for (int i = 2; i < this.value; i++){
			if (this.value % i == 0)
				return false;
		}
		return true;				
		}
	
	public static boolean isEven(int num) {
		if (num % 2 == 0)
			return true;
		else 
			return false;
	}

	public static boolean isOdd(int num) {
		if (num % 2 == 1)
			return true;
		else
			return false;
	}

	public static boolean isPrime(int num) {
		if (num < 2)
			return false;
		for (int i = 2; i < num; i++) {
			if (num % i == 0) {
				return false;
			}
		}
		return true;
	}

	public static boolean isEven(MyInteger num) {
		return isEven(num.getValue());
	}

	public static boolean isOdd(MyInteger num) {
		return isOdd(num.getValue());
	}

	public static boolean isPrime(MyInteger num) {
		return isPrime(num.getValue());
	}

	public boolean equals(int num) {
		return (num == this.value);
	}

	public boolean equals(MyInteger num) {
		return equals(num.getValue());
	}

	public static int parseInt(char[] numberToParse){
		//MUST ADD CHARACTERS CHANGE THIS METHOD
		int sum = 0; 
		for (int i =  0; i < numberToParse.length ; i++) {
			if (Character.isDigit(numberToParse[i]))
				sum += numberToParse[i];
		}
		return sum;
	}
	
	public static int parseInt(String numberToParse){
		int string2int = Integer.parseInt(numberToParse);
		
		return string2int;
	}
	
	
}
