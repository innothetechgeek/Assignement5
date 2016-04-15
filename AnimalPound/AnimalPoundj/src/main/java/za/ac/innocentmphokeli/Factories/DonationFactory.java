package za.ac.innocentmphokeli.Factories;

import za.ac.innocentmphokeli.Domain.Donation;

import java.sql.Date;

/**
 * Created by Admin on 2016/04/03.
 */
public class DonationFactory {

    //singleton
    private static DonationFactory instance=null;

    public DonationFactory(){}

    public static DonationFactory getInstance(){
        if (instance == null) {
            instance = new DonationFactory();
        }
        return instance;
    }
    public static Donation createDonation(int donationId,
            Date donationDate,
            double amount,
            String comment)
    {
        return new Donation.Builder(donationDate)
                .amount(amount)
                .comment(comment)
                .donationId(donationId)
                .build();
    }
}
