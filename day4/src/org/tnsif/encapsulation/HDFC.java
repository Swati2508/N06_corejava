//program to demonstrate on encapsulation
/* Encapsulation achieves a data hiding  using private access
 * specifier
 */

package org.tnsif.encapsulation;

public class HDFC {
	
	private String accountType;
	private long AccountNo;
	private long AtmCardNo;
	private int pinNo;
	public String getAccountType() {
		return accountType;
	}
	public void setAccountType(String accountType) {
		this.accountType = accountType;
	}
	public long getAccountno() {
		return AccountNo;
	}
	public void setAccountno(long accountno) {
		this.AccountNo = accountno;
	}
	
	
	@Override
	public String toString() {
		return "HDFC [AccountType=" + accountType + ", AccountNo=" + AccountNo + ", AtmCardNo=" + AtmCardNo + ", PinNo="
				+ pinNo + "]";
	}
	public long getAtmCardNo() {
		return AtmCardNo;
	}
	public void setAtmCardNo(long AtmCardNo) {
		this.AtmCardNo = AtmCardNo;
	}
	public int getPinNo() {
		return pinNo;
	}
	public void setPinNo(int pinNo) {
		this.pinNo = pinNo;
	}
	

}
