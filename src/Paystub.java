import java.util.Scanner;

public class Paystub {

    public static void main(String [] args)
    {
        //Variables
        String name; //Name of Employee
        double hours; //Hours worked per week
        double payRate; //Dollars made per hour
        double fedTax; //federal tax bracket
        double stateTax; //State Tax Bracket
        Scanner inputBox = new Scanner(System.in); //creates a box for entries from User

        //Input
        System.out.println("What is your name?");
        name = inputBox.nextLine();
        System.out.println("How many hours did you work last week?");
        hours = inputBox.nextDouble();
        System.out.println("What is your hourly pay?");
        payRate = inputBox.nextDouble();
        System.out.println("What is your State Tax-Bracket?");
        stateTax = inputBox.nextDouble();
        System.out.println("What is your Federal Tax-Bracket?");
        fedTax = inputBox.nextDouble();

        //Output
        System.out.println(name + ", you worked " + hours + " hours " + "at an hourly pay rate of $" + payRate + ".");
        double grossPay = ((hours * payRate)*4);
        System.out.println("Your gross income for the current pay period is: $" + grossPay + ".");
        double fedWithold = grossPay * (fedTax / 100);
        System.out.println("The amount withheld from Federal Taxes is: $" + fedWithold + ".");
        double stateWithhold = grossPay * (stateTax / 100);
        System.out.println("The amount witheld from State Taxes is: $" + stateWithhold + ".");
        double finalPay = grossPay - fedWithold - stateWithhold;
        System.out.println("After deductions, your takehome pay is $" + finalPay + ".");
    }//end string
}//end class
