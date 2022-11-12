import java.util.Scanner;

public class inputOutput {
    public static void main(String[] args) {
        System.out.println("Enter first number:");
        int a = Integer.parseInt(System.console().readLine()); // using console().readLine(); reads string values.
        System.out.println("Enter second number:");
        int b = Integer.parseInt(System.console().readLine());
        System.out.println("Addition:");
        System.out.println(a + b);

        System.out.println("Enter a line of text: ");
        Scanner scan = new Scanner(System.in); // Using scanner, from the java.util package.
        String textA = scan.nextLine();
        System.out.println("You're entered text: " + textA);
        scan.close();
    }
}
