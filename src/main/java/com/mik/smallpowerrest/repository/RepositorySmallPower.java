package com.mik.smallpowerrest.repository;

import com.mik.smallpowerrest.exception.FailEntityManagerException;
import com.mik.smallpowerrest.exception.FailWorkAppException;
import lombok.AllArgsConstructor;
import org.hibernate.mapping.Collection;
import org.springframework.stereotype.Repository;

import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;
import javax.persistence.PersistenceContextType;
import java.util.*;
import java.util.stream.Collectors;


@Repository
@AllArgsConstructor
public class RepositorySmallPower {

    @PersistenceContext(type = PersistenceContextType.EXTENDED)
    EntityManager entityManager;


    public <T> List<T> getListFromQuery(String query, Class<T> obj){
        try {
            return entityManager.createQuery(query,obj).getResultList().stream()
                    .peek(t -> entityManager.detach(t)).collect(Collectors.toList());
        } catch (RuntimeException ex){
            FailWorkAppException.catchExceptionEntityManager(new FailEntityManagerException(ex.getMessage()));
            return Collections.emptyList();
        }
    }


    public <T> T getObjectFromQuery(String query, Class<T> obj){
        return (T) entityManager.createQuery(query,obj).getSingleResult();
    }


}
