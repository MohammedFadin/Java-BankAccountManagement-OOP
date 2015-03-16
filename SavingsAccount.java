/**
 * Created by mohammedfadin on 3/16/15.
 */
public class SavingsAccount extends BankAccount
{
    private double roi; // Rate of Interest

    public SavingsAccount(String name, String address) {
        super(name, address);
    }

    //Overloading constructor
    public SavingsAccount(String name, String address, double currentBalance)
    {
        super(name, address, currentBalance); // Create bank account
        log(name);
    }

    public double getRoi()
    {
        return roi;
    }

    public void setRoi(double roi)
    {
        this.roi = roi;
    }

    // Public interface to call the original method
    public double getDailyInterest()
    {
           return _getDailyInterest(getCurrentBalance());
    }

    private double _getDailyInterest(double currentBalance)
    {
        //dailyInterest = currentBalance * interestRate / 365
        return currentBalance * roi / 365;
    }
}
