import java.io.File;
import java.io.FileWriter;
import java.util.Scanner;

class FileWriting11{
  public static void main(String[] args){
    File consonant = new File("./consonants.txt");
    File vowel = new File("./vowels.txt");


    try {
      if (consonant.createNewFile()) {
        System.out.println("Consonant File created");
      } else {
        System.out.println("File already exists.");
      }

      if (vowel.createNewFile()) {
        System.out.println(" Vowel File created");
      } else {
        System.out.println("File already exists.");
      }

    } catch (Exception e) {
      System.out.println("An error occurred.");
    }

        Scanner sc = new Scanner(System.in);
    System.out.println("Enter a string:");
    String str = sc.nextLine();


    try(FileWriter consonantw = new FileWriter(consonant); FileWriter vowelw = new FileWriter(vowel)) {
      
    for (int i=0;i<str.length();i++){
      char ch = str.charAt(i);
      if (ch == 'a' || ch == 'e' || ch == 'i' || ch == 'o' || ch == 'u') {
        vowelw.write(ch);
      } else {
        consonantw.write(ch);
      }
    }
    } catch (Exception e) {
      System.out.println("An error occurred.");
    }
  }
}
