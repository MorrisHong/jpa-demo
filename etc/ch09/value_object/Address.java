package ch09.value_object;

import javax.persistence.Embeddable;
import javax.persistence.Embedded;

@Embeddable
public class Address {

    private String city;
    private String street;

    @Embedded
    private Zipcode zipcode;
}
