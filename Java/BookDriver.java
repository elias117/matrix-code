public class BookDriver {
    public static void main(String[] args) {
        Book book1 = new Book("The Great Gatsby", "F. Scott Fitzgerald");
        Book book2 = new Book("To Kill a Mockingbird", "Harper Lee");
        Book book3 = new Book("1984", "George Orwell");
        // System.out.println(book1.display());

        Library library = new Library("New York Public Library", "476 5th Ave, New York, NY 10018");
        library.addBook(book1);
        library.addBook(book1);
        library.addBook(book1);
        library.addBook(book2);
        library.addBook(book2);
        library.addBook(book2);
        library.addBook(book3);
        library.addBook(book3);

        library.printBooks();
        
    }
}
