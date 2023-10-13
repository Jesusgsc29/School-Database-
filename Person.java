package Project1;

public class Person {
	
	private String name;
	private int birthYear;
	
	public Person() {
		name = "";
		birthYear = 0;
	}
	public Person(String name, int birthYear) {
		this.name = name;
		if(birthYear >=0) {
		this.birthYear = birthYear;
		}
		else {
			birthYear = 0;
		}
	}
	public void setBirthYear(int year) {
		if(birthYear >=0) {
			this.birthYear = year;
			}
			else {
				birthYear = 0;
			}
	}
	
	public String getName() {
		return name;
	}
	public int getBirthYear() {
		return birthYear;
	}
	public void setName(String name) {
		this.name = name;
	}
	
	@Override
	public boolean equals(Object obj) {
		if(obj == null) {return false;}
		if(this == obj) {return true;}
		if(obj instanceof Person) {
		Person other = (Person)obj;
		if(birthYear == other.birthYear) {
			if((name != null)&&(other.name != null)) {
				if(name.equals(other.name)) {
				return true;
				}
			}
		}
	}
	return false;
	}
	
	@Override
	public String toString() {
		return String.format("Person: Name: %30s | Birth Year: %4d", name, birthYear);
	}
	
	public int compareTo(Person p) {
		if(this.birthYear == p.birthYear) {return 0;}
		if(this.birthYear > p.birthYear) {
			return 1;
		}
		return -1;
	}
	
	
}

