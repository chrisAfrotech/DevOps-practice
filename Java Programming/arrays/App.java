public class App
{
    /*ways to declare arrays in java
     * int tab[] / int[] tab
     * int tab[]={1,2,3}
     * int tab[]=new int[3]
     * int tab[]=new int[]{1,2,3}
     */

     /*Arrays of multiple dimensions
      * int[][] tab = new int[][]{{4,5,6},{1,2,3}}
      */

    /*character or string
     * concat() -> better than "+"
     * trim() = to remove space inside text
     * toUppercase() , toLowercase = to transform respectively text in upper or lower case
     * append(<str>) = add the content in parameter at the end of the text
     * insert(<index>. <str>)
     */

    public static void main(String[] args)
    {
        int[] tab = new int []{1,2,3};
        int[][] mat = new int[][]{{4,5,6},{1,2,3}};

        for (int i = 0; i < tab.length; i++) 
        {
            System.out.println(tab[i]);
        }
        
        System.out.println("\n"+tab[1]+"\n");

        //Simplify syntax to access to an arrays 
        for(int el: tab )
        {
            System.out.println(el);
        }
        /************Matrice display*******/
        for (int i = 0; i < tab.length; i++) 
        {
            for (int j = 0; j < mat.length; j++)
            {
                System.out.println(mat[i][j]);
            }
            System.out.println("\n");
        }

    }
}