import javax.swing.*;
public class DebugPhoneBook extends DebugBook
{
   private String city;
   private String size;
   private final int CUTOFF = 30;
   public DebugPhoneBook()
   {
      super();
      city = "";
      size = "small";
   }
   public DebugPhoneBook(int pages, String city)
   {
      this.pages = pages;
      this.city = city;
      if(pages > CUTOFF)
         size = "big";
      else
         size = "small";
   }
   public void display()
   {
      JOptionPane.showMessageDialog(null,"The phone book for " + city + " has " + pages + " pages.\nThat is a " + size + " phone book.");
   }
}
