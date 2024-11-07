public class Main {
    public static void main(String[] args) {
        // Create library
        Library library = new Library();

        // Create books
        Book fictionBook = new Fiction("1984", "George Orwell", "ISBN1234");
        Book nonFictionBook = new NonFiction("A Brief History of Time", "Stephen Hawking", "ISBN5678");

        // Create members
        Member member1 = new Member("Alice", "M001");
        Member member2 = new Member("Bob", "M002");

        // Create staff
        Staff staff1 = new Staff("Charles", "S001");

        // Add staff to library
        library.addStaff(staff1);

        // Register books and members through staff
        staff1.registerBook(library, fictionBook);
        staff1.registerBook(library, nonFictionBook);
        staff1.registerMember(library, member1);
        staff1.registerMember(library, member2);

        // List all books
        System.out.println("Books in Library:");
        library.listBooks();

        // List all members
        System.out.println("\nMembers in Library:");
        library.listMembers();

        // List all staff
        System.out.println("\nStaff in Library:");
        library.listStaff();

        // Test checkout
        System.out.println("\nChecking out a book by Alice...");
        fictionBook.checkOut();
        System.out.println("Fiction Book Status: " + (fictionBook.isCheckedOut ? "Checked Out" : "Available"));

        // Test return
        System.out.println("\nReturning the book by Alice...");
        fictionBook.returnBook();
        System.out.println("Fiction Book Status: " + (fictionBook.isCheckedOut ? "Checked Out" : "Available"));
    }
}
