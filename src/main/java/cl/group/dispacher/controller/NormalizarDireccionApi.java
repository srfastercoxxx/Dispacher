package cl.group.dispacher.controller;

import cl.group.dispacher.ws.normalizacion.DireccionNormalizadaTO;
import cl.group.dispacher.ws.normalizacion.NormalizarDireccion;
import cl.group.dispacher.ws.regionComuna.ArrayOfComunaTO;
import cl.group.dispacher.ws.regionComuna.ArrayOfRegionTO;
import io.swagger.annotations.*;
import org.springframework.http.ResponseEntity;
import org.springframework.validation.annotation.Validated;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import javax.validation.Valid;

@Validated
@Api(value = "normalizar direccion", description = "Normalizar Dirección")
public interface NormalizarDireccionApi {


    @ApiOperation(value = "Entrega una dirección verificada con su respectivo código postal.", nickname = "consultarGet", notes = "", tags={ "normalizar-direccion-api-controller", })
    @ApiResponses(value = {
            @ApiResponse(code = 200, message = "válido"),
            @ApiResponse(code = 400, message = "Petición incorrecta"),
            @ApiResponse(code = 401, message = "Unauthorized"),
            @ApiResponse(code = 403, message = "Forbidden"),
            @ApiResponse(code = 404, message = "Not Found") })
    @RequestMapping(value = "/normalizarDireccion",
            produces = { "application/json" },
            method = RequestMethod.POST)
    ResponseEntity<DireccionNormalizadaTO> normalizarDireccion(@ApiParam(value = "", required = true) @Valid @RequestBody NormalizarDireccion direccion)  throws Exception;
}
