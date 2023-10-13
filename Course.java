package Project1;

public class Course {

	private boolean isGraduateCourse;
	private int courseNum;
	private String courseDept;
	private int numCredits;
	
	
	public Course(boolean isGraduateCourse, int courseNum, String courseDept, int numCredits) {
		this.isGraduateCourse = isGraduateCourse;
		this.courseNum = courseNum;
		this.courseDept = courseDept;
		this.numCredits = numCredits;
	}
	
	public boolean isGraduateCourse() {
		return isGraduateCourse;
	}
	public int getCourseNum() {
		return courseNum;
	}
	public String getCourseDept() {
		return courseDept;
	}
	public int getNumCredits() {
		return numCredits;
	}
	
	public String getCourseName() {
		String s ="";
		if(isGraduateCourse) {
			s = "G";
		}
		else {
			s = "U";
		}
		s += courseDept + courseNum;
		return s;
	}
	
	@Override
	public boolean equals(Object obj){
		if(obj == null) {return false;}
		if(this == obj) {return true;}
		if(obj instanceof Course) {
			Course other = (Course)obj;
			if(isGraduateCourse == other.isGraduateCourse) {
				if(courseNum == other.courseNum) {
					if((courseDept != null)&&(other.courseDept != null)) {
						if(courseDept.equals(other.courseDept)) {
							if(numCredits == other.numCredits) {
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
		String s = "";
		String GC;
		if(isGraduateCourse) {
			GC = "Graduate";
		}
		else {
			GC = "Undergraduate";
		}
		s = String.format("Course: %3s-%3d | Number of Credits: %02d | %5s", courseDept, courseNum, numCredits,GC);	
		return s;
	}
	
	public int compareTo(Course c) {
		if(this.courseNum == c.courseNum) {return 0;}
		if(this.courseNum > c.courseNum) {
			return 1;
		}
		return -1;
	}
	
	
	
	
}
