package jhoang6606;

import java.util.Scanner;

public class guessNum {

    public static void main(String[] args)
    {
        Boolean p = true;
        Scanner input = new Scanner(System.in);
        int cGuess = 50;
        int llimit = 0;
        int ulimit = 101;
        int numGuess = 1;
        String name = "";
        System.out.println("Before we begin tell me your name.");
        name = input.nextLine();
        System.out.println("My guess is " + cGuess + ". Is that correct, " + name + "? (Type higher, lower or correct.)");
        while ( p)
        {
            String pAnswer = input.nextLine();
            if (pAnswer.equals("lower"))
            {
                numGuess++;
                ulimit = cGuess;
                cGuess = ((ulimit - llimit) / 2) + llimit;
                System.out.println("My guess is " + cGuess + ". Is that correct, " + name + "? (Type higher, lower or correct.)");
                new Scanner(System.in);
            }
            if (pAnswer.equals("higher"))
            {
                numGuess++;
                llimit = cGuess;
                cGuess = ((ulimit - cGuess) / 2) + llimit;
                System.out.println("My guess is " + cGuess + ". Is that correct, " + name + "? (Type higher, lower or correct.)");
                new Scanner(System.in);
            }
            if (pAnswer.equals("correct"))
            {
                System.out.println("That was too easy.");
                System.out.println("I got your number in " + numGuess + " guess(es), " + name + ".");
                p = false;
            }
            if (!pAnswer.equals("lower") && !pAnswer.equals("higher") && !pAnswer.equals("correct"))
            {
                System.out.println("Please type in a correct input, " + name + ".");
            }
        }
    }
}