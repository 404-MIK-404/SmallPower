package com.mik.smallpowerrest.domain;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import org.hibernate.annotations.Proxy;

import javax.persistence.*;


@Entity(name = "test_spr")
@Proxy(lazy = false)
@Data
@AllArgsConstructor
@NoArgsConstructor
public class TEST_SPR {


    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id")
    private Long id;

    @Column(name = "name_test")
    private String nameTest;


}
