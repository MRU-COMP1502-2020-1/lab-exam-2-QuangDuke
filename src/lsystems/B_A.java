package lsystems;

public class B_A extends LRule{
	
	private char x = 'B';
	private char[] y = {'A'};
	
	public  char getMatch() {
		return x;
	}
	public char[] getBody() {
		return y;
	}

}

