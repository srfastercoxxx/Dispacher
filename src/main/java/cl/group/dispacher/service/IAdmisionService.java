package cl.group.dispacher.service;

import cl.group.dispacher.ws.admision.AdmisionTO;
import cl.group.dispacher.ws.admision.AdmitirEnvio;
import cl.group.dispacher.ws.admision.RespuestaAdmisionTO;

public interface IAdmisionService {

	RespuestaAdmisionTO admitirEnvio(AdmisionTO request) throws Exception;
}
