package cl.group.dispacher.service;

import cl.group.dispacher.ws.tarifacion.*;

import java.util.List;

public interface ITarifacionService {

	List<ServicioTO> consultaCobertura(CoberturaTO cobertura) throws Exception;
	//ArrayOfServicioTO consultaCobertura(CoberturaTO cobertura) throws Exception;

	ServicioTO consultaCoberturaPorProducto(CoberturaProductoTO cobertura) throws Exception;

	ArrayOfProductoTO consultaProductosPorCliente() throws Exception;
}
