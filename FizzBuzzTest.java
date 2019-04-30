package fizzbuzz;

import static org.junit.Assert.*;

import fizzbuzz.*;
import junit.framework.Assert;

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
		assertEquals("buzz", fb.getString(20));
	}
	
	@Test
	public void testNotMultipleString() {
		assertEquals("7", fb.getString(7));
	}
}
