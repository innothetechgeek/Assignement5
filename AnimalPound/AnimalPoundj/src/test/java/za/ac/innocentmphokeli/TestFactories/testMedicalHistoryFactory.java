package za.ac.innocentmphokeli.TestFactories;

import org.junit.Assert;
import org.junit.Test;
import za.ac.innocentmphokeli.Domain.Animal;
import za.ac.innocentmphokeli.Domain.AnimalHealth;
import za.ac.innocentmphokeli.Domain.LivingArea;
import za.ac.innocentmphokeli.Domain.MedicalHistory;
import za.ac.innocentmphokeli.Factories.LivingAreaFactory;
import za.ac.innocentmphokeli.Factories.MedicalHistoryFactory;

import java.text.SimpleDateFormat;
import java.util.List;

/**
 * Created by Game330 on 2016-04-15.
 */
public class testMedicalHistoryFactory {
    @Test
    public void testName() throws Exception {
        List<AnimalHealth> infections = null;
        java.text.SimpleDateFormat sdf = new java.text.SimpleDateFormat("dd-MMM-yyyy");

            java.util.Date date = sdf.parse("23-Mar-2016");

        MedicalHistoryFactory factory = new MedicalHistoryFactory();
        MedicalHistory original = factory.createMedHistory(1232453,"lung infection", date,infections);


        Assert.assertEquals(date, original.getDate());

    }
}
