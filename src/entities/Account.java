package entities;

import java.util.Date;

public class Account {

	private String accountType;
	private String clientType;
	private Date openingDate;
	private Double balance;
	
	public Account() {
		
	}

	public Account(String accountType, String clientType, Date openingDate, Double balance) {
		super();
		this.accountType = accountType;
		this.clientType = clientType;
		this.openingDate = openingDate;
		this.balance = balance;
	}
	
	public boolean withdraw(int amount) {
        if (balance < amount) {
            return false;
        } 
        balance -= amount;
        return true;
    }
	
	public void deposit(double amount) {
		this.balance += amount;
	}

	public String getAccountType() {
		return accountType;
	}

	public void setAccountType(String accountType) {
		this.accountType = accountType;
	}

	public String getClientType() {
		return clientType;
	}

	public void setClientType(String clientType) {
		this.clientType = clientType;
	}

	public Date getOpeningDate() {
		return openingDate;
	}

	public void setOpeningDate(Date openingDate) {
		this.openingDate = openingDate;
	}

	public Double getBalance() {
		return balance;
	}

	public void setBalance(Double balance) {
		this.balance = balance;
	}
}
