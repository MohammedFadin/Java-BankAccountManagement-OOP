/**
 * Created by mohammedfadin on 3/15/15.
 */
public class polyMain
{
    public static void main(String [] argc)
    {

    }

    public static void codeLesson()
    {
        //Reference Type  and instance actual type
        Bank test = new NCB();
        // Since paymentMethod is overridden
        // and when calling from a Super ref type
        // JVM will look for paymentMethod in Super
        // but at the runtime its going to use
        // the method in the child class, that overrided
        // that method
        test.paymentMethod();

        // someMethod() Cannot be called, because of Ref type but we can
        // cast it to NCB type to access that method
        NCB tempTest = (NCB) test;
        tempTest.someMethod();
    }
}
