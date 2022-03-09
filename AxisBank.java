package week3.day1;

public class AxisBank extends BankInfo {

	
	public void depoist() {
		
		System.out.println("deposit avaiable ");
	}
	
	
	public static void main ( String[] args)
	{
		
		AxisBank object = new AxisBank();
		object.depoist();
		object.fixed();
		object.saving();
	}
	//deposit()
}
