public class Student {
    static int number_of_instances;
    private int rollNo;
    private String StudentName;
    private int marksInMath;
    private int marksInEng;
    private int marksInScience;

    public Student(){
        number_of_instances+=1;
        this.rollNo = number_of_instances;
    }

    public void setName(String name) {
        this.StudentName = name;
    }
    public void setMarksInMath(int marks) {
        this.marksInMath = marks;
    }
    public void setMarksInEng(int marks) {
        this.marksInEng = marks;
    }
    public void setMarksInScience(int marks) {
        this.marksInScience = marks;
    }
    public int getRollNo(){
        return this.rollNo;
    }
    public String getName(){
        return this.StudentName;
    }
    public int getMarksInEng(){
        return this.marksInEng;
    }
    public int getMarksInScience(){
        return this.marksInScience;
    }
    public int getMarksInMath(){
        return this.marksInMath;
    }
}
// If roll number is static
//create student avinash
//set the roll number for avinash by calling avinash.setRollNo()
// Rollno has become 1
// what will avinash.getRollNumber return ?
// Answer: will return 1

// Create another student aishu
// set roll number for aishu by calling aishu.setRollNo()
// Roll number has become 2
// what will aishu.getRollNumber return?
// Answer : will return 2

// What should avinash.getRollNumber return now???
// Should return 1, but instead will return 2 
// unfortunately, Avinash's roll number has changed!!!
// this is not expected

// Roll number cannot be static,
// instead make a number of instances as static,
// update this in constructore
// assign rollnum for the strudent at this time

