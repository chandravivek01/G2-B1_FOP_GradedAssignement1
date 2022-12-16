package com.g2b1.fop.main;

import com.g2b1.fop.model.AdminDepartment;
import com.g2b1.fop.model.HrDepartment;
import com.g2b1.fop.model.SuperDepartment;
import com.g2b1.fop.model.TechDepartment;

public class Main {
	
	public static void main(String[] args) {
		
		// Creating Objects of all the Departments Except Super Department (Not Needed for this Problem Statement)
		
		AdminDepartment adminDepartment = new AdminDepartment();
		HrDepartment hrDepartment = new HrDepartment();
		TechDepartment techDepartment = new TechDepartment();
		
		
		// Displaying the functionalities of ADMIN Department
		System.out.println("\nWelcome to " + adminDepartment.departmentName());
		System.out.println(adminDepartment.getTodaysWork());
		System.out.println(adminDepartment.getWorkDeadline());
		System.out.println(adminDepartment.isTodayAHoliday());
		System.out.println("_____________________________________________________________");
		
		// Displaying the functionalities of HR Department
		System.out.println("\nWelcome to " + hrDepartment.departmentName());
		System.out.println(hrDepartment.doActivity());
		System.out.println(hrDepartment.getTodaysWork());
		System.out.println(hrDepartment.getWorkDeadline());
		System.out.println(hrDepartment.isTodayAHoliday());
		System.out.println("_____________________________________________________________");
		
		// Displaying the functionalities of TECH Department
		System.out.println("\nWelcome to "+ techDepartment.departmentName());
		System.out.println(techDepartment.getTodaysWork());
		System.out.println(techDepartment.getWorkDeadline());
		System.out.println(techDepartment.getTechStackInformation());
		System.out.println(techDepartment.isTodayAHoliday());
		System.out.println("_____________________________________________________________");
		
		
	}
}
		
		
