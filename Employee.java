package Project1;

public class Employee extends Person {

	private String deptName;
	private static int numEmployees;
	private int employeeID;
	
	public Employee() {
	super();
	deptName = "";
	numEmployees++;
	employeeID = numEmployees;
	
	}
	public Employee(String deptName) {
		super();
		this.deptName = deptName;
		numEmployees++;
		employeeID = numEmployees;
	}
	public Employee(String name, int birthYear, String deptName) {
		super(name,birthYear);
		this.deptName = deptName;
		numEmployees++;
		employeeID = numEmployees;
	}
	
	public String getDeptName() {
		return deptName;
	}
	public static int getNumEmployees() {
		return numEmployees;
	}
	public int getEmployeeID() {
		return employeeID;
	}
	public void setDeptName(String deptName) {
		this.deptName = deptName;
	}
	
	@Override
	public boolean equals(Object obj) {
		if(obj == null) {return false;}
		if(this == obj) {return true;}
		if(super.equals(obj)) {
			if(obj instanceof Employee) {
				Employee other = (Employee)obj;
				if(employeeID == other.employeeID) {
					if(numEmployees == other.numEmployees) {
						if((deptName != null)&&(other.deptName != null)) {
							if(deptName.equals(deptName)) {
								return true;
							}
						}
					}
				}
			}
		}
		return false;
	}
	
	@Override
	public String toString() {
		String s = super.toString();
		s += String.format(" Employee: Department: %20s | Employee Number: %3d", deptName, employeeID);
		return s;
	}
	
	@Override
	public int compareTo(Person p) {
		if((p != null)&&(p instanceof Employee)) {
		Employee other = (Employee)p;
		int val = Integer.compare(employeeID, other.employeeID);
		return val;
		}
		return super.compareTo(p);
	}
	
	
}
