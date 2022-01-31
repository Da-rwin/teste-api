package com.darwin.os.services;

import java.util.Arrays;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.darwin.os.domain.Cliente;
import com.darwin.os.domain.OS;
import com.darwin.os.domain.Tecnico;
import com.darwin.os.domain.enums.Prioridade;
import com.darwin.os.domain.enums.Status;
import com.darwin.os.repositorys.ClienteRepository;
import com.darwin.os.repositorys.OSRepository;
import com.darwin.os.repositorys.TecnicoRepository;

@Service
public class DBService {
	@Autowired
	private TecnicoRepository tecnicoRepository;
	@Autowired
	private ClienteRepository clienteRepository;
	@Autowired
	private OSRepository osRepository;

	public void instanciaDB() {
		Tecnico t1 = new Tecnico(null, "Darwin", "729.900.010-50", "(88) 98888-8888");
		Tecnico t2 = new Tecnico(null, "Jhon", "764.921.900-33", "(88) 98888-9999");
		Cliente c1 = new Cliente(null, "Doky", "055.107.190-79", "(88) 98888-7777");
		OS os1 = new OS(null, Prioridade.ALTA, "Teste create OS", Status.ANDAMENTO, t1, c1);

		t1.getList().add(os1);
		c1.getList().add(os1);

		tecnicoRepository.saveAll(Arrays.asList(t1, t2));
		clienteRepository.saveAll(Arrays.asList(c1));
		osRepository.saveAll(Arrays.asList(os1));
	}

}