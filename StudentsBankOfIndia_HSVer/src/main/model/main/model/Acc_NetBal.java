package main.model;

public class Acc_NetBal implements java.io.Serializable {
	private int acc_bal;
	private Customer_Account customer_account;
	
	public Acc_NetBal() {
		super();
		// TODO Auto-generated constructor stub
	}

	/**
	 * @return the acc_bal
	 */
	public int getAcc_bal() {
		return acc_bal;
	}

	/**
	 * @param acc_bal the acc_bal to set
	 */
	public void setAcc_bal(int acc_bal) {
		this.acc_bal = acc_bal;
	}

	/**
	 * @return the customer_account
	 */
	public Customer_Account getCustomer_account() {
		return customer_account;
	}

	/**
	 * @param customer_account the customer_account to set
	 */
	public void setCustomer_account(Customer_Account customer_account) {
		this.customer_account = customer_account;
	}
	 
}
