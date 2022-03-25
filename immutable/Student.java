package immutable;

public class Student {

		private final int id;
		private final String name;
		private final String department;
		
		public Student(int id, String name, String department) {
			super();
			this.id = id;
			this.name = name;
			this.department = department;
		}
		public int getId()
		{return id;}
		public String getName()
		{
			return name;
		}
		public String getDepartment()
		{
			return department;
		}
		
	public static void main(String[] args) {
		Student sd=new Student(11,"Ram","IT");
		System.out.println("ID "+sd.getId());
		System.out.println("NAMe "+sd.getName());
		System.out.println("DEPARTMENT "+sd.getDepartment());
	}
	
}
