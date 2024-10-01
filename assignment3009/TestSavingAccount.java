package assignment3009;

public class TestSavingAccount {
	public static void main(String[] args) {
		SavingAccount savingAccount = new SavingAccount();
		SavingAccount savingAccount1 = new SavingAccount();
		savingAccount.setSavingBalance(10000.00);
		savingAccount1.setSavingBalance(50000.00);

		savingAccount.modifyInterestRate(3);

		System.out.println("intereset when is 3");
		savingAccount.calculateMonthlyInterest();
		System.out.println("\nintereset when is 3");
		savingAccount1.calculateMonthlyInterest();
		System.out.println("=====================================================");
		savingAccount.modifyInterestRate(4);
		System.out.println(" After modifying ");
		savingAccount.calculateMonthlyInterest();
		savingAccount1.calculateMonthlyInterest();
	}

}
