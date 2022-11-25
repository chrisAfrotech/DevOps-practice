public class Player
{
    public Player() 
    {
          this.mName = "Inconnu";
          this.mLevel = 1;
          System.out.println(this.mName+" - "+this.mLevel);  
    }
    public Player(String name) 
    {
          this.mName = name;
          this.mLevel = 1;
          System.out.println(this.mName+" - "+this.mLevel);  
    }
    public Player(String name, int level) 
    {
          this.mName = name;
          this.mLevel = level;
          System.out.println(this.mName+" - "+this.mLevel);  
    }
    private String mName;
    private int mLevel;
}