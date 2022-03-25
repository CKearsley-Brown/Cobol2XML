package coboltests;

import org.junit.runner.RunWith;
import org.junit.runners.Suite;
import org.junit.runners.Suite.SuiteClasses;

@RunWith(Suite.class)
@SuiteClasses({ LiteralTest.class, NumTest.class, ParserTest.class, SymbolTest.class, TokenTest.class })
public class AllTests {

}
