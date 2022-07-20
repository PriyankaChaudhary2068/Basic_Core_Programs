package com.bridgelabz.basicCorePrograms;
 
import java.util.Scanner;

public class FlipCoin {
	
	
	    public static void main(String[] args) {
		    int heads = 0;
		    int tails = 0;
		    int counter = 1;
		    double randNum = 0.0;
		      
		    Scanner s = new Scanner(System.in); 
		    System.out.println("How many times the coin will be flipped");
		    int flips = s.nextInt();

		    while(counter <= flips)
		    {
		    	randNum = Math.random();

		    	if(randNum < 0.5)
		    	{
		    		heads++;
		    	}
		    	else
		    	{
		    		tails++;
		    	}
		            counter++;      
		        }

		        System.out.println("Number of Heads = " + heads);
		        System.out.println("Number of Tails = " + tails);
		        double percentHeads = (float)heads/(float)flips*100;
		        double percenttails = 100 - percentHeads;
		        System.out.println("percent of wining Heads = " + percentHeads+ " %");
		        System.out.println("percent of wining Tails = " + percenttails+ " %");
		        
		        s.close();

		        
		

		}

	}
	


