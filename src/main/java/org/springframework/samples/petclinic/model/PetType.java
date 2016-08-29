package org.springframework.samples.petclinic.model;

import javax.persistence.Entity;
import javax.persistence.Table;

/**
 * Created by U27688 on 8/25/2016.
 */
@Entity
@Table(name = "TYPES")
public class PetType extends NamedEntity {
}
