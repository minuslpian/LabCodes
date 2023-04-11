package com.app.tester;
import com.app.fruits.*;
import java.util.*;

public class FruitBasket {

	public static void main(String[] args) {
		System.out.println("Enter the quantity of basket :");
		Scanner sc=new Scanner(System.in);
		
		Fruit arr[]=new Fruit[sc.nextInt()];
		boolean choice=false;
		int count=0;
		while(!choice) {
			System.out.println("Enter choice 1.Add Mango  2.Add Oranges  3.Add Apple  4.Display Fruit names "
					+ "5.Display all from Fruits  6.Not Fresh  7.Stale  8.Fruit Functionality  9.Exit");
			String color = sc.next();
			double weight = sc.nextDouble();
			String name = sc.next();
			boolean fresh = sc.nextBoolean();
		switch(sc.nextInt()) {
		case 1:
			System.out.println("Color Weight Name Fresh");
			
			if(count< arr.length) {
				if(fresh != false)
					arr[count++]=new Mango(color,weight,name,fresh);
			}
			break;
			
		case 2:
			System.out.println("Color Weight Name Fresh");
			
			if(count< arr.length) {
				if(fresh != false)
					arr[count++]=new Mango(color,weight,name,fresh);
			}
			break;
		case 3:
			System.out.println("Color Weight Name Fresh");
			if(count< arr.length) {
			arr[count++]=new Apple (color,weight,name,fresh);
			}
			break;
		case 4:
			for(Fruit f :arr) {
        		if(f!=null)
        			System.out.println(f.getName());
        	}
			break;
        case 5:
        	for(Fruit f :arr) {
        		if(f!=null)
        			System.out.println(f);
        	}
        	break;
		case 6:
			System.out.println("Enter index of Fruit :");
        	arr[sc.nextInt()].isFresh(false);
			break;
//		case 7:
//			
//			break;
			
        case 8:
        	System.out.println("Enter index of Fruit :");
        	arr[sc.nextInt()].specFunc();
        	
        	break;
		case 9:
			choice=true;
			break;
		}
		
		}
	}

}
