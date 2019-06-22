// Makes String comparisons
public class DebugSeven1
{
   public static void main(String[] args)
   {
      String name1 = "Roger";
      String name2 = "Roger";
      String name3 = "Stacy";

      if(name1.equals(name2)){
        System.out.println(name1 + " and " + name2 +
          " are the same");
      }
      else{
        System.out.println(name1 + " and " + name2 + " are not the same");
      }
      if(name1.equals(name3)){
        System.out.println(name1 + " and " + name3 +
          " are the same");
      }
      else{
        System.out.println(name1 + " and " + name3 + " are not the same");
      }
      if(name1 == "roger"){
        System.out.println(name1 + " and 'roger' are the same");
      }
      else
        System.out.println(name1 + " and 'roger' are not the same");
      if(name1 == "Roger"){
        System.out.println(name1 + " and 'Roger' are the same");
      }
      else{
        System.out.println(name1 + " and 'roger' are not the same");
      }
   }
}
