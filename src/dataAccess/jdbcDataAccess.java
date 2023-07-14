package dataAccess;

import entities.Category;
import entities.Course;
import entities.Instructor;

public class jdbcDataAccess implements IData{
    @Override
    public void addCourse(Course course) {
        System.out.println("jdbc ile veritabanına eklendi: "+course.getCourseName());
    }

    @Override
    public void addCategory(Category category) {
        System.out.println("jdbc ile veritabanına eklendi: "+category.getCategoryName());
    }

    @Override
    public void addInstructor(Instructor instructor) {
        System.out.println("jdbc ile veritabanına eklendi: "+instructor.getInstructorName());
    }
}
