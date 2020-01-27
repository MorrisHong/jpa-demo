package ch07_advancedMapping.MappedSuperclass;

import javax.persistence.Entity;

@Entity
public class Member extends BaseEntity {

    private String email;
}
