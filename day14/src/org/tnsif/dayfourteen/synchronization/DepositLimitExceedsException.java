package org.tnsif.dayfourteen.synchronization;

public class DepositLimitExceedsException extends Exception {
	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	public DepositLimitExceedsException()
	{
		super("Can't Deposit..Limit is exceeded");
	}
	public DepositLimitExceedsException(String message)
	{
		super(message);
	}
}
