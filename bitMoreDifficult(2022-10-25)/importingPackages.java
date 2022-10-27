import java.util.Scanner; // use "import" keyword to use a package from any library.
// Using "Scanner" class from the java.util package.

// To use everything from a package, use a *.
// e.g. "import java.util.*"

public class importingPackages {
    public static void main(String[] args) {

        Scanner newObj = new Scanner(System.in); // Scanner allows for user input.
        System.out.println("Enter your name:");

        String yourName = newObj.nextLine(); // next is a method within Scanner, prints a new line.
        System.out.println("Hi " + yourName);

        newObj.close(); // closing the scanner.
    }
}
