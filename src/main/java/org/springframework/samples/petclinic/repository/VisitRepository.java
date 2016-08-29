package org.springframework.samples.petclinic.repository;

import org.springframework.dao.DataAccessException;
import org.springframework.samples.petclinic.model.Visit;

import java.util.List;

/**
 * Created by U27688 on 8/25/2016.
 */
public interface VisitRepository {

public  void  save(Visit b) throws DataAccessException;
public  List<Visit> findByPetId(Integer petId);

}

