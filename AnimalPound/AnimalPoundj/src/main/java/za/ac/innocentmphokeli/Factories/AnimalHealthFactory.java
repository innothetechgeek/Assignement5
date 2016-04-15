package za.ac.innocentmphokeli.Factories;

import za.ac.innocentmphokeli.Domain.Animal;
import za.ac.innocentmphokeli.Domain.AnimalHealth;
import za.ac.innocentmphokeli.Domain.Treatment;

import java.util.List;

/**
 * Created by Game330 on 2016-04-12.
 */
public class AnimalHealthFactory {

    //singleton
   private static  AnimalHealthFactory instance=null;

    public  AnimalHealthFactory(){}

    public static AnimalHealthFactory getInstance(){
        if (instance == null) {
            instance = new  AnimalHealthFactory();
        }
        return instance;
    }

    public static AnimalHealth getHealth(String condition, String description, List<Animal> animal, List<Treatment> treatment)
    {
        AnimalHealth myHealth = new AnimalHealth
                .Builder(condition)
                .Description(description)
                .animals(animal)
                .Treatment(treatment)
                .build();

        return myHealth;
    }





}

