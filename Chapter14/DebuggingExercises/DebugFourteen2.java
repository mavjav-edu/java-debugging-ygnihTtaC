// Displays list of payment options
//      - credit card, check or cash
// Displays fee for using each - 5%, 2% or 0%

import javax.swing.*;
import java.awt.*;
import java.awt.event.*;

public class DebugFourteen2 extends JFrame implements ItemListener
{
   FlowLayout flow = new FlowLayout();
   JComboBox<String> payMethod = new JComboBox<String>();
   JLabel payList = new JLabel("Pay List");
   JTextField totFees = new JTextField(25);
   String pctMsg = new String("percent will be added to your bill");
   int[] fees = {5, 2, 0};
   int feePct = 0;
   String output;
   int fee = 0;
   private static final long serialVersionUID = 42l;
   public DebugFourteen2()
   {
      super("Pay List");
      setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
      setLayout(flow);
      payMethod.addItemListener(this);
      add(payList);
      add(payMethod);
      payMethod.addItem("Credit card");
      payMethod.addItem("Check");
      payMethod.addItem("Cash");
      add(totFees);
   }
   public static void main(String[] arguments)
   {
      JFrame cframe = new DebugFourteen2();
      cframe.setSize(350,150);
      cframe.setVisible(true);
   }
   @Override
   public void itemStateChanged(ItemEvent payList)
   {
      Object source = payList.getSource();
      if(source == payMethod)
      {
         int i = payMethod.getSelectedIndex();
         feePct = fees[i];
         if(feePct == 0){
           totFees.setEnabled(false);
         }
         else{
           totFees.setEnabled(true);
         }
         output = feePct + " " + pctMsg;
         totFees.setText(output);
      }
   }
}
