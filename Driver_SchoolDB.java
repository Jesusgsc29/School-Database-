package Project1;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.PrintWriter;
import java.util.Scanner;


public class Driver_SchoolDB {

	public static void main(String[] args) {
	Scanner scnr = null;
	FileInputStream fileStream = null;
	try{
		fileStream = new FileInputStream("SchoolDB_Initial.txt");
		scnr = new Scanner(fileStream);
		
		while(scnr.hasNextLine()) {
			System.out.println(scnr.nextLine());
		}	
	}
	catch(FileNotFoundException e) {
		System.err.println(e.getMessage());
	}
	finally {
		if(scnr != null) {
			scnr.close();
		}
	}

	Course c1 = new Course(true, 771,"MAT", 4);
	Faculty f1 = new Faculty();
	Faculty f2 = new Faculty(true);
	Faculty f3 = new Faculty("MAT",false);
	Faculty f4 = new Faculty("Superman",1938,"PHY",true);
	
	Student s1 = new Student();
	Student s2 = new Student(false);
	Student s3 = new Student("Math",false);
	Student s4 = new Student("Wonderwoman",1941,"JST",true);
	
	GeneralStaff g1 = new GeneralStaff();
	GeneralStaff g2 = new GeneralStaff("advise students");
	GeneralStaff g3 = new GeneralStaff("Sanitation","clean");
	GeneralStaff g4 = new GeneralStaff("Flash Gordon",1934,"Security","safety");
	
	Course c2 = new Course(true, 777,"CMP", 4);
	Course c3 = new Course(true, 711,"CMP", 4);
	Course c4 = new Course(true, 723,"MAT", 4);
	Course c5 = new Course(false, 168,"CMP", 4);
	Course c6 = new Course(false, 338,"CMP", 4);
	
	System.out.println("\n**************************************************************");
	System.out.println("SCHOOL DATABASE INFO:");
	System.out.println("\n************************************************");
	System.out.println("COURSES:");
	System.out.println(c1.toString());
	System.out.println(c2.toString());
	System.out.println(c3.toString());
	System.out.println(c4.toString());
	System.out.println(c5.toString());
	System.out.println(c6.toString());
	System.out.println("************************************************");
	System.out.println("************************************************");
	System.out.println("PERSONS:");
	System.out.println("************************************************");
	System.out.println("************************************************");
	System.out.println("EMPLOYEES:");
	System.out.println("************************************************");
	System.out.println("************************************************");
	System.out.println("GENERAL STAFF:");
	System.out.println(g1.toString());	
	System.out.println(g2.toString());	
	System.out.println(g3.toString());	
	System.out.println(g4.toString());	
	System.out.println("************************************************");
	System.out.println("************************************************");
	System.out.println("FACULTY:");
	System.out.println(f1.toString());	
	System.out.println(f2.toString());	
	System.out.println(f3.toString());	
	System.out.println(f4.toString());	
	System.out.println("************************************************");
	System.out.println("************************************************");
	System.out.println("STUDENTS:");
	System.out.println(s1.toString());	
	System.out.println(s2.toString());	
	System.out.println(s3.toString());	
	System.out.println(s4.toString());	
	System.out.println("************************************************");
	System.out.println("**************************************************************\n");
	
	
//	Scanner kb = new Scanner(System.in);
//	String userDecision = "";
//	boolean yesno = true;
//	Course co1 = new Course(false, 0, "", 0);
//	Course co2 = new Course(false, 0, "", 0);;
//	Course co3 = new Course(false, 0, "", 0);;
//	Faculty fa1 = new Faculty();
//	Faculty fa2 = new Faculty();
//	Faculty fa3 = new Faculty();
//	GeneralStaff gs1 = new GeneralStaff();
//	GeneralStaff gs2 = new GeneralStaff();
//	GeneralStaff gs3 = new GeneralStaff();
//	Student st1 = new Student();
//	Student st2 = new Student();
//	Student st3 = new Student();
//	while(yesno) {
//	
//	System.out.println("Press C to create 3 new Courses");
//	System.out.println("Press F to create 3 new Faculties");
//	System.out.println("Press G to create 3 new General Staff");
//	System.out.println("Press S to create 3 new Students");
//	System.out.println("Press E to exit");
//
//	
//	userDecision = kb.next();
//	
//	switch(userDecision) {
//	case "C":
//	case "c":
//		System.out.println("Enter Course info in order(isGraduateCourse,courseNum,courseDept,numCredits):");
//		co1 = new Course(kb.nextBoolean(),kb.nextInt(),kb.next(),kb.nextInt());
//		System.out.println("Course #1 created.");
//		
//		System.out.println("Enter Course info in order(isGraduateCourse,courseNum,courseDept,numCredits):");
//		co2 = new Course(kb.nextBoolean(),kb.nextInt(),kb.next(),kb.nextInt());
//		System.out.println("Course #2 created.");
//		
//		System.out.println("Enter Course info in order(isGraduateCourse,courseNum,courseDept,numCredits):");
//		co3 = new Course(kb.nextBoolean(),kb.nextInt(),kb.next(),kb.nextInt());
//		System.out.println("Course #3 created.");
//		break;
//	case "F":
//	case "f":	
//		System.out.println("Enter Faculty info in order(name,birthYear,deptName,isTenured):");
//		fa1 = new Faculty(kb.next(),kb.nextInt(),kb.next(),kb.nextBoolean());
//		System.out.println("Faculty #1 created.");
//
//		System.out.println("Enter Faculty info in order(name,birthYear,deptName,isTenured):");
//		fa2 = new Faculty(kb.next(),kb.nextInt(),kb.next(),kb.nextBoolean());
//		System.out.println("Faculty #2 created.");
//		
//		System.out.println("Enter Faculty info in order(name,birthYear,deptName,isTenured):");
//		fa3 = new Faculty(kb.next(),kb.nextInt(),kb.next(),kb.nextBoolean());
//		System.out.println("Faculty #3 created.");
//		break;
//	case "G":
//	case "g":	
//		System.out.println("Enter General Staff info in order(name,birthYear,deptName,duty):");
//		gs1 = new GeneralStaff(kb.next(),kb.nextInt(),kb.next(),kb.next());
//		System.out.println("General Staff #1 created.");
//		
//		System.out.println("Enter General Staff info in order(name,birthYear,deptName,duty):");
//		gs2 = new GeneralStaff(kb.next(),kb.nextInt(),kb.next(),kb.next());
//		System.out.println("General Staff #2 created.");
//		
//		System.out.println("Enter General Staff info in order(name,birthYear,deptName,duty):");
//		gs3 = new GeneralStaff(kb.next(),kb.nextInt(),kb.next(),kb.next());
//		System.out.println("General Staff #3 created.");
//		break;
//	case "S":
//	case "s":	
//		System.out.println("Enter Student info in order(name,birthYear,major,isGraduate):");
//		st1 = new Student(kb.next(),kb.nextInt(),kb.next(),kb.nextBoolean());
//		System.out.println("Student #1 created.");
//		
//		System.out.println("Enter Student info in order(name,birthYear,major,isGraduate):");
//		st2 = new Student(kb.next(),kb.nextInt(),kb.next(),kb.nextBoolean());
//		System.out.println("Student #2 created.");
//		
//		System.out.println("Enter Student info in order(name,birthYear,major,isGraduate):");
//		st3 = new Student(kb.next(),kb.nextInt(),kb.next(),kb.nextBoolean());
//		System.out.println("Student #3 created.");
//		break;
//	case "E":
//	case "e":	
//		yesno = false;
//		break;
//	}
//	}
//	
//	Course selectedCourse = null;
//	Faculty selectedFaculty = null;
//	int userInt1 = 0;
//	int userInt2 = 0;
//	Course[] courseArr = {co1,co2,co3,c1,c2,c3,c4,c5};
//	Faculty[] facultyArr = {fa1,fa2,fa3};
//	Student[] studentArr = {st1,st2,st3};
//	Course[] courseArr1 = {c2,c3};
//	Course[] courseArr2 = {c4,c5};
//	
//	System.out.println("Select a number 1-3 to add 2 Courses to a Faculty");
//	switch(kb.nextInt()) {
//	case 1:
//		facultyArr[0].addCourseTaught(courseArr[0]);
//		facultyArr[0].addCourseTaught(courseArr[1]);
//		break;
//	case 2:
//		facultyArr[1].addCourseTaught(courseArr[0]);
//		facultyArr[1].addCourseTaught(courseArr[1]);
//		break;
//	case 3:
//		facultyArr[2].addCourseTaught(courseArr[0]);
//		facultyArr[2].addCourseTaught(courseArr[1]);
//		break;
//	}
//	System.out.println("Select a number 1-3 to add 2 Courses to a Student");
//	switch(kb.nextInt()) {
//	case 1:
//		studentArr[0].addCourseTaken(courseArr[2]);
//		studentArr[0].addCourseTaken(courseArr[3]);
//		break;
//	case 2:
//		studentArr[1].addCourseTaken(courseArr[2]);
//		studentArr[1].addCourseTaken(courseArr[3]);
//		break;
//	case 3:
//		studentArr[2].addCourseTaken(courseArr[2]);
//		studentArr[2].addCourseTaken(courseArr[3]);
//		break;
//	}
//	
//	System.out.println("Select a number 1-3 to add and array of Courses to a Faculty");
//	switch(kb.nextInt()) {
//	case 1:
//		facultyArr[0].addCoursesTaught(courseArr1);
//		facultyArr[0].addCoursesTaught(courseArr1);
//		break;
//	case 2:
//		facultyArr[1].addCoursesTaught(courseArr1);
//		facultyArr[1].addCoursesTaught(courseArr1);
//		break;
//	case 3:
//		facultyArr[2].addCoursesTaught(courseArr1);
//		facultyArr[2].addCoursesTaught(courseArr1);
//		break;
//	}
//	System.out.println("Select a number 1-3 to add and array of Courses to a Student");
//	switch(kb.nextInt()) {
//	case 1:
//		studentArr[0].addCoursesTaken(courseArr2);
//		studentArr[0].addCoursesTaken(courseArr2);
//		break;
//	case 2:
//		studentArr[1].addCoursesTaken(courseArr2);
//		studentArr[1].addCoursesTaken(courseArr2);
//		break;
//	case 3:
//		studentArr[2].addCoursesTaken(courseArr2);
//		studentArr[2].addCoursesTaken(courseArr2);
//		break;
//	}
//	
//	System.out.println("Select a Faculty(1-3):");
//	userInt1 = kb.nextInt()-1;
//	System.out.println("Faculty #"+(userInt1+1)+" taughts "+facultyArr[userInt1].getNumCoursesTaught()+" courses. Select a course:");
//	userInt2 = kb.nextInt()-1;
//	if(userInt2 >= 0 && userInt2 < facultyArr[userInt1].getNumCoursesTaught()) {
//	System.out.println("Course #"+(userInt2+1)+": "+facultyArr[userInt1].getCourseTaught(userInt2).toString());
//	}
//	else {
//		System.out.println("Invalid Index");
//	}
//	
//	System.out.println("Select a Student(1-3):");
//	userInt1 = kb.nextInt()-1;
//	System.out.println("Student #"+(userInt1+1)+" takes "+studentArr[userInt1].getNumCoursesTaken()+" courses. Select a course:");
//	userInt2 = kb.nextInt()-1;
//	if(userInt2 >= 0 && userInt2 < studentArr[userInt1].getNumCoursesTaken()) {
//	System.out.println("Course #"+(userInt2+1)+": "+studentArr[userInt1].getCourseTaken(userInt2).toString());
//	}
//	else {
//		System.out.println("Invalid Index");
//	}
//	
//	System.out.println("Select a Course:(1-8)");
//	selectedCourse = courseArr[kb.nextInt()-1];
//	System.out.println("Select a Faculty:(1-3)");
//	selectedFaculty = facultyArr[kb.nextInt()-1];
//	System.out.println(facultyTeachesCourse(selectedFaculty,selectedCourse));
//	System.out.println("************************************************");
//	System.out.println("Faculty #"+(facultyTeachesMostCourses(facultyArr)+1)+" teaches the most courses");
//	System.out.println("Faculty #"+(facultyTeachesLeastCourses(facultyArr)+1)+" teaches the least courses");
//	System.out.println("Course #"+(minimunCourse(courseArr)+1)+" is the minimun of all the courses");
//	System.out.println("Course #"+(maximunCourse(courseArr)+1)+" is the maximun of all the courses");
//	System.out.println("Student #"+(studentWithMostCredits(studentArr)+1)+" has the most credits");
//	System.out.println("Student #"+(studentWithLeastCredits(studentArr)+1)+" has the least credits");
//
//	System.out.println("COURSES:");
//	System.out.println(co1.toString());
//	System.out.println(co2.toString());
//	System.out.println(co3.toString());
//	System.out.println("************************************************");
//	System.out.println("GENERAL STAFF:");
//	System.out.println("#1: "+gs1.toString());	
//	System.out.println("#2: "+gs2.toString());	
//	System.out.println("#3: "+gs3.toString());	
//	System.out.println("************************************************");
//	System.out.println("FACULTY:");
//	System.out.println("#1: "+fa1.toString());	
//	System.out.println("#2: "+fa2.toString());	
//	System.out.println("#3: "+fa3.toString());		
//	System.out.println("************************************************");
//	System.out.println("STUDENTS:");
//	System.out.println("#1: "+st1.toString());	
//	System.out.println("#2: "+st2.toString());	
//	System.out.println("#3: "+st3.toString());	
//	
//	PrintWriter outStream = null;
//	try {
//		outStream = new PrintWriter(new FileOutputStream("SchoolDB_Updated.txt",true));
//		outStream.println("COURSES:");
//	outStream.println(co1.toString());
//	outStream.println(co2.toString());
//	outStream.println(co3.toString());
//	outStream.println("************************************************");
//	outStream.println("GENERAL STAFF:");
//	outStream.println("#1: "+gs1.toString());	
//	outStream.println("#2: "+gs2.toString());	
//	outStream.println("#3: "+gs3.toString());	
//	outStream.println("************************************************");
//	outStream.println("FACULTY:");
//	outStream.println("#1: "+fa1.toString());	
//	outStream.println("#2: "+fa2.toString());	
//	outStream.println("#3: "+fa3.toString());		
//	outStream.println("************************************************");
//	outStream.println("STUDENTS:");
//	outStream.println("#1: "+st1.toString());	
//	outStream.println("#2: "+st2.toString());	
//	outStream.println("#3: "+st3.toString());		
//	}
//	catch(Exception e){
//		System.out.println(e.getMessage());
//	}
//	finally {
//		if(outStream != null) {
//			outStream.close();
//		}
//	}
//	
//	kb.close();
	}
	
	
	
