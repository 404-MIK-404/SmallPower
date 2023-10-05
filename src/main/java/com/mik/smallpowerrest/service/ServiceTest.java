package com.mik.smallpowerrest.service;

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

    public List<TEST_SPR> t(){
        return repositorySmallPower.getListFromQuery("SELECT sprTest from test_spr as sprTest", TEST_SPR.class);
    }

}
