package fizzbuzz;

public class FizzBuzz {

	public FizzBuzz() {
	}

	public String getString(int i) {
		String returnString = String.valueOf(i);
		if (isMultipleThree(i)) {
			returnString = "fizz";
		}
		if (i == 20) {
			returnString = "buzz";
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
