package com.cdac.tester;
import java.util.*;
import com.cdac.geometry.*;
public class TestPoints {

	public static void main(String[] args) {
		try(Scanner sc= new Scanner(System.in)){
			
			System.out.println("Enter no of points to plot: ");
			Point2D arr[]=new Point2D[sc.nextInt()];
			
			System.out.println("Enter x and y co-ordinates "+arr.length+" times");
			for(int i=0;i<arr.length;i++) {
				arr[i]=new Point2D(sc.nextInt(),sc.nextInt());
			}
			
			boolean b=true;
			
			while(b) {
				System.out.println("Select 1.Display co-ordinates 2.Compare two points 3.Exit:  ");
				switch(sc.nextInt()) {
				
				case 1:
					System.out.println("Displaying all coordinates: ");
					for(Point2D p:arr) {
						if(p != null)
							System.out.println(p);
						else
							System.out.println("No object at current index!!!");
					}
					break;
				case 2:
					System.out.println("Enter 2 indices between 0 to "+ (arr.length-1));
					Point2D firstPoint = arr[sc.nextInt()];
					Point2D secondPoint = arr[sc.nextInt()];
					if(firstPoint.equals(secondPoint)){
						System.out.println("Entered two points are same");
					}
					else
						System.out.println("Entered two points are at distance "+firstPoint.calculateDistance(secondPoint));
					break;
				case 3:
					b=false;
					break;
				}
				
				
					
			}
		}

	}

}
