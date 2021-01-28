package cl.group.dispacher.service.impl;

import cl.group.dispacher.service.INormalizacionService;
import cl.group.dispacher.service.IRegionComunaService;
import cl.group.dispacher.ws.normalizacion.DireccionNormalizadaTO;
import cl.group.dispacher.ws.normalizacion.NormalizarDireccion;
import cl.group.dispacher.ws.normalizacion.ServicioExternoNormalizacionSoap;
import cl.group.dispacher.ws.regionComuna.ArrayOfComunaTO;
import cl.group.dispacher.ws.regionComuna.ArrayOfRegionTO;
import cl.group.dispacher.ws.regionComuna.ServicioExternoRegionYComunas;
import cl.group.dispacher.ws.regionComuna.ServicioExternoRegionYComunasSoap;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Service;

@Service
public class NormalizacionService implements INormalizacionService {

	private static final Logger log = LoggerFactory.getLogger(ServicioExternoRegionYComunas.class);	
	
	@Autowired
	ServicioExternoNormalizacionSoap service;

	@Value("${ws.user}")
	private String user;

	@Value("${ws.pass}")
	private String pass;
	
	public DireccionNormalizadaTO normalizarDireccion(NormalizarDireccion request) throws Exception {
		DireccionNormalizadaTO response = service.normalizarDireccion(user, pass, "0", request.getDireccion(), request.getComuna());
		return response;
	}

}
