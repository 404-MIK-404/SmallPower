package com.mik.smallpowerrest.controller;


import com.google.gson.Gson;
import com.google.gson.GsonBuilder;
import com.mik.smallpowerrest.service.ServiceTest;
import lombok.AllArgsConstructor;
import org.springframework.http.MediaType;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;


@RestController
@RequestMapping(value = "api/smallpower/v1",produces = MediaType.APPLICATION_JSON_VALUE)
@AllArgsConstructor
public class TestController {

    private final ServiceTest serviceTest;

    private final Gson gson = new GsonBuilder().setPrettyPrinting().create();

    @GetMapping(value = "/hello")
    public String testMethod(){
        return gson.toJson(serviceTest.t());
    }

}
