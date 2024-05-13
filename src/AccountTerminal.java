import java.util.Scanner;

public class AccountTerminal {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        int agencyNumber = 0;
        String clientName = "";
        double balance = 0.0;

        boolean isValidAgency = false;
        while (!isValidAgency) {
            System.out.println("Enter the agency number: ");
            if (scanner.hasNextInt()) {
                agencyNumber = scanner.nextInt();
                isValidAgency = true;
            } else {
                System.out.println("Error, please enter a numeric type");
                scanner.next();
            }
        }

        boolean isValidClientName = false;
        while (!isValidClientName) {
            System.out.println("Enter username: ");
            if (scanner.hasNext()) {
                clientName = scanner.next();
                isValidClientName = true;
            } else {
                System.out.println("Error, please enter a valid format");
                scanner.next();
            }
        }

        boolean isValidBalance = false;
        while (!isValidBalance) {
            System.out.println("Enter account balance: ");
            if (scanner.hasNextDouble()) {
                balance = scanner.nextDouble();
                isValidBalance = true;
            } else {
                System.out.println("Error, please enter a valid format");
                scanner.next();
            }
        }

        System.out.print("Agency number: " + agencyNumber + " | ");
        System.out.print("Username: " + clientName + " | ");
        System.out.print("Account balance: " + "$" + balance + " | ");

        scanner.close();
    }
}