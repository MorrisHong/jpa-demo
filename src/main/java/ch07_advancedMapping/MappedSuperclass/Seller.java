package ch07_advancedMapping.MappedSuperclass;

import ch07_advancedMapping.MappedSuperclass.BaseEntity;

import javax.persistence.Entity;

@Entity
public class Seller extends BaseEntity {

    private String shopName;
}
