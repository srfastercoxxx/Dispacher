package cl.group.dispacher.service.impl;

import cl.group.dispacher.service.IAdmisionService;
import cl.group.dispacher.ws.admision.AdmisionTO;
import cl.group.dispacher.ws.admision.RespuestaAdmisionTO;
import cl.group.dispacher.ws.admision.ServicioExternoAdmisionCEPSoap;
import cl.group.dispacher.ws.regionComuna.ServicioExternoRegionYComunas;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Service;

@Service
public class AdmisionService implements IAdmisionService {

	private static final Logger log = LoggerFactory.getLogger(ServicioExternoRegionYComunas.class);	
	
	@Autowired
	ServicioExternoAdmisionCEPSoap service;

	@Value("${ws.user}")
	private String user;

	@Value("${ws.pass}")
	private String pass;
	
	public RespuestaAdmisionTO admitirEnvio(AdmisionTO request) throws Exception {
		RespuestaAdmisionTO response = service.admitirEnvio(user, pass, request);
		return response;
	}

}
