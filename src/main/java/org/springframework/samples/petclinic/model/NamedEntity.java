package org.springframework.samples.petclinic.model;

import javax.persistence.Column;
import javax.persistence.MappedSuperclass;

/**
 * Created by U27688 on 8/25/2016.
 */
@MappedSuperclass
public class NamedEntity extends BaseEntity{

    @Column(name = "NAME",nullable = false)
    private  String name;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    @Override
    public String toString() {
     return  name.toString();
    }
}
