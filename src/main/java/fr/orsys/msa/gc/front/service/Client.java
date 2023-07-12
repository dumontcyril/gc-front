package fr.orsys.msa.gc.front.service;

import lombok.Data;

@Data
public class Client {

    private Integer id;
    private String lastname;
    private String firstname;
    private String address;
    private String zipCode;
    private String city;
}
