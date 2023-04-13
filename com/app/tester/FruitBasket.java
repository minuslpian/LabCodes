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
					+ "5.Display all from Fruits  6.modify Not Fresh  7.modify sour fruits Stale  8.Fruit Functionality  9.Exit");
			
		switch(sc.nextInt()) {
		
		case 1:
			System.out.println("Color Weight Name Fresh");
			
			if(count< arr.length) {
				
				String color=sc.next();
				double weight=sc.nextDouble();
				String name=sc.next();
				boolean fresh=sc.nextBoolean();
				if (fresh)
					arr[count++]=new Mango(color,weight,name,fresh);
			}
			break;
			
		case 2:
			System.out.println("Color Weight Name Fresh");
			
			if(count< arr.length) {
				
				String color=sc.next();
				double weight=sc.nextDouble();
				String name=sc.next();
				boolean fresh=sc.nextBoolean();
				if (fresh)
					arr[count++]=new Orange(color,weight,name,fresh);
			}
			break;
		case 3:
			System.out.println("Color Weight Name Fresh");
			if(count< arr.length) {
				String color=sc.next();
				double weight=sc.nextDouble();
				String name=sc.next();
				boolean fresh=sc.nextBoolean();
				if (fresh)
					arr[count++]=new Apple(color,weight,name,fresh);
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
			
		case 7:
			for(Fruit f: arr)
				if(f.taste().equals("sour"))
					f.isFresh(false);
			break;
			
        case 8:
        	System.out.println("Enter index of Fruit :");
        	Fruit f= arr[sc.nextInt()];
        	if(f instanceof Mango)
        		
        		((Mango)f).pulp();
        	else if(f instanceof Apple)
        		((Apple)f).jam();
        	else
        		((Orange)f).juice();
        	
        	break;
		case 9:
			choice=true;
			break;
		}
		
		}
	}

}
