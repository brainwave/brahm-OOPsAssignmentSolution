package com.departments;

public class SuperDepartment {

	/*
	 * Using protected as access specifier to ensure Main cannot access these directly
	 */
	protected String departmentName() {
		return "Super Department";
	};
	protected String getTodaysWork() {
		return "No Work as of now";
	};
	protected String getWorkDeadline() {
		return "Nil";
	};
	protected static String isTodayAHoliday() { //static so this method is generated once for all objects
		return "Today is not a holiday";
	}; 
	
}
