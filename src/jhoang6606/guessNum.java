package jhoang6606;

import java.util.Scanner;

public class guessNum {

    public static void main(String[] args)
    {
        Boolean p = true;
        Scanner input = new Scanner(System.in);
        int cGuess = 50;
        int llimit = 1;
        int ulimit = 100;
        System.out.println("My guess is " + cGuess + ". (Type higher, lower or correct.)");
        while ( p == true)
        {
            String pAnswer = input.nextLine();
            if (pAnswer.equals("lower"))
            {
                cGuess = ((cGuess - llimit) / 2) + cGuess;
                System.out.println("My guess is " + cGuess + ". (Type higher, lower or correct.)");
                new Scanner(System.in);
            }
            if (pAnswer.equals("higher"))
            {
                cGuess = ((ulimit - cGuess) / 2) + llimit;
                llimit = cGuess;
                System.out.println("My guess is " + cGuess + ". (Type higher, lower or correct.)");
                new Scanner(System.in);
            }
            if (pAnswer.equals("correct"))
            {
                System.out.println("That was too easy.");
                p = false;
            }
        }
    }
}