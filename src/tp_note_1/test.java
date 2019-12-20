package tp_note_1;
import java.util.Scanner;
import java.util.InputMismatchException;
public class test
{
    // create function readint for reading input value.
    public static int readInt(String msg)
    {
        boolean error=false;
        int x=0;
        do
        {
            try
            {
                // create object of scanner class.
                Scanner KB=new Scanner(System.in);

                // enter here.
                System.out.print("Enter integer : ");
                x=KB.nextInt();
                error=false;
            }
            catch(InputMismatchException e)
            {
                // accept integer only.
                System.out.println("Invalid Input..Pls Input Integer Only..");
                error=true;
            }
        }
        while(error);
        return(x);
    }
}