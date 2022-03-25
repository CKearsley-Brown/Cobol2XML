package coboltests;

import static org.junit.Assert.*;

import java.util.ArrayList;

import org.junit.Test;

import parse.Parser;
import parse.tokens.Literal;
import parse.tokens.Token;

public class LiteralTest {

	@Test
	public void test() {
		String a = "hey";
		String b = "hey";
		Token t = new Token(b);
		Literal l = new Literal(a);
		assertFalse(l.equals(t));
		
		ArrayList<Parser> arrayList = new ArrayList<Parser>();
		arrayList.add(l);
		assertFalse(arrayList.isEmpty());
	}

}
