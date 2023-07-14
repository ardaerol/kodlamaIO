package dataAccess;

import entities.Category;
import entities.Course;
import entities.Instructor;

public interface IData {
    void addCourse(Course course);
    void addCategory(Category category);
    void addInstructor(Instructor instructor);
}
