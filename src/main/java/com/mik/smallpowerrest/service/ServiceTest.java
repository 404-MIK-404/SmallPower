package com.mik.smallpowerrest.service;

import com.google.gson.Gson;
import com.google.gson.GsonBuilder;
import com.mik.smallpowerrest.domain.TEST_SPR;
import com.mik.smallpowerrest.model.Security;
import com.mik.smallpowerrest.repository.RepositorySmallPower;
import lombok.AllArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
@AllArgsConstructor
public class ServiceTest {

    private final RepositorySmallPower repositorySmallPower;

    private final Gson gson = new Gson();

    public String t(){
        return gson.toJson(repositorySmallPower.getListFromQuery(
                "SELECT sprTest from test_spr as sprTest", TEST_SPR.class));
    }

}
