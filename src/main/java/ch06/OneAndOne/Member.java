package ch06.OneAndOne;

import javax.persistence.*;

@Entity
public class Member {

    @Id @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "member_id")
    private Long id;

    private String username;

    @OneToOne
    @JoinColumn(name = "locker_id")
    private Locker locker;
}
