// Allows user to enter a series of words
// and displays them in reverse order
import javax.swing.*;
public class DebugEight4
{
   public static void main(String[] args)
   {
      int x = 0, y;
      String array[] = new String[100];
      String entry = new String();
      final String STOP = "XXX";
      StringBuffer message = new StringBuffer("The words in reverse order are\n");


      while(!(entry.equals(STOP)))
      {
         entry = JOptionPane.showInputDialog(null,
            "Enter another word\n" +
            "Enter " + STOP + " when you want to stop");
         array[x++] = entry;
         System.out.println(array[x-1]);
      }
      for(y = x-2; y >= 0; --y)
      {
         message.append(array[y]);
         message.append("\n");
      }
      JOptionPane.showMessageDialog(null, message);
   }
}
