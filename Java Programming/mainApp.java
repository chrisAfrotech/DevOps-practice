class mainApp 
//The definition of the class who is call MainApp
{
   public static void main(String[] args){
    //Main is the principle funtion of the program
    //The signature (String[] args) is obligate in java
    //Static means that the function is accessible only here
    //Public means that the main is acessible every where in the programe
    //private is another type of access mode for which the class is accessible only in the class it was define


    System.out.println("Bonjour les design patterns!");
    //System (Always start with capital letter) is a native class of java
    //Out is an attribute of variable
    //println (dsiplay something on screen and go aonline) 
   
   //*****Variables and constante********** */
   /* no special caracter
      start with a letter or with underscore (_)
      uneVariableUnPeuLongue (camel case)
      UneVariable (pascal case)
      une_variable (snake case)
   
      Constante 
      final int BUBBLE = 26;
   */

   //variable accessibility
   // Variabe are access only in the function it's define

   /*****Operators****** */
   /*
   = Affectation
   == Equall to
   == Equall to and have the same type 
   && and 
   || or
   =! Different

    */

   int ageUser = 25; //is better to innitialise variable when it's declared
   System.out.println(ageUser);
   ageUser = 55;
   System.out.println(ageUser);

   final int BUBBLE = 216; //constante of integer
   System.out.println(BUBBLE);

      // otherMethod(); //call the function otherMethod
   }

   // public void otherMethod()
   // {
   //    System.out.println(ageUser);
   // }
}