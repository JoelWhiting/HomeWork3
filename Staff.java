/**
 * Class representing a library staff member.
 * Inherits from Person.
 */
public class Staff extends Person {
    /**
     * Constructs a new Staff member.
     * @param name The name of the staff member.
     * @param id The ID of the staff member.
     */
    public Staff(String name, String id) {
        super(name, id);
    }

    /**
     * Registers a new member in the library.
     * @param library The library instance to add the member to.
     * @param member The member to be added.
     */
    public void registerMember(Library library, Member member) {
        library.registerMember(member);
    }

    /**
     * Registers a new book in the library.
     * @param library The library instance to add the book to.
     * @param book The book to be added.
     */
    public void registerBook(Library library, Book book) {
        library.addBook(book);
    }

    /**
     * Provides a description of the person type.
     * @return A string indicating that this is a Staff member.
     */
    @Override
    public String describe() {
        return "Staff";
    }
}
