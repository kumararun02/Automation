package com.utils;

import org.testng.Assert;

public class TestAppVerify extends Assert {
	
	public static void verify(String actual, String expected) {
		assertEquals(actual, expected);
	}
	
	public static void verify(boolean condition, String message) {
		assertTrue(condition, message);
	}

	public static void verify(boolean condition) {
		assertTrue(condition);
	}
}
