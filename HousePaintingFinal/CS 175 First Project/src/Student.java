public class Student {
	
	//Sets and prints the name of the student.

public String setStudentName (String name) {
	System.out.println ("Name: " +name);
	return name;
}
	//Sets and prints the student's major.

public String setStudentMajor (int majorNumber, String major) {
	System.out.println ("Major: " + majorNumber+ " "+major);
	return majorNumber + major;
}
	//Sets and prints the student's GPA
public double setStudentGPA (double GPA) {
	System.out.println ("GPA: " +GPA);
	return GPA;
	}
}