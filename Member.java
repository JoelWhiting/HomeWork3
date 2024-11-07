/**
 * Class representing a library member.
 * Inherits from Person.
 */
public class Member extends Person {
    /**
     * Constructs a new Member.
     * @param name The name of the member.
     * @param id The ID of the member.
     */
    public Member(String name, String id) {
        super(name, id);
    }

    /**
     * Provides a description of the person type.
     * @return A string indicating that this is a Member.
     */
    @Override
    public String describe() {
        return "Member";
    }
}
