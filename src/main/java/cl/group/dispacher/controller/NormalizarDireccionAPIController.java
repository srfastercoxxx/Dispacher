package cl.group.dispacher.controller;

import cl.group.dispacher.service.INormalizacionService;
import cl.group.dispacher.service.IRegionComunaService;
import cl.group.dispacher.ws.normalizacion.DireccionNormalizadaTO;
import cl.group.dispacher.ws.normalizacion.NormalizarDireccion;
import cl.group.dispacher.ws.regionComuna.ArrayOfComunaTO;
import cl.group.dispacher.ws.regionComuna.ArrayOfRegionTO;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
@RequestMapping("${openapi.dispatcher.base-path:/}")
public class NormalizarDireccionAPIController implements NormalizarDireccionApi {

    @Autowired
	INormalizacionService service;

	@Override
	public ResponseEntity<DireccionNormalizadaTO> normalizarDireccion(NormalizarDireccion direct) throws Exception {
		try
		{
			DireccionNormalizadaTO direccion = service.normalizarDireccion(direct);
			return new ResponseEntity<DireccionNormalizadaTO>(direccion, HttpStatus.OK);
		}
		catch(Exception exception)
		{
			throw new Exception("Ocurrio un error intentar normalizar la direccion.", exception);
		}
	}
}
