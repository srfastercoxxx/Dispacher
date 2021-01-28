package cl.group.dispacher.service.impl;

import cl.group.dispacher.service.ITarifacionService;
import cl.group.dispacher.ws.regionComuna.ServicioExternoRegionYComunas;
import cl.group.dispacher.ws.tarifacion.*;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class TarifacionService implements ITarifacionService {

	private static final Logger log = LoggerFactory.getLogger(ServicioExternoRegionYComunas.class);	


	@Autowired
	ExternoTarificacionSoap service;

	@Value("${ws.user}")
	private String user;

	@Value("${ws.pass}")
	private String pass;
	
	public List<ServicioTO> consultaCobertura(CoberturaTO request) throws Exception {
		ArrayOfServicioTO response = service.consultaCobertura(user, pass,  request);
		return response.getServicioTO();
	}

	public ServicioTO consultaCoberturaPorProducto(CoberturaProductoTO request) throws Exception {
		ServicioTO servicio = service.consultaCoberturaPorProducto(user, pass,  request);
		return servicio;
	}

	public ArrayOfProductoTO consultaProductosPorCliente() throws Exception {
		ArrayOfProductoTO productos = service.consultaProductosPorCliente(user, pass);
		return productos;
	}
}
