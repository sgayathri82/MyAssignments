package org.student;

import org.department.Department;

public class Student extends Department{

	
	public void studentName()
	{
		System.out.println("This method display Student Name");
	}
	
	public void studentDept()
	{
		System.out.println("This Method Displays Student Department");
	}
	
	public void studentId()
	{
		System.out.println("This Method Displays Student ID");
	}
	
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub

		
		Student obj=new Student();
		
		obj.collegeName();
		obj.collegeCode();
		obj.collegeRank();
		obj.deptName();
		obj.studentName();
		obj.studentDept();
		obj.studentId();
	}

}
