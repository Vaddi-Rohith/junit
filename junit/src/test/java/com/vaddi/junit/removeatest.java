package com.vaddi.junit;

import static org.junit.Assert.*;

import org.junit.Test;

public class removeatest {

	@Test
	public void test1() {
		removea ra = new removea();
		String actual = ra.rem("ABCD");
		assertEquals("BCD",actual);		
	}
	@Test
	public void test2() {
		removea ra = new removea();
		String actual = ra.rem("AACD");
		assertEquals("CD",actual);		
	}
	@Test
	public void test3() {
		removea ra = new removea();
		String actual = ra.rem("BACD");
		assertEquals("BCD",actual);		
	}
	@Test
	public void test4() {
		removea ra = new removea();
		String actual = ra.rem("BBAA");
		assertEquals("BBAA",actual);		
	}
	@Test
	public void test5() {
		removea ra = new removea();
		String actual = ra.rem("AABAA");
		assertEquals("BAA",actual);		
	}
}
