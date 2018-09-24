package jhoang6606;

import java.util.Scanner;

public class guessing {

    public static void main(String[] args)
    {
        int rNumber = (int )(Math.random() * 100 + 1);
        Boolean p = true;
        Scanner input = new Scanner(System.in);
        System.out.println("Can you guess what number I'm thinking of?(It's between 1 and 100)");
        while (p == true)
        {
            int gNumber = input.nextInt();
            if (rNumber == gNumber)
            {
                System.out.println("Wow you actually got it, nice job.");
                p = false;
            }
            else
            {
                System.out.println("Haha try again.");
                new Scanner(System.in);
            }
        }
    }
}
