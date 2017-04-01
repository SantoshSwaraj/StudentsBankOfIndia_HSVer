     package main.model;

import java.util.Date;
import java.util.Set;

public class Customer_Account implements java.io.Serializable{
	private int cust_id;
	private String cname;
	private Date dob;
	private String addr_l1;
	private String addr_l2;
	private String reg_email;
	private int account_no;
	private String  acc_type;
	private Acc_NetBal acc_netbal;
	private Set account_transactions;
	public Customer_Account() {
		super();
		// TODO Auto-generated constructor stub
	}
	public Customer_Account(String cname, Date dob, String addr_l1, String addr_l2, String reg_email, int account_no,
			String acc_type) {
		super();
		this.cname = cname;
		this.dob = dob;
		this.addr_l1 = addr_l1;
		this.addr_l2 = addr_l2;
		this.reg_email = reg_email;
		this.account_no = account_no;
		this.acc_type = acc_type;
	}
	/**
	 * @return the cust_id
	 */
	public int getCust_id() {
		return cust_id;
	}
	/**
	 * @param cust_id the cust_id to set
	 */
	public void setCust_id(int cust_id) {
		this.cust_id = cust_id;
	}
	/**
	 * @return the cname
	 */
	public String getCname() {
		return cname;
	}
	/**
	 * @param cname the cname to set
	 */
	public void setCname(String cname) {
		this.cname = cname;
	}
	/**
	 * @return the dob
	 */
	public Date getDob() {
		return dob;
	}
	/**
	 * @param dob the dob to set
	 */
	public void setDob(Date dob) {
		this.dob = dob;
	}
	/**
	 * @return the addr_l1
	 */
	public String getAddr_l1() {
		return addr_l1;
	}
	/**
	 * @param addr_l1 the addr_l1 to set
	 */
	public void setAddr_l1(String addr_l1) {
		this.addr_l1 = addr_l1;
	}
	/**
	 * @return the addr_l2
	 */
	public String getAddr_l2() {
		return addr_l2;
	}
	/**
	 * @param addr_l2 the addr_l2 to set
	 */
	public void setAddr_l2(String addr_l2) {
		this.addr_l2 = addr_l2;
	}
	/**
	 * @return the reg_email
	 */
	public String getReg_email() {
		return reg_email;
	}
	/**
	 * @param reg_email the reg_email to set
	 */
	public void setReg_email(String reg_email) {
		this.reg_email = reg_email;
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
	 * @return the acc_type
	 */
	public String getAcc_type() {
		return acc_type;
	}
	/**
	 * @param acc_type the acc_type to set
	 */
	public void setAcc_type(String acc_type) {
		this.acc_type = acc_type;
	}
	/**
	 * @return the acc_netbal
	 */
	public Acc_NetBal getAcc_netbal() {
		return acc_netbal;
	}
	/**
	 * @param acc_netbal the acc_netbal to set
	 */
	public void setAcc_netbal(Acc_NetBal acc_netbal) {
		this.acc_netbal = acc_netbal;
	}
	/**
	 * @return the account_transaction
	 */
	public Set getAccount_transactions() {
		return account_transactions;
	}
	/**
	 * @param account_transaction the account_transaction to set
	 */
	public void setAccount_transactions(Set account_transactions) {
		this.account_transactions = account_transactions;
	}
			
}
