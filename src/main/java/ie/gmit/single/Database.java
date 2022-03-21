package ie.gmit.single;

public class Database {

    //Store used by controller
    private Store store = new Store();

    public void addDB(User user)
    {
        store.store(user);
    }






}
