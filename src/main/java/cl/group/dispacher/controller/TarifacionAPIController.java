package cl.group.dispacher.controller;

import cl.group.dispacher.service.ITarifacionService;
import cl.group.dispacher.ws.tarifacion.*;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

import java.util.List;

@Controller
@RequestMapping("${openapi.dispatcher.base-path:/}")
public class TarifacionAPIController implements TarifacionApi {


	@Autowired
	ITarifacionService service;

	@Override
	public ResponseEntity<List<ServicioTO>> consultaCobertura(CoberturaTO coberturaRequest) throws Exception {
		try
		{
			List<ServicioTO> cobertura = service.consultaCobertura(coberturaRequest);
			return new ResponseEntity<List<ServicioTO>>(cobertura, HttpStatus.OK);
		}
		catch(Exception exception)
		{
			throw new Exception("Ocurrio un error intentar consultar cobertura.", exception);
		}
	}

	@Override
	public ResponseEntity<ServicioTO> consultaCoberturaPorProducto(CoberturaProductoTO coberturaRequest) throws Exception {
		try
		{
			ServicioTO cobertura = service.consultaCoberturaPorProducto(coberturaRequest);
			return new ResponseEntity<ServicioTO>(cobertura, HttpStatus.OK);
		}
		catch(Exception exception)
		{
			throw new Exception("Ocurrio un error intentar consultar cobertura por producto.", exception);
		}
	}


	@Override
	public ResponseEntity<ArrayOfProductoTO> consultaProductosPorCliente() throws Exception {
		try
		{
			ArrayOfProductoTO productos = service.consultaProductosPorCliente();
			return new ResponseEntity<ArrayOfProductoTO>(productos, HttpStatus.OK);
		}
		catch(Exception exception)
		{
			throw new Exception("Ocurrio un error intentando obtener las regiones.", exception);
		}
	}
}
