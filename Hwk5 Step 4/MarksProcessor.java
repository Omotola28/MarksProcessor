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
        nameOfCohort = "";
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
   private void storeRecords(StudentRecord stuRecord)
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
      this.nameOfCohort = nameOfCohort;
      int noOfMarks = scanner.nextInt();
      while( scanner.hasNext() )
      {
        scanner.nextLine();
        String stuName = scanner.nextLine();
        int[] marks = new int[noOfMarks];
        for (int i = 0; i< marks.length; i++)
        {
            int stuMarks = scanner.nextInt();
            marks[i] = stuMarks;
        }
        storeRecords( new StudentRecord(stuName, marks)); 
      }
      scanner.close();
   }
   
//    public boolean checkPosition()
//    {
//        if(marksList.getNoOfMarks() = 5 )
//        {
//             System.out.printf("\n%10s%35s%n",   nameOfStudent,score);
//         }
//        else if (markList.getNoOfMarks() = 5 )
//        {
//            System.out.printf("\n%10s%35s%n",   nameOfStudent,score);
//         }
//     }
   
      public void displayResults()
   {
       String nameOfStudent = "Name"; String score = "Marks";
       int listPosition = 0; int numbering = 1; 
       System.out.println("Results for " +getNameOfCohort());
       System.out.printf("\n%10s%30s%n",   nameOfStudent,score);
        while(listPosition  < marksList.size())
       {
           int sum = 0; double average = 0;
           StudentRecord stuRecords = marksList.get(listPosition);
           System.out.printf("%-3d%-25s",numbering, stuRecords.getName());
           for (int i = 0; i< stuRecords.getMarks().length; i++)
           {
            int[] marks = stuRecords.getMarks();
            sum = sum + marks[i];
            average = (double)sum/stuRecords.getMarks().length;
            System.out.printf("%5d",marks[i]);
           }
           System.out.println("  "+ average);
           listPosition++;
           numbering++;
        }
    }
//    public void displayResults()
//    {
//        int listPosition = 0; int numbering = 1;
//        System.out.println("Results for " +getNameOfCohort()+
//        "\n Name                              Marks"
//        );
//         System.out.printf("%-5s%15s",nameOfStudent,score);
//         while(listPosition  < marksList.size())
//        {
//            StudentRecord stuRecords = marksList.get(listPosition);
//            System.out.print(numbering + " " +stuRecords.getName() + "                 ");
//            for (int i = 0; i< stuRecords.getMarks().length; i++)
//            {
//             int[] marks = stuRecords.getMarks();
//             
//             System.out.print(marks[i] + " ");
//            }
//            
//            System.out.println();
//                              // Arrays.toString(stuRecords.getMarks()));
//            listPosition++;
//            numbering++;
//         }
//     }
//    
//      while(listPosition  < marksList.size())
//        {
//            StudentRecord stuRecords = marksList.get(listPosition);
//            System.out.println(numbering + " " +stuRecords.getName() +  "   " +
//                               Arrays.toString(stuRecords.getMarks()));
//            listPosition++;
//            numbering++;
//         }
//  for(StudentRecord stuRecord : marksList)
//        {
//            System.out.println(stuRecord.getName()+ " " + stuRecord.getMarks());
//         }
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
//    File dataFile = new File(fileName);
//       Scanner scanner = new Scanner(dataFile);
//       String nameOfCohort = scanner.nextLine();
//       System.out.println(nameOfCohort);
//       int noOfMarks = scanner.nextInt();
//       System.out.println(noOfMarks);
//       int number = 0;
//       while( scanner.hasNext() )
//       {
//         scanner.nextLine(); //advance to the next line;
//          String stuName = scanner.nextLine();
//         System.out.println("student name: " + stuName);
//         //String stuMarks = scanner.nextLine();
//         while(scanner.hasNextInt())
//         {
//             number++;
//             scanner.nextInt();
//         }
//         int[] marks = new int[number];
//      for (int i = 0; i< marks.length; i++)
//      {
//          int stuMarks = scanner.nextInt();
//          marks[i] = stuMarks;
//      }
//         System.out.println("student marks: " + Arrays.toString(marks));
//         //storeRecords( new StudentRecord(stuName, stuMarks)); 
//       }
//    scanner.close();
//    }
}
