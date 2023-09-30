import java.util.Scanner;

public class index {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int choice = 0;

        while (choice != 5) {
            System.out.println("Main Menu:");
            System.out.println("1. Option 1");
            System.out.println("2. Option 2");
            System.out.println("3. Option 3");
            System.out.println("4. Option 4");
            System.out.println("5. Exit");

            System.out.print("Enter your choice (1-5): ");

            if (scanner.hasNextInt()) {
                choice = scanner.nextInt();
                scanner.nextLine(); // Consume the newline character
                switch (choice) {
                    case 1:
                        // Perform action for Option 1
                        System.out.println("Hello 1.");
                        break;
                    case 2:
                        // Perform action for Option 2
                        System.out.println("Hello 2.");
                        break;
                    case 3:
                        // Perform action for Option 3
                        System.out.println("Hello 3.");
                        break;
                    case 4:
                        // Perform action for Option 4
                        System.out.println("Hello 4.");
                        break;
                    case 5:
                        // Exit the program
                        System.out.println("Exiting program.");
                        break;
                    default:
                        System.out.println("Invalid choice. Please enter a valid option (1-5).");
                        break;
                }
            } else {
                // User input is not an integer
                System.out.println("Invalid input. Please enter a valid option (1-5).");
                scanner.nextLine(); // Consume the invalid input
            }
        }

        scanner.close();
    }
}