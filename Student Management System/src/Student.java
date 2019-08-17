import java.util.Scanner;

public class Student {
	private static Scanner scan=new Scanner(System.in);
	
	private String firstName;
	private String lastName;
	private String coursesEnrolled="";
   	private int grade;
//	private String firstName;
//	
	
	
	public Student() {
		System.out.println("Enter the first name of student:");
		this.firstName=scan.nextLine();
		
		System.out.println("Enter the last name of student:");
		this.lastName=scan.nextLine();
		
		System.out.println("Enter the courses the student enrolled: ");
		
		do {
			System.out.println("Enter Course name (ex to stop entering)");
			String course=scan.nextLine();
			
			if(course.equals("ex")) {
				break;
			}
			
			
			coursesEnrolled+="\n"+course;
			
		}
			
		while(1!=0);
					
			
		}
		
	
	public String toString() {
		
		return "Student name:"+firstName+" "+lastName+"\n"+"Courses Enrolled:" + coursesEnrolled ;
		
		
	}
}
