

import business.CategoryManager;
import business.CourseManager;
import business.InstructorManager;
import core.DatabaseLogger;
import core.FileLogger;
import core.ILogger;
import core.MailLogger;
import dataAccess.HibernetDataAccess;
import dataAccess.IData;
import dataAccess.jdbcDataAccess;
import entities.Category;
import entities.Course;
import entities.Instructor;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;

// Press Shift twice to open the Search Everywhere dialog and type `show whitespaces`,
// then press Enter. You can now see whitespace characters in your code.
public class Main {
    public static void main(String[] args) throws Exception {
        // IData iData = new HibernetDataAccess();

        // Course list dizisi içinde kurslarımız var
        List<Course> courses = new ArrayList<Course>();
        courses.add(new Course(12, "deniz"));
        courses.add(new Course(12, "derya"));


        // log dizisi logları dönmek için
        List<ILogger> loggers = new ArrayList<ILogger>();
        loggers.add(new DatabaseLogger());
        loggers.add(new FileLogger());
        loggers.add(new MailLogger());

        CourseManager courseManager = new CourseManager(new HibernetDataAccess(), courses, loggers);
        Course course = new Course(11, "arda");
        courseManager.add(course);
//        ************************************************************
        System.out.println("---------Category işlemleri-----------");

        List<Category> categories = new ArrayList<Category>();
        categories.add(new Category(1, "front-end"));
        categories.add(new Category(2, "full-stack"));

        CategoryManager categoryManager = new CategoryManager(new jdbcDataAccess(), categories, loggers);
        Category category = new Category(3, "back-end");
        categoryManager.add(category);

        System.out.println("---------InstructorManager işlemleri-----------");

        InstructorManager instructorManager = new InstructorManager(new HibernetDataAccess(),loggers);

        Instructor instructor = new Instructor(1, "Fatma");
        instructorManager.add(instructor);

    }
}