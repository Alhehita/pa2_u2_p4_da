package com.example.demo;

import java.math.BigDecimal;
import java.time.LocalDateTime;
import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import com.example.demo.repository.modelo.CuentaBancaria;
import com.example.demo.repository.modelo.Propietario;
import com.example.demo.repository.modelo.Transferencia;
import com.example.demo.service.CuentaBancariaService;
import com.example.demo.service.PropietarioService;
import com.example.demo.service.TransferenciaService;

@SpringBootApplication
public class Pa2U2P4DaApplication implements CommandLineRunner {

	@Autowired
	private CuentaBancariaService cuentaBancariaService;
	
	@Autowired
	private TransferenciaService transferenciaService;
	
	@Autowired
	private PropietarioService propietarioService;

	public static void main(String[] args) {
		SpringApplication.run(Pa2U2P4DaApplication.class, args);
	}

	@Override
	public void run(String... args) throws Exception {
		// TODO Auto-generated method stub

		CuentaBancaria bancaria = new CuentaBancaria();

		CuentaBancaria bancaria2 = new CuentaBancaria();

		Propietario propietario = new Propietario();
		
		Transferencia transferencia = new Transferencia();
		
		propietario.setApellido("Andrade");
		propietario.setCedula("1234567890");
		propietario.setNombre("Dennisse");
		
		bancaria.setIdPropietario("67890");
		bancaria.setNumero("123456");
		bancaria.setPropietario(propietario);
		bancaria.setSaldo(new BigDecimal(20));
		bancaria.setTipo("Ahorros");
		
		bancaria2.setIdPropietario("674490");
		bancaria2.setNumero("123336");
		bancaria2.setPropietario(propietario);
		bancaria2.setSaldo(new BigDecimal(25));
		bancaria2.setTipo("Ahorros");

		List<CuentaBancaria> bancarias = new ArrayList<>();
		bancarias.add(bancaria);
		bancarias.add(bancaria2);
		
		propietario.setCuentasBancarias(bancarias);

		
		
		
		this.propietarioService.guardar(propietario);

		this.cuentaBancariaService.crear(bancaria);
		this.cuentaBancariaService.crear(bancaria2);
		
		this.transferenciaService.realizar("123336", "123456", new BigDecimal(5));
		
		

	}
}
