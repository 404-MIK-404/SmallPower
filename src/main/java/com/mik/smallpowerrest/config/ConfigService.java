package com.mik.smallpowerrest.config;

import org.springframework.boot.context.properties.ConfigurationProperties;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;

@Configuration
public class ConfigService {

    @Bean
    public EntityManager entityManager(){
        EntityManagerFactory emf = Persistence.createEntityManagerFactory("com.mik.smallpowerrest");
        return emf.createEntityManager();
    }



}
