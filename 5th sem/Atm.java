/*
Write a simple ATM Program to display the following options and perform the user-selective operation until the user exits from the program.
· Initial account pin is 1234 and the balance of the user is 0.
· Read the PIN from the user and if it matches then print and execute the following operations as per user selection.
1. Deposit
2. Withdraw
3. Balance enquiry
4. PIN change
5. Exit
· Return the total available balance after the deposit.
· Return the total available balance after the withdrawal.
· Return the total available balance after the Balance check.
· Return “PIN Change” after the pin change operation.
Transaction(1) : input: 5000 output:5000

*/

import java.util.Scanner;

class Atm{
    static int pin=1234;
    static int balance = 0;
    Scanner in = new Scanner(System.in);
    public static void main(String[] args) {
        start();
    }
    public static void start(){
        Scanner in = new Scanner(System.in);

        System.out.println("Enter the pin:");
        int temp = in.nextInt();
        if(temp == pin)
            while(true)
                atm();
        else
        System.err.println("Wrong pin! Try again.");
        start();
    }
    public static void atm(){
        Scanner in = new Scanner(System.in);
        System.out.println("1. Deposit\n" + //
                "2. Withdraw\n" + //
                "3. Balance enquiry\n" + //
                "4. PIN change\n" + //
                "5. Exit");
        System.out.print("Choice: ");
        int choice = in.nextInt();
        switch (choice) 
        {
            case 1:
                System.out.println("Enter the anount to deposit.");
                int deposit = in .nextInt();
                if(deposit>0)
                    balance += deposit;
                printBalance();
                break;
            
            case 2:
                System.out.println("Enter the amount to withdraw.");
                int withdraw = in.nextInt();
                if(withdraw<=balance)
                    {
                        if(withdraw == 100|| withdraw == 200 || withdraw == 500)
                        {
                            System.out.println(withdraw +"Rs withdrawed.");
                            balance -= withdraw;
                        }
                        else
                        System.out.println("Enter 100, 200 or 500. ");
                    }
                    else
                    System.out.println("Insufficient Balance!");
                    printBalance();
                    break;

            case 3:
                printBalance();
            case 4:
                int temp;
                System.out.println("Enter current pin.");
                temp = in.nextInt();
                if(temp == pin){
                    System.out.println("Enter the new pin.");
                    pin = in.nextInt();
                    System.out.println("Pin changed. Please login again.");
                    start();
                }
                else
                System.out.println("Wrong pin.");
                break;
            case 5:
            System.exit(0);
        
            default:
                System.out.println("Wrong choice!");
                break;
        }
    }
    public static void printBalance(){
        System.out.println("*******\nBalance: "+balance+"\n******* ");
    }
}