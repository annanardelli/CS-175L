import java.util.Scanner;

public class ClassTester {
	public static void main (String []args) {
		Scanner stud = new Scanner (System.in);
		Scanner grades = new Scanner (System.in);
		System.out.println("Please enter the name of a student: ");
		String studentName= stud.toString();
		Class student1 = new Class (studentName);
		System.out.println("Please enter the grade of this student: ");
		int grade = grades.nextInt();
		student1.setGrade(grade);
		System.out.println("There are currently "+ student1.getStudentNum() +" students in the class.");
		System.out.println("Would you like to add another student to the class?");
		stud.close();
		grades.close();
	}
}
