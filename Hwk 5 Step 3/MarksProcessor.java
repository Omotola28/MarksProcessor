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
    
    /**
    * Adds student Records to the MarksProcessor
    *
    * @param   <code>stuRecord</code> an <code>StudentRecord</code> object, the records to be added
    */
   public void storeRecords(StudentRecord stuRecord)
   {
      marksList.add(stuRecord);
   }
   
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
      System.out.println(nameOfCohort);
      int noOfMarks = scanner.nextInt();
      System.out.println(noOfMarks);
      while( scanner.hasNext() )
      {
        scanner.nextLine();
        String stuName = scanner.nextLine();
        System.out.println("student name: " + stuName);
        //String stuMarks = scanner.nextLine();
        int[] marks = new int[noOfMarks];
		for (int i = 0; i< marks.length; i++)
		{
			int stuMarks = scanner.nextInt();
			marks[i] = stuMarks;
			System.out.print(marks[i] + " ");
		}
        System.out.println();
        //storeRecords( new StudentRecord(stuName, stuMarks)); 
      }
	  scanner.close();
   }
   
//      /**
//     * Reads marks data from a file and adds corresponding marks to the MarksProcessor
//     *
//     * @param   <code>fileName</code> a <code>String</code>, the name of the 
//     *          text file in which the data is stored.
//     * 
//     * @throws  FileNotFoundException
//     */   
//    public void readMarksData(String fileName) throws FileNotFoundException
//    {
// 	  File dataFile = new File(fileName);
//       Scanner scanner = new Scanner(dataFile);
//       String nameOfCohort = scanner.nextLine();
//       System.out.println(nameOfCohort);
//       int noOfMarks = scanner.nextInt();
//       System.out.println(noOfMarks);
//       int number = 0;
//       while( scanner.hasNext() )
//       {
//         scanner.nextLine(); //advance to the next line;
//        	String stuName = scanner.nextLine();
//         System.out.println("student name: " + stuName);
//         //String stuMarks = scanner.nextLine();
//         while(scanner.hasNextInt())
//         {
//             number++;
//             scanner.nextInt();
//         }
//         int[] marks = new int[number];
// 		for (int i = 0; i< marks.length; i++)
// 		{
// 		    int stuMarks = scanner.nextInt();
// 			marks[i] = stuMarks;
// 		}
//         System.out.println("student marks: " + Arrays.toString(marks));
//         //storeRecords( new StudentRecord(stuName, stuMarks)); 
//       }
// 	  scanner.close();
//    }
}
