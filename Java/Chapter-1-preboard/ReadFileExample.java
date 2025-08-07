import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

public class ReadFileExample {
    public static void main(String[] args) {
        try {
            File file = new File("test.txt"); // Make sure test.txt is in the same folder
            Scanner scanner = new Scanner(file); // Read the file

            while (scanner.hasNextLine()) {
                String line = scanner.nextLine(); // Read each line
                System.out.println(line); // Print the line
            }

            scanner.close(); // Close the scanner
        } catch (FileNotFoundException e) {
            System.out.println("File not found!");
        }
    }
}
