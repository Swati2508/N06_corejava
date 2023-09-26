package org.tnsif.dayfourteen.synchronization;

public class InsufficientBalanceException extends Exception{
	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	public InsufficientBalanceException()
	{
		super("Can't Withdraw...Insufficient balance");
	}
	public InsufficientBalanceException(String message)
	{
		super(message);
	}
}
