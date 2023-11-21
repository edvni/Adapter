// New System class
public class NewSystem {
    private NewDatabase userDatabase;

    public NewSystem(NewDatabase userDatabase) {
        this.userDatabase = userDatabase;
    }

    void useDatabase(String name) {
        userDatabase.saveUser(name);
        userDatabase.getUser(name);
    }

}
