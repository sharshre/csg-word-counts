package test;

import static org.junit.Assert.assertFalse;
import static org.junit.Assert.assertTrue;

import org.junit.jupiter.api.Test;

class WordCountProgramsTest {

	@Test
	public boolean validStringtest(String s) throws Exception{
		return s.matches("S[A-Z][a,z]");
	}
	
	@Test
	public static void assertLength(String s) throws Exception {
		assertTrue("length of string is greater than 5", s.length() > 5);
		assertFalse("length is not greater than 5", s.length() < 5);
	}
	
	@Test
	public static void assertCharacter(String s) throws Exception{
		assertTrue("string is starting with m", s.startsWith("m"));
		assertTrue("string is starting with M", s.startsWith("M"));
		assertFalse("string does not start with m", !s.startsWith("m"));
		assertFalse("string does not start with M", !s.startsWith("M"));
	}

}
