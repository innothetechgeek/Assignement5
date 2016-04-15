package za.ac.innocentmphokeli.Domain;

import java.io.Serializable;

/**
 * Created by Game330 on 2016-04-12.
 */
public class Customer implements Serializable {
    private Long Id;
    private String custNumber;
    private String custName;
    private String custSurname;


    private Adoption adopt;
    //embeded
    private Address Adress;


    private Customer() {
    }


    private Customer(Builder build)
    {
        Id = build.Id;
        adopt = build.adopt;
        custName = build.custName;
        custSurname = build.custSurname;
        custNumber = build.custNumber;
        Adress = build.adress;

    }


    public static class Builder{

        private Long Id;
        private String custName;
        private String custNumber;
        private String custSurname;
        private Adoption adopt;
        private Address adress;

        public Builder (String custNumber) {
            this.custNumber = custNumber;
        }

        public Builder Adress (Address addr){
            this.adress = addr;
            return this;
        }
        public Builder Id(Long id) {
            this.Id = id;
            return this;
        }

        public Builder CustName(String custName) {
            this.custName = custName;
            return this;
        }

        public Builder CustSurname(String custSurname) {
            this.custSurname = custSurname;
            return this;
        }
        public Builder Adopt(Adoption adopt) {
            this.adopt = adopt;
            return this;
        }

        public Builder customer(Customer cust)
        {
            adopt = cust.getAdopt();
            custName = cust.getCustName();
            custNumber = cust.getCustNumber();
            custSurname = cust.getCustSurname();
            Id = cust.getID();
            adress = cust.getAdress();
            return this;
        }

        public Customer build()
        {
            return new Customer(this);
        }
    }

    public Address getAdress()
    {
        return Adress;
    }
    public Long getID()
    {
        return Id;
    }
    public String getCustName() {
        return custName;
    }

    public String getCustNumber() {
        return custNumber;
    }

    public String getCustSurname() {
        return custSurname;
    }


    public Adoption getAdopt() {
        return adopt;
    }



}
