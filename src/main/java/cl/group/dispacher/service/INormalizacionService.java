package cl.group.dispacher.service;

import cl.group.dispacher.ws.normalizacion.DireccionNormalizadaTO;
import cl.group.dispacher.ws.normalizacion.NormalizarDireccion;

public interface INormalizacionService {

	DireccionNormalizadaTO normalizarDireccion(NormalizarDireccion request) throws Exception;

}
