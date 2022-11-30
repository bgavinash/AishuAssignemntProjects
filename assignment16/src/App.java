public class App {
    public static void main(String[] args) throws Exception {
        System.out.println("Hello, World!");
        // Create a standard
        // add 4 students to it
        // display all students

        Standard std = new Standard();
        
        std.addStudent("Aishu", 90, 91, 92);
        std.addStudent("Anuja", 80,81,82);
        std.addStudent("Anupama", 70,71,72);
        std.addStudent("Avinash", 60,61,62);

        std.displayAllStudents();
    }
}
