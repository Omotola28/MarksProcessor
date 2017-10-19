
/**
 * Write a description of class StudentRecord here.
 * 
 * @author (Omotola Shogunle) 
 * @version (version1)
 */
public class StudentRecord
{
    // instance variables - replace the example below with your own
    private String name;
    private int noOfMarks;
    private int[] marks;

    /**
     * Constructor for objects of class StudentRecord
     *@param studentMarks indicates number for length of array.
     *@noOfMarks 3 is the number of marks allocated to each student
     */
    public StudentRecord(String name, int studentMarks)
    {
        // initialise instance variables
        this.name = name;
        noOfMarks = 3;
        marks = new int[studentMarks];
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