	public static String facultyTeachesCourse(Faculty a,Course b) {
		for(int i=0;i< a.getNumCoursesTaught();i++) {
			if(b.equals(a.getCourseTaught(i))) {
				return a.getName()+" teaches this course";
			}
		}
		return a.getName()+" does not teach this course";
	}
	public static int facultyTeachesMostCourses(Faculty[] f) {
		Faculty temp = f[0];
		int a = 0;
		for(int i=1; i<f.length; i++) {
			if(temp.compareTo(f[i]) < 0) {
				temp = f[i];
				a = i;
			}
		}
		return a;
	}
	public static int facultyTeachesLeastCourses(Faculty[] f) {
		Faculty temp = f[0];
		int a = 0;
		for(int i=1; i<f.length; i++) {
			if(temp.compareTo(f[i]) > 0) {
				temp = f[i];
				a = i;
			}
		}
		return a;
	}
	public static int studentWithMostCredits(Student[] s) {
		Student temp = s[0];
		int a = 0;
		for(int i=1; i<s.length; i++) {
			if(temp.compareTo(s[i]) < 0) {
				temp = s[i];
				a = i;
			}
		}
		return a;	
	}
	public static int studentWithLeastCredits(Student[] s) {
		Student temp = s[0];
		int a = 0;
		for(int i=1; i<s.length; i++) {
			if(temp.compareTo(s[i]) > 0) {
				temp = s[i];
				a = i;
			}
		}
		return a;	
	}
	public static int minimunCourse(Course[] c) {
		Course temp = c[0];
		int a = 0;
		for(int i=1; i<c.length; i++) {
			if(temp.compareTo(c[i]) > 0) {
				temp = c[i];
				a = i;
			}
		}
		return a;	
	}
	public static int maximunCourse(Course[] c) {
		Course temp = c[0];
		int a = 0;
		for(int i=1; i<c.length; i++) {
			if(temp.compareTo(c[i]) < 0) {
				temp = c[i];
				a = i;
			}
		}
		return a;	
	}
	
	
	
	
	
}
