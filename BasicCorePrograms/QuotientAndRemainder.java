package com.bridgelabz.basicCorePrograms; 

import java.util.Scanner;

public class QuotientAndRemainder {
	
	

		public static void main(String[] args) {
			int num;
			int num1;
			Scanner s = new Scanner(System.in);
			System.out.println("Enter the Dividend Number = ");
		    num = s.nextInt();
		    
			Scanner r = new Scanner(System.in);
			System.out.println("Enter the Dividend Number = ");
			num1 = r.nextInt();
			
			int Quotient = num / num1;
			int Reminder = num % num1;
			System.out.println("Quotient ="+ Quotient );
			System.out.println("Reminder ="+ Reminder );
			
			s.close();
			r.close();


		}

	}


	
	

