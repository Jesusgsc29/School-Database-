package Project1;
public class GeneralStaff extends Employee {

	private String duty;
	
	public GeneralStaff(){
		super();
		duty ="";
	}
	public GeneralStaff(String duty){
		super();
		this.duty = duty;
	}
	public GeneralStaff(String deptName, String duty) {
		super(deptName);
		this.duty = duty;
	}
	public GeneralStaff(String name, int birthYear, String deptName, String duty) {
		super(name, birthYear, deptName);
		this.duty = duty;
	}
	
	public String getDuty() {
		return duty;
	}
	
	@Override
	public boolean equals(Object obj) {
		if(obj == null) {return false;}
		if(this == obj) {return true;}
		if(super.equals(obj)) {
			if(obj instanceof GeneralStaff) {
				GeneralStaff other = (GeneralStaff)obj;
				if((duty != null)&&(other.duty != null)) {
					if(duty.equals(other.duty)) {
						return true;
					}
				}
			}
		}
		return false;
	}
	
	@Override
	public String toString() {
		String s = super.toString();
		s += String.format(" GeneralStaff: Duty: %10s", duty);
		return s;
	
	}
	
}
