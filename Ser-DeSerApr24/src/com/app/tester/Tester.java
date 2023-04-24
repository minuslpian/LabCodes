package com.app.tester;
import com.app.company.*;
import com.app.serializable.DeSerialization;
import com.app.serializable.Serialization;

import java.util.*;
public class Tester {
      public static void main(String[] args) {
		try(Scanner sc= new Scanner(System.in)) {
			Map<Integer,Employee> emp=new HashMap<>();
			
			boolean exit= true;
			while( exit) {
				System.out.println("Enter choice 1.add employee 2.disp all 3. enter id to disp emp 4. delete emp by id");
				switch(sc.nextInt()) {
				case 1:
					System.out.println("Enter name");
					emp.put(Employee.getId(),(new Employee(sc.next(),sc.nextDouble(),sc.next())));
					break;	
				case 2:
					emp.forEach((k,v) -> System.out.println(v));
					break;
				case 3:
					System.out.println("Enter Filename: ");
					emp = DeSerialization.testDeSerialization(sc.next());
					for(Employee e : emp.values())
						System.out.println(e);
					break;
				case 4:
					System.out.println("Enter Filename: ");
					Serialization.testSerialization(emp,sc.next());
					break;
				case 0:
					exit=false;
				    break;
				}
			}	
		} catch (Exception e) {
			
		}
	}
}
