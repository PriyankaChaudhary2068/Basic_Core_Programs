 package com.bridgelabz.basicCorePrograms;
 
 import java.util.Scanner;


public class LargestAmongThreeNumbers {
	
	
		public static void main(String[] args) {
			int x;
			int y;
			int z;
			Scanner s = new Scanner (System.in);
			System.out.println("Enter the First Number:");
			x = s.nextInt();
			
			System.out.println("Enter the Second Number:");
			y= s.nextInt();
			
			System.out.println("Enter the Third Number:");
			z = s.nextInt();
			
			if(x > y && x > z)
			{
				System.out.println("Largest Number Is:"+x);
			}
			else if ( y > z)
			{
				System.out.println("Largest Number Is:"+y);
			}
			else
				
			{
				System.out.println("Largest Number Is:"+z);
			}
            
			s.close();
			
		}
	}


