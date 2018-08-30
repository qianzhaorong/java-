package test_02;

import java.util.Scanner;

public class Scanner_nextLine {
	public static void main(String[] args) {
//		Scanner sc = new Scanner(System.in);
//		System.out.println("Please input your name:");
//		String name = sc.nextLine();
//		System.out.println("Please input your age:");
//		int age = sc.nextInt();
//		System.out.println("Please input your salary:");
//		float salary = sc.nextFloat();
//		System.out.println("Your information:");
//		System.out.println("name:" + name + " age:" + age + " salary:" + salary);
		
		Scanner sc = new Scanner(System.in);
		System.out.println("Please input your age:");
		int age = sc.nextInt();
		System.out.println("Please input your name:");
		String name = sc.nextLine();
		System.out.println("Please input your salary:");
		float salary = sc.nextFloat();
		System.out.println("Your information:");
		System.out.println("name:" + name + " age:" + age + " salary:" + salary);
	}
}
