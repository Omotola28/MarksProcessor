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
    private int noOfScores;

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
      noOfScores = noOfMarks;
      while( scanner.hasNext() )
      {
        scanner.nextLine();
        String stuName = scanner.nextLine();
        int[] marks = new int[noOfMarks];
        for (int i = 0; i< noOfMarks; i++)
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
       int index = 0; int listPosition = 1; 
       System.out.println("Results for " +getNameOfCohort());
       System.out.printf("\n%10s%30s%27s%n",   "Name","Marks","Average");
        while(listPosition  < marksList.size())
       {
           int sum = 0; double average = 0;
           StudentRecord stuRecords = marksList.get(index);
           System.out.printf("%-3d%-25s",listPosition, stuRecords.getName());
           for (int i = 0; i< stuRecords.getMarks().length; i++)
           {
            int[] marks = stuRecords.getMarks();
            sum = sum + marks[i];
            System.out.printf("%5d",marks[i]);
           }
           average = (double)sum/stuRecords.getMarks().length;
           System.out.println("          " + average);
           index++;
           listPosition++;
        }
    }
    
//    public void getMarksFromArray ()
//    {    
//         int listPosition = 0;
//         StudentRecord stuRecords = marksList.get(listPosition);
//         for (int i = 0; i< stuRecords.getMarks().length; i++)
//          {
//            int[] marks = stuRecords.getMarks();
//            System.out.println(marks[i]);
//            }
//         listPosition++;
//     }
    
   public void writeMarksData(String fileName) throws FileNotFoundException
   {
       PrintWriter pWriter = new PrintWriter(fileName);
       pWriter.println(getNameOfCohort());
       pWriter.println(noOfScores);
       for (StudentRecord stuRecord : marksList)
       {
          String lineOfOutput = stuRecord.getName();
          pWriter.println("");
          pWriter.println(lineOfOutput);
          for (int i = 0; i< stuRecord.getMarks().length; i++)
          {
            int[] marks = stuRecord.getMarks();
            pWriter.print( marks[i]+ " ");
          }
        }
       pWriter.close();
   }
   
   public void clearMarksData()
   {
       if(!marksList.isEmpty())
       { 
           marksList.clear(); //discards all entries from marksList.
           marksList.trimToSize();
        }
    }
    
   public void editMarksData(int studentPosn, int marksPosn, int newMark) 
                                                        
   {
       StudentRecord student = marksList.get(studentPosn+1);
       int[] marks = student.getMarks();
       marks[marksPosn-1] = newMark; 
   }
//     for (int i = 0; i< stuRecord.getMarks().length; i++)
//           {
//             int[] marks = stuRecord.getMarks();
//             for(StudentRecord stuRecord : marksList)
//             {
//                 String lineOfOutput = stuRecord.getName();
//                 pWriter.println(lineOfOutput);
//             }
//             pWriter.print(marks[i]+ " ");
//           }
//       
//        for (StudentRecord stuRecord : marksList)
//        {
//           String lineOfOutput = stuRecord.getName();
//           pWriter.println(lineOfOutput);
//           for (int i = 0; i< stuRecord.getMarks().length; i++)
//           {
//             int[] marks = stuRecord.getMarks();
//             pWriter.print(marks[i]+ " ");
//           }
//         }
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
