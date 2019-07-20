package email;
import java.util.Scanner;

public class Email_contents {
	
	private static Scanner scan=new Scanner(System.in);
	
	private String firstName;
	private String lastName;
	private String department;
	private String emailSuffix="company.com";
	private int passwordLength=8;
	private String emailID;
	String Password;
	//Constructor for this class
	public Email_contents(String firstname, String lastname) {
		
		
		this.firstName=firstname;
		this.lastName=lastname;		
		
		
		this.department=setDepartment();
		Password=passwordGenerator(passwordLength);
		
		emailID=firstname.toLowerCase()+"."+lastname.toLowerCase()+"."+this.department
				+"@"+this.emailSuffix+"\n";
		
		System.out.println("\nYour new email account is:" +emailID);
		System.out.println("------------------------------------");
		// TODO Auto-generated constructor stub
		
		System.out.println("Your new password is: "+Password);
	}
	
	//Prompts the user to enter the department he or she is assigned to
	private String setDepartment() {
		System.out.println(firstName+"! Enter the department you are assigned to\n1 for Sales"
				+ "\n2 for Accounting\n3 for Research\n4 for Human resource and management\5 for other:");
		
		int depNum=scan.nextInt();
		scan.nextLine();
		
			
		if(depNum==1) {
			return "sales";
		}
		else if(depNum==2) {
			return "accounting";
		}
		else if(depNum==3) {
			return "research";
		}
		else if(depNum==4) {
			return "hrm";
		}
		else {
			return "";
		}
		
		
	}
	
	//This is a password generator
	private String passwordGenerator(int size) {
		String words="abcdefghijklmnopqrstuvwxyz";
		String characters=words.toUpperCase()+"abcdefghijklmnopqrstuvwxyz0123456789!@#$%&*()_+-=[]?";
		char[] password=new char[size];
		
		for(int i=0;i<size;i++) {
			int rand= (int) (Math.random() * characters.length());
			password[i]=characters.charAt(rand);
		}
		
		String SPassword=new String(password);
		
		return SPassword;		
	}
	
	//Function to reset password
	public void ResetPassword() {
		System.out.println("Enter new Password:");
		setPassword(scan.nextLine());		
	}
	
		
	public String getPassword() {
		return Password;
	}

	public void setPassword(String password) {
		Password = password;
	}

	//toString() method for this class
	public String toString() {
		return "EmailID:"+this.emailID+"\nPassword:"+Password;
	}
	
	
}
