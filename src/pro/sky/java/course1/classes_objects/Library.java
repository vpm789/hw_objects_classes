package pro.sky.java.course1.classes_objects;

public class Library {
    private Book[] books;
    private int size;

    public Library(int size) {
        this.books = new Book[size];
    }

    public void addBook(String title, Author author, int year) {
        if (size >= books.length) {
            System.out.println("Нельзя добавить книгу, закончилось место");
        }
        Book newBook = new Book(title, author, year);
        books[size++] = newBook;
    }

    public void printAllBooks() {
        for (int i = 0; i < size; i++) {
            Book book = books[i];
            System.out.println(book.getAuthor().getName() + " " + book.getAuthor().getLastName() + ": " + book.getTitle() + ": " + book.getYear());
        }
    }

    public void printBooks(String title) {
        for (int i = 0; i < size; i++) {
            Book book = books[i];
            boolean same = book.getTitle().equals(title);
            if (same == true) {
                System.out.println(book.getAuthor().getName() + " " + book.getAuthor().getLastName() + ": " + book.getTitle() + ": " + book.getYear());
            } else if (i == size - 1 && same == false) {
                System.out.println("Книги с таким названием нет");
            }
        }
    }

    public void changeYear(String title, int year) {
        for (int i = 0; i < size; i++) {
            Book book = books[i];
            if (book.getTitle().equals(title)) {
                book.setYear(year);
                System.out.println(book.getAuthor().getName() + " " + book.getAuthor().getLastName() + ": " + book.getTitle() + ": " + book.getYear());
            }
        }
    }

}
