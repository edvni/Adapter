// Adapter class changes OldDatabase-class to NewDatabase-interface
public class DatabaseAdapter implements INewDatabase {
    private OldDatabase oldDatabase;

    public DatabaseAdapter(OldDatabase oldDatabase) {
        this.oldDatabase = oldDatabase;
    }

    @Override
    public void saveUser(String name) {
        // Call existing OldDatabase save method
        oldDatabase.saveUser(name);
    }

    @Override
    public String getUser(String name) {
        // Call existing OldDatabase get method
        return oldDatabase.getUser(name);
    }
}
