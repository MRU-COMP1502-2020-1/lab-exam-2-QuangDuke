package lsystems;

import static org.junit.Assert.*;

import java.util.HashSet;
import java.util.Set;

import org.junit.Before;
import org.junit.Test;

public class B_ATests {

	@Before
	public void setUp() throws Exception {
	}

	@Test
	public void test() throws LSystemSymbolException, LSystemLengthException {
		LRule r = new B_A();
		Set<LRule> rules = new HashSet<>();
		rules.add(r);
		char[] lineChar = {'C','B','B'};
		LLine line = new LLine(lineChar, rules);
		System.out.println("Step 0: "+ line);
		line.process();
		assertEquals("CAA", line.toString());
		System.out.println("Step 1: " +line);
		
		
	}


}
