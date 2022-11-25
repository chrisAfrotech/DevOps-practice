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
    }
    
    private int mExprirationYear;
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