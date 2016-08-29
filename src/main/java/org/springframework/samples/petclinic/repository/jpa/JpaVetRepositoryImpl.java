package org.springframework.samples.petclinic.repository.jpa;

import org.springframework.samples.petclinic.model.Vet;
import org.springframework.samples.petclinic.repository.VetRepository;

import javax.persistence.Cacheable;
import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;
import java.util.Collection;

/**
 * Created by U27688 on 8/26/2016.
 */
public class JpaVetRepositoryImpl implements VetRepository {

    @PersistenceContext
    private EntityManager em;

    @Cacheable(value = "vets")
    public Collection<Vet> findAll(){

    return this.em.createQuery("SELECT distinct vet FROM Vet vet left join fetch vet.specialties ORDER BY vet.lastName, vet.firstName").getResultList();
    }
}
