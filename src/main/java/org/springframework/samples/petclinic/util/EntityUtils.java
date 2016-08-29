package org.springframework.samples.petclinic.util;

import org.springframework.orm.ObjectRetrievalFailureException;
import org.springframework.samples.petclinic.model.BaseEntity;

import java.util.Collection;

/**
 * Created by U27688 on 8/26/2016.
 */
public abstract   class EntityUtils {

    public static <T extends BaseEntity>  T getByid(Collection<T> entities,Class<T> entityClass, int id) throws ObjectRetrievalFailureException{

   for(T t:entities){

           if(t.getId() == id && entityClass.isInstance(t)){

               return t;
                 }
            }
            throw new ObjectRetrievalFailureException(entityClass,id);
    }
}
