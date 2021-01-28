package cl.group.dispacher.service.impl;

import cl.group.dispacher.ws.regionComuna.*;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;

import cl.group.dispacher.service.IRegionComunaService;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Service;

@Service
public class RegionComunaService implements IRegionComunaService {

	private static final Logger log = LoggerFactory.getLogger(ServicioExternoRegionYComunas.class);	
	
	@Autowired
	ServicioExternoRegionYComunasSoap service;

	@Value("${ws.user}")
	private String user;

	@Value("${ws.pass}")
	private String pass;
	
	public ArrayOfRegionTO listarTodasLasRegiones() throws Exception {
		ArrayOfRegionTO response = service.listarTodasLasRegiones(user, pass);
		return response;
	}

	public ArrayOfComunaTO listarTodasLasComunas() throws Exception {
		ArrayOfComunaTO response = service.listarTodasLasComunas(user, pass);
		return response;
	}

	public ArrayOfComunaTO listarComunasSegunRegion(String region) throws Exception {
		ArrayOfComunaTO response = service.listarComunasSegunRegion(user, pass, region);
		return response;
	}
}
