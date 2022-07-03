package com.departments;

public class AdminDepartment extends SuperDepartment {
	
	/*
	 * Constructor is responsible for calling various functions
	 */
	public AdminDepartment() {
		System.out.println("Welcome to "+this.departmentName()); //Concatenated "Welcome to " to match expected output
		System.out.println(this.getTodaysWork());
		System.out.println(this.getWorkDeadline());
		System.out.println(super.isTodayAHoliday());
	}
	protected String departmentName( ) {
		return "Admin Department";
	}
	protected String getTodaysWork( ) {
		return "Complete your documents Submission";
	}
	protected String getWorkDeadline( ) {
		return "Complete by EOD";
	}	
}
