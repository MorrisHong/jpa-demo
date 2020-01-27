package ch07_advancedMapping.nonIdenfityRelationship;

import javax.persistence.*;

@Entity
public class Parent {

    @Id @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "parent_id")
    private Long id;

    private String name;
}
