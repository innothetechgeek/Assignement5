package za.ac.innocentmphokeli.Factories;

import za.ac.innocentmphokeli.Domain.AnimalRecord;
import za.ac.innocentmphokeli.Domain.Donation;

import java.sql.Date;

/**
 * Created by Game330 on 2016-04-13.
 */
public class AnimalRecordFactory {

    //singleton
    private static AnimalRecordFactory instance=null;

    public AnimalRecordFactory(){}

    public static AnimalRecordFactory getInstance(){
        if (instance == null) {
            instance = new AnimalRecordFactory();
        }
        return instance;
    }
    public static AnimalRecord createDonation(String arrivalDate ,
                                              String leavingDate)
    {
        return new AnimalRecord.Builder(arrivalDate)
                .leavingDate(leavingDate)
                .build();
    }

}
