/*
Class NumToCompare
    main()
        int numOne = 0
        int numTwo = 0
        output("What is your number one? ")
        if(input is integer) then
            input numOne
        else
            terminate
        end If
        output("What is your number two? ")
        if (input is integer) then
            input numTwo
        else
            terminate
        end If
        if (numOne == numTwo) then
            output("The numbers are equal")
        else if (numOne > numTwo) then
            output("Number one is larger than number Two")
        else if (numOne < numTwo) then
            output ("Number one is less than number Two")
        end if
    return
End Class
 */
import java.util.Scanner;
public class Num_To_Compare {
    public static void main(String[] args)
    {
        int numOne = 0;
        int numTwo = 0;


        Scanner in = new Scanner(System.in);

        System.out.print("What is you number one? ");
        if(in.hasNextInt()) {
            numOne = in.nextInt();
            in.nextLine();
        }else
        {
            System.out.println("Your number is invalid! ");
            System.exit(0);
        }
        System.out.print("What is your number two? ");
        if(in.hasNextInt())
        {
            numTwo = in.nextInt();
            in.nextLine();
        }else
        {
            System.out.println("Your number is invalid! ");
            System.exit(0);
        }
        if (numOne == numTwo)
        {
            System.out.println("The numbers are equal! " + numOne + ", " + numTwo);
        } else if (numOne > numTwo)
        {
            System.out.println("Number one " + numOne + " is larger than number two " + numTwo  +".");
        } else if (numOne < numTwo)
        {
            System.out.println("Number one " + numOne + " is less than number two " + numTwo + ".");
        }
    }
}