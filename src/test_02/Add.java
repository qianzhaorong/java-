package test_02;

import java.util.Scanner;

public class Add {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Please input the value of a:");
		int a = sc.nextInt();
		System.out.println("Please input the value of b:");
		int b = sc.nextInt();
		
		System.out.println("The sum of " + a + " and " + b + " is " + (a + b));
	}
}
