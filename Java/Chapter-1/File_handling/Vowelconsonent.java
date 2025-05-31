//write a program to read input from user and check the vowel and consonant 
import java.util.Scanner;
import java.io.FileWriter;

public class Vowelconsonent {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.println("Enter a word: ");
        String word = input.nextLine().toLowerCase(); // convert to lowercase

        try {
            FileWriter vowelFile = new FileWriter("vowel.txt", true);
            FileWriter consonantFile = new FileWriter("consonant.txt", true);

            for (int i = 0; i < word.length(); i++) {
                char ch = word.charAt(i);

                if (Character.isLetter(ch)) {
                    if (ch == 'a' || ch == 'e' || ch == 'i' || ch == 'o' || ch == 'u') {
                        vowelFile.write(ch + "\n"); // write vowel
                    } else {
                        consonantFile.write(ch + "\n"); // write consonant
                    }
                }
            }

            vowelFile.close();
            consonantFile.close();

            System.out.println("Letters written to vowel.txt and consonant.txt");

        } catch (Exception e) {
            System.out.println("Error writing to file: " + e.getMessage());
        }

        input.close();
    }
}
