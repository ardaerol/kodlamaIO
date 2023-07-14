package business;

import core.ILogger;
import dataAccess.IData;
import entities.Instructor;

import java.util.List;

public class InstructorManager {
    private IData iData;
    private List<ILogger> loggers;

    public InstructorManager(IData iData, List<ILogger> loggers) {
        this.iData = iData;
        this.loggers = loggers;
    }

    public void add(Instructor instructor) throws Exception {
        if (instructor.getInstructorName().isEmpty() ){
            throw new Exception("Eğitmen ismi boş olamaz");
        }else{
            for (ILogger logger: loggers) {
                logger.log(instructor.getInstructorName());
            }
            iData.addInstructor(instructor);
        }

    }
}
