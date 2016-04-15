package za.ac.innocentmphokeli.Factories;

/**
 * Created by Game330 on 2016-04-13.
 */
public class CustomerFactory {
    //singleton
    private static CustomerFactory instance=null;

    public CustomerFactory(){}

    public static CustomerFactory getInstance(){
        if (instance == null) {
            instance = new CustomerFactory();
        }
        return instance;
    }

}
