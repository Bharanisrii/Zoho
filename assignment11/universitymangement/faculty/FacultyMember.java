package assignment11.universitymangement.faculty;

public class FacultyMember {
	private String name;
    private String facultyId;
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getFacultyId() {
		return facultyId;
	}
	public void setFacultyId(String facultyId) {
		this.facultyId = facultyId;
	}
	public FacultyMember(String name,String facultyId) {
		this.name = name;
        this.facultyId = facultyId;
	}
}
