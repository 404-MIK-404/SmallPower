package com.mik.smallpowerrest.controller;

import com.mik.smallpowerrest.service.ServiceAuthorization;
import lombok.AllArgsConstructor;
import org.springframework.http.MediaType;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@AllArgsConstructor
@RequestMapping(value = "/smallpower/auth/v1/api",produces = MediaType.APPLICATION_JSON_VALUE)
public class ControllerAuthorization {

    private final ServiceAuthorization serviceAuthorization;

    @PostMapping(value = "/authorization")
    public String AuthorizationUser(){
        return null;
    }




}
