package pro.sky.java.course1.methods_of_objects;

/*
import pro.sky.java.course1.classes_objects.Author;
import pro.sky.java.course1.classes_objects.Book;
*/

public class Main {
    public static void main(String[] args) {

        Author leoTolstoy = new Author("Leo", "Tolstoy");
        Author joanneRowling = new Author("Joanne", "Rowling");
        Author herbertSchildt = new Author("Herbert", "Schildt");

        Book warAndPease = new Book("War and Peace", leoTolstoy, 1865);
        Book harryPotter = new Book("Harry Potter", joanneRowling, 1997);
        Book javaBeginnerGuide8Edition = new Book("Java Beginner’s Guide", herbertSchildt, 2018);
        Book javaBeginnerGuide9Edition = new Book("Java Beginner’s Guide", herbertSchildt, 2021);
        warAndPease.setYear(1867);

        System.out.println("");
        System.out.println("Название книги - " + warAndPease.getTitle());
        System.out.println("Автор - " + warAndPease.getAuthor().getName() + " " + warAndPease.getAuthor().getLastName());
        System.out.println("Год издания - " + warAndPease.getYear());

        System.out.println("");
        System.out.println("Название книги - " + harryPotter.getTitle());
        System.out.println("Автор - " + harryPotter.getAuthor().getName() + " " + harryPotter.getAuthor().getLastName());
        System.out.println("Год издания - " + harryPotter.getYear());

        System.out.println("");
        System.out.println(javaBeginnerGuide9Edition);

        System.out.println("");
        System.out.println(warAndPease.equals(harryPotter));
        System.out.println(javaBeginnerGuide8Edition.equals(javaBeginnerGuide9Edition));
    }
}