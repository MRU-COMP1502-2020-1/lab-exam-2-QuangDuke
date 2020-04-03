package lsystems;

import java.util.List;
import java.util.Set;

public class LLine {

	
	char line[];
	Set<LRule> rules;
	
	public LLine (char[] start, Set<LRule> rules) {
		this.rules = rules;
		this.line = start;
	}
	
	public void process() throws LSystemSymbolException, LSystemLengthException {
		for ( char c : line) {
			if ( !rules.contains(c) ){
				throw new LSystemSymbolException("Symbol(s) has no rules.");
			}
		}
		if( line.length == 0) {
			throw new LSystemLengthException();
		}
		if (line.toString().contains("A")) {
			
		}
		
	}
	
	
	
	private char[] listToArray(List<Character> list) {
		char[] newChars = new char[list.size()];
		for (int i = 0; i < list.size(); i++) {
			newChars[i] = list.get(i);
		}
		return newChars;
	}

	public String toString() {
		
		return new String(line);
	}
	
}
