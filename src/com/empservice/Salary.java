package com.empservice;


import java.util.Scanner;

import com.employeedetails.Employee;


public class Salary {
	Scanner sc=new Scanner(System.in);
	double bsalary=40000;
	double hAllan=3000;
	double tAllan=4000;
	int salaryl;
	double gstsalary;
	double finalsalary;
	
	Employee obj=new Employee();
	public void createEmpdetails() {
		System.out.println("========================================");
		System.out.println("Enter ID of Employee: ");
		int id=sc.nextInt();
		int len=String.valueOf(id).length();
		if(len <=4) {
			obj.setId(id);
		}else {
			System.out.println("Please enter correct employee ID......");
			return;
		}

		System.out.println("Enter Name of Employee: ");
		String name=sc.next()+sc.nextLine();
		for(int i=0;i<name.length();i++) {
			char x=name.charAt(i);
			if((x>='A' && x<='Z')||(x>='a'&&x<='z')||(x==' ')){
				obj.setName(name);
			}else {
				System.out.println("Enter valid name");
			}
		}
		System.out.println("Select Employee position");
		System.out.println("1.Software Engineer");
		System.out.println("2.Data Scientist");
		System.out.println("3.Systems Administrator");
		System.out.println("4.UX/UI Designer");
		System.out.println("5.DevOps Engineer");
		int choice=sc.nextInt();
		switch (choice) {
		case 1:{
			String str1="Software Engineer";
			obj.setDept(str1);
			break;
		}
		case 2:{
			String str2="Data Scientist";
			obj.setDept(str2);
			break;
		}
		case 3:{
			String str3="Systems Administrator";
			obj.setDept(str3);
			break;
		}
		case 4:{
			String str4="UX/UI Designer";
			obj.setDept(str4);
			break;
		}
		case 5:{
			String str5="DevOps Engineer";
			obj.setDept(str5);
			break;
		}
		default:{
			System.out.println("Enter only choice numbers");
		}
		}
		System.out.println("Enter Mobile number: ");
		long mNo=sc.nextLong();
		int len1=String.valueOf(mNo).length();
		if(len1==10) {
			obj.setMobileNo(mNo);
		}else {
			System.out.println("Please enter 10 digit mobile number.....");
			return;
		}
		
		System.out.println("Enter Address: ");
		obj.setAddress(sc.next()+sc.nextLine());
						
		System.out.println("Enter Leaves: ");
		double leave=sc.nextInt();
		obj.setLeave(leave);
	    salaryl=(int) ((int)(leave*1333));
	    gstsalary=(bsalary+hAllan+tAllan-salaryl)*0.18;
	    finalsalary=(bsalary+hAllan+tAllan-salaryl)-gstsalary;
	    
	}
	public void displayEmpdetails() {
		System.out.println("------------------------------------------");
		System.out.println("Emp ID: "+obj.getId());
		System.out.println("Emp Name: "+obj.getName());
		System.out.println("Emp Mobile Number: "+obj.getMobileNo());
		System.out.println("Emp Address: "+obj.getAddress());
		System.out.println("Emp Leaves: "+obj.getLeave());
		System.out.println("Emp Basic salary: "+bsalary);
		System.out.println("House Allowance: "+hAllan);
		System.out.println("Transport Allowance: "+tAllan);
		System.out.println("18% GST: "+gstsalary);
		System.out.println("|********* Your Salary: "+finalsalary+"...*********|");
		System.out.println("-------------------------------------------");
		
	}
}
