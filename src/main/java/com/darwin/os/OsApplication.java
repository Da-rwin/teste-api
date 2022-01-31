package com.darwin.os;

import java.util.Arrays;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import com.darwin.os.domain.Cliente;
import com.darwin.os.domain.OS;
import com.darwin.os.domain.Tecnico;
import com.darwin.os.domain.enums.Prioridade;
import com.darwin.os.domain.enums.Status;
import com.darwin.os.repositorys.ClienteRepository;
import com.darwin.os.repositorys.OSRepository;
import com.darwin.os.repositorys.TecnicoRepository;

@SpringBootApplication
public class OsApplication {

	public static void main(String[] args) {
		SpringApplication.run(OsApplication.class, args);
	}

}