public class Loan {
    private String borrower;
    private int amount;
    private boolean isPaid;
    private double interestRate;
    private static int maxLoanAmount; //static is global variable but for the class within only

    public Loan(String borrower, int amount, double interestRate) {
        this.borrower = borrower;
        this.amount = amount;
        this.interestRate = interestRate;
        this.isPaid = false;
        if(amount > maxLoanAmount){
            maxLoanAmount = amount;
        }
    }

    public void setAsPaid() {
        isPaid = true;
    }

    public boolean isPaid() {
        return isPaid;
    }

    public String getBorrower() {
        return borrower;
    }
    
    public String getDisplayString(){
        return borrower + ": " + amount;
    }
    
    public double getProfit(){
        return amount*interestRate;
    }

    public static int getMaxLoan() {
        return maxLoanAmount;
    }
}
