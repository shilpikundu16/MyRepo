package com.lti.test;

import static org.junit.Assert.assertEquals;

import org.junit.Before;
import org.junit.Test;

import com.lti.code.Arithmetic;

public class TestArithmetic {
	private Arithmetic arth;
	
	@Before
	public void init() {
		arth = new Arithmetic();
	}
	
	@Test
	public void testSum() {
		assertEquals(10, arth.sum(4, 6));
	}
	
	@Test
	public void testsubtract() {
		assertEquals(2, arth.subtract(6, 4));
	}
	
	@Test
	public void testmultiply() {
		assertEquals(24, arth.multiply(6, 4));
	}
	
	@Test
	public void testMax() {
		assertEquals(6, arth.max(6, 4));
	}
	
	@Test
	public void testMin() {
		assertEquals(4, arth.min(6, 4));
	}

}
