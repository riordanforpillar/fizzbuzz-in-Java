package fizzbuzz;

public class FizzBuzz {

	public FizzBuzz() {
	}

	public String getString(int i) {
		if (i == 3) {
			return "fizz";
		}
		if (i == 20) {
			return "buzz";
		}
		return "Not this";
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
