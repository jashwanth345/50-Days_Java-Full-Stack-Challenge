package controlForm;
import java.util.*;
public class UtilityCalculator {
	//Addition
	static int add(int a,int b) {
		return a+b;
	}
	//Method Overloading(Addition)
	static int add(int a,int b,int c) {
		return a+b+c;
	}
	//Subtraction
	static int sub(int a,int b) {
		return a-b;
	}
	//Multiplication
	static int multiple(int a, int b) {
		return a*b;
	}
	//Division
	static double divide(int a,int b) {
		if(b==0) {
			System.out.println("Division by zero is not allowed.");
			return 0;
		}
		return (double) a/b;
	}
	//Factorial
	static int factorial(int n) {
		int fact=1;
		for(int i=1;i<=n;i++) {
			fact*=i;
		}
		return fact;
	}
	//prime no.
	static boolean isprime(int n) {
		if(n<=1)
			return false;
		for(int i=2;i<=Math.sqrt(n);i++) {
			if(n%i==0) {
				return false;
			}
		}
		return true;
	}
	//even or odd
	static boolean isEven(int n) {
		return n%2==0;
	}
	//power
	static int power(int base, int exponent) {
		int result=1;
		for(int i=1;i<=exponent;i++) {
			result*=base;
		}
		return result;
	}
	
	
	
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		int choice;
		do {

            System.out.println("\n========== Utility Calculator ==========");
            System.out.println("1. Addition");
            System.out.println("2. Subtraction");
            System.out.println("3. Multiplication");
            System.out.println("4. Division");
            System.out.println("5. Factorial");
            System.out.println("6. Prime Number Check");
            System.out.println("7. Even/Odd Check");
            System.out.println("8. Power Calculation");
            System.out.println("9. Method Overloading (Add 3 Numbers)");
            System.out.println("0. Exit");
            System.out.print("Enter your choice: ");

            choice = sc.nextInt();

            switch (choice) {

                case 1:
                    System.out.print("Enter two numbers: ");
                    int a = sc.nextInt();
                    int b = sc.nextInt();
                    System.out.println("Result = " + add(a, b));
                    break;

                case 2:
                    System.out.print("Enter two numbers: ");
                    a = sc.nextInt();
                    b = sc.nextInt();
                    System.out.println("Result = " + sub(a, b));
                    break;

                case 3:
                    System.out.print("Enter two numbers: ");
                    a = sc.nextInt();
                    b = sc.nextInt();
                    System.out.println("Result = " + multiple(a, b));
                    break;

                case 4:
                    System.out.print("Enter two numbers: ");
                    a = sc.nextInt();
                    b = sc.nextInt();
                    System.out.println("Result = " + divide(a, b));
                    break;

                case 5:
                    System.out.print("Enter a number: ");
                    int n = sc.nextInt();
                    System.out.println("Factorial = " + factorial(n));
                    break;

                case 6:
                    System.out.print("Enter a number: ");
                    n = sc.nextInt();

                    if (isprime(n))
                        System.out.println("Prime Number");
                    else
                        System.out.println("Not a Prime Number");

                    break;

                case 7:
                    System.out.print("Enter a number: ");
                    n = sc.nextInt();

                    if (isEven(n))
                        System.out.println("Even Number");
                    else
                        System.out.println("Odd Number");

                    break;

                case 8:
                    System.out.print("Enter Base: ");
                    int base = sc.nextInt();

                    System.out.print("Enter Exponent: ");
                    int exponent = sc.nextInt();

                    System.out.println("Result = " + power(base, exponent));

                    break;

                case 9:
                    System.out.print("Enter three numbers: ");
                    int x = sc.nextInt();
                    int y = sc.nextInt();
                    int z = sc.nextInt();

                    System.out.println("Result = " + add(x, y, z));

                    break;

                case 0:
                    System.out.println("Thank You!");
                    break;

                default:
                    System.out.println("Invalid Choice!");
            }

        } while (choice != 0);

        sc.close();
    }
}
