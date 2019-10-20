public class SavingsAccount {
    static double annualInterestRate;
    private double savingsBalance;

    public SavingsAccount(double savingsBalance){
        this.savingsBalance = savingsBalance;
    }

    public double getBalance(){
        return this.savingsBalance;
    }

    public static void modifyInterestRate(double newInterestRate){
        annualInterestRate = newInterestRate;
    }

    public void calculateMonthlyInterest(){
        double monthly;
        monthly = (double)(this.savingsBalance*(annualInterestRate/12));
        this.savingsBalance+=monthly;
    }

    public static void main(String args[]) {
        SavingsAccount one, two;
        one = new SavingsAccount(2000.0);
        two = new SavingsAccount(3000.0);
        int total = 0;

        SavingsAccount.modifyInterestRate(0.04);
        for (int i = 0; i < 12; i++) {
            one.calculateMonthlyInterest();
            System.out.println("Month " + (i + 1) + ": ");
            System.out.printf("%.2f\n", one.getBalance());
        }
        System.out.println("\nPrinting Balance for Second Saver\n");
        for (int i = 0; i < 12; i++) {
            two.calculateMonthlyInterest();
            System.out.println("Month " + (i + 1) + ": ");
            System.out.printf("%.2f\n", two.getBalance());
        }
        SavingsAccount.modifyInterestRate(0.05);
        System.out.println("After changing interest rate to 0.05");
        for (int i = 0; i < 12; i++) {
            one.calculateMonthlyInterest();
            System.out.println("Month " + (i + 1) + ": ");
            System.out.printf("%.2f\n", one.getBalance());
        }
        for (int i = 0; i < 12; i++) {
            two.calculateMonthlyInterest();
            System.out.println("Month " + (i + 1) + ": ");
            System.out.printf("%.2f\n", two.getBalance());
        }
    }
}
