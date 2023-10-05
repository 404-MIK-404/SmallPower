package com.mik.smallpowerrest.controller;

import com.mik.smallpowerrest.service.ServiceFiles;
import lombok.AllArgsConstructor;
import org.springframework.http.MediaType;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@AllArgsConstructor
@RequestMapping(value = "/smallpower/file/v1/api",produces = MediaType.APPLICATION_JSON_VALUE)
public class ControllerFile {

    private final ServiceFiles serviceFiles;



}
