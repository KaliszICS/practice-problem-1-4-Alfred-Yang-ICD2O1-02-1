/**
	* Lesson: Input
	* Author: Alfred Yang
	* Date Created: February 17, 2026
	* Date Last Modified: February 17, 2026
	*/
import java.util.Scanner;
public class PracticeProblem {

	public static void main(String args[]) {
		q1();
		q2();
		q3();
		q4();
		q5();
	}

	public static void q1() {
		//Write question 1 code here
		Scanner input = new Scanner(System.in);

		String name;
		System.out.print("What is your name: ");
		name = input.nextLine();
		System.out.println(name);

	}

	public static void q2() {
		//Write question 2 code here
		Scanner input = new Scanner(System.in);
		int num;
		System.out.print("Input a whole number: "); 
		num = input.nextInt();
		num = num*2+2;
		System.out.println(num);




	}

	public static void q3() {
		//Write question 3 code here
		Scanner input = new Scanner(System.in);
		Double rad;
		double circle;
		System.out.print("Input a radius: ");
		rad = input.nextDouble();
		input.nextLine();
		circle = 3.14*2*rad;
		rad = 3.14*rad*rad;
		System.out.println(circle);
		System.out.println(rad);
	}

	public static void q4() {
		//Write question 4 code here
		Scanner input = new Scanner(System.in);
		String first;
		String last;
		String age;
		System.out.print("Input a first name: ");
		first = input.next();
		input.nextLine();
		System.out.print("Input a last name: ");
		last = input.next();
		input.nextLine();
		System.out.print("Input an age: ");
		age = input.next();
		input.nextLine();
		System.out.println(last +", "+first+" - "+age);


	}

	public static void q5() {
		//Write question 5 code here
		Scanner input = new Scanner(System.in);
		String name;
		Integer age;
		Integer iq;
		System.out.print("Input a name: ");
		name = input.next();
		input.nextLine();
		System.out.print("Input an age: ");
		age = input.nextInt();
		input.nextLine();
		iq = age;
		age += 3;
		System.out.println(name + "" + age + "\n" + iq);
	}

}
