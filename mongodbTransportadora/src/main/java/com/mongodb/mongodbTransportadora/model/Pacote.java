package com.mongodb.mongodbTransportadora.model;

import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;

@Document(collection = "pacotes")
public class Pacote {

    @Id
    private Integer id;
    private String codigo;
    private String nome;
    private Status status;
    private Destino destino;

    //constructor
    //
    //

    public Pacote() {

    }

    public Integer getId(){
        return id;
    }
}
