// what is method and pass variable with the use of reference variable 

package pkg1;

public class Student {   // boundary of class
	
	int stud_age, stud_roll_no;   // global variable
	
	public void method1() 
	{
		//boundary of method
		
		System.out.println("Welcome All");
	}
	 
	public void method2() 
	{
		System.out.println("Automation is very easy");
	}
 		public static void main(String[] args) {
 		Student Deepak= new Student();
	 
				 Deepak.stud_age=28;
				 System.out.println("stud_Age is :"+Deepak.stud_age);
				 Deepak.stud_roll_no=123;
					 System.out.println("stud_roll_no is :"+Deepak.stud_roll_no);

					 
				 Deepak.method1();
			 Deepak.method2();
 }
}
