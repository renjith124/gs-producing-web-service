package org.springframework.samples.petclinic.repository.org.springframework.samples.petclinic.repository.springdatajpa;

import org.springframework.dao.DataAccessException;
import org.springframework.data.jpa.repository.Query;
import org.springframework.samples.petclinic.model.Pet;
import org.springframework.samples.petclinic.model.PetType;
import org.springframework.samples.petclinic.repository.PetRepository;
import org.springframework.stereotype.Repository;

import java.util.List;

/**
 * Created by U27688 on 8/26/2016.
 */
public interface SpringDataPetRepository extends PetRepository,Repository<Pet,Integer> {
    @Query("SELECT petType from PetType petType order by petType.name")
     public List<PetType> findPetTyep() throws DataAccessException
}
