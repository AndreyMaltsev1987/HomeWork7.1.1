import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;

public class Book {
    private String title;
    private String author;

    public Book(String title, String author) {
        this.title = title;
        this.author = author;
    }

    public String getTitle() {
        return title;
    }

    public String getAuthor() {
        return author;
    }
}

class LibraryCard {
    private int ticketNumber;

    public LibraryCard(int ticketNumber) {
        this.ticketNumber = ticketNumber;
    }

    public int getTicketNumber() {
        return ticketNumber;
    }
}



class LibraryJournalEntry {
    private Book book;
    private int ticketNumber;
    private LocalDate issueDate;
    private int loanPeriodDays;

    public LibraryJournalEntry(Book book, int ticketNumber, LocalDate issueDate, int loanPeriodDays) {
        this.book = book;
        this.ticketNumber = ticketNumber;
        this.issueDate = issueDate;
        this.loanPeriodDays = loanPeriodDays;
    }

    public Book getBook() {
        return book;
    }

    public int getTicketNumber() {
        return ticketNumber;
    }

    public LocalDate getIssueDate() {
        return issueDate;
    }

    public LocalDate getDueDate() {
        return issueDate.plusDays(loanPeriodDays);
    }

    public void setReturnDate(LocalDate returnDate) {
    }
}



