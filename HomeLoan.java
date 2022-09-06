import java.text.NumberFormat;

public class HomeLoan {
  private final byte MONTHS_IN_YEAR = 12;
  private int loanAmount;
  private float interestRate;
  private int loanPeriod;

  public HomeLoan(int loanAmount, float interestRate, int loanPeriod) {
    setLoanAmount(loanAmount);
    setInterestRate(interestRate);
    setLoanPeriod(loanPeriod);
  }

  private void setLoanAmount(int loanAmount) {
    this.loanAmount = loanAmount;
  }

  private void setInterestRate(float interestRate) {
    this.interestRate = interestRate;
  }

  private void setLoanPeriod(int loanPeriod) {
    this.loanPeriod = loanPeriod;
  }

  // Caclulate Monthly Repayments
  // Monthly Repayment = Principal * ( Monthly Interest / (1 - (1 + Monthly Interest)^-Number of payments))
  private double calculateRepayments() {
    int numberOfPayments = loanPeriod * MONTHS_IN_YEAR;
    float monthlyInterest =  interestRate / 100 / MONTHS_IN_YEAR;
    double monthlyPayment = loanAmount * (monthlyInterest / (1 - Math.pow((1 + monthlyInterest), -numberOfPayments)));
    return monthlyPayment;
  }

  public void printMonthlyPayment() {
    double monthlyPayment = calculateRepayments();
    String monthlyPaymentFormatted = NumberFormat.getCurrencyInstance().format(monthlyPayment);
    System.out.println("The monthly repayments are " + monthlyPaymentFormatted); 
  }
}


