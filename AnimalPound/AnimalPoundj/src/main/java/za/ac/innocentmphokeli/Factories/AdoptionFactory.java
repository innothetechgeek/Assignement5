package za.ac.innocentmphokeli.Factories;

import za.ac.innocentmphokeli.Domain.Adoption;

import java.util.Date;

/**
 * Created by Admin on 2016/04/03.
 */
public class AdoptionFactory {

    //singleton
    private static AdoptionFactory instance=null;

    public AdoptionFactory(){}

    public static AdoptionFactory getInstance(){
        if (instance == null) {
            instance = new AdoptionFactory();
        }
        return instance;
    }

    public static Adoption createAdoption(String comment,
            int adoptionId,
            Date adoptionDate)
    {
        return new Adoption.Builder(comment)
                .adoptionDate(adoptionDate)
                .adoptionId(adoptionId)
                .build();
    }
}
