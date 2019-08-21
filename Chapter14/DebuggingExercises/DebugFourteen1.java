// Creates a frame with a specified size
// Twice as tall as wide
// The size is a constructor argument
import javax.swing.*;
public class DebugFourteen1 extends JFrame
{
   private static final long serialVersionUID = 42l;
   public DebugFourteen1(int size)
   {
      super("This is my frame");
      setSize(size, size * 2);
      setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
   }
   public static void main(String[] args)
   {
      DebugFourteen1 frame = new DebugFourteen1(200);
      frame.setVisible(true);
   }
}
