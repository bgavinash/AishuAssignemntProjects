public class Standard {
    
    // 2 types of variables 
    // reference variables and Primitive varaiables
    // A standard should have 8 students
    Student[] fileOfStudents;
    int number_of_students_entered;
    // here students is a reference variable of type array of students

    public Standard(){
        fileOfStudents = new Student[4];
        number_of_students_entered = 0;
    }

    public void addStudent(String name,int math,int science,int english){
        //1  create an object of Student
        //2  fill in the details for the students
        //3 then insert the student into fileOfStudents

        //step 1:
        Student s = new Student();
        //step2:
        s.setName(name);
        s.setMarksInEng(english);
        s.setMarksInMath(math);
        s.setMarksInScience(science);
        //step3:
        fileOfStudents[number_of_students_entered] = s;
        number_of_students_entered += 1;
    }

    public void displayAllStudents(){
        for(int i=0;i<4;i++){
            System.out.println("Roll Num = " + fileOfStudents[i].getRollNo() + "-----> Name = " + fileOfStudents[i].getName());
        }
    }
}
