package AhmadMalik;
/*
Write a recursive method that calculates the interest rates on some money in a bank account for a given number of months
if the interest rate = 1.005*money in account.
 */
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
      Scanner input= new Scanner(System.in);
        System.out.println("Enter the amount in your bank");
       double m = input.nextDouble();
        System.out.println("Enter the amount of months");
        int t = input.nextInt();

        System.out.println("The amount in your account with 0.005% interest after "+t+" months is : "+ IntCalc(m,t));
    }
    public static double IntCalc(Double m, int t){
        if (t ==1){
            return m+ ((m*t*.005)/100);}
        else
            return   m+ ((m*t*1.005)/100)+ IntCalc(m,t-1);
        }
    }
