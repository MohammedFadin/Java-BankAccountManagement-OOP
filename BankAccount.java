/**
 * Created by mohammedfadin on 3/15/15.
 */
class BankAccount
{
    private String name;
    private String address;
    private double currentBalance; // Default 0

    public BankAccount(String name, String address)
    {
        this.name = name;
        this.address = address;
        currentBalance = 0.00;
    }

    //Overloading constructor
    public BankAccount(String name, String address, double currentBalance)
    {
        this.name = name;
        this.address = address;
        this.currentBalance = currentBalance;
    }

    // Extra, for log checking (for fun)
    // method cannot be overriden due to final
    public final void log(String accountOwnerName)
    {
        System.out.println("New (" + accountOwnerName +
                ")'s account has been logged!");
    }

    // Encapsulations
    public String getName()
    {
        return name;
    }

    public void setName(String name)
    {
        this.name = name;
    }

    public String getAddress()
    {
        return address;
    }

    public void setAddress(String address)
    {
        this.address = address;
    }

    public double getCurrentBalance()
    {
        return currentBalance;
    }

    public void setCurrentBalance(double currentBalance)
    {
        this.currentBalance = currentBalance;
    }

    @Override
    public String toString() {
        return "BankAccount{" +
                "name='" + name + '\'' +
                ", address='" + address + '\'' +
                ", currentBalance=" + currentBalance +
                '}';
    }
}
