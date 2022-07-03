package com.main;
import com.departments.*;

/*
 * Main Driver class - creates objects of various classes for various departments
 */
public class Main {

	public static void main(String[] args) {
		AdminDepartment adminDept = new AdminDepartment(); 
		System.out.println(""); //spacing between outputs of 2 departments
		HrDepartment hrDept = new HrDepartment();
		System.out.println(""); //spacing between outputs of 2 departments
		TechDepartment techDept = new TechDepartment();
	}
}
