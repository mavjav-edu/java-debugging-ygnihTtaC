import java.io.Console;
import java.util.*;
public class DebugSeven2 {

	   public static void main(String[] args)
	   {
	      //String str = new String();
	      //int x;
	      //int length;
	      //int start = 0;
	      int num;
	      //int lastSpace = -1;
	      int sum = 0;
	      //String partStr;
	      //Scanner in = new Scanner(System.in);
	      Console console = System.console();

	      Scanner str =  console == null ? new Scanner("") : new Scanner(console.readLine("Enter a series of integers separated by spaces >> "));

	      while(str.hasNextInt())
	      {
	             num = str.nextInt();
	             System.out.println("                " + num);
	             sum += num;
	      }
	      System.out.println("         -------------------" +
	         "\nThe sum of the integers is " + sum);
	      str.close();
	   }
}
