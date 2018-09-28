package jhoang6606;

import java.util.Scanner;

public class hangman {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        String pInput = "";
        String word = "";
        String hWord = "";
        Boolean p = true;
        int length = 0;
        System.out.println("This hangman is a two player game, where the first player chooses a word and the second player guesses it. The second player has 10 guesses before they are hanged. Type ok when you two are ready.");
        pInput = input.nextLine();
        if (pInput.equals("ok"))
        {
            System.out.println("Player one input your word.");
            word = input.nextLine();
            length = word.length();
            for (int x = 0; x < length; x++)
            {
                if (word.indexOf(" ") == (x))
                {
                    hWord = hWord + " ";
                    word = word.substring(word.indexOf(" ") + 1);
                }
                else {
                    hWord = hWord + "_";
                }
            }
            for (int i = 0; i < 20; i++)
            {
                System.out.println("");
            }
            System.out.println("The word has " + length + " letters. Please begin guessing.");
            System.out.println(hWord);
            while (p)
            {
                pInput = input.nextLine();
            }
        }

    }
}
