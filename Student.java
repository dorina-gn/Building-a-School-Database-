import java.util.HashSet;
public class Student {

    //Ensures a unique number will be generated each time
    private HashSet<Integer> uniqueNum = new HashSet<>();

    //Creates a string for the first name of the student
    private String firstName;
    //Creates a string for the last name of the student
    private String lastName;
    //Creates an integer to hold grades of the student
    private int grade;

    //Creates an integer to hold student numbers
    private int studentNumber;

    //This constructor initializes student with 'firstName', 'lastName' and 'grade'
    public Student(String firstName, String lastName, int grade){
        //Passes the value of 'firstName' from the constructor onto the variable
        //'this' is used to refer to the object, which is the Student in this case
        this.firstName = firstName;
        //Passes the value of 'lastName' from the constructor onto the variable
        this.lastName = lastName;
        //Passes the value of 'grade' from the constructor onto the variable
        this.grade = grade;
        //Assigns each Student a different student number
        this.studentNumber = uniqueStudentNumber();
    }

    //Creates a new integer 'uniqueStudentNumber' which assigns each student a unique 7-digit student number
    private int uniqueStudentNumber(){
        //Creates an integer 'randomNumber'
        int randomNumber;
        /**This loop ensures the code runs at least once
        In order to generate unique numbers, there must be an original number to compare them to
        By running the loop once, the method can check if each number is unique by comparing it
        to the previous ones**/
        do {
            /**Uses the method 'Math.random() which generates a number between 0 and 1
            Multiplying this number by 10000000 will cause the number to start from 0 and go up to 7 digits
            Adding 1000000 causes the lowest number possible to be 1000000
            While the highest number will be 9,999,999
            Therefore, the student number will always remain in a 7-digit range**/
            randomNumber = (int) (Math.random()* 9000000) + 1000000;
            //This loop will run while this condition is true
        } while (uniqueNum.contains(randomNumber));
        //Once a unique number is found, 'randomNumber' will be added to the 'uniqueNum' set
        uniqueNum.add(randomNumber);
        //Returns 'randomNumber' when the method is called
        return randomNumber;
    }

    //Creates a getter to access 'FirstName'
    public String getFirstName() {
        //Returns 'firstName'
        return firstName;
    }
    //The method requires a string input and text in order to be called
    //Sets the first name
    public void setFirstName(String firstName) {
        //Assigns the value of the parameter to the object, not just to the parameter itself
        //'this' refers to the original object
        this.firstName = firstName;
    }

    //Creates a getter to access 'LastName'
    public String getLastName() {
        //Returns 'lastName'
        return lastName;
    }
    //The method requires a string input and text in order to be called
    public void setLastName(String lastName) {
        //Assigns the value of the parameter to the object, not just to the parameter itself
        this.lastName = lastName;
    }

    //Creates a getter to access 'Grade'
    public int getGrade() {
        //Returns 'grade'
        return grade;
        }

    //The method requires an integer input in order to be called
    public void setGrade(int grade){
        //Accepts grade values that are greater or equal to 8 and less than or equal to 12
        //This makes the range from 8-12
        if (grade >= 8 && grade <= 12) {
            //Assigns the value of the parameter to the object, not just to the parameter itself
            this.grade = grade;
        }

    }
    //Creates a getter to access 'studentNumber'
    public int getStudentNumber() {
        //Returns 'studentNumber'
        return studentNumber;
    }

    //The method requires an integer input in order to be called
    public void setStudentNumber(int studentNumber) {
        //Assigns the value of the parameter to the object, not just to the parameter itself
        this.studentNumber = studentNumber;
    }

    //Creates a 'toString()' method so that the output is readable to users
    public String toString(){
        //Converts all the categories below into a readable format
        return "Name: " + firstName + " " + lastName + " Grade: " + grade + " Student Number: " + studentNumber;
    }
}
