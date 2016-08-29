package org.springframework.samples.petclinic.model;

import javax.persistence.Entity;
import javax.persistence.Table;
import java.util.jar.Attributes;

/**
 * Created by U27688 on 8/25/2016.
 */
@Entity
@Table(name = "specialities")
public class Specialty extends NamedEntity {
}
