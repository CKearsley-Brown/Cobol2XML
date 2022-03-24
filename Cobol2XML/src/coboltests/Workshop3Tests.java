package coboltests;

import static org.junit.Assert.*;

import org.junit.Test;

import cobol.Cobol;

public class Workshop3Tests {

	@Test
	public void test() {
		//Cobol Class Test
		Cobol c = new Cobol();
		c.clone();
		Cobol c2 = new Cobol();
		assertTrue(c.equals(c2));
		//Assembly Test
		
		//Assembler Test
		
		//XMLPayload Method Test
		
		//Tokeniser Test
		
		//Colbol Parser Test
		
		//!!!!!!!!!! Will come back to test these if they are needed
		//!!!!!!!!!! I think this is the correct way of going about testing these
		//Could possibly split each element into their own file so they can be tested individually and then tested
		//altogether on AllTest.java
	}

}
