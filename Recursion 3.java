package AhmadMalik;

/*
Write a static recursive method that returns the sum of integers in an array of integer values.
 */
import java.util.Scanner;
public class Main {

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        int[] arr = new int[10];

        for (int i = 0; i < 10; i++) {
            System.out.println("Enter integer number " + (i+1) + " :");
            arr[i] = input.nextInt();



        }
        int n = 10;
        System.out.println("Sum of digits of array = " + SumDigit(arr, n));
    }
public static int SumDigit(int arr [], int n){

        if (n==1)
            return arr [n-1];
        else
            return
                    (arr[n-1]+SumDigit(arr , n-1));
        }


}
