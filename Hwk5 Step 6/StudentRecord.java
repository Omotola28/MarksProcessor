
/**
 * This class is used to store student records, name, noOfMarks, marks
 * 
 * @author (Omotola Shogunle) 
 * @version (13/02/2017)
 */
public class StudentRecord
{
    //instance variables
    private String name;
    private int noOfMarks;
    private int[] marks;
    
    /**
     *Constructor for objects of class StudentRecord
     *@marks stores the array object
     *@noOfMarks is the number of marks allocated to each student and size of array
     */
    public StudentRecord(String name, int[] studentMarks)
    {
        // initialise instance variables
        this.name = name;
        marks = studentMarks;
        noOfMarks = marks.length;
    }
    
    /**
     * Accessor methods for the class StudentRecords
     */
    public String getName()
    {
        return name;
    }
    
    public int getNoOfMarks()
    {
        return noOfMarks;
    }
    
    public int[] getMarks()
    {
        return marks;
    }
}
