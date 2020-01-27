package ch09.non_use_value_object;

import javax.persistence.*;
import java.util.Date;

@Entity
public class Member {

    @Id @GeneratedValue
    @Column(name = "member_id")
    private Long id;

    private String name;
    private int age;

    @Temporal(TemporalType.TIMESTAMP)
    private Date startDate;

    @Temporal(TemporalType.TIMESTAMP)
    private Date endDate;

    private String city;
    private String street;
    private String zipcode;
}
