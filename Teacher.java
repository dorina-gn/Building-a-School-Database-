public class Teacher {
        //Creates a string for the first name of the teacher
        private String firstName;
        //Creates a string for the last name of the teacher
        private String lastName;
        //Creates a string for the subject they teach
        private String subject;

        //This constructor initializes student with 'firstName', 'lastName' and 'subject'
        public Teacher(String firstName, String lastName, String subject) {
                //Passes the value of 'firstName' from the constructor onto the variable
                this.firstName = firstName;
                //Passes the value of 'lastName' from the constructor onto the variable
                this.lastName = lastName;
                //Passes the value of 'subject' from the constructor onto the variable
                this.subject = subject;
        }
        //Creates a getter to access 'firstName'
        public String getFirstName() {
                //Returns 'firstName'
                return firstName;
        }
        //The method requires an string input in order to be called
        public void setFirstName(String firstName) {
                //Assigns the value of the parameter to the object, not just to the parameter itself
                this.firstName = firstName;

        }
        //Creates a getter to access 'lastName'
        public String getLastName() {
                //Returns 'lastName'
                return lastName;

        }
        //The method requires an string input in order to be called
        public void setLastName(String lastName) {
                //Assigns the value of the parameter to the object, not just to the parameter itself
                this.lastName = lastName;

        }
        //Creates a getter to access 'Grade'
        public String getSubject() {
                //Returns 'subject'
                return subject;

        }
        //The method requires an string input in order to be called
        public void setSubject(String subject) {
                //Assigns the value of the parameter to the object, not just to the parameter itself
                this.subject = subject;

        }
        //Creates a 'toString()' method so that the output is readable to users
        public String toString() {
        //Converts all the categories below into a readable format
                return "Name: " + firstName + " " + lastName + " " + "Subject: " + subject;
        }
}