import java.util.Scanner;

public class LibraryApp {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        LibrarySystem system = new LibrarySystem();

        int choice;

        do {
            printMenu();
            System.out.print("Enter your choice: ");

            while (!sc.hasNextInt()) {
                System.out.print("Please enter a valid number: ");
                sc.next();
            }
            choice = sc.nextInt();
            sc.nextLine(); 

            // Using The Switch Case for Input from User
            switch (choice) {
                case 1:
                    system.addBook(sc);
                    break;
                case 2:
                    system.viewAllBooks();
                    break;
                case 3:
                    system.searchBookByTitle(sc);
                    break;
                case 4:
                    system.addMember(sc);
                    break;
                case 5:
                    system.viewAllMembers();
                    break;
                case 6:
                    system.issueBook(sc);
                    break;
                case 7:
                    system.returnBook(sc);
                    break;
                case 8:
                    system.viewIssuedBooks();
                    break;
                case 0:
                    System.out.println("Exiting Library Management System,Goodbye!!");
                    break;
                default:
                    System.out.println("Invalid choice!Try again!!");
            }

        } while (choice != 0);

        sc.close();
    }

    private static void printMenu() {
        System.out.println("\n===== Library Management System =====");
        System.out.println("1. Add Book");
        System.out.println("2. View All Books");
        System.out.println("3. Search Book by Title");
        System.out.println("4. Add Member");
        System.out.println("5. View All Members");
        System.out.println("6. Issue Book");
        System.out.println("7. Return Book");
        System.out.println("8. View Currently Issued Books");
        System.out.println("0. Exit");
    }
}
