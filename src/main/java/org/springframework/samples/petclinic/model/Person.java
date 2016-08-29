package org.springframework.samples.petclinic.model;

import javax.persistence.Column;
import javax.persistence.MappedSuperclass;

/**
 * Created by U27688 on 8/25/2016.
 */
@MappedSuperclass
public class Person extends BaseEntity {

    @Column(name = "FIRST_NAME",nullable = false)
    private  String firstName;

    @Column(name = "LAST_NAME",nullable = false)
    private String lastName;

    public String getFirstName() {
        return firstName;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public String getLastName() {
        return lastName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }
}
