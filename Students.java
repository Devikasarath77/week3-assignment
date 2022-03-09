package week3.day1;

public class Students {
	
	
	public void getStudentInfo(int id ) {
		
		System.out.println(id);
		
	}
	public void getStudentInfo(int id, String Name) {
		
		System.out.println(id);
		System.out.println(Name);
		
	}public void getStudentInfo(String email, int phonenumber ) {
		System.out.println(email);
		System.out.println(phonenumber);
		
		
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Students object = new Students();
		object.getStudentInfo(123);
		object.getStudentInfo(123, "Devika");
		object.getStudentInfo(" devika@gmail.com", 121312434);

	}

}
