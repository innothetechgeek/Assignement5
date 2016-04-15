package za.ac.innocentmphokeli.Factories;

import za.ac.innocentmphokeli.Domain.Adoption;
import za.ac.innocentmphokeli.Domain.Animal;
import za.ac.innocentmphokeli.Domain.Schedule;

import java.util.List;

/**
 * Created by Admin on 2016/04/03.
 */
public class AnimalFactory {

    //singleton
   private static AnimalFactory instance=null;

    public AnimalFactory(){}

    public static AnimalFactory getInstance(){
        if (instance == null) {
            instance = new AnimalFactory();
        }
        return instance;
    }
    public static Animal createAnimal(String name,
            int animalId,
            List<Schedule> schedules,
            String breed)
    {
        return new Animal.Builder(name)
                .animalId(animalId)
                .breed(breed)
                .schedules(schedules)
                .build();
    }
}
