package za.ac.innocentmphokeli.TestFactories;


import org.junit.Assert;
import org.junit.Test;
import za.ac.innocentmphokeli.Domain.Animal;
import za.ac.innocentmphokeli.Domain.LivingArea;
import za.ac.innocentmphokeli.Factories.LivingAreaFactory;

import java.util.List;

/**
 * Created by Admin on 2016/04/03.
 */
public class testLivingAreaFactory {
    @Test
    public void testCreate()
    {
        List<Animal> animals = null;
        LivingAreaFactory factory = new LivingAreaFactory();
        LivingArea original = factory.createLivingArea(0, "Kennels", "50", animals);

        Assert.assertEquals(50, original.getSpaceAvailable());
    }

    @Test
    public void testUpdate()
    {
        List<Animal> animals = null;
        LivingAreaFactory factory = new LivingAreaFactory();
        LivingArea original = factory.createLivingArea(0, "Kennels","50", animals);
        LivingArea copy = new LivingArea.Builder("Cages").copy(original).spaceAvailable(45).build();

        Assert.assertEquals(45, copy.getSpaceAvailable());
        Assert.assertEquals(50, original.getSpaceAvailable());
        Assert.assertEquals(original.getName(), copy.getName());
    }

}
