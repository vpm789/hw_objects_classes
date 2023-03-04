package pro.sky.java.course1.classes_objects;

public class Main {
    public static void main(String[] args) {
        Author leoTolstoy = new Author("Leo", "Tolstoy");
        Author joanneRowling = new Author("Joanne", "Rowling");
        Author stephenKing = new Author("Stephen", "King");

        Library library = new Library(5);

        library.addBook("War and Peace", leoTolstoy, 1865);
        library.addBook("Harry Potter", joanneRowling, 1997);
        library.addBook("The Stand", stephenKing, 1978);
        library.printAllBooks();

        System.out.println();
        library.printBooks("The Stand1");

        System.out.println();
        library.changeYear("War and Peace", 1867);
    }
}