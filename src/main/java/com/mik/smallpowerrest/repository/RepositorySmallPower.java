package com.mik.smallpowerrest.repository;

import lombok.AllArgsConstructor;
import org.springframework.stereotype.Repository;

import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;
import javax.persistence.PersistenceContextType;
import java.util.List;
import java.util.stream.Collectors;


@Repository
public class RepositorySmallPower {


    @PersistenceContext(type = PersistenceContextType.EXTENDED)
    EntityManager entityManager;


    public <T> List<T> getListFromQuery(String query, Class<T> obj){
        return  entityManager.createQuery(query,obj).getResultList().stream()
                .peek(t -> entityManager.detach(t)).collect(Collectors.toList());
    }


    public <T> T getObjectFromQuery(String query, Class<T> obj){
        return (T) entityManager.createQuery(query,obj).getSingleResult();
    }


}
