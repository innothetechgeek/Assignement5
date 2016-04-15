package za.ac.innocentmphokeli.Domain;

import java.io.Serializable;

/**
 * Created by Game330 on 2016-04-12.
 */
public class Treatment implements Serializable {
    private int treatmentNO;
    private String expiryDate;
    private String instructions;

    public  Treatment(){}

    private Treatment(Builder build) {
        this.treatmentNO = build.treatmentNO;
        this.expiryDate = build.expiryDate;
        this.instructions = build.instructions;
    }

    public int getTreatmentNO() {
        return treatmentNO;
    }

    public String getExpiryDate() {
        return expiryDate;
    }

    public String getInstructions() {
        return instructions;
    }



    public static class Builder {
         int treatmentNO;
        String expiryDate;
        String instructions;

        public Builder(int treatmentNO) {
            this.treatmentNO = treatmentNO;
        }

        public Builder ExpiryDate(String expiryDate) {
            this.expiryDate = expiryDate;
            return this;
        }

        public Builder Instructions(String instructions) {
            this.instructions = instructions;
            return this;
        }


        public Builder treatment(Treatment treat) {
            expiryDate = treat.getExpiryDate();
            instructions = treat.getInstructions();
            treatmentNO = treat.getTreatmentNO();
            return this;
        }

        public Treatment build() {
            return new Treatment(this);
        }




    }
}

