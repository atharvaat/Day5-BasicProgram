package com.bridgelabz;

public class FlipCoin {
	   public static void main(String[] args) {  
			double flip = Math.floor(Math.random()*10)%2;
			if (flip == 1) {
		    	float head = 1;
			 head+=0;
			double visitedheadpercentage = (0.5)*100;
			System.out.println("coined flipped and it got Head");
			System.out.println("count of visited heads are "+head);
			System.out.println("head visited percentage is "+visitedheadpercentage);
			}
			else {
				float tail = 1;
				tail+=0;
		    double visitedtailpercentage = (0.5)*100;		
				System.out.println("coin flipped and it got tail");
				System.out.println("count of visited tails are "+tail);
				System.out.println("tail visited percentage is "+visitedtailpercentage);
			}	 
			 
		 }	
}
