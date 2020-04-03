package lsystems;

import static org.junit.Assert.*;

import java.util.HashSet;
import java.util.Set;

import org.junit.Before;
import org.junit.Test;

public class A_ATests {

	@Before
	public void setUp() throws Exception {
	}

	@Test
	public void test() throws LSystemSymbolException, LSystemLengthException {
		LRule r = new A_A();
		Set<LRule> rules = new HashSet<>();
		rules.add(r);
		char[] lineChar = {'A'};
		LLine line = new LLine(lineChar, rules);
		System.out.println("Step 0: "+ line);
		line.process();
		assertEquals("A", line.toString());
		System.out.println("Step 1: " +line);
		line.process();
		assertEquals("A", line.toString());
		System.out.println("Step 2: " +line);
		
	}


}
