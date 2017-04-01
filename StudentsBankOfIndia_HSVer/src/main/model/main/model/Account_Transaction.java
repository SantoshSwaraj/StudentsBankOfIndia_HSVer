package main.model;

import java.util.Date;

public class Account_Transaction implements java.io.Serializable {
	private int trans_id;
	private int account_no;
	private int debit;
	private int credit;
	private Date trans_date;
	private String description;
	private Customer_Account customer_account;
	public Account_Transaction() {
		super();
		// TODO Auto-generated constructor stub
	}
	/**
	 * @return the trans_id
	 */
	public int getTrans_id() {
		return trans_id;
	}
	/**
	 * @param trans_id the trans_id to set
	 */
	public void setTrans_id(int trans_id) {
		this.trans_id = trans_id;
	}
	/**
	 * @return the account_no
	 */
	public int getAccount_no() {
		return account_no;
	}
	/**
	 * @param account_no the account_no to set
	 */
	public void setAccount_no(int account_no) {
		this.account_no = account_no;
	}
	/**
	 * @return the debit
	 */
	public int getDebit() {
		return debit;
	}
	/**
	 * @param debit the debit to set
	 */
	public void setDebit(int debit) {
		this.debit = debit;
	}
	/**
	 * @return the credit
	 */
	public int getCredit() {
		return credit;
	}
	/**
	 * @param credit the credit to set
	 */
	public void setCredit(int credit) {
		this.credit = credit;
	}
	/**
	 * @return the trans_date
	 */
	public Date getTrans_date() {
		return trans_date;
	}
	/**
	 * @param trans_date the trans_date to set
	 */
	public void setTrans_date(Date trans_date) {
		this.trans_date = trans_date;
	}
	/**
	 * @return the description
	 */
	public String getDescription() {
		return description;
	}
	/**
	 * @param description the description to set
	 */
	public void setDescription(String description) {
		this.description = description;
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
