public class Trumpet implements Instrument
{
    float trumpetDiameter;
    public Trumpet(float trumpetDiameter)
    {
        this.trumpetDiameter = trumpetDiameter;
    }
    @Override
    public void play()
    {
        System.out.println("Играет труба диаметром " + trumpetDiameter);

    }
}
