/**
 * Created by mohammedfadin on 3/15/15.
 */
class Bank {

    public void paymentMethod()
    {
        System.out.println("Payment method parent");
    }

    public void license(String id)
    {
        System.out.println("Bank Saudi License");
    }

    // Part of polymorphism, overloading
    public void license(int id)
    {
        System.out.println("license 2");
    }

}
