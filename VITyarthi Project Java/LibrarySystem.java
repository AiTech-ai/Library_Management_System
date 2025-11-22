import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;
import java.time.LocalDate;

// Defining the class
public class LibrarySystem {

    private List<Book> books;
    private List<Member> members;
    private List<IssueRecord> records;

    private int nextBookId = 1;
    private int nextMemberId = 1;
    private int nextTransactionId = 1;

    // defining the arraylist 
    public LibrarySystem() {
        books = new ArrayList<>();
        members = new ArrayList<>();
        records = new ArrayList<>();
    }

    // methods
    public void addBook(Scanner sc) {
        System.out.println("\n--- Add New Book ---");
        System.out.print("Enter book title: ");
        String title = sc.nextLine();

        System.out.print("Enter author name: ");
        String author = sc.nextLine();

        System.out.print("Enter total copies: ");
        int copies = readInt(sc);

        Book book = new Book(nextBookId++, title, author, copies);
        books.add(book);
        System.out.println("Book added successfully with ID: " + book.getId());
    }

    public void viewAllBooks() {
        System.out.println("\n--- All Books ---");
        if (books.isEmpty()) {
            System.out.println("No books found.");
            return;
        }
        for (Book b : books) {
            System.out.println(b);
        }
    }

    public void searchBookByTitle(Scanner sc) {
        System.out.println("\n--- Search Book by Title ---");
        System.out.print("Enter title keyword: ");
        String keyword = sc.nextLine().toLowerCase();

        boolean found = false;
        for (Book b : books) {
            if (b.getTitle().toLowerCase().contains(keyword)) {
                System.out.println(b);
                found = true;
            }
        }
        if (!found) {
            System.out.println("No matching books found.");
        }
    }

    public void addMember(Scanner sc) {
        System.out.println("\n--- Add New Member ---");
        System.out.print("Enter member name: ");
        String name = sc.nextLine();

        System.out.print("Enter email: ");
        String email = sc.nextLine();

        Member member = new Member(nextMemberId++, name, email);
        members.add(member);
        System.out.println("Member added with ID: " + member.getMemberId());
    }

    public void viewAllMembers() {
        System.out.println("\n--- All Members ---");
        if (members.isEmpty()) {
            System.out.println("No members found.");
            return;
        }
        for (Member m : members) {
            System.out.println(m);
        }
    }

    public void issueBook(Scanner sc) {
        System.out.println("\n--- Issue Book ---");
        System.out.print("Enter Book ID: ");
        int bookId = readInt(sc);

        System.out.print("Enter Member ID: ");
        int memberId = readInt(sc);

        Book book = findBookById(bookId);
        if (book == null) {
            System.out.println("Book not found.");
            return;
        }

        Member member = findMemberById(memberId);
        if (member == null) {
            System.out.println("Member not found.");
            return;
        }

        if (!book.issueOneCopy()) {
            System.out.println("Book is not available (no copies left).");
            return;
        }

        LocalDate issueDate = LocalDate.now();
        LocalDate dueDate = issueDate.plusDays(14); 

        IssueRecord record = new IssueRecord(
                nextTransactionId++, book, member, issueDate, dueDate
        );
        records.add(record);

        System.out.println("Book issued successfully.");
        System.out.println(record);
    }

    public void returnBook(Scanner sc) {
        System.out.println("\n--- Return Book ---");
        System.out.print("Enter Transaction ID: ");
        int txnId = readInt(sc);

        IssueRecord record = findRecordById(txnId);
        if (record == null) {
            System.out.println("Transaction not found.");
            return;
        }

        if (record.isReturned()) {
            System.out.println("This book is already returned.");
            return;
        }

        record.markReturned(LocalDate.now());
        record.getBook().returnoneCopy();
        System.out.println("Book returned successfully.");
        System.out.println(record);
    }

    public void viewIssuedBooks() {
        System.out.println("\n--- Currently Issued Books ---");
        boolean any = false;
        for (IssueRecord r : records) {
            if (!r.isReturned()) {
                System.out.println(r);
                any = true;
            }
        }
        if (!any) {
            System.out.println("No active issued books.");
        }
    }


    private Book findBookById(int id) {
        for (Book b : books) {
            if (b.getId() == id) {
                return b;
            }
        }
        return null;
    }

    private Member findMemberById(int id) {
        for (Member m : members) { // this is for each loop 
            if (m.getMemberId() == id) {
                return m;
            }
        }
        return null;
    }

    private IssueRecord findRecordById(int txnId) {
        for (IssueRecord r : records) {
            if (r.getTransactionId() == txnId) {
                return r;
            }
        }
        return null;
    }

    private int readInt(Scanner sc) {
        while (!sc.hasNextInt()) {
            System.out.print("Please enter a valid number: ");
            sc.next();
        }
        int value = sc.nextInt();
        sc.nextLine(); 
        return value;
    }
}
