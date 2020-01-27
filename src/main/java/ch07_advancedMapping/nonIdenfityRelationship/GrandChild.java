package ch07_advancedMapping.nonIdenfityRelationship;

import javax.persistence.*;

public class GrandChild {
    @Id @GeneratedValue
    @Column(name = "grandchild_id")
    private Long id;

    private String name;

    @ManyToOne
    @JoinColumn(name = "child_id")
    private Child child;
}
