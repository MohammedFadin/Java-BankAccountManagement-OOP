/**
 * Created by mohammedfadin on 3/15/15.
 */
import java.util.*;

public class MainProgram
{
    private Scanner input = new Scanner(System.in);
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

        /*
            Let's play with some Arraylist
            Remember that ArrayList is dynamic,
            meaning it can exceeds whenever it has to
            however, you still need to set the initial size
         */
        List<SavingsAccount> ownersList = new ArrayList<SavingsAccount>(); // Store account owners here
        ownersList.add(new SavingsAccount("Mohammed Fadin", "Dhahran", 10000));
        ownersList.add(new SavingsAccount("Hussein Fadin", "Jeddah", 40000));

        Iterator<SavingsAccount> iterator = ownersList.iterator();
        System.out.println("Bank Accounts List");
        while(iterator.hasNext())
        {
            String temp = iterator.next().getName();
            System.out.println(temp);
        }

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
