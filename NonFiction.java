/**
 * Class representing a Non-Fiction book.
 * Inherits from Book.
 */
public class NonFiction extends Book {
    /**
     * Constructs a new Non-Fiction book.
     * @param title The title of the non-fiction book.
     * @param author The author of the non-fiction book.
     * @param ISBN The ISBN of the non-fiction book.
     */
    public NonFiction(String title, String author, String ISBN) {
        super(title, author, ISBN);
    }

    /**
     * Provides a description of the book type.
     * @return A string indicating that this is a Non-Fiction book.
     */
    @Override
    public String describe() {
        return "Non-Fiction";
    }
}
