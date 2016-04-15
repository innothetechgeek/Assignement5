package za.ac.innocentmphokeli.Factories;

import za.ac.innocentmphokeli.Domain.Schedule;
import za.ac.innocentmphokeli.Domain.ScheduleType;
import za.ac.innocentmphokeli.Domain.Treatment;

import java.util.List;

/**
 * Created by Game330 on 2016-04-13.
 */
public class TreatmentFactory {

    //singleton
    private static TreatmentFactory instance=null;

    private TreatmentFactory(){}

    public static TreatmentFactory getInstance(){
        if (instance == null) {
            instance = new TreatmentFactory();
        }
        return instance;
    }
    public static Treatment createTreatment(int treatmentNO,
                String expiryDate,
                String instructions){

        return new Treatment.Builder(treatmentNO)
                .Instructions(instructions)
                .ExpiryDate(expiryDate)
                .build();
    }
}
