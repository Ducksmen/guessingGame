package jhoang6606;

import java.util.InputMismatchException;
import java.util.Scanner;

public class guessing {

    public static void main(String[] args)
    {
        int rNumber = (int )(Math.random() * 100 + 1);
        Boolean p = true;
        Scanner input = new Scanner(System.in);
        int numGuesses = 1;
        int gNumber = 0;
        String name = "";
        String stream = "";
        System.out.println("Before we begin tell me your name.");
        name = input.nextLine();
        System.out.println("Can you guess what number I'm thinking of, " + name + "?(It's between 1 and 100)");
        while (p)
        {
            try
            {
                gNumber = input.nextInt();
                if (gNumber > 100 || gNumber < 1)
                {
                    System.out.println("Please type a correct input, " + name + ".");
                }
            }
            catch (InputMismatchException e)
            {
                System.out.println("Please type in a number, " + name + ".");
                stream = input.next();
            }
            if (rNumber == gNumber)
            {
                numGuesses++;
                System.out.println("Wow you actually got it, nice job, " + name + ".");
                System.out.println("It took you " + numGuesses + " guess(es).");
                p = false;
            }
            else
            {
                numGuesses++;
                System.out.println("Try again.");
                new Scanner(System.in);
            }
        }
    }
}
