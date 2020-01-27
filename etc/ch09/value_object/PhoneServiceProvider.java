package ch09.value_object;

import javax.persistence.Entity;
import javax.persistence.Id;

@Entity
public class PhoneServiceProvider {
    @Id
    private String name;
}
