package email;

public class Email_main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Email_contents em1=new Email_contents("John","Diven");
		Email_contents em2=new Email_contents("Tim","Myatt");
		
		
		em2.ResetPassword();
		
		System.out.println(em2);
	}

}
