package kodlama.io.entities;

public class Course {
	// Attributes:
	private String category, instructor, courseDescription;
	private double price;
	private static int counter;

	private String[] categories = new String[counter];

	// Constructor:
	public Course(String courseDescription, String category, String instructor, double price) {
		this.courseDescription = courseDescription;
		this.category = category;
		this.instructor = instructor;
		this.price = price;

		Course.counter++;
	}

	// Encapsulation:
	public String getCategory() {
		return category;
	}

	public void setCategory(String category) {
		this.category = category;
	}

	public String getInstructor() {
		return instructor;
	}

	public void setInstructor(String instructor) {
		this.instructor = instructor;
	}

	public double getPrice() {
		return price;
	}

	public void setPrice(double price) {
		this.price = price;
	}

	public String getCourseDescription() {
		return courseDescription;
	}

	public void setCourseDescription(String courseDescription) {
		this.courseDescription = courseDescription;
	}

	public String[] getCategories() {
		return categories;
	}

	public void setCategories(String[] categories) {
		this.categories = categories;
	}

	public static int getCounter() {
		return counter;
	}

}
