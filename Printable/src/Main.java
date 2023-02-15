public class Main
{
    public static void main(String[] args)
    {
        Printable[] booksAndMagazines = new Printable[6];
                booksAndMagazines[0] = new Book("Последнее желаие");
                booksAndMagazines[1] = new Book("Сын зевса");
                booksAndMagazines[2] = new Book("Что-то связанное с фарингейтом");
                booksAndMagazines[3] = new Magazine("Человек паук");
                booksAndMagazines[4] = new Magazine("Железный человек");
                booksAndMagazines[5] = new Magazine("Халк");

        Magazine.printMagazines(booksAndMagazines);
        Book.printBooks(booksAndMagazines);

    }

}