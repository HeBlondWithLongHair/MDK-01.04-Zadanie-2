public class Book implements Printable
{
    private String nameOfBook;
    public Book(String nameOfBook)
    {
        this.nameOfBook = nameOfBook;
    }

    @Override
    public void print()
    {
        System.out.println("Книга: " + nameOfBook);
    }

    public static void printBooks(Printable[] printable)
    {
       for(Printable books: printable)
       {
           if(books instanceof Book)
           {
               books.print();

           }
       }

    }

}
