package com.mk.project1;

import static org.junit.Assert.*;

import org.junit.Test;

public class Scalctest {

	@Test
	public void test1() {
		Scalc ob = new Scalc();
		assertEquals(123650, ob.salaryCalc(170000, true));
	}
	@Test
	public void test2() {
		Scalc ob = new Scalc();
		assertEquals(290900, ob.salaryCalc(380000, false));
	}
	@Test
	public void test3() {
		Scalc ob = new Scalc();
		assertEquals(1475500, ob.salaryCalc(2000000, true));
	}
}
