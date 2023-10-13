package Project1;

public class Faculty extends Employee {

	private Course[] coursesTaught;
	private int numCoursesTaught;
	private boolean isTenured;
	
	public Faculty() {
		super();
		coursesTaught = new Course[100];
		numCoursesTaught = 0;
		isTenured = false;
	}
	public Faculty(boolean isTenured) {
		super();
		coursesTaught = new Course[100];
		numCoursesTaught = 0;
		this.isTenured = isTenured;
	}
	public Faculty(String deptName,boolean isTenured) {
		super(deptName);
		coursesTaught = new Course[100];
		numCoursesTaught = 0;
		this.isTenured = isTenured;
	}
	public Faculty(String name, int birthYear, String deptName, boolean isTenured) {
		super(name,birthYear,deptName);
		coursesTaught = new Course[100];
		numCoursesTaught = 0;
		this.isTenured = isTenured;
	}
	
	public boolean isTenured() {
		return isTenured;
	}
	public int getNumCoursesTaught() {
		return numCoursesTaught;
	}
	public void setIsTenured(boolean isTenured) {
		this.isTenured = isTenured;
	}
	
	
	public void addCourseTaught(Course course) {
		if(numCoursesTaught < coursesTaught.length) {
		coursesTaught[numCoursesTaught] = course;
		numCoursesTaught++;
		}
	}
	public void addCoursesTaught(Course [] course) {
		if(course != null) {
			for(int i=0;i < course.length; i++) {
				if(course[i] != null) {
					if(numCoursesTaught < 100) {
					coursesTaught[numCoursesTaught] = course[i];
					numCoursesTaught++;
					}
				}
				else {
					break;
				}
			}
		}
	}
	
	public Course getCourseTaught(int index) {
		if((index >=0)&& (index < numCoursesTaught)) {
			return coursesTaught[index];
		}
		return null;
	}
	
	public String getCourseTaughtAsString(int index) {
		if((index >=0)&& (index < numCoursesTaught)) {
			return coursesTaught[index].getCourseDept() + "-"+ coursesTaught[index].getCourseNum();
		}
		return "";
	}
	public String getAllCoursesTaughtAsString() {
		String s = "";
		s = getCourseTaughtAsString(0);
		for(int i=1; i<numCoursesTaught;i++) {
			s += "," + getCourseTaughtAsString(i);
		}
		return s;
	}
	
	@Override
	public boolean equals(Object obj) {
		if(obj == null) {return false;}
		if(this == obj) {return true;}
		if(super.equals(obj)) {
			if(obj instanceof Faculty) {
				Faculty other = (Faculty)obj;
				if(isTenured == other.isTenured) {
					if(numCoursesTaught == other.numCoursesTaught) {
						if((coursesTaught != null)&&(other.coursesTaught != null)) {
							if(this.getAllCoursesTaughtAsString().equals(other.getAllCoursesTaughtAsString())) {
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
		String IT = "";
		if(isTenured) {
			IT = "Is Tenured";
		}
		else {
			IT = "Not Tenured";
		}
		String s = super.toString();
		s += String.format(" Faculty: %11s | Number of Courses Taught: %3d | Courses Taught: %s", IT , numCoursesTaught,getAllCoursesTaughtAsString());
		return s;
	}
	
	@Override
	public int compareTo(Person p) {
		if((p != null)&&(p instanceof Faculty)) {
			Faculty other = (Faculty)p;
			int val = Integer.compare(numCoursesTaught, other.numCoursesTaught);
			return val;
		}
		return super.compareTo(p);
	}
	
	
	
}
