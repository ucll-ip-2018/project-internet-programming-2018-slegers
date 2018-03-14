package it.yanice.studyTracker.db;

public class DbFactory {
    public CourseDb getDB(String dbname) {
        CourseDb database = null;
        try {
            Class dbclass = Class.forName("it.yanice.studyTracker.db." + dbname);
            Object dbObject = dbclass.newInstance();
            database = (CourseDb) dbObject;
        } catch (ClassNotFoundException | InstantiationException | IllegalAccessException e) {
            try {
                throw new DbException("The database you enter doesn't exist.");
            } catch (DbException e1) {
                e1.printStackTrace();
            }
        }
        return database;
    }

    public StudyMomentDb getStudymomentDb(String dbname){
        StudyMomentDb database = null;
        try {
            Class dbclass = Class.forName("it.yanice.studyTracker.db." + dbname);
            Object dbObject = dbclass.newInstance();
            database = (StudyMomentDb) dbObject;
        } catch (ClassNotFoundException | InstantiationException | IllegalAccessException e) {
            try {
                throw new DbException("The database you enter doesn't exist.");
            } catch (DbException e1) {
                e1.printStackTrace();
            }
        }
        return database;
    }
}
