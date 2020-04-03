package lsystems;

public class C_B extends LRule{
	
	private char x = 'C';
	private char[] y = {'B'};
	
	public  char getMatch() {
		return x;
	}
	public char[] getBody() {
		return y;
	}

}
