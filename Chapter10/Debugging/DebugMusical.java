public class DebugMusical extends DebugPlay
{
   protected String composer;
   DebugMusical()
   {
      super();
      this.composer = "";
   }
   DebugMusical(String title, String author, String comp)
   {
      this.composer = comp;
      this.title = title;
      this.author = author;
   }
   public void display()
   {
     super.display();
      System.out.println("The music for '" + title + "' is by " + composer);
   }
}
