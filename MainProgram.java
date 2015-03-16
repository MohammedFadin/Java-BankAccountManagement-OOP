/**
 * Created by mohammedfadin on 3/15/15.
 */
public class MainProgram
{
    public static void main(String [] argc)
    {
        // Ref SavingsAccount
        SavingsAccount account1 = new
                SavingsAccount("Mohammed Fadin", "Saudi Arabia", 503.2);
        account1.setRoi(0.02);
        System.out.println(account1.toString());
        System.out.println(account1.getDailyInterest()); // 0.02757260273972603

        SavingsAccount account2 = new
                SavingsAccount("Abdullah Fadin", "Saudi Arabia");
        System.out.println(account2.toString());
        System.out.println(account2.getDailyInterest()); //0.0
    }

    public static void codeLesson()
    {
        //Reference Type  and instance actual type
        //Bank test = new NCB();
        // Since paymentMethod is overridden
        // and when calling from a Super ref type
        // JVM will look for paymentMethod in Super
        // but at the runtime its going to use
        // the method in the child class, that overrided
        // that method
        //test.paymentMethod();

        // someMethod() Cannot be called, because of Ref type but we can
        // cast it to NCB type to access that method
        //NCB tempTest = (NCB) test;
        //tempTest.someMethod();
    }
}
