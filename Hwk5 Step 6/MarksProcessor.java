import java.util.*;
import java.io.*;
/**
 * This class Stores the nameOfCohort, noOfMarks and a list of StudentRecord.
 * It uses the Scanner class to read data from a file 
 * The PrintWriter class is used to write read data to a new file of the same type
 * 
 * @author (Omotola M. Shogunle) 
 * @version (13-02-2016)
 */
public class MarksProcessor
{
    // instance variables 
    private String nameOfCohort;
    private ArrayList<StudentRecord> marksList;
    private int noOfMarks;

    /**
     * Constructor for objects of class MarksProcessor
     * 
     * @nameOfCohort saves the name of cohort from file read 
     * @noOfMarks saves the number of marks the students have based on file read
     * @marksList is an ArrayList variable that stores the StudentRecord objects
     */
    public MarksProcessor()
    {
        // initialise instance variables
        nameOfCohort = "Name Of Cohort";
        marksList = new ArrayList<StudentRecord>();
        noOfMarks = 0;
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
      nameOfCohort = scanner.nextLine();
      this.nameOfCohort = nameOfCohort;
      int noOfMarks = scanner.nextInt();
      this.noOfMarks = noOfMarks;
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
   
   /**
    * Displays students names and marks and average to the terminal window
    * 
    * @param listPosition used to prevents list of students to be displayed using the zero based indexing
    * @param average stores the average value of sumed marks
    */
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
    
    /**
    * Writes marks data to a new file
    *
    * @param   <code>fileName</code> a <code>String</code>, the name of the 
    *          text file in which the data is written to.
    * 
    * @throws  FileNotFoundException
    */   
   public void writeMarksData(String fileName) throws FileNotFoundException
   {
       PrintWriter pWriter = new PrintWriter(fileName);
       pWriter.println(nameOfCohort);
       pWriter.println(noOfMarks);
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
   
   /**
    * Emptys stored data in MarksProcessor 
    * 
    * @param trimToSize() resets the size of the ArrayList
    * @isEmpty() checks if arrayList is empty
    */
   public void clearMarksData()
   {
       if(!marksList.isEmpty())
       { 
           marksList.clear(); //discards all entries from marksList.
           marksList.trimToSize();
           nameOfCohort = "Name of Cohort";
           noOfMarks = 0;
        }
        else{
            System.out.println("No data available to discard");
        }
    }
   
   /**
    * Modify the data stored in the MarksProcessor
    * 
    * @param studentPosn for accessing the students based on position in the ArrayList
    *        marksPosn for position of marks that user wants to modify
    *        newMark input value for updated mark
    */
   public void editMarksData(int studentPosn, int marksPosn, int newMark) 
                                                        
   {
       if(studentPosn > 0 && marksPosn > 0)
       {
           StudentRecord student = marksList.get(studentPosn-1);
           int[] marks = student.getMarks();
           marks[marksPosn-1] = newMark; 
        }
        else
        {
            System.out.println("############################"+
            "\nInvalid input values"+
            "\nData was not updated"+
            "\n##############################"+
            "\n"
            );
        }
   }
}
