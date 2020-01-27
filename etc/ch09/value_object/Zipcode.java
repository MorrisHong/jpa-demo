package ch09.value_object;

import javax.persistence.Embeddable;

@Embeddable
public class Zipcode {

    String zip;
    String plusFour;

}
