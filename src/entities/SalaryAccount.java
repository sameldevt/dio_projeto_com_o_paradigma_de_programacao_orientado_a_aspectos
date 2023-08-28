package entities;

import java.util.Date;

public class SalaryAccount extends Account {

	public SalaryAccount(String accountType, String clientType, Date openingDate, Double balance) {
		super(accountType, clientType, openingDate, balance);
	}
}
