package entities;

public class Course {
    public Course(double coursePrice, String courseName) {
        this.coursePrice = coursePrice;
        this.courseName = courseName;
    }

    public Course() {
    }

    private double coursePrice;
    private String courseName;

    public double getCoursePrice() {
        return coursePrice;
    }

    public void setCoursePrice(double coursePrice) {
        this.coursePrice = coursePrice;
    }

    public String getCourseName() {
        return courseName;
    }

    public void setCourseName(String courseName) {
        this.courseName = courseName;
    }
}
