import java.io.File;
import java.util.Scanner;

class FileReading12 {
  public static void main(String[] args) {
    try {
      System.out.println("Looking for files in: " + new File(".").getAbsolutePath());

      File vowel = new File("./vowels.txt");
      File consonant = new File("./consonants.txt");
      Scanner vowelr = new Scanner(vowel);
      Scanner consonantr = new Scanner(consonant);

      System.out.print("Vowels:");
      while (vowelr.hasNextLine()) {
        String line = vowelr.nextLine();
        System.out.println(line);
      }

      System.out.print("Consonants:");
      while (consonantr.hasNextLine()) {
        String line = consonantr.nextLine();
        System.out.println(line);
      }

      vowelr.close();
      consonantr.close();

    } catch (Exception e) {
      System.out.println("An error occurred.");
      e.printStackTrace();
    }
  }
}
