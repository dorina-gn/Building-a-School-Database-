public class Main {
    public static void main(String[] args) {
        //Creates a new school
        //Assigns it the information "name", "location", "currentYear" from the School class
        //Why did we create the school again?
        School school = new School("Sir Charles Tupper Secondary", "419 East 24th Ave", 2024);

        //The loop assigns 'i' a value of 1 and iterates through each loop until it reaches 10
        //This ensures that exactly 10 students are added
        for (int i = 1; i <= 10; i++){
            //Creates a string 'firstName' and adds a number after the string
            //This number increments after each loop
            String firstName = "Student" + i;
            //Creates a string 'lastName' and adds a number after the string
            //This number increments after each loop
            String lastName = "Last" + i;
            //Creates an array of numbers to represent the grade levels
            int [] numbers = {8,9,10,11,12};
            //An integer 'randomIndex' is created and the grade levels are randomized using the 'Math.random()' method
            int randomIndex = (int)(Math.random()* numbers.length);
            //Accesses a random index and sets the grade to the index accessed
            int grade = numbers[randomIndex];
            //Adds a student to the list using "firstName", "lastName", "grade" from the Student class
            school.addStudent(new Student(firstName, lastName, grade));
        }
        //The loop assigns 'i' a value of 1 and iterates through each loop until it reaches 3
        //This ensures that exactly 3 teachers are added
        for (int i = 0; i < 3; i++){
            //Creates a string 'firstName' and adds a number after the string
            //This number increments after each loop
            String firstName = "Teacher" + (i + 1);
            //Creates a string 'lastName' and adds a number after the string
            //This number increments after each loop
            String lastName = "Last" + (i + 1);
            //Adds the "Math", "Science" and "history" subjects
            //Each subject is represented by an index ranging from 0 to 2
            String[] subjects = {"Math", "Science", "History"};
            //Assigns the subjects above to the subject string using index values
            String subject = subjects[i];
            //Uses the addTeacher() method to add a new teacher
            //Assigns the 'firstName', 'lastName','subject' to the new Teacher
            school.addTeacher(new Teacher(firstName, lastName, subject));
        }
        //Displays a list of all the students
        System.out.println();
        school.showAllStudents();
        System.out.println();
        //Displays a list of all the teachers
        school.showAllTeachers();
        System.out.println();
        //Retrieves the first student from the student list at the index '0' using the getStudents() method
        Student student1 = school.getStudents().get(0);
        //Uses the method 'removeStudent() to remove the first student from the list
        school.removeStudent(student1);
        //Retrieves the first student from the student list at the index '1' using the getStudents() method
        Student student2 = school.getStudents().get(1);
        //Uses the method 'removeStudent() to remove the second student from the list
        school.removeStudent(student2);

        //Retrieves the first teacher from the teacher list at the index '0' using the getTeachers() method
        Teacher teacher1 = school.getTeachers().get(0);
        //Removes the first teacher from the list
        school.removeTeacher(teacher1);

        //Displays a list of all the students after they were removed
        school.showAllStudents();
        System.out.println();
        //Displays a list of all the teachers after they were removed
        school.showAllTeachers();
    }
}

