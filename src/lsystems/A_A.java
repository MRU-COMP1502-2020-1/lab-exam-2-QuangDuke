package lsystems;

public class A_A extends LRule{
	
	private char x = 'A';
	private char[] y = {'A'};
	
	public  char getMatch() {
		return x;
	}
	public char[] getBody() {
		return y;
	}

}
