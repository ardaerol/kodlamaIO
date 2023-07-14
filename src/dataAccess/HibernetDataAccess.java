package dataAccess;

import entities.Category;
import entities.Course;
import entities.Instructor;

public class HibernetDataAccess implements IData{
    @Override
    public void addCourse(Course course) {
        System.out.println("Hibernet ile veritabanına eklendi: "+course.getCourseName());
    }

    @Override
    public void addCategory(Category category) {
        System.out.println("Hibernet ile veritabanına eklendi: "+category.getCategoryName());
    }

    @Override
    public void addInstructor(Instructor instructor) {
        System.out.println("Hibernet ile veritabanına eklendi: "+instructor.getInstructorName());
    }
}
