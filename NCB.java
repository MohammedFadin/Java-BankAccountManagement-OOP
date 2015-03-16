/**
 * Created by mohammedfadin on 3/15/15.
 */
public class NCB extends Bank
{

    @Override // Runtime binding or Overriding
    public void paymentMethod()
    {
        System.out.println("Payment method from NCB");
    }

    // Wont execute since it's not in the Bank class
    public void someMethod()
    {
        System.out.println(getClass().toString());
    }
}
