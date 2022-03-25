package mutableObject;

public class TestMutableDemo {
	
	public static void main(String[] args)
	{
		Address ad = new Address(41234, "kop", "INDIA");
		EmployeeMutableFields emp = new EmployeeMutableFields(125, "praj", ad);
		
		System.out.println("Employee info before change: " + emp);
		ad.setPin(2000);
		ad.setCity("Mumbai");
		
	System.out.println("Employee info After change: " + emp);
	}
		
	
}
