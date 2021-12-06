package com.escola.escola.model;

import javax.persistence.*;
import java.time.LocalDate;

@Entity
public class Publicacao {

    @Id
    @GeneratedValue(strategy = GenerationType.SEQUENCE)
    private Long id;

    private int versao;

    private String titulo;

    @Column(name = "data_publicacao")
    private LocalDate dataPublicacao;

    @ManyToOne(fetch = FetchType.LAZY)
    private Autor autor;


}
