public class DebugMusical extends DebugPlay
{
   protected String composer;

   DebugMusical(String title, String author, String comp)
   {
      this.composer = comp;
      this.title = title;
      this.author = author;
   }
   public void display()
   {
      System.out.println("The performance is " + title + " by " + author + "\nThe music for " + title + " is by " + composer);
   }
}
