package lsystems;

public class A_Q extends LRule{
	
	private char x = 'A';
	private char[] y = {'Q'};
	
	public  char getMatch() {
		return x;
	}
	public char[] getBody() {
		return y;
	}

}
