import java.time.LocalDate;

public class IssueRecord {
    private int transactionId;
    private Book book;
    private Member member;
    private LocalDate issueDate;
    private LocalDate dueDate;
    private LocalDate returnDate;

    public IssueRecord(int transactionId, Book book, Member member,
                       LocalDate issueDate, LocalDate dueDate) {
        this.transactionId = transactionId;
        this.book = book;
        this.member = member;
        this.issueDate = issueDate;
        this.dueDate = dueDate;
        this.returnDate = null;
    }

    public int getTransactionId() {
        return transactionId;
    }

    public Book getBook() {
        return book;
    }

    public Member getMember() {
        return member;
    }

    public LocalDate getIssueDate() {
        return issueDate;
    }

    public LocalDate getDueDate() {
        return dueDate;
    }

    public LocalDate getReturnDate() {
        return returnDate;
    }

    public boolean isReturned() {
        return returnDate != null;
    }

    public void markReturned(LocalDate date) {
        this.returnDate = date;
    }

    @Override
    public String toString() {
        return "Txn ID: " + transactionId +
               ", Book: [" + book.getTitle() + "]" +
               ", Member: [" + member.getName() + "]" +
               ", Issued: " + issueDate +
               ", Due: " + dueDate +
               ", Returned: " + (returnDate == null ? "Not yet" : returnDate);
    }
}
