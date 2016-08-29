package org.springframework.samples.petclinic.repository.jpa;

import org.springframework.dao.DataAccessException;

import org.springframework.samples.petclinic.model.Owner;
import org.springframework.samples.petclinic.repository.OwnerRepository;
import org.springframework.stereotype.Repository;

import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;
import javax.persistence.Query;
import java.util.Collection;

/**
 * Created by U27688 on 8/26/2016.
 */
@Repository
public class JpaOwnerRepositoryImpl implements OwnerRepository {

    @PersistenceContext
    private EntityManager entityManager;

    @Override
    public Collection<Owner> findByLastName(String lastName) throws DataAccessException {

        Query query = entityManager.createQuery("SELECT DISTINCT  owner from OWNER owner left join fetch owner.pets where owner.lastName like :lastName");
         query.setParameter("lastName",lastName +"%");
        return query.getResultList();

    }

    @Override
    public Owner findById(int id) throws DataAccessException {
       Query  query  = entityManager.createQuery("SELECT DISTINCT  owner  from OWNER owner left join fetch owner.pets where owner.id = :id");
        query.setParameter("id",id);
        return (Owner)query.getSingleResult();
    }

    @Override
    public void saveOwner(Owner owner) throws DataAccessException {

        if(owner.isNew())
            entityManager.persist(owner);
        else
            entityManager.merge(owner);
    }
}
