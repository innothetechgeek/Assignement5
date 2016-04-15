package za.ac.innocentmphokeli.Domain;

import java.io.Serializable;

/**
 * Created by Game330 on 2016-04-12.
 */
public class AnimalRecord implements Serializable {


    private String arrivalDate;
    private String leavingDate;

    private AnimalRecord(Builder build) {
        this.arrivalDate = build.arrivalDate;
        this.leavingDate = build.leavingDate;
    }

    public static class Builder {

        private String arrivalDate;
        private String leavingDate;

        public Builder(String arrivalDate) {
            this.arrivalDate = arrivalDate;
        }
        public Builder leavingDate(String leavingDate) {
            this.leavingDate = leavingDate;
            return this;
        }

        public Builder id(Long value) {
            return this;
        }
        public Builder AnimalRecord(AnimalRecord record) {
            this.arrivalDate = record.arrivalDate;
            this.leavingDate= record.leavingDate;
            return this;
        }

        public AnimalRecord build() {
            return new AnimalRecord(this);
        }

    }
    public String getarrivalDate() {
        return arrivalDate;
    }

    public String getleavingDate() {
        return leavingDate;
    }

}


