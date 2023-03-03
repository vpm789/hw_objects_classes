package pro.sky.java.course1.classes_objects;

public class Main {

    public static void addBook(Book[] books, Book book) {
        for (int i = 0; i < books.length; i++) {
            if (books[i] == null) {
                books[i] = book;
                break;
            }
        }
        printBook(books);
    }

    public static void printBook(Book[] books) {
        for (int i = 0; i < books.length; i++) {
            if (books[i] != null) {
                System.out.println(books[i].getAuthor().getName() + " " + books[i].getAuthor().getLastName() + ": " + books[i].getTitle() + ": " + books[i].getYear());
            }
        }
    }


    public static void main(String[] args) {
        Author leoTolstoy = new Author("Leo", "Tolstoy");
        Author joanneRowling = new Author("Joanne", "Rowling");
        Author stephenKing = new Author("Stephen", "King");

        Book warAndPeace = new Book("War and Peace", leoTolstoy, 1865);
        Book harryPotter = new Book("Harry Potter", joanneRowling, 1997);
        warAndPeace.setYear(1867);
        Book theStand = new Book("The Stand", stephenKing, 1978);

        /*1. Необходимо в классе с методом main создать массив объектов типа pro.sky.java.course1.classes_objects.Book и положить туда созданные книги.
        2. Написать статические методы для работы с массивом в классе, где располагается метод main:
            1. Добавить книгу (найти свободную ячейку массива и положить туда книгу). Учесть, что этот метод
               может быть вызван любое количество раз (от 1 до 5) и каждая новая книга должна успешно укладываться в массив.
            2. Напечатать в консоль все книги из массива в следующем формате: “Stephen King: The Stand: 1978”*/
        Book[] books = new Book[5];
        books[0] = warAndPeace;
        books[1] = harryPotter;
        addBook(books, theStand);

    }
}