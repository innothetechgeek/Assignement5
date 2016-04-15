package za.ac.innocentmphokeli.TestFactories;



import org.junit.Assert;
import org.junit.Test;
import za.ac.innocentmphokeli.Domain.Adoption;
import za.ac.innocentmphokeli.Domain.Animal;
import za.ac.innocentmphokeli.Domain.Schedule;
import za.ac.innocentmphokeli.Factories.AnimalFactory;

import java.util.List;

/**
 * Created by Admin on 2016/04/03.
 */
public class testAnimalFactory {

    @Test
    public void testCreate()
    {
        Adoption adoption = new Adoption.Builder("Peters Family").build();
        List<Schedule> schedules = null;
        AnimalFactory factory = new AnimalFactory();
        Animal original = factory.createAnimal("Sunshine1",2121, schedules, "Dog");

        Assert.assertEquals(original.getAnimalId(), 2121);
    }


    @Test
    public void testUpdate()
    {
        Adoption adoption = new Adoption.Builder("Peters Family").build();
        List<Schedule> schedules = null;
        AnimalFactory factory = new AnimalFactory();
        Animal original = factory.createAnimal("Sunshine1",2121, schedules, "Dog");
        Animal copy = new Animal.Builder("Sunshine").copy(original).animalId(2121).build();

        Assert.assertEquals(original.getAnimalId(), 2121);
        Assert.assertEquals(copy.getAnimalId(), 4);
        Assert.assertEquals(copy.getBreed(), original.getBreed());
    }

}
