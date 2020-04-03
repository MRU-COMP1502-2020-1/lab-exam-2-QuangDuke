package lsystems;

public class A_AA extends LRule {
	
	private char x = 'A';
	private char[] y = {'A','A'};
	
	public char getMatch() {
		return x;
	}
	public char[] getBody() {
		return y;
	}

}
