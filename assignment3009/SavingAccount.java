package assignment3009;
import java.util.Scanner;
public class SavingAccount {
	private double savingBalance;
    private static double annualInterestRate;
    private double intAmount;

    public double getSavingBalance() {
        return savingBalance;
    }

    public void setSavingBalance(double savingBalance) {
        this.savingBalance = savingBalance;
    }

    public static void modifyInterestRate(double newInterestRate) {
        annualInterestRate = newInterestRate;
    }

    public void calculateMonthlyInterest() {
        intAmount = (savingBalance * (annualInterestRate/100)) / 12;
        savingBalance += intAmount;
        System.out.println("Monthly interest: " + intAmount);
        System.out.println("New balance after adding interest: " + savingBalance);
    }

}
