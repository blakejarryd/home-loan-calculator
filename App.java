public class App {
  public static void main(String[] args) {
    var homeLoanForm = new HomeLoanForm();
    int loanAmount = homeLoanForm.getLoanAmount();
    float interest = homeLoanForm.getInterestRate();
    int years = homeLoanForm.getLoanPeriod();

    var homeLoan = new HomeLoan(loanAmount, interest, years);
    homeLoan.printMonthlyPayment();
  }
}
