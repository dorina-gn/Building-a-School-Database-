import java.util.ArrayList;

public class School {
    //Creates a string for the list of teachers
    private ArrayList<Teacher> teachers = new ArrayList<>();
    //Creates a string for the list of students
    private ArrayList<Student> students = new ArrayList<>();
    //Creates a string for the name of the school
    private String schoolName;
    //Creates a string for the location of the school
    private String location;
    //Creates a string for the current school year
    private int currentYear;

    //This constructor initializes student with 'firstName', 'lastName' and 'grade'
    public School(String schoolName, String location, int currentYear) {
        //Passes the value of 'schoolName' from the constructor onto the variable
        this.schoolName = schoolName;
        //Passes the value of 'location' from the constructor onto the variable
        this.location = location;
        //Passes the value of 'currentYear' from the constructor onto the variable
        this.currentYear = currentYear;
    }

    public ArrayList<Student> getStudents(){
        //Returns 'students'
        return students;
    }

    public ArrayList<Teacher> getTeachers() {
        //Returns 'teachers'
        return teachers;
    }

    public String getName() {
        //Returns 'schoolName'
        return schoolName;
    }

    public void setName(String name) {
        this.schoolName = name;
    }

    public String getLocation() {
        //Returns 'schoolName'
        return location;
    }

    public void setLocation(String location) {
        this.location = location;
    }

    public int getCurrentYear() {
        return currentYear;
    }

    public void setCurrentYear(int currentYear) {
        this.currentYear = currentYear;
    }

    public void addTeacher(Teacher teacher){
    //Adds a teacher to the teacher list
    teachers.add(teacher);

    }
    public void addStudent(Student student){
    //Adds a student to the student list
        students.add(student);

    }
    public void removeTeacher(Teacher teacher) {
        //Removes a teacher from the teacher list
        teachers.remove(teacher);
    }
    public void removeStudent(Student student) {
        //Removes a student from the student list
        students.remove(student);
    }
    //Creates a method 'showAllTeachers()' that will display all the teachers
    public void showAllTeachers(){
        //Iterates over each teacher in a list
        for (Teacher teacher: teachers) {
            //Prints out each teacher
            System.out.println(teacher);
        }
    }
    //Creates a method 'showAllStudents()' that will display all the students
    public void showAllStudents(){
        //Iterates over each student in the student list
        for (Student student: students){
            //Prints out each student
            System.out.println(student);
        }
    }
}