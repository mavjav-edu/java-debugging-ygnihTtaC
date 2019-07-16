public class DebugPlay
{
   public String title;
   public String author;

   public void FixDebugPlay(String title, String author)
   {
      this.title = title;
      this.author = author;
   }
   public void display()
   {
      System.out.println("The performance is " + title + " by " + author);
   }
}
