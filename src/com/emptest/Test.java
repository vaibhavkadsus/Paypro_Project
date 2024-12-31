package com.emptest;
import java.util.Scanner;
import com.empservice.Salary;

public class Test {	
	public static void main(String[] args) {
		System.out.println("==================Employee Paypro=======================");
		System.out.println("Enter Employee details");
		Salary obj=new Salary();
		obj.createEmpdetails();
		obj.displayEmpdetails();
	}
}

