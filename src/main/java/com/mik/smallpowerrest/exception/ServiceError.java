package com.mik.smallpowerrest.exception;

import lombok.*;

import java.util.Date;

@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
public class ServiceError {

    private int statusCode;
    private String message;
    private Date timeStamp;

}
