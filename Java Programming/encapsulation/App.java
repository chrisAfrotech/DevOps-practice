public class App 
{
    public static void main(String[] args)
    {
        SoftwareRegistration sr = new SoftwareRegistration(2032);
        sr.setExprirationYear(2050);
        System.out.println(sr.getExprirationYear());
    }
}