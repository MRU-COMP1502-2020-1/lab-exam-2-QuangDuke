package lsystems;

public class A_BC extends LRule {
	
	private char x = 'A';
	private char[] y = {'B','C'};
	
	public  char getMatch() {
		return x;
	}
	public char[] getBody() {
		return y;
	}
}
