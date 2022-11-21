package org.student;

import org.department.Department;

public class Student extends Department{
	public void studentName()
	{
	System.out.println("Student Name :Thara");
	}
	public void studentdept()
	{
	System.out.println("Student dept :CSE");
	}
	public void StudentID()
	{
	System.out.println("Sudent ID :321019");
	}
public static void main(String[] args) {
	Student stud= new Student ();
	stud.collegeCode();
	stud.collegeName();
	stud.collegeRank();
	stud.DepartmentName();
	stud.studentdept();
	stud.StudentID();
	stud.studentName();
	
}
}
