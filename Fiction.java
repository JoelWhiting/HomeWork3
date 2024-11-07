/**
 * Class representing a Fiction book.
 * Inherits from Book.
 */
public class Fiction extends Book {
    /**
     * Constructs a new Fiction book.
     * @param title The title of the fiction book.
     * @param author The author of the fiction book.
     * @param ISBN The ISBN of the fiction book.
     */
    public Fiction(String title, String author, String ISBN) {
        super(title, author, ISBN);
    }

    /**
     * Provides a description of the book type.
     * @return A string indicating that this is a Fiction book.
     */
    @Override
    public String describe() {
        return "Fiction";
    }
}
