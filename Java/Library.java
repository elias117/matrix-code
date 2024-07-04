public class Library {
    private String name;
    private String address;
    private Book[] books; // has many books
    private int numberOfBooks;

    public Library(String name, String address) {
        this.name = name;
        this.address = address;
        books = new Book[10];
        numberOfBooks = 0; // when we create a new library, it has no books
    }

    public String getName() {
        return this.name;
    }

    public String getAddress() {
        return this.address;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public void addBook(Book book) {
        if(numberOfBooks > books.length - 1){
            System.out.println("The library is full");
            return;
        }
        books[numberOfBooks] = book;
        numberOfBooks = numberOfBooks + 1;
    }

    public void printBooks() {
        for (int i = 0; i < numberOfBooks; i++) {
            System.out.println(books[i].display());
        }
    }

}
