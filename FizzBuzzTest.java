package fizzbuzz;

import static org.junit.Assert.*;


import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;

public class FizzBuzzTest {
	FizzBuzz fb;
	@BeforeClass
	public static void setUpBeforeClass() throws Exception {
	}

	@AfterClass
	public static void tearDownAfterClass() throws Exception {
	}

	@Before
	public void setUp() throws Exception {
		fb = new FizzBuzz();
	}

	@After
	public void tearDown() throws Exception {
	}
	
	@Test
	public void testAcceptStepsInConstructor() {
		new FizzBuzz(3);
	}

	@Test
	public void testMultipleOfThree() {
		assertTrue(fb.isMultipleThree(6));
		assertFalse(fb.isMultipleThree(5));
	}
	
	@Test
	public void testMultipleOfFive() {
		assertTrue(fb.isMultipleFive(5));
		assertFalse(fb.isMultipleFive(6));
	}
	
	@Test
	public void testMutipleOfThreeString() {
		assertEquals("fizz", fb.getString(3));
		assertEquals("fizz", fb.getString(6));
	}
	
	@Test
	public void testMultipleOfFiveString() {
		assertEquals("buzz", fb.getString(5));
		assertEquals("buzz", fb.getString(20));
	}
	
	@Test
	public void testNotMultipleString() {
		assertEquals("7", fb.getString(7));
		assertEquals("1", fb.getString(1));
	}
	
	@Test
	public void testMultipleOfThreeAndFive() {
		assertEquals("fizzbuzz", fb.getString(15));
	}
	
	@Test
	public void testRunString() {
		assertEquals("1 2 fizz 4 buzz fizz 7", fb.generateString(7));
		assertEquals("1 2 fizz 4 buzz fizz 7 8 fizz buzz 11 fizz 13 14 fizzbuzz 16", fb.generateString(16));
	}
	
	@Test
	public void testGenerateStringWithPassedNumberOfSteps() {
		FizzBuzz with8Steps = new FizzBuzz(8);
		assertEquals("1 2 fizz 4 buzz fizz 7 8", with8Steps.generateString());
		FizzBuzz with6Steps = new FizzBuzz(6);
		assertEquals("1 2 fizz 4 buzz fizz", with6Steps.generateString());
	}
	
	@Test
	public void testDefaultString() {
		assertEquals("1", fb.generateString());
	}
	
	@Test (expected = NegativeFizzBuzz.class)
	public void testNegativeConstructorException() {
		new FizzBuzz(-1);
	}

	@Test (expected = NegativeFizzBuzz.class)
	public void testNegativeStringException() {
		fb.generateString(-1);
	}
}
