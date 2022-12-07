package com.g2b1.fop.main;

import com.g2b1.fop.model.AdminDepartment;
import com.g2b1.fop.model.HrDepartment;
import com.g2b1.fop.model.SuperDepartment;
import com.g2b1.fop.model.TechDepartment;

public class Main {
	
	public static void main(String[] args) {
		
		// Creating Objects of all the Departments
		SuperDepartment superDepartment = new SuperDepartment();
		AdminDepartment adminDepartment = new AdminDepartment();
		HrDepartment hrDepartment = new HrDepartment();
		TechDepartment techDepartment = new TechDepartment();
		
		// Displaying the functionalities of Super Department
		System.out.println("Details of the Super Department are as follow:");
		System.out.println(superDepartment.departmentName());
		System.out.println(superDepartment.getTodaysWork());
		System.out.println(superDepartment.getWorkDeadline());
		System.out.println(superDepartment.isTodayAHoliday());
		System.out.println("_____________________________________________________________");
		
		// Displaying the functionalities of Admin Department
		System.out.println("\nDetails of the Admin Department are as follow:");
		System.out.println(adminDepartment.departmentName());
		System.out.println(adminDepartment.getTodaysWork());
		System.out.println(adminDepartment.getWorkDeadline());
		System.out.println(adminDepartment.isTodayAHoliday());
		System.out.println("_____________________________________________________________");
		
		// Displaying the functionalities of Hr Department
		System.out.println("\nDetails of the Hr Department are as follow:");
		System.out.println(hrDepartment.departmentName());
		System.out.println(hrDepartment.getTodaysWork());
		System.out.println(hrDepartment.getWorkDeadline());
		System.out.println(hrDepartment.doActivity());
		System.out.println(hrDepartment.isTodayAHoliday());
		System.out.println("_____________________________________________________________");
		
		// Displaying the functionalities of Tech Department
		System.out.println("\nDetails of the Tech Department are as follow:");
		System.out.println(techDepartment.departmentName());
		System.out.println(techDepartment.getTodaysWork());
		System.out.println(techDepartment.getWorkDeadline());
		System.out.println(techDepartment.getTechStackInformation());
		System.out.println(techDepartment.isTodayAHoliday());
		System.out.println("_____________________________________________________________");
		
		
	}
}
		
		
