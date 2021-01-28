package cl.group.dispacher.controller;

import cl.group.dispacher.service.IAdmisionService;
import cl.group.dispacher.ws.admision.AdmisionTO;
import cl.group.dispacher.ws.admision.RespuestaAdmisionTO;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
@RequestMapping("${openapi.dispatcher.base-path:/}")
public class AdmisionAPIController implements AdmisionApi {

    @Autowired
	IAdmisionService service;

	@Override
	public ResponseEntity<RespuestaAdmisionTO> admitirEnvio(AdmisionTO direct) throws Exception {
		try
		{
			RespuestaAdmisionTO admision = service.admitirEnvio(direct);
			return new ResponseEntity<RespuestaAdmisionTO>(admision, HttpStatus.OK);
		}
		catch(Exception exception)
		{
			throw new Exception("Ocurrio un error intentar admitir envio.", exception);
		}
	}
}
