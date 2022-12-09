package chrisAfrotech;

abstract public class LivingSpace
{
    protected String mName;

    public String whoAmI()
    {
        return mName;
    }

    abstract public void eat();
    abstract public void speak();
}