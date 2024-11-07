/**
 * Abstract class representing a generic Person in the library system.
 */
public abstract class Person {
    protected String name;
    protected String id;

    /**
     * Constructs a new Person.
     * @param name The name of the person.
     * @param id The ID of the person (staff ID or member ID).
     */
    public Person(String name, String id) {
        this.name = name;
        this.id = id;
    }

    /**
     * Provides a description of the person type.
     * @return A string representing the person type.
     */
    public abstract String describe();
}
