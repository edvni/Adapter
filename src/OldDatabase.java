// The old existing database class
public class OldDatabase {
    void saveUser(String name) {
        System.out.println("Old DB is saving user " + name);
    }

    String getUser(String name) {
        System.out.println("Old DB is getting user " + name);
        return name;
    }
}
