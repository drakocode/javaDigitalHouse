package com.grupo.clinica.odontologica.model;

import javax.persistence.*;
import java.util.Date;

@Entity
@Table(name = "tb_consulta")
public class Consulta {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @ManyToOne(fetch = FetchType.LAZY)
    @JoinColumn(name="paciente_id", referencedColumnName = "id")
    private Paciente paciente;

    @ManyToOne(fetch = FetchType.LAZY)
    @JoinColumn(name="dentista_id", referencedColumnName = "id")
    private Dentista dentista;

    @Temporal(TemporalType.TIMESTAMP)
    private Date dataConsulta = new Date(System.currentTimeMillis());

    //constructor
    //
    //
    public Consulta(Paciente paciente, Dentista dentista, Date date) {
    }

    public Consulta(Paciente paciente, Dentista dentista) {
        this.paciente = paciente;
        this.dentista = dentista;
    }

    public Consulta(Long id, Paciente paciente, Dentista dentista) {
        this.id = id;
        this.paciente = paciente;
        this.dentista = dentista;
    }

    //getters setters
    //
    //
    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public Paciente getPaciente() {
        return paciente;
    }

    public void setPaciente(Paciente paciente) {
        this.paciente = paciente;
    }

    public Dentista getDentista() {
        return dentista;
    }

    public void setDentista(Dentista dentista) {
        this.dentista = dentista;
    }

    public Date getDataConsulta() {
        return dataConsulta;
    }

    public void setDataConsulta(Date dataConsulta) {
        this.dataConsulta = dataConsulta;
    }
}
