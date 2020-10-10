import java.util.Scanner;
public class StudentTester {

public static void main(String[] args) {
	Scanner input = new Scanner(System.in);
	Scanner numbers = new Scanner(System.in);
	System.out.println ("Please enter the student's name: ");
	Student newStudent = new Student();
	String name = input.nextLine();
	newStudent.setStudentName(name);
	System.out.println ("Please enter your graduation year: ");
	int number= numbers.nextInt();
	System.out.println ("Please enter your major: ");
	String major = input.nextLine();
	
	newStudent.setStudentMajor(number, major);
	System.out.println ("Please enter your GPA: ");
	double GPA= input.nextDouble();
	newStudent.setStudentGPA(GPA);
	input.close();
	numbers.close();
}

}
