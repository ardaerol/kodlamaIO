package business;

import core.ILogger;
import dataAccess.IData;
import entities.Course;

import java.util.List;

public class CourseManager {
    private IData iData;
    private List<Course> courses;
    private List<ILogger> loggers;

    public CourseManager(IData iData, List<Course> courses, List<ILogger> loggers) {
        this.iData = iData;
        this.courses = courses;
        this.loggers = loggers;
    }

    public void add(Course course) throws Exception {
        for (Course course1:courses) {
            if (course1.getCourseName() == course.getCourseName() || course.getCoursePrice()<=1){
                throw new Exception("Kurs için gereken değerlker hatalı");
            }

        }

        for (ILogger logger: loggers) {
            logger.log(course.getCourseName());
        }
        iData.addCourse(course);
    }
}
