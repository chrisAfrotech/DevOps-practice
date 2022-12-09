package wildAnnimal;

public final class Pegasus extends Horse //The term final here means that this class can't be extends
{
    public Pegasus(String name)
    {
        super(name);
        this.mPosz = 100;
    } 

    public void move(int x, int y)
    {
        super.move(x, y); //call the method move in the parent class
        System.out.println("The pegasus is moving(x= "+this.mPosx+", Y = "+this.mPosy+")");
    }

    public void fly(int z)
    {
        this.mPosz= z;
        System.out.println("The pegasus is flying(z= "+this.mPosz+")");
    }

    private int mPosz;
}