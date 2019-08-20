// Program describes two files
// tells you which one is newer and which one is larger
import java.nio.file.*;
import java.nio.file.attribute.*;
import java.io.IOException;
public class DebugThirteen1
{
   public static void main(String[] args)
   {
      Path file1 =
         Paths.get("./DebugData1.txt");
      Path file2 =
         Paths.get("DebugData2.txt");
      /*Path file3 =
         Paths.get("../../CodeInFigures/CreateEmployeesRandomFile.java");*/
      try
      {
         BasicFileAttributes attr1 =
            Files.readAttributes(file1, BasicFileAttributes.class);
         System.out.println("File: " + file1.getFileName());
         System.out.println("Creation time " + attr1.creationTime());
         System.out.println("Last modified time " + attr1.lastModifiedTime());
         System.out.println("Size " + attr1.size());
         BasicFileAttributes attr2 =
            Files.readAttributes(file2, BasicFileAttributes.class);
         System.out.println("\nFile: " + file2.getFileName());
         System.out.println("Creation time " + attr2.creationTime());
         System.out.println("Last modified time " + attr2.lastModifiedTime());
         System.out.println("Size " + attr2.size());
         int compareTimes = attr1.creationTime().compareTo(attr2.creationTime());
         if(compareTimes == 0)
            System.out.println("The creation times of " + file1.getFileName() + " and " + file2.getFileName() + " are the same");
         else if(compareTimes < 0)
            System.out.println("\n" + file1.getFileName() + " was created earlier");
         else
            System.out.println("\n" + file2.getFileName() + " was created earlier");
         if(attr1.size() == attr2.size())
            System.out.println(file1.getFileName() + " and " + file2.getFileName() + " are the same size");
         else if(attr1.size() > attr2.size())
            System.out.println(file1.getFileName() + " is larger ");
         else
            System.out.println(file2.getFileName() + " is larger");
      }
      catch(IOException e)
      {
          System.out.println("IO Exception" + e);
      }
   }
}
