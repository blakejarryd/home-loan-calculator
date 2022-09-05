import java.util.Scanner;
import java.text.NumberFormat;

public class App {
  public static int getHomeLoanAmount() {
    int principal = 0;
    Scanner scanner = new Scanner(System.in);

    while (true) {  
      System.out.print("What is the home loan amount? ");
      principal = scanner.nextInt();
      if (principal > 0)
        break;
      System.out.println("Please enter a positive number");
    }
    return principal;
  }

  public static float getInterestAmount() {
    final byte MONTHS_IN_YEAR = 12;
    float annualInterest = 0;
    float monthlyInterest = 0;
    Scanner scanner = new Scanner(System.in);

    while (true) {
      System.out.print("What is the annual interest rate? ");
      annualInterest = scanner.nextFloat();
      if (annualInterest > 0) 
        break;
      System.out.println("Please enter a positive number");
    }
    monthlyInterest =  annualInterest / 100 / MONTHS_IN_YEAR;
    return monthlyInterest;
  }

  public static int getLoanPeriod() {
    int years = 0;
    Scanner scanner = new Scanner(System.in);

    while (true) {
      System.out.print("What is the period of the loan (Years)? "); 
      years = scanner.nextInt();
      if (years > 0)
        break;
      System.out.println("Please enter a positive number");
    }
    return years;
  }

  public static void main(String[] args) {
    final byte MONTHS_IN_YEAR = 12;
    int principal = getHomeLoanAmount();
    float interest = getInterestAmount();
    int years = getLoanPeriod();
    int numberOfPayments = years * MONTHS_IN_YEAR;

    // Caclulate Monthly Repayments
    // M = P * ( I / (1 - (1 + I)-N))
    // M = monthly payment amount
    // P = principal, meaning the amount of money borrowed
    // I = monthly interest rate
    // N = total number of payments
    double monthlyPayment = principal * (interest / (1 - Math.pow((1 + interest), -numberOfPayments)));

    String monthlyPaymentFormatted = NumberFormat.getCurrencyInstance().format(monthlyPayment);
    System.out.println("The monthly repayments are " + monthlyPaymentFormatted); 
  }
}
