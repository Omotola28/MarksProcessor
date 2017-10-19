import java.util.*;
import java.io.*;
/**
 * The Test class is used to thoroughly test code written in MarksProcessor
 * 
 * 
 * @author (Omotola M Shogunle) 
 * @version (13/02/2017)
 */
public class Test
{
    /**
     * Constructor for objects of class Test
     */
    public Test()throws FileNotFoundException
    {
        // Step iii Testing for data1.txt
        MarksProcessor mksPro1 = new MarksProcessor();
        //mksPro1.readMarksData("data1.txt");
        //mksPro1.displayResults();
        
        //Step iii Testing for data2.txt
        //MarksProcessor mksPro1 = new MarksProcessor();
        //mksPro1.readMarksData("data2.txt");
        //mksPro1.displayResults();
        
        //#############################################################################
        //Step 3i Testing to read data1.txt and write data into new text file 
        //MarksProcessor mksPro1 = new MarksProcessor();
        //mksPro1.readMarksData("data1.txt");
        //mksPro1.writeMarksData("data3.txt");
        
        //Step 3i Testing to read data2.txt and write data into new text file 
        //MarksProcessor mksPro1 = new MarksProcessor();
        //mksPro1.readMarksData("data2.txt");
        //mksPro1.writeMarksData("data4.txt");
        
        
        //############################################################################
        //Step 3ii Testing to clear from text file 
        //MarksProcessor mksPro1 = new MarksProcessor();
        //mksPro1.readMarksData("data1.txt");
        //mksPro1.clearMarksData();
        //mksPro1.displayResults();
        
        //Testing if users forget that data has already been cleared from arrayList
        //MarksProcessor mksPro1 = new MarksProcessor();
        //mksPro1.readMarksData("data1.txt");
        //mksPro1.clearMarksData();
        //mksPro1.clearMarksData(); 
     
        
        //##############################################################################
        //Step 3iii Testing to modify data in file 
        //MarksProcessor mksPro1 = new MarksProcessor();
        //mksPro1.readMarksData("data1.txt");
        //mksPro1.editMarksData(1,3,100);
        //mksPro1.displayResults();
        
        //Testing for valid index
        //MarksProcessor mksPro1 = new MarksProcessor();
        //mksPro1.readMarksData("data1.txt");
        //mksPro1.editMarksData(-1,3,100);
        //mksPro1.displayResults();
    }
}
