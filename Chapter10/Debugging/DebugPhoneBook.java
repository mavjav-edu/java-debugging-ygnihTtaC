import javax.swing.*;
public class DebugPhoneBook extends DebugBook
{
   private String area;
   private String size;
   private final int CUTOFF = 30;
   public void FixDebugPhoneBook(int pages, String city)
   {
      this.pages = pages;
      area = city;
      if(pages > CUTOFF)
         size = "big";
      else
         size = "small";
   }
   public void display()
   {
      JOptionPane.showMessageDialog(null,"The phone book for " + area +
         " has " + pages + " pages.\nThat is a " +
         size + " phone book.");
   }
}
