public class Main
{
    public static void main(String[] args)
    {
        Instrument[] instrument = new Instrument[3];
        instrument[0] = new Guitar(6);
        instrument[1] = new Drum(8.5f);
        instrument[2] = new Trumpet(5.5f);

        for(Instrument instruments: instrument)
        {
            instruments.play();

        }

    }
}