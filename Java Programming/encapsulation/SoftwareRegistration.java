public class SoftwareRegistration
{
    /*
        [Accesseurs]
            getters : Access to an attribute()
            Setters : Modifications of an attribute
     */
    public SoftwareRegistration (int expiration)
    {
        this.mExprirationYear = expiration;
        System.out.println("Software licence valid until: " + this.mExprirationYear);
    
        if(mNUMBEROFREGISTRATION>0)
        {
            this.mExprirationYear = expiration;
            mNUMBEROFREGISTRATION--;
            
            System.out.println("Software licence valid. Expiration: " + this.mExprirationYear+"years");
            System.out.println("Number of registration left: " + this.mNUMBEROFREGISTRATION+"years");
        }
        else
        {
            System.out.println("Maximum Number of registration done!!");
        }
    }
    
    private int mExprirationYear; //variable of the class or instance var (Value can change form one object of the class to another)
    private static int mNUMBEROFREGISTRATION=5; //variable of class (have the same value for all the object of the class)
                                                //Also don't need to instanciate the object before using it!!
    public int getExprirationYear() 
    {
        return this.mExprirationYear ;
    }
    public void setExprirationYear(int expiration) 
    {
        this.mExprirationYear = expiration;
        //return; if we don't want to allow access to that accessor
    }
}