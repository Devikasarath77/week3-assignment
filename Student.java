package org.student;

	import org.department.Department;

	public class Student extends Department {

		
		 public void studentName() {
			 
			 System.out.println("Devika");
			
		}
		 
		  public void studentDept() {
			
			  
			  System.out.println(" cse");
		}
		  
		 public void studentId() {
		
			 // this key word used to create object for the class, methods and variables 
//			 this.collegeCode();
			 // super is a keyword used to create object for superclass methods 
//			 super.collegeName();
			 System.out.println("1125121040");
		} 
		 
		 
		 
	

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		
		Student object = new Student();
		object.collegeName();
		object.collegeCode();
		
		object.collegeRank();
		object.deptName();
		object.studentName();
		object.studentDept();
		object.studentId();
		

	}

}
