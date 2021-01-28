package cl.group.dispacher.controller;

import javax.validation.Valid;

import cl.group.dispacher.ws.regionComuna.ArrayOfComunaTO;
import cl.group.dispacher.ws.regionComuna.ArrayOfRegionTO;
import org.springframework.http.ResponseEntity;
import org.springframework.validation.annotation.Validated;
import org.springframework.web.bind.annotation.*;

import cl.group.dispacher.viewmodel.Request;
import cl.group.dispacher.viewmodel.Response;
import io.swagger.annotations.Api;
import io.swagger.annotations.ApiOperation;
import io.swagger.annotations.ApiParam;
import io.swagger.annotations.ApiResponse;
import io.swagger.annotations.ApiResponses;
@Validated
@Api(value = "regions", description = "Regiones y Comunas")
public interface RegionesAndComunasApi {

    @ApiOperation(value = "Entrega la lista de todas las regiones.", nickname = "consultarGet", notes = "", tags={ "regiones-and-comunas-api-controller", })
    @ApiResponses(value = { 
        @ApiResponse(code = 200, message = "válido"),
        @ApiResponse(code = 400, message = "Petición incorrecta"),
        @ApiResponse(code = 401, message = "Unauthorized"),
        @ApiResponse(code = 403, message = "Forbidden"),
        @ApiResponse(code = 404, message = "Not Found") })
    @RequestMapping(value = "/listarTodasLasRegiones",
        produces = { "application/json" }, 
        method = RequestMethod.GET)
     ResponseEntity<ArrayOfRegionTO> listarTodasLasRegiones() throws Exception;


    @ApiOperation(value = "Entrega la lista de todas las comunas.", nickname = "consultarGet", notes = "", tags={ "regiones-and-comunas-api-controller", })
    @ApiResponses(value = {
            @ApiResponse(code = 200, message = "válido"),
            @ApiResponse(code = 400, message = "Petición incorrecta"),
            @ApiResponse(code = 401, message = "Unauthorized"),
            @ApiResponse(code = 403, message = "Forbidden"),
            @ApiResponse(code = 404, message = "Not Found") })
    @RequestMapping(value = "/listarTodasLasComunas",
            produces = { "application/json" },
            method = RequestMethod.GET)
    ResponseEntity<ArrayOfComunaTO> listarTodasLasComunas() throws Exception;


    @ApiOperation(value = "Entrega la lista de todas las comunas segun region.", nickname = "consultarGet", notes = "", tags={ "regiones-and-comunas-api-controller", })
    @ApiResponses(value = {
            @ApiResponse(code = 200, message = "válido"),
            @ApiResponse(code = 400, message = "Petición incorrecta"),
            @ApiResponse(code = 401, message = "Unauthorized"),
            @ApiResponse(code = 403, message = "Forbidden"),
            @ApiResponse(code = 404, message = "Not Found") })
    @RequestMapping(value = "/listarComunasSegunRegion",
            produces = { "application/json" },
            method = RequestMethod.GET)
    ResponseEntity<ArrayOfComunaTO> listarComunasSegunRegion(@ApiParam(value = "" ,required=true )  @Valid @RequestBody String region)  throws Exception;
}
