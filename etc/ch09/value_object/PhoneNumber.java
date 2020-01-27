package ch09.value_object;

import javax.persistence.Embeddable;
import javax.persistence.ManyToOne;

@Embeddable
public class PhoneNumber {
    private String areaCode;
    private String localNumber;
    @ManyToOne
    PhoneServiceProvider provider;
}
