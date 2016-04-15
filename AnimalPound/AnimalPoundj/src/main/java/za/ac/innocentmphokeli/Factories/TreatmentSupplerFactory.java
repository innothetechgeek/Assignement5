package za.ac.innocentmphokeli.Factories;

import za.ac.innocentmphokeli.Domain.TreatmentSupplier;

/**
 * Created by Game330 on 2016-04-14.
 */
public class TreatmentSupplerFactory {

    //singleton
    private static TreatmentSupplerFactory instance=null;

    private TreatmentSupplerFactory(){}

    public static TreatmentSupplerFactory getInstance(){
        if (instance == null) {
            instance = new TreatmentSupplerFactory();
        }
        return instance;
    }

    public static TreatmentSupplier createTreatment(int code,
                                            String supplierName,
                                            String treatmentName){
        return new TreatmentSupplier.Builder(code)
                 .supplierName(supplierName)
                 .treatmentName(treatmentName)
                 .build();
    }


}
