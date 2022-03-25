package mutableObject;

public class EmployeeMutableFields {
	private final int emp_id;
	private final String emp_name;
	private final Address address;
	
	public EmployeeMutableFields(int emp_id, String emp_name, Address address) {
		super();
		this.emp_id = emp_id;
		this.emp_name = emp_name;
		
		Address dummyadd = new Address();
		dummyadd.setPin(address.getPin());
		dummyadd.setCity(address.getCity());
		dummyadd.setCountry(address.getCountry());
		
		this.address = dummyadd;
	}

	public int getEmp_id() {
		return emp_id;
	}

	public String getEmp_name() {
		return emp_name;
	}

	public Address getAddress() {
		
		Address dummyadd1=new Address();
		dummyadd1.setPin(this.address.getPin());
		dummyadd1.setCity(this.address.getCity());
		dummyadd1.setCountry(this.address.getCountry());
		
		return dummyadd1;
	}

	@Override
	public String toString() {
		return "EmployeeMutableFields [emp_id=" + emp_id + ", emp_name=" + emp_name + ", address=" + address + "]";
	}
	
	
	

}
