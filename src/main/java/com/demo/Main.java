package com.demo;

import java.util.Scanner;

public class Main {
	
	public static void main(String args[])
	{
		Scanner sc = new Scanner(System.in);
		Storage s = new Storage();
		
		
		int k=0;
		while(k!=1)
		{
			System.out.println("Choose the following option");
			System.out.println("1.AddEmployye\n2.ListEmployees\n3.UpdateEmployee\n4.DeleteEmployee\n5.Exit");
			int n= sc.nextInt();
			switch (n) 
			{
			    case 1:	Employee E1 = new Employee();
			    		System.out.println("Enter Employee Id");
						E1.setE_Id(sc.nextInt());
						System.out.println("Enter Employee FirstName");
						E1.setE_fName(sc.next());
						System.out.println("Enter Employee LastName");
						E1.setE_lName(sc.next());
						System.out.println("Enter Employee Age");
						E1.setE_Age(sc.nextInt());
						s.emp.add(E1);
				break;
				
			    case 2: for(Employee k1: s.emp)
			    		{
			    			System.out.println(k1.getE_Id()+" "+k1.getE_fName()+" "+k1.getE_lName()+" "+k1.getE_Age());
			    		}
			    		break;
			    		
			    case 3: System.out.println("Enter Employee Id to update");
			            int up=sc.nextInt();
			            for(Employee k1: s.emp)
			    		{
			    			if(k1.getE_Id()==up)
			    			{
			    				System.out.println("Enter First Name");
			    				k1.setE_fName(sc.next());
			    				System.out.println("Enter Last Name");
			    				k1.setE_lName(sc.next());
			    				System.out.println("Enter Age");
			    				k1.setE_Age(sc.nextInt());
			    			}
			    		}
			            System.out.println("Data Updated Sucussfully");
			            break;
			            
			    case 4: System.out.println("Enter employee id to delete");
			    		int u=sc.nextInt();
			    		int del=0,del1=0;
			    		for(Employee k1: s.emp)
			    		{
			    			if(k1.getE_Id()==u)
			    			{
			    				del=s.emp.indexOf(k1);
			    				del1++;
			    			}
			    		}
			    		if(del1==1)
			    		{
			    			s.emp.remove(del);
			    			System.out.println("Employee Deleted Sucussfully");
			    		}
			    		else
			    		{
			    			System.out.println("Invalid employee id");
			    		}
			    		break;
			    		
			    case 5: k++;
			    		System.out.println("Exited Sucussfully");
			    break;
	            

			    default: System.out.println("Choose a valid option");
				break;
			}
			
		}
	}

}
