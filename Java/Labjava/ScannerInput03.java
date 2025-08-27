import java.util.Scanner;
class ScannerInput03 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.print("Enter first number:");
        int num1 = scan.nextInt();
        System.out.print("Enter second number:");
        int num2 = scan.nextInt();
        System.out.println("Sum : " + (num1+num2));
    }
}
