package org.yearup;

import java.util.Scanner;


public class Main {
    public static void main(String[] args)
    {
        Scanner userInput = new Scanner(System.in);
        //Mortgage Calculator

        double loanAmount;
        double interestRate;
        int numberOfMonths;
        double monthlyInterestrate; // 100 gets 100th place and 12 divided by number of months
        double monthlypayment;

        //User input questions
        System.out.println("MORTGAGE CALCULATOR");
        System.out.println("---------------------------");
        System.out.print("What is your loan amount?");
        loanAmount = userInput.nextDouble();
        userInput.nextLine();
        System.out.println("---------------------------");

        System.out.print("What is your annual interest rate?");
        interestRate = userInput.nextDouble();
        userInput.nextLine();
        System.out.println("---------------------------");

        System.out.print("Total number of months");
        numberOfMonths= userInput.nextInt();
        userInput.nextLine();
        monthlyInterestrate = (interestRate/1200);
        monthlypayment =
               loanAmount * (monthlyInterestrate/(1-(Math.pow(1+monthlyInterestrate,-numberOfMonths))));
        double TotalAmount = (monthlypayment*monthlyInterestrate*numberOfMonths)+loanAmount;

        System.out.println("---------------------------");
        System.out.println("Monthly Interest Rate = " + monthlyInterestrate);

        System.out.println("---------------------------");
        System.out.println("Monthly Payment = $" + monthlypayment);

        System.out.println("---------------------------");
        System.out.println("Total = $" + TotalAmount);

    }
}