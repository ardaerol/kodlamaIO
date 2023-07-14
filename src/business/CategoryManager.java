package business;

import core.ILogger;
import dataAccess.IData;
import entities.Category;

import java.util.List;

public class CategoryManager {
    private IData iData;
    private List<Category> categories;
    private List<ILogger> loggers;

    public CategoryManager(IData iData, List<Category> categories, List<ILogger> loggers) {
        this.iData = iData;
        this.categories = categories;
        this.loggers = loggers;
    }

    public void add(Category category) throws Exception {
        for (Category category1: categories) {
            if (category1.getCategoryName() == category.getCategoryName()){
                throw new Exception("Kategori adı mevcut");
            }
        }
        for (ILogger logger: loggers) {
            logger.log(category.getCategoryName());
        }
        iData.addCategory(category);
    }
}
