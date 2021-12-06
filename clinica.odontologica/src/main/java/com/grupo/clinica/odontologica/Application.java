package com.grupo.clinica.odontologica;

import com.grupo.clinica.odontologica.model.Dentista;
import com.grupo.clinica.odontologica.model.Endereco;
import com.grupo.clinica.odontologica.model.Paciente;
import com.grupo.clinica.odontologica.service.ConsultaService;
import com.grupo.clinica.odontologica.service.DentistaService;
import com.grupo.clinica.odontologica.service.PacienteService;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import java.util.Date;

@SpringBootApplication
public class Application {

	public static void main(String[] args) {
		SpringApplication.run(Application.class, args);

		ConsultaService consultaService=new ConsultaService();
		PacienteService pacienteService = new PacienteService();
		DentistaService dentistaService = new DentistaService();


		Endereco endereco = new Endereco("Av Santa fe", "444", "São Paulo", "São Paulo");
		Paciente p = pacienteService.cadastrar(new Paciente("Vicente", "Santos", "88888888", new Date(), endereco));
		Dentista d = dentistaService.cadastrar(new Dentista("dentista","d",1));

		Endereco endereco1 = new Endereco("Av das Margaridas", "333", "Belo Horizonte", "Minas Gerais");
		Paciente p1 = pacienteService.cadastrar(new Paciente("Marcela", "Moura", "99999999", new Date(), endereco1));
		Dentista d1 = dentistaService.cadastrar(new Dentista("dentista1","d1",2));

	}

}
