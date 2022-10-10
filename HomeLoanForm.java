import java.util.Scanner;

public class HomeLoanForm {
  private Scanner scanner = new Scanner(System.in);
  private int loanAmount;
  private float interestRate;
  private int loanPeriod;

  public int getLoanAmount() {
    return loanAmountInput();
  }

  public float getInterestRate() {
    return interestRateInput();
  }

  public int getLoanPeriod() {
    return loanPeriodInput();
  }

  private int loanAmountInput() {
    while (true) {  
      System.out.print("What is the home loan amount? ($) ");
      loanAmount = scanner.nextInt();
      if (loanAmount > 0)
        break;
      System.out.println("Please enter a positive number");
    }
    return loanAmount;
  }

  private float interestRateInput() {
    while (true) {
      System.out.print("What is the annual interest rate? (%)");
      interestRate = scanner.nextFloat();
      if (interestRate > 0) 
        break;
      System.out.println("Please enter a positive number");
    }
    return interestRate;
  }

  private int loanPeriodInput() {
    while (true) {
      System.out.print("What is the period of the loan (Years)? "); 
      loanPeriod = scanner.nextInt();
      if (loanPeriod > 0)
        break;
      System.out.println("Please enter a positive number");
    }
    return loanPeriod;
  }
}

