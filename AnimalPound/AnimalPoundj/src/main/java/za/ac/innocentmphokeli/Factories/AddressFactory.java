package za.ac.innocentmphokeli.Factories;

import za.ac.innocentmphokeli.Domain.Address;
import za.ac.innocentmphokeli.Domain.Adoption;

import java.util.Date;

/**
 * Created by Game330 on 2016-04-12.
 */
public class AddressFactory{

    //singleton
    private static AddressFactory instance=null;

    public AddressFactory(){}

    public static AddressFactory getInstance() {
        if (instance == null) {
            instance = new AddressFactory();

        }
        return instance;
    }



    public static Address createAdress(String room,
                                       String street,
                                       String surbub,
                                       String zipCode)
    {

        Address myAddress = new Address.Builder(room)
                .street(street)
                .surbub(surbub)
                .zipCode(zipCode)
                .build();
        return myAddress;
    }
}
