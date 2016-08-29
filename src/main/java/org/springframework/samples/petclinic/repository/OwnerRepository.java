package org.springframework.samples.petclinic.repository;

import org.springframework.dao.DataAccessException;
import org.springframework.samples.petclinic.model.Owner;

import javax.xml.crypto.Data;
import java.util.Collection;

/**
 * Created by U27688 on 8/25/2016.
 */
public interface OwnerRepository {

    public  Collection<Owner> findByLastName(final String lastName) throws DataAccessException;

    public  Owner findById(int id) throws DataAccessException;

    public  void  saveOwner(Owner owner)  throws DataAccessException;

}
