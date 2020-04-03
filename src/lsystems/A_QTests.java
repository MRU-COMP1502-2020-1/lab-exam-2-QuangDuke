package lsystems;

import static org.junit.Assert.*;

import java.util.HashSet;
import java.util.Set;

import org.junit.Before;
import org.junit.Test;

public class A_QTests {

	@Before
	public void setUp() throws Exception {
	}

	@Test
	public void test() throws LSystemSymbolException, LSystemLengthException {
		LRule r = new A_Q();
		Set<LRule> rules = new HashSet<>();
		rules.add(r);
		char[] lineChar = {'A','B','B'};
		LLine line = new LLine(lineChar, rules);
		System.out.println("Step 0: "+ line);
		line.process();
		assertEquals("QBB", line.toString());
		System.out.println("Step 1: " +line);
		
		
	}


}
