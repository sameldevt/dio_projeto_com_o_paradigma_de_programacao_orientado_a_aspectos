package aspectJ;

import entities.Account;

public aspect VerifyBalance {

    pointcut callWithDraw(int amount, Account acc) : 
    	call(boolean Account.withdraw(int)) && args(amount) && target(acc);

    boolean around(int amount, Account acc) : 
        callWithDraw(amount, acc) {
          if (acc.getBalance() < amount) {
        	  System.out.println("Insufficient funds!");
              return false;
          }
          System.out.println("Withdraw done!");
          return proceed(amount, acc);
      }
}
 	 	