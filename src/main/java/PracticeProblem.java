import java.util.Scanner;

public class PracticeProblem {

	public static void main(String args[]) {
		q1();
		q2();
		q3();
		q4();
		q5();
		q6();
	}

	public static void q1() {
		//Write question 1 code here
		Scanner input = new Scanner(System.in);
		System.out.print("In: ");
		String phrase = input.nextLine();
		System.out.println(phrase);
	}

	public static void q2() {
		//Write question 2 code here
		Scanner input = new Scanner(System.in);
		System.out.print("In: ");
		int num = input.nextInt();
		input.nextLine();
		System.out.print("In: ");
		int num2 = input.nextInt();
		input.nextLine();
		System.out.println(num/num2);
		System.out.println(num%num2);
	}

	public static void q3() {
		//Write question 3 code here
		Scanner input = new Scanner(System.in);
		System.out.print("In: ");
		String phrase = input.nextLine();
		System.out.println(phrase + " was the text you wrote");


	}

	public static void q4() {
		//Write question 4 code here
		Scanner input = new Scanner(System.in);
		System.out.print("In: ");
		int num = input.nextInt();
		input.nextLine();
		System.out.println(num*5);
	}

	public static void q5() {
		//Write question 5 code here
	Scanner input = new Scanner(System.in);
	System.out.print("In: ");	
	boolean trueFalse = input.nextBoolean();
	input.nextLine();
	System.out.println(trueFalse + " is a boolean");


	}

	public static void q6() {
		//Write question 6 code here
		Scanner input = new Scanner(System.in);
		System.out.print("In: ");
		Double fracNum = input.nextDouble();
		input.nextLine();
		System.out.println(fracNum - 3.2);
	}

}
