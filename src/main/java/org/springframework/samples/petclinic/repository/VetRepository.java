package org.springframework.samples.petclinic.repository;

import org.springframework.dao.DataAccessException;
import org.springframework.samples.petclinic.model.Vet;

import java.util.Collection;

/**
 * Created by U27688 on 8/25/2016.
 */
public interface VetRepository {

public Collection<Vet> findAll() throws DataAccessException;
}
