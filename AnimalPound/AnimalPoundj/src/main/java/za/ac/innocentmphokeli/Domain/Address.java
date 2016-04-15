package za.ac.innocentmphokeli.Domain;

import java.io.Serializable;

/**
 * Created by Game330 on 2016-04-11.
 */
public class Address implements Serializable{
    private String room;
    private String street;
    private String surbub;
    private String zipCode;

    public String getRoom() {
        return room;

    }

    public Address(Builder value){
        this.zipCode = value.zipCode;
        this.street = value.street;
        this.surbub = value.surbub;
        this.zipCode = value.zipCode;
    }

    public String getStreet() {
        return street;
    }

    public String getSurbub() {
        return surbub;
    }

    public String getZipCode() {
        return zipCode;
    }

    public static class Builder{
        private String room;
        private String street;
        private String surbub;
        private String zipCode;


        public  Builder (String rm){
            this.room = rm;
        }

        public  Builder street(String strt){
            this.street = strt;
            return this;
        }

        public Builder surbub(String surbb){
            this.surbub = surbb;
            return this;
        }

        public Builder zipCode(String pCode){
            this.zipCode = pCode;
            return this;
        }
        public Builder copy(Address val){
            this.zipCode = val.zipCode;
            this.surbub = val.surbub;
            this.street = val.street;
            return this;
        }

        public Address build()
        {
            return new Address(this);
        }
    }
}