package jUnitTestPackage;

import static org.junit.Assert.*;

import org.junit.Test;

public class testAddNumbers {
	jUnitFunctions Junit = new jUnitFunctions();

	@Test
	public void test() {
		int result = Junit.testAddNumbers(100,200);
		assertEquals(300,result);
	}
	@Test
	public void test2(){
		String res = Junit.addString("Hello", "World");
		assertEquals("HelloWorld", res);

}
