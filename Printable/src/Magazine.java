public class Magazine implements Printable {
    private String nameOfMagazine;

    public Magazine(String nameOfMagazine) {
        this.nameOfMagazine = nameOfMagazine;
    }

    @Override
    public void print() {
        System.out.println("Комикс: " + nameOfMagazine);

    }

    public static void printMagazines(Printable[] printable) {
        for (Printable magazines : printable)
        {
            if (magazines instanceof Magazine)
            {
                magazines.print();
            }
        }
    }
}
