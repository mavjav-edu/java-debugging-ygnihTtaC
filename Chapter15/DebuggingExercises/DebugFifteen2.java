// Demonstrates layout positions
// using BorderLayout
import javax.swing.*;
import java.awt.*;
import java.awt.event.*;
public class DebugFifteen2 extends JFrame
{
   private static final long serialVersionUID = 42l;
   JButton nb = new JButton("Left    ");
   JButton sb = new JButton("Down  ");
   JButton eb = new JButton("Right ");
   JButton wb = new JButton("Center  ");
   JButton cb = new JButton("Up");
   Container con = null;

   public DebugFifteen2()
   {
      con = this.getContentPane();
      con.setLayout(new BorderLayout());
      con.add(nb, BorderLayout.LINE_START);
      con.add(sb, BorderLayout.PAGE_END);
      con.add(eb, BorderLayout.LINE_END);
      con.add(wb, BorderLayout.CENTER);
      con.add(cb, BorderLayout.PAGE_START);
   }
   public static void main(String[] args)
   {
      DebugFifteen2 f = new DebugFifteen2();
      f.setSize(300, 300);
      f.setVisible(true);
   }
}
