/**
   A bank account has a balance that can be changed by
   deposits and withdrawals.
*/
public class BankAccount2 implements Comparable<BankAccount2>
{
   private double balance;

   /**
      Constructs a bank account with a zero balance.
   */
   public BankAccount2()
   {
      balance = 0;
   }

   /**
      Constructs a bank account with a given balance.
      @param initialBalance the initial balance
   */
   public BankAccount2(double initialBalance)
   {
      balance = initialBalance;
   }

   /**
      Deposits money into the bank account.
      @param amount the amount to deposit
   */
   public void deposit(double amount)
   {
      balance = balance + amount;
   }

   /**
      Withdraws money from the bank account.
      @param amount the amount to withdraw
   */
   public void withdraw(double amount)
   {
      balance = balance - amount;
   }

   /**
      Gets the current balance of the bank account.
      @return the current balance
   */
   public double getBalance()
   {
      return balance;
   }
   
   @Override
	public int compareTo( BankAccount2 other )
	{
		if(this.getBalance() < other.getBalance()) {
			return -1;
		}else if (this.getBalance == other.getBalance) {
			return 0;
		}return 1;
	}

}
