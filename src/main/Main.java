package main;

import java.util.Date;

import entities.Account;
import entities.CurrentAccount;
import entities.InvestmentAccount;
import entities.SalaryAccount;
import entities.SavingsAccount;

public class Main {

	public static void main(String[] args) {
		
		Account conta1 = new SalaryAccount("Salary Account", "Physical Person", new Date(), 100.0);
		Account conta2 = new CurrentAccount("Current Account", "Physical Person", new Date(), 200.0);
		Account conta3 = new SavingsAccount("Savings Account", "Physical Person", new Date(), 300.0);
		Account conta4 = new InvestmentAccount("Investment Account", "Legal Person", new Date(), 400.0);
		
		System.out.println("\n======================");
		System.out.println("Withdraw test conta1 - conta salario: ");
		conta1.withdraw(1001);
		System.out.println("======================\n");
		
		System.out.println("\n======================");
		System.out.println("Withdraw test conta2 - conta corrente: ");
		conta2.withdraw(50);
		System.out.println("======================\n");
		
		System.out.println("\n======================");
		System.out.println("Withdraw test conta3 - conta poupanca: ");
		conta3.withdraw(400);
		System.out.println("======================\n");
		
		System.out.println("\n======================");
		System.out.println("Withdraw test conta4 - conta investimento: ");
		conta4.withdraw(199);
		System.out.println("======================\n");
	}

}
