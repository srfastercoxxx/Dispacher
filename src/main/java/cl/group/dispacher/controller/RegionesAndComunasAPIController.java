package cl.group.dispacher.controller;

import cl.group.dispacher.service.IRegionComunaService;
import cl.group.dispacher.ws.regionComuna.ArrayOfComunaTO;
import cl.group.dispacher.ws.regionComuna.ArrayOfRegionTO;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
@RequestMapping("${openapi.dispatcher.base-path:/}")
public class RegionesAndComunasAPIController implements RegionesAndComunasApi {

    @Autowired
    IRegionComunaService service;

	@Override
	public ResponseEntity<ArrayOfRegionTO> listarTodasLasRegiones() throws Exception {
		try
		{
			ArrayOfRegionTO regiones = service.listarTodasLasRegiones();
			return new ResponseEntity<ArrayOfRegionTO>(regiones, HttpStatus.OK);
		}
		catch(Exception exception)
		{
			throw new Exception("Ocurrio un error intentando obtener las regiones.", exception);
		}
	}

	@Override
	public ResponseEntity<ArrayOfComunaTO> listarTodasLasComunas() throws Exception {
		try
		{
			ArrayOfComunaTO comunas = service.listarTodasLasComunas();
			return new ResponseEntity<ArrayOfComunaTO>(comunas, HttpStatus.OK);
		}
		catch(Exception exception)
		{
			throw new Exception("Ocurrio un error intentando obtener las comunas.", exception);
		}
	}

	@Override
	public ResponseEntity<ArrayOfComunaTO> listarComunasSegunRegion(String region) throws Exception {
		try
		{
			ArrayOfComunaTO comunas = service.listarComunasSegunRegion(region);
			return new ResponseEntity<ArrayOfComunaTO>(comunas, HttpStatus.OK);
		}
		catch(Exception exception)
		{
			throw new Exception("Ocurrio un error intentando obtener las comunas.", exception);
		}
	}
}
