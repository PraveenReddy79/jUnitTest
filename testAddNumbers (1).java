package jUnitTestPackage;

import static org.junit.Assert.*;

import org.junit.Test;

public class testAddNumbers {

	@Test
	public void test() {
		jUnitFunctions Junit = new jUnitFunctions();
		int result = Junit.testAddNumbers(100,200);
		assertEquals(300,result);
	}

}
