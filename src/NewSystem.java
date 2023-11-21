// New System class
public class NewSystem {
    private INewDatabase userDatabase;

    public NewSystem(INewDatabase userDatabase) {
        this.userDatabase = userDatabase;
    }

    void useDatabase(String name) {
        userDatabase.saveUser(name);
        userDatabase.getUser(name);
    }

}
