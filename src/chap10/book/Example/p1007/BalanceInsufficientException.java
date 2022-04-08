package chap10.book.Example.p1007;

public class BalanceInsufficientException extends Exception {
	public BalanceInsufficientException() {
		
	}

	BalanceInsufficientException(String message) {
		super(message);
	}
}
