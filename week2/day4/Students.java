package week2.day4;

public class Students {
	
	// overloading concept
	
		public void getStudentInfo(int id)
		
		{
			System.out.println("The student ID is " +id);
		}
	
		public void getStudentInfo(int id,String name)
		
		{
			System.out.println("The student ID is " +id);
			System.out.println("The student name is " +name);
		}
			
		public void getStudentInfo(String email,int id)
		
		{
			System.out.println("The student email is " +email);
			System.out.println("The student Phone Number is " +id);
			
		}
		
		public static void main(String[] args) {
			
			Students obj=new Students();
			obj.getStudentInfo(1234);
			System.out.println("");
			obj.getStudentInfo(1234,"Gayathri");
			System.out.println("");
			obj.getStudentInfo("gayu@yahoo.com",844567823);
			
		}
	
	

	}
