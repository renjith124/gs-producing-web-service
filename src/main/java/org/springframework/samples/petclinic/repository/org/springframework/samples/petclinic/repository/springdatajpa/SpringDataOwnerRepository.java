package org.springframework.samples.petclinic.repository.org.springframework.samples.petclinic.repository.springdatajpa;

import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;
import org.springframework.samples.petclinic.model.Owner;
import org.springframework.samples.petclinic.repository.OwnerRepository;
import org.springframework.stereotype.Repository;

import java.util.Collection;

/**
 * Created by U27688 on 8/26/2016.
 */
public interface SpringDataOwnerRepository extends OwnerRepository,Repository<Owner,Integer> {

    @Query("SELECT owner from Owner owner left join fetch owner.pets pets where owner.lastName like :lastName%")
    public Collection<Owner> findByLastname(@Param("lastName") String lastName);

    @Query("SELECT owner FROM Owner owner left join fetch owner.pets WHERE owner.id =:id")
    public Owner findById(@Param("id") int id);
}
