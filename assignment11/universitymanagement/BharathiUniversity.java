package assignment11.universitymanagement;

import assignment11.universitymanagement.course.Course;
import assignment11.universitymanagment.students.Students;
import assignment11.universitymangement.faculty.FacultyMember;

public class BharathiUniversity {
	public static void main(String[]args) {
		Course course = new Course("21MAA351","Tamil");
		Students st = new Students("Mini",301);
		FacultyMember fm = new FacultyMember("kalam","B021");
		
        System.out.println("Course: " +course.getCourseName()  );
        System.out.println("Faculty Member: " +fm.getName() );
        System.out.println("Student: " +st.getName() );


	}

}
