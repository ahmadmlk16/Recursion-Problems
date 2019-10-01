/*
Write a Recursive method that will write a string in reverse. eg book as koob.
 */

import java.util.Scanner;

public class Main {
    public static void main (String args[]){

        Scanner input = new Scanner(System.in);
        System.out.println("Enter a word" );
        String word = input.nextLine();

        System.out.println("The word in reverse is " + WordRev(word));
    }
public static String WordRev(String word){
       String word2;
        if( word.length()==0){
            return "";
        }
        else
            word2= WordRev(word.substring(1))+word.charAt(0);
            return word2;

}

}
