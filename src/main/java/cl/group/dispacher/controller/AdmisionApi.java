package cl.group.dispacher.controller;

import cl.group.dispacher.ws.admision.AdmisionTO;
import cl.group.dispacher.ws.admision.RespuestaAdmisionTO;
import io.swagger.annotations.*;
import org.springframework.http.ResponseEntity;
import org.springframework.validation.annotation.Validated;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import javax.validation.Valid;

@Validated
@Api(value = "admision", description = "Admitir envios")
public interface AdmisionApi {


    @ApiOperation(value = "Permite registrar una solicitud de envío de paquetería.", nickname = "consultarGet", notes = "", tags={ "admision-api-controller", })
    @ApiResponses(value = {
            @ApiResponse(code = 200, message = "válido"),
            @ApiResponse(code = 400, message = "Petición incorrecta"),
            @ApiResponse(code = 401, message = "Unauthorized"),
            @ApiResponse(code = 403, message = "Forbidden"),
            @ApiResponse(code = 404, message = "Not Found") })
    @RequestMapping(value = "/admitirEnvio",
            produces = { "application/json" },
            method = RequestMethod.POST)
    ResponseEntity<RespuestaAdmisionTO> admitirEnvio(@ApiParam(value = "", required = true) @Valid @RequestBody AdmisionTO admision)  throws Exception;
}
