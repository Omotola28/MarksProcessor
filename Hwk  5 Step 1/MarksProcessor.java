import java.util.*;
import java.io.*;
/**
 * Write a description of class MarksProcessor here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class MarksProcessor
{
    // instance variables - replace the example below with your own
    private String nameOfCohort;
    private ArrayList<StudentRecord> marksList;

    /**
     * Constructor for objects of class MarksProcessor
     */
    public MarksProcessor()
    {
        // initialise instance variables
        nameOfCohort = "Group2";
        marksList = new ArrayList<StudentRecord>();
    }
    
    /**
     * Accessor methods for the class MarksProcessor
     */
    public String getNameOfCohort()
    {
        return nameOfCohort;
    }
    
    public ArrayList getRecords()
    {
        return marksList;
    }
    
//     /**
//     * Adds student Records to the MarksProcessor
//     *
//     * @param   <code>stuRecord</code> an <code>StudentRecord</code> object, the records to be added
//     */
//    public void storeRecords(StudentRecord stuRecord)
//    {
//       marksList.add(stuRecord);
//    }
   
    /**
    * Reads marks data from a file and adds corresponding marks to the MarksProcessor
    *
    * @param   <code>fileName</code> a <code>String</code>, the name of the 
    *          text file in which the data is stored.
    * 
    * @throws  FileNotFoundException
    */   
   public void readMarksData(String fileName) throws FileNotFoundException
   {
	  File dataFile = new File(fileName);
      Scanner scanner = new Scanner(dataFile);
      String nameOfCohort = scanner.nextLine();
      int noOfMarks = scanner.nextInt();
      scanner.nextLine(); //advance to the next line;
      while( scanner.hasNext() )
      {
         String stuName = scanner.nextLine();
         System.out.println("student name: " + stuName);
         String stuMarks = scanner.nextLine();
         System.out.println("student marks: " + stuMarks);
         //storeRecords( new StudentRecord(stuName, stuMarks));
         //scanner.nextLine(); //advance to the next line;
      }
      scanner.close();
   }
}
