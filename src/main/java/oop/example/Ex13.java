
/*
 *  UCF COP3330 Summer 2021 Assignment 1 Solution
 *  Copyright 2021 Michael Hickey
 */

package oop.example;
import java.util.Scanner;
import java.lang.Math;

public class Ex13 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("What is the principal amount? ");
        double principal = scanner.nextDouble();
        System.out.println("What is the rate? ");
        double rate = scanner.nextDouble();
        System.out.println("What is the number of years? ");
        double years = scanner.nextDouble();
        System.out.println("What is the number of times the interest is compounded per year? ");
        double comp = scanner.nextDouble();

        double calcInterest = rate / 100;
        double investment = principal * Math.pow((1 + calcInterest/comp), (comp * years));
        double roundedInvestment = Math.round(investment * 100.0) / 100.0;

        System.out.println("$" + principal + " invested at " + rate + "% for " + years + " years compounded " + comp + " times per year is " + roundedInvestment);
    }
}