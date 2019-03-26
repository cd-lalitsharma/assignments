package model;

import javax.persistence.Embeddable;

@Embeddable
public class Address {
    
    Integer streetNumber;
    String location;
    String state;
    
    public Address() {
    
    }
    
    public Address(Integer streetNumber, String location, String state) {
        this.streetNumber = streetNumber;
        this.location = location;
        this.state = state;
    }
}
