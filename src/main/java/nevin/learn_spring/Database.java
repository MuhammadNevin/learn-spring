package nevin.learn_spring;

public class Database {
    
    private static Database database;

    public static Database getInstance() {
        if (Database.database == null) {
            Database.database = new Database();
        }
        return Database.database;
    }

    private Database() {
        
    }
}
