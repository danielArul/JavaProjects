import java.util.Scanner;

public class Student {
	private static Scanner scan = new Scanner(System.in);

	private String firstName;
	private String lastName;
	private String coursesEnrolled = "";
	private int studentID = 0;
	private int grade;
	private int BalancePayment;

	public Student() {
		
		studentID++;
		System.out.println("Enter the first name of student:");
		this.firstName = scan.nextLine();

		System.out.println("Enter the last name of student:");
		this.lastName = scan.nextLine();
		
		int courseNumber=0;
		System.out.println("Enter the courses the student wishes to enroll.");

		do {
			courseNumber++;
			System.out.println("Enter Course"+ courseNumber  +"(ex to stop entering)");
			String course = scan.nextLine();

			if (course.equals("ex")) {
				courseNumber--;
				break;
			}
			
			coursesEnrolled += "\n" + course;
		}while (1 != 0);
		
		this.BalancePayment=500*courseNumber;

	}
	
	public void payTutition() {
		
		System.out.println("Enter the amount paid:");
		int Amount=scan.nextInt();
		if(Amount>this.BalancePayment) {
			System.out.println("The Amount paid should be less than or equal to the Balance.");
		}
		else {
				
		this.BalancePayment-=Amount;
		System.out.println("Amount Paid:"+Amount+"\nBalancePayment:"+this.BalancePayment);
	}
	}


	public String toString() {

		return "Student name:" + firstName + " " + lastName + "\n" + "Courses Enrolled:" + coursesEnrolled+""
				+ "\nStudent ID:"+studentID+"\nBalance :$"+BalancePayment+"\n";

	}
}
