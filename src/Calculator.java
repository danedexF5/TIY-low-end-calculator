import java.util.Scanner;

/**
 * Created by danedexheimer on 4/14/16.
 */
public class Calculator {
    public static void main(String[] args){

        // setup the variables
        int num1;
        int num2;
        String operation;

        // setup the scanner
        Scanner input = new Scanner(System.in);
        Scanner op = new Scanner(System.in);

        //ask the user what their number is?
        System.out.println("Number?");
        num1 = input.nextInt();

        //ask the user what their number is?
        System.out.println("Number?");
        num2 = input.nextInt();

        //ask the user for the operation?
        System.out.println("Operation Type?");
        operation = op.next();

        //if statements for the +
        if (operation.equals("+"))
        {
            System.out.println("Your answer is" + (num1 + num2));
        }

        //if statements for -
        if (operation.equals("-"))
        {
            System.out.println("Your answer is" + (num1 - num2));
        }

        //if statements for /
        if (operation.equals("/"))
        {
            System.out.println("Your answer is" + (num1 / num2));
        }

        //if statement for *
        if (operation.equals("*"))
        {
            System.out.println("Your answer is" + (num1 * num2));
        }





    }
}
