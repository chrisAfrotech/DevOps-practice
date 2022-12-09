package wildAnnimal;

//In java is not possible to make multiple extends(with heritance) but only multiple implements (With interface)
public class Horse
{
    public Horse(String name, int x){
        this.mName = name;

        if(x < 0)
        {
            throw new HorseException("The value of x is not correct!!");
        }

        this.mPosx = 50;
        this.mPosy = 50;
    } 

    public void move(int x, int y)
    {
        this.mPosx = x;
        this.mPosx = y;
        System.out.println("The horse is moving(x= "+this.mPosx+", Y = "+this.mPosy+")");
    }

    protected String mName;
    protected int mPosx;
    protected int mPosy;
}