import java.util.Scanner;

class AgeException extends Exception{
	AgeException(String s){
		super(s);
	}
}
class VoterAge{
	void checkAge(int age) {
		try {
		if(age<18) {
			AgeException ageob=new AgeException("Not Eligible for Voting");
			throw ageob;
		}
		else {
			System.out.println("You can vote!!!!");
		}
		}catch(AgeException e) {
			e.printStackTrace();
		}
	}
}

public class UserException {

	public static void main(String[] args) {
		VoterAge ob=new VoterAge();
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter voter age");
		int age=sc.nextInt();
		ob.checkAge(age);

	}



}
