package java_Basics;

import java.util.Scanner;

public class IfElseIf {

	
	public static void main(String[] args) {
		 Scanner enterNumber = new Scanner(System.in);
		 
		 System.out.println("Enter The Age : ");
		 
		 int age = enterNumber.nextInt();
		
		
		
		if (age <=18) {
			
		System.out.println("The Person is Minor");
		}
		else if (age >=18 && age >=50)
		{
		System.out.println("The Person is adultl");	
	
		}		
		
		else if (age >50)
		{
		System.out.println("The Person is senior citizen");
	
		}
		else {
			
			System.out.println("Not Born Yet");
		}
		
	}
	
	
}
