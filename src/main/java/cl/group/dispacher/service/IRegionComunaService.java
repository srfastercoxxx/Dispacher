package cl.group.dispacher.service;

import cl.group.dispacher.ws.regionComuna.ArrayOfComunaTO;
import cl.group.dispacher.ws.regionComuna.ArrayOfRegionTO;
import cl.group.dispacher.ws.regionComuna.ListarTodasLasRegiones;
import cl.group.dispacher.ws.regionComuna.ListarTodasLasRegionesResponse;
import org.springframework.stereotype.Service;

public interface IRegionComunaService {

	ArrayOfRegionTO listarTodasLasRegiones() throws Exception;

	ArrayOfComunaTO listarTodasLasComunas() throws Exception;

	ArrayOfComunaTO listarComunasSegunRegion(String region) throws Exception;
}
