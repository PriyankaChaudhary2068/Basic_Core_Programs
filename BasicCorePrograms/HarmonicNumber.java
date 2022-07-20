package com.bridgelabz.basicCorePrograms;

import java.util.Scanner;

public class HarmonicNumber {
	
	
		public static void main(String[] args) {
			int num;
			Scanner s = new Scanner(System.in);
			System.out.println("Enter the Nth Harmonic Numbe: ");
		    num = s.nextInt();
			System.out.println("The Harmonic Series Is : ");

			for (int i=1; i<=num; i++) 
			{
			double Harmonic_Number = (double)1/i ;
			System.out.println(Harmonic_Number + ",");
			
			s.close();

			}
			
		}


}
