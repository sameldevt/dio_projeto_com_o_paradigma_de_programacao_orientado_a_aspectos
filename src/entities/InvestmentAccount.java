package entities;

import java.util.Date;

public class InvestmentAccount extends Account{

	public InvestmentAccount(String accountType, String clientType, Date openingDate, Double balance) {
		super(accountType, clientType, openingDate, balance);
	}
}
