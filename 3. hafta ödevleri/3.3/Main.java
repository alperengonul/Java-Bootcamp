package kodlama.io;

import kodlama.io.business.CourseManager;
import kodlama.io.coreLogging.DatabaseLogger;
import kodlama.io.coreLogging.EmailLogger;
import kodlama.io.coreLogging.FileLogger;
import kodlama.io.coreLogging.Logger;
import kodlama.io.dataAccess.HibernateCourseDao;
import kodlama.io.entities.Course;

public class Main {

	public static void main(String[] args) throws Exception {
		Course course1 = new Course("Java Boot Camp for Junior Developers", "Intro to OOP", "Engin Demiog", 0);
		Course course2 = new Course("Java Boot Camp for Senior Developers", "OOP Advance", "Engin Demiog", 0);
		Course course3 = new Course("Phyton Boot Camp for Junior Developers", "Intro to Phyton", "Engin Demiog", 0);

		Logger[] loggers = { new DatabaseLogger(), new FileLogger(), new EmailLogger() };

		CourseManager courseManager = new CourseManager(new HibernateCourseDao(), loggers);
		courseManager.add(course1);
		courseManager.add(course2);
		courseManager.add(course3);

	}

}
