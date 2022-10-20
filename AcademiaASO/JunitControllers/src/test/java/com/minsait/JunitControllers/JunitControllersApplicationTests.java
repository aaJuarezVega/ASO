package com.minsait.JunitControllers;

import com.minsait.JunitControllers.models.Banco;
import com.minsait.JunitControllers.models.Cuenta;
import com.minsait.JunitControllers.repositories.BancoRepository;
import com.minsait.JunitControllers.repositories.CuentaRepository;
import com.minsait.JunitControllers.services.CuentaServiceImpl;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.extension.ExtendWith;
import org.mockito.InjectMocks;
import org.mockito.Mock;
import org.mockito.Mockito;
import org.mockito.junit.jupiter.MockitoExtension;

import java.util.Optional;
//import org.springframework.boot.test.context.SpringBootTest;

//@SpringBootTest

@ExtendWith(MockitoExtension.class)
class JunitControllersApplicationTests {

	@Mock
	CuentaRepository cuentaRepository;
	@Mock
	BancoRepository bancoRepository;

	@InjectMocks
	CuentaServiceImpl service;


	@Test
	void findById_Test(){
		//Mockito.when(cuentaRepository.findAll()).thenReturn(Datos.CUENTAS);
		Mockito.when(cuentaRepository.findById(Mockito.anyLong())).thenReturn(Datos.CUENTAS.get(0));
		Optional<Cuenta> cuenta = service.findById(3L);

		//Mockito.verify(cuentaRepository).findAll();
		Mockito.verify(cuentaRepository).findById(3L);
	}

	@Test
	void revisarTotalTransferencias_Test() {
		Mockito.when(bancoRepository.findById(Mockito.anyLong())).thenReturn(Datos.BANCOS.get(0));
		Banco banco = service.getBancoRepository().findById(3L);

		Mockito.verify(bancoRepository).findById(3L);
		System.out.println(banco.getTotalTransferencia());
	}

	@Test
	void revisarSaldo_Test() {
		Mockito.when(cuentaRepository.findById(Mockito.anyLong())).thenReturn(Datos.CUENTAS.get(1));
		Cuenta cuenta = service.getCuentaRepository().findById(1L);

		Mockito.verify(cuentaRepository).findById(1L);
		System.out.println("cuenta.getSaldo() = " + cuenta.getSaldo());
	}

	@Test
	void name() {
	}

	@Test
	void contextLoads() {

	}

}
