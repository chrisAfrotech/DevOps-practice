import wildAnnimal.*;

public class App
{
    public static void main(String[] args)
    {
        Horse h = new Horse("Guero");
        h.move(167, 428);

        Pegasus p = new Pegasus("Titanus");
        p.move(33, 146);
        p.fly(446);
    }
}