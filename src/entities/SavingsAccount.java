package entities;

import java.util.Date;

public class SavingsAccount extends Account{

	public SavingsAccount(String accountType, String clientType, Date openingDate, Double balance) {
		super(accountType, clientType, openingDate, balance);
	}
}
