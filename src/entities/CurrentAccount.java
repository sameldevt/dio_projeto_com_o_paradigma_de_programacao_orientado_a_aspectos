package entities;

import java.util.Date;

public class CurrentAccount extends Account{

	public CurrentAccount(String accountType, String clientType, Date openingDate, Double balance) {
		super(accountType, clientType, openingDate, balance);
	}
}
