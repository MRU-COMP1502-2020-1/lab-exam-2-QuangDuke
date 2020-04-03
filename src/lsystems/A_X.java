package lsystems;

public class A_X extends LRule{
	
	private char x = 'A';
	private char[] y = {};
	
	public  char getMatch() {
		return x;
	}
	public char[] getBody() {
		return y;
	}

}
