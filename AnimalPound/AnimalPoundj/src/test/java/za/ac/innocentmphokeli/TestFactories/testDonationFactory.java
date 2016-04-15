package za.ac.innocentmphokeli.TestFactories;


import org.junit.Assert;
import org.junit.Test;
import za.ac.innocentmphokeli.Domain.Donation;
import za.ac.innocentmphokeli.Factories.DonationFactory;

import java.sql.Date;

/**
 * Created by Admin on 2016/04/03.
 */
public class testDonationFactory {
    @Test
    public void testCreate()
    {
        DonationFactory factory = new DonationFactory();
        Donation original = factory.createDonation(0, new Date(2016,2,5),500.14, "For Food");

        Assert.assertEquals(500.14, original.getAmount());
    }

    @Test
    public void testUpdate()
    {
        DonationFactory factory = new DonationFactory();
        Donation original = factory.createDonation(0, new Date(2016,2,5),500.14, "For Food");
        Donation copy = new Donation.Builder(new Date(2016,3,4)).copy(original).amount(300.67).build();
        Assert.assertEquals(500.14, original.getAmount());
        Assert.assertEquals(300.67, copy.getAmount());

    }
}
