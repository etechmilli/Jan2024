package SchoolDays;

public class Student{
	String name;
	String sex;
	String dOB;
	String birthPlace;
		// This program is a meant to simulate adding and subtracting students to a school
		// Bio info for students, course load and extracurricular activities
		// Bio data: name, sex, DOB and birthplace
		// CourseLoad: List the courses that they are taking 1 through 5
		// Extracurricular activities: Athlete yes/no, STEM yes/no, student government yes/no and Creative yes/no
		// Create a default constructor 
		// Create 3 different student profiles
		
		
		private Student(String name, String sex, String dOB, String birthPlace) {
			this.name = name;
			this.sex = sex;
			this.dOB = dOB;
			this.birthPlace = birthPlace;
		}
		
		public static void main(String[] args) {
			Student jeffrey = new Student("Jeffrey", "Male", "23SEP2008", "Atlanta, GA");
			Student kimberely = new Student("Kimberely", "Female", "15NOV2009", "Tampa, FL");
			Student jasmine = new Student("Jasmine", "Female", "10DEC2008", "New York, New York");

		 // Print student information
        System.out.println("Name: " + jeffrey.name);
        System.out.println("Sex: " + jeffrey.sex);
        System.out.println("DOB: " + jeffrey.dOB);
        System.out.println("Birthplace: " + jeffrey.birthPlace);
        System.out.println("");
        
        // Print student information
        System.out.println("Name: " + kimberely.name);
        System.out.println("Sex: " + kimberely.sex);
        System.out.println("DOB: " + kimberely.dOB);
        System.out.println("Birthplace: " + kimberely.birthPlace);
        System.out.println("");
       
        // Print student information
        System.out.println("Name: " + jasmine.name);
        System.out.println("Sex: " + jasmine.sex);
        System.out.println("DOB: " + jasmine.dOB);
        System.out.println("Birthplace: " + jeffrey.birthPlace);
        System.out.println("");
}
}