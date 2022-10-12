package kodlama.io.dataAccess;

import kodlama.io.entities.Course;

public class HibernateCourseDao implements CourseDao {

	public void add(Course course) {
		System.out.println("The relevant course has been added to database via Hibernate. ");
	}

}
