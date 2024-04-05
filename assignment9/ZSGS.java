package assignment9;

class Student {
	Student(String name, int age, String ParentName) {
		this.name = name;
		this.age = age;
		this.parentName = ParentName;
	}

	private String name;
	private int age;
	private String parentName;

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public int getAge() {
		return age;
	}

	public void setAge(int age) {
		this.age = age;
	}

	public String getParentName() {
		return parentName;
	}

	public void setParentName(String parentName) {
		this.parentName = parentName;
	}

}

public class ZSGS extends Student {

	ZSGS(String schoolName,String name,String parentName,int age) {
		super(name, age, parentName);
		this.schoolName = schoolName;

	}

	private String schoolName;

	public String getSchoolName() {
		return schoolName;
	}

	public static void main(String[] args) {
		Student s = new Student("Bharani",22,"Regina");
		System.out.println(s.getAge());
		System.out.println(s.getName());
		System.out.println(s.getParentName());
	}
}
