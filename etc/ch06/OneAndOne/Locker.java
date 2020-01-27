package ch06.OneAndOne;

import javax.persistence.*;

@Entity
public class Locker {

    @Id @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "locker_id")
    private Long id;

    private String name;
}
