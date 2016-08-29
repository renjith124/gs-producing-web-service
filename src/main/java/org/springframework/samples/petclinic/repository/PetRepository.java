package org.springframework.samples.petclinic.repository;

import org.springframework.dao.DataAccessException;
import org.springframework.samples.petclinic.model.Pet;
import org.springframework.samples.petclinic.model.PetType;

import java.util.List;

/**
 * Created by U27688 on 8/25/2016.
 */
public interface PetRepository {

    public List<PetType>  findPetTyeps() throws DataAccessException;

    public Pet findById(int id)  throws  DataAccessException;

    public  void  save(Pet pet) throws DataAccessException;
}
