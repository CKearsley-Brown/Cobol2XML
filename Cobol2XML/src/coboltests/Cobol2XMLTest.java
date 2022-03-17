package coboltests;

import static org.junit.Assert.*;

import org.junit.Test;

import parse.tokens.Symbol;
import parse.tokens.Token;
import parse.tokens.Word;

public class Cobol2XMLTest {

	@Test
	public void test() {
		Token tokenTest = new Token("hi there");
		Word wordTest = new Word();
		Symbol symbolTest = new Symbol("1221");
		
		assertTrue(tokenTest.equals(symbolTest));
	}

}
