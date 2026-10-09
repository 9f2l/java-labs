package tut08;

import java.util.Scanner;

public class Tut08 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.print("Enter the first value: "); 
		Scanner sc = new Scanner(System.in);
	   	int n1 = sc.nextInt();
	   	System.out.print("Enter the second numeric value: ");  
	   	int n2 = sc.nextInt();
	   	numCompare(n1,n2);
	}
	public static void numCompare(int a, int b) {
		if ( a > b ) {
			System.out.println( a + " is bigger");
		}
		else  if(b > a) {
			System.out.println( b + " is bigger");
		}
		else {
			System.out.println( a + " and " + b + " are equal");
		}
		
	}
}
