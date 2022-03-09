package org.system;

public class Desktop  extends Computer
{
	
	public void desktopSize() {
		
		
		System.out.println("desktopsize- 15inch ");
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		
		Desktop object = new Desktop();
		
		object.computerModel();
		object.desktopSize();
	}

}
