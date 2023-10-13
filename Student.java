package Project1;
import java.util.Arrays;

public class Student extends Person {

	private static int numStudents;
	private int studentID;			 
	private Course[] coursesTaken;
	private int numCoursesTaken;	
	private boolean isGraduate;
	private String major;

	public Student() {
		super();
		coursesTaken = new Course[50];
		numCoursesTaken = 0;
		isGraduate = false;
		major = "undeclared";
		numStudents++;
		studentID = numStudents;
	}
	public Student(boolean isGraduate) {
		super();
		coursesTaken = new Course[50];
		numCoursesTaken = 0;
		this.isGraduate = isGraduate;
		major = "undeclared";
		numStudents++;
		studentID = numStudents;
	}
	public Student(String major,boolean isGraduate) {
		super();
		coursesTaken = new Course[50];
		numCoursesTaken = 0;
		this.isGraduate = isGraduate;
		this.major = major;
		numStudents++;
		studentID = numStudents;
	}
	public Student(String name, int birthYear, String major, boolean isGraduate)  {
		super(name,birthYear);
		coursesTaken = new Course[50];
		numCoursesTaken = 0;
		this.isGraduate = isGraduate;
		this.major = major;
		numStudents++;
		studentID = numStudents;
	}
	
	public boolean isGraduate() {
		return isGraduate;
	}
	public int getNumCoursesTaken() {
		return numCoursesTaken;
	}
	public static int getNumStudents() {
		return numStudents;
	}
	public int getStudentID() {
		return studentID;
	}
	public String getMajor() {
		return major;
	}
	public void setIsGraduate(boolean isGraduate) {
		this.isGraduate = isGraduate;
	}
	public void setMajor(String major) {
		this.major = major;
	}
	
	public void addCourseTaken(Course course) {
		if(numCoursesTaken < 50) {
		coursesTaken[numCoursesTaken] = course;
		numCoursesTaken++;
		}
	}
	public void addCoursesTaken(Course [] course) {
		if(course != null) {
			for(int i=0;i < course.length; i++) {
				if(course[i] != null) {
					if(numCoursesTaken < 50) {
					coursesTaken[numCoursesTaken] = course[i];
					numCoursesTaken++;
					}
				}
				else {
					break;
				}
			}
		}
	}
	public Course getCourseTaken(int index) {
		if((index >=0)&& (index < numCoursesTaken)) {
			return coursesTaken[index];
		}
		return null;
	}
	public String getCourseTakenAsString(int index) {
		if((index >=0)&& (index < numCoursesTaken)) {
			return coursesTaken[index].getCourseDept() + "-"+ coursesTaken[index].getCourseNum();
		}
		return "";
	}
	public String getAllCoursesTakenAsString() {
		String s = "";
		s = getCourseTakenAsString(0);
		for(int i=1; i<numCoursesTaken;i++) {
			s += "," + getCourseTakenAsString(i);
		}
		return s;
	}
	
	@Override
	public boolean equals(Object obj) {
		if(super.equals(obj)) {
			if(obj instanceof Student) {
				Student other = (Student)obj;
				if(studentID ==  other.studentID) {
					if(numStudents == other.numStudents) {
						if(isGraduate == other.isGraduate) {
							if(major.equals(other.major)) {
								if(numCoursesTaken == other.numCoursesTaken) {
									if(Arrays.equals(coursesTaken, other.coursesTaken)) {
										return true;
									}
								}
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
		String IG;
		if(isGraduate) {
			IG = "Graduate";
		}
		else {
			IG = "Undergraduate";
		}
		String s = super.toString();
		s += String.format(" Student: studentID: %04d | Major %20s | %14s | Number of Courses Taken: %3d | Courses Taken: %s", studentID, major, IG, numCoursesTaken, getAllCoursesTakenAsString() );
		return s;
	}
	
	@Override
	public int compareTo(Person p) {
		if((p != null)&&(p instanceof Student)) {
		Student other = (Student)p;
		int a=0;
		int b=0;
		for(int i=0;i<numCoursesTaken; i++) {
			a += coursesTaken[i].getNumCredits();
		}
		for(int i=0;i<other.numCoursesTaken; i++) {
			b += other.coursesTaken[i].getNumCredits();
		}
		int val = Integer.compare(a,b);
		return val;
		}
		return super.compareTo(p);
	}
	
	
}
