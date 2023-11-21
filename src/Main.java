/*
* With the adapter we can use the OLD database in the NEW system,
* without having to change the existing database.
* Adapter takes care of the conversion between the old and the new system.
* */
public class Main {
    public static void main(String[] args) {
        // Create an existing OldDatabase object
        OldDatabase oldDatabase = new OldDatabase();

        // Create adapter
        DatabaseAdapter adapter = new DatabaseAdapter(oldDatabase);

        // Create NewSystem object and pass adapter to it
        NewSystem newSystem = new NewSystem(adapter);

        // Use NewSystem object which uses the adapter
        String userName = "Jouko Joukahainen";
        newSystem.useDatabase(userName);
    }
}
