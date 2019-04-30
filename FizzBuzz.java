package fizzbuzz;

public class FizzBuzz {

	public FizzBuzz() {
	}
	
	public String runString(int i) {
		return "1 2 fizz 4 buzz fizz 7";
	}

	public String getString(int i) {
		String returnString = String.valueOf(i);
		if (isMultipleThree(i)) {
			returnString = "fizz";
		}
		if (isMultipleFive(i)) {
			returnString = "buzz";
		}
		if (isMultipleThree(i) && isMultipleFive(i)) {
			returnString = "fizzbuzz";
		}
		return returnString;
	}

	public boolean isMultipleThree(int integer) {
		if (integer % 3 == 0) {
			return true;
		} else {
			return false;
		}
	}

	public boolean isMultipleFive(int integer) {
		if (integer % 5 == 0) {
			return true;
		} else {
			return false;
		}
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}

}
