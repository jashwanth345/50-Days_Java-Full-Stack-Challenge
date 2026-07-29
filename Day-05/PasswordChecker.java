import java.util.*;
public class PasswordChecker {
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter Password : ");
		String password=sc.nextLine();
		boolean hasUpper=false;
		boolean hasLower=false;
		boolean hasDigit=false;
		boolean hasSpecial=false;
		for(int i=0;i<password.length();i++) {
			char ch=password.charAt(i);
			if(Character.isUpperCase(ch))
				hasUpper=true;
			else if(Character.isLowerCase(ch))
				hasLower=true;
			else if(Character.isDigit(ch))
				hasDigit=true;
			else
				hasSpecial=true;
		}
		int score=0;
		if(hasUpper)
			score++;
		if(hasLower)
			score++;
		if(hasDigit)
			score++;
		if(hasSpecial)
			score++;
		
		System.out.println("\nPassword Analysis ");
		System.out.println("-------------------------------");
		System.out.println("Length : "+ password.length());
		System.out.println("Uppercase : "+hasUpper);
		System.out.println("Lowercase : "+ hasLower);
		System.out.println("Special Characters : "+ hasSpecial);
		System.out.println("\npassword Strength");
		if(password.length()<8||score<=2) {
			System.out.println("Weak Password");
		}else if(score==3) {
			System.out.println("Medium Password");
		}else {
			System.out.println("Storng Password");
		}
		sc.close();
		
	}
}
