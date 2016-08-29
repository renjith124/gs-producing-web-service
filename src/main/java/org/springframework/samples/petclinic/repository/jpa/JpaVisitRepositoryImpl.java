package org.springframework.samples.petclinic.repository.jpa;

import org.springframework.samples.petclinic.model.Visit;
import org.springframework.samples.petclinic.repository.VisitRepository;

import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;
import javax.persistence.Query;
import java.util.List;

/**
 * Created by U27688 on 8/26/2016.
 */
public class JpaVisitRepositoryImpl implements VisitRepository {

    @PersistenceContext
    private EntityManager entityManager;

    public void save(Visit visit){
        if(visit.isNew())
            entityManager.persist(visit);
        else
            entityManager.merge(visit);


    }

    public List<Visit> findByPetId(Integer petId){

        Query query = this.entityManager.createQuery("SELECT v FROM Visit v where v.pet.id= :id");
        query.setParameter("id", petId);
        return query.getResultList();
    }
}
