public class Drum implements Instrument
{
    float drumSize;

    public Drum(float drumSize)
    {
        this.drumSize = drumSize;
    }

    @Override
    public void play()
    {
        System.out.println("Играет барабан диаметром " + drumSize);

    }
}
