package kodlama.io.business;

import kodlama.io.coreLogging.Logger;
import kodlama.io.dataAccess.CourseDao;
import kodlama.io.entities.Course;

public class CourseManager {
	// Attributes:
	private CourseDao courseDao;
	private Logger[] loggers;
	private Course course;
	private int i;
	private static String[] courses = new String[Course.getCounter()];
	private static String[] categories = new String[Course.getCounter()];

	// Constructor:
	public CourseManager(CourseDao courseDao, Logger[] loggers) {
		this.courseDao = courseDao;
		this.loggers = loggers;
	}

	// Encapsulation:

	public CourseDao getCourseDao() {
		return courseDao;
	}

	public void setCourseDao(CourseDao courseDao) {
		this.courseDao = courseDao;
	}

	public Logger[] getLoggers() {
		return loggers;
	}

	public void setLogger(Logger[] loggers) {
		this.loggers = loggers;
	}

	public Course getCourse() {
		return course;
	}

	public void setCourse(Course course) {
		this.course = course;
	}

	public int getI() {
		return i;
	}

	public void setI(int i) {
		this.i = i;
	}

	public static String[] getCourses() {
		return courses;
	}

	public static void setCourses(String[] courses) {
		CourseManager.courses = courses;
	}

	public static String[] getCategories() {
		return categories;
	}

	public static void setCategories(String[] categories) {
		CourseManager.categories = categories;
	}

	public void add(Course course) throws Exception {
		System.out.println("-------------------------------------");

		System.out.println("Course Description : " + course.getCourseDescription());
		System.out.println("Category : " + course.getCategory());

		courses[i] = course.getCourseDescription();
		categories[i] = course.getCategory();

		// Business rule-1 :
		for (int ii = 0; ii < i; ii++) {
			if (course.getCourseDescription().equals(courses[ii])) {
				System.out.println("rule 1 working.");
				throw new Exception("Warning! Course description can not be used more than once.");
			}
		}

		// Business rule-2 :
		for (int ii = 0; ii < i; ii++) {
			if (course.getCategory().equals(categories[ii])) {
				System.out.println("rule 2 working.");
				throw new Exception("Warning! Course categories can not be used more than once.");
			}
		}

		// Business rule-3 :
		for (int ii = 0; ii < (i - 1); ii++) {
			if (course.getCategory().equals(categories[ii])) {

			}
		}
		i++;
		System.out.println("The relevant course has been added.");
		for (Logger logger : loggers) {
			logger.log(course.getCourseDescription());
		}
	}

}
