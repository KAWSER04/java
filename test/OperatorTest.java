package test;

import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.jupiter.api.Test;

import main.Operators;

class OperatorTest {
	
	@Test
	void arithmeticOperatorTest() {
		Operators ao = new Operators();
		
		assertEquals(10,ao.add(5, 5));
		assertEquals(2,ao.sub(8, 6));
		assertEquals(40,ao.mul(8, 5));
		assertEquals(2,ao.div(16, 8));
		assertEquals(2,ao.sub(8, 6));
		assertEquals(2,ao.sub(7, 5));
		
		assertEquals(true,ao.or(true, false));
		assertEquals(false,ao.and(true, false));
		assertEquals(false,ao.not(true));
		assertEquals(true,ao.xor(true, false));
		
		assertEquals(3,ao.or(1, 3));
		assertEquals(1,ao.and(1, 3));
		assertEquals(-4,ao.not(3));
		assertEquals(2,ao.xor(1, 3));
		assertEquals(10,ao.leftShift(5, 1));
		assertEquals(2,ao.rightShift(5, 1));
	}
}
