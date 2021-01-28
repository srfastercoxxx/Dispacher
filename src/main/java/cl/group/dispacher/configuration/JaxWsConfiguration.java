package cl.group.dispacher.configuration;

import java.net.MalformedURLException;
import java.net.URL;

import javax.xml.rpc.ServiceException;


import org.springframework.beans.factory.annotation.Value;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import cl.group.dispacher.ws.admision.ServicioExternoAdmisionCEP;
import cl.group.dispacher.ws.admision.ServicioExternoAdmisionCEPSoap;
import cl.group.dispacher.ws.normalizacion.ServicioExternoNormalizacion;
import cl.group.dispacher.ws.normalizacion.ServicioExternoNormalizacionSoap;
import cl.group.dispacher.ws.tarifacion.ExternoTarificacion;
import cl.group.dispacher.ws.tarifacion.ExternoTarificacionSoap;
import cl.group.dispacher.ws.regionComuna.ServicioExternoRegionYComunas;
import cl.group.dispacher.ws.regionComuna.ServicioExternoRegionYComunasSoap;

@Configuration
public class JaxWsConfiguration {


	@Value("${ws.regioncomuna.url}")
	private String url;

	@Value("${ws.normalizacion.url}")
	private String urlNormalizacion;

	@Value("${ws.tarifacion.url}")
	private String urlTarifacion;

	@Value("${ws.admision.url}")
	private String urlAdmision;

	@Bean
	public ServicioExternoRegionYComunasSoap beanServicioExternoRegionYComunas() throws MalformedURLException, ServiceException {
		return new ServicioExternoRegionYComunas(new URL(url)).getServicioExternoRegionYComunasSoap();		
	}

	@Bean
	public ServicioExternoNormalizacionSoap beanServicioExternoNormalizacion() throws MalformedURLException, ServiceException {
		return new ServicioExternoNormalizacion(new URL(urlNormalizacion)).getServicioExternoNormalizacionSoap();
	}

	@Bean
	public ExternoTarificacionSoap beanExternoTarificacion() throws MalformedURLException, ServiceException {
		return new ExternoTarificacion(new URL(urlTarifacion)).getExternoTarificacionSoap();
	}

	@Bean
	public ServicioExternoAdmisionCEPSoap beanServicioExternoAdmisionCEP() throws MalformedURLException, ServiceException {
		return new ServicioExternoAdmisionCEP(new URL(urlAdmision)).getServicioExternoAdmisionCEPSoap();
	}
}
