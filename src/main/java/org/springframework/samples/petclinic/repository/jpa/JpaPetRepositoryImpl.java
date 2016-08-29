package org.springframework.samples.petclinic.repository.jpa;

import org.springframework.dao.DataAccessException;
import org.springframework.samples.petclinic.model.Pet;
import org.springframework.samples.petclinic.model.PetType;
import org.springframework.samples.petclinic.repository.PetRepository;

import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;
import javax.persistence.Query;
import java.util.List;

/**
 * Created by U27688 on 8/26/2016.
 */
public class JpaPetRepositoryImpl implements PetRepository {
    @PersistenceContext
    private EntityManager  entityManager;

    @Override
    public List<PetType> findPetTyeps() throws DataAccessException {
        return this.entityManager.createQuery("SELECT ptype FROM PetType ptype ORDER BY ptype.name").getResultList();

    }

    @Override
    public Pet findById(int id) throws DataAccessException {

        return this.entityManager.find(Pet.class,id);
    }

    @Override
    public void save(Pet pet) throws DataAccessException {


         if(pet.isNew())
             entityManager.persist(pet);
        else
            entityManager.merge(pet);
    }
}
