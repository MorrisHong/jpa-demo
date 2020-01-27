package ch09.value_object;

import javax.persistence.*;

@Entity
public class Member {

    @Id @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "member_id")
    private Long id;

    @Embedded
    private Period workPeriod;

    @Embedded
    private Address address;

    @Embedded
    @AttributeOverrides({
            @AttributeOverride(name="city", column = @Column(name="company_city")),
            @AttributeOverride(name="street", column = @Column(name = "company_street")),
            @AttributeOverride(name="zipcode", column = @Column(name = "company_zipcode"))
    })
    private Address workAddress;

    @Embedded
    private PhoneNumber phoneNumber;
}
