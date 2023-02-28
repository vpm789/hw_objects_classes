public class Main {
    public static void main(String[] args) {
        Author leoTolstoy = new Author("Leo", "Tolstoy");
        Author joanneRowling = new Author("Joanne", "Rowling");

        Book warAndPease = new Book("War and Pease", leoTolstoy, 1865);
        Book harryPotter = new Book("Harry Potter", joanneRowling, 1997);
        warAndPease.setYear(1867);

        System.out.println("");
        System.out.println("Название книги - " + warAndPease.getTitle());
        System.out.println("Автор - " + warAndPease.getAuthor().getName() + " " + warAndPease.getAuthor().getLastName());
        System.out.println("Год издания - " + warAndPease.getYear());

        System.out.println("");
        System.out.println("Название книги - " + harryPotter.getTitle());
        System.out.println("Автор - " + harryPotter.getAuthor().getName() + " " + harryPotter.getAuthor().getLastName());
        System.out.println("Год издания - " + harryPotter.getYear());
    }
}