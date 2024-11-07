import java.util.ArrayList;
import java.util.List;

/**
 * Class representing a Library that manages books, members, and staff.
 */
public class Library {
    private List<Book> books;
    private List<Member> members;
    private List<Staff> staff;

    /**
     * Constructs a new Library.
     */
    public Library() {
        this.books = new ArrayList<>();
        this.members = new ArrayList<>();
        this.staff = new ArrayList<>();
    }

    /**
     * Adds a new book to the library.
     * @param book The book to be added.
     */
    public void addBook(Book book) {
        books.add(book);
    }

    /**
     * Registers a new member in the library.
     * @param member The member to be registered.
     */
    public void registerMember(Member member) {
        members.add(member);
    }

    /**
     * Adds a new staff member to the library.
     * @param staffMember The staff member to be added.
     */
    public void addStaff(Staff staffMember) {
        staff.add(staffMember);
    }

    /**
     * Lists all books in the library.
     */
    public void listBooks() {
        for (Book book : books) {
            System.out.println(book.title + " - " + book.describe());
        }
    }

    /**
     * Lists all members in the library.
     */
    public void listMembers() {
        for (Member member : members) {
            System.out.println(member.name);
        }
    }

    /**
     * Lists all staff in the library.
     */
    public void listStaff() {
        for (Staff staffMember : staff) {
            System.out.println(staffMember.name);
        }
    }
}
