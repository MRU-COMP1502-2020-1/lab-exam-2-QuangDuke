package lsystems;

public class LSystemSymbolException extends Exception {
	
	private String c;
	public LSystemSymbolException(String message) {
		super(message);
	}
	public String getSymbol() {
		return c;
	}

	

}
