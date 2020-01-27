package ch07_advancedMapping.nonIdenfityRelationship;

import javax.persistence.*;

@Entity
public class Child {

    @Id @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "child_id")
    private Long id;

    @ManyToOne
    @JoinColumn(name = "parent_id")
    private Parent parent;
}
