package org.springframework.samples.petclinic.repository.org.springframework.samples.petclinic.repository.springdatajpa;

import org.springframework.data.repository.Repository;
import org.springframework.samples.petclinic.model.Visit;
import org.springframework.samples.petclinic.repository.VisitRepository;

/**
 * Spring Data JPA specialization of the {@link VisitRepository} interface
 *
 * @author Michael Isvy
 * @since 15.1.2013
 */
public interface SpringDataVisitRepository extends VisitRepository, Repository<Visit, Integer> {
}