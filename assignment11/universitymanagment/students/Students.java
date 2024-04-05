package assignment11.universitymanagment.students;

public class Students {
	private String name;
    private int studentId;
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public int getStudentId() {
		return studentId;
	}
	public void setStudentId(int studentId) {
		this.studentId = studentId;
	}
	public Students(String name,int studentId) {
		this.name=name;
		this.studentId=studentId;
	}
}
