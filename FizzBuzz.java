package fizzbuzz;

public class FizzBuzz {

	public FizzBuzz() {
	}

	public FizzBuzz(int nSteps) {
	}	
	
	public String runString(int nSteps) {
		String generated = "";
		for(int index = 1; index < nSteps; index++) {
			generated += getString(index) + " ";
		}
		generated += getString(nSteps);
		
		return generated;
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
