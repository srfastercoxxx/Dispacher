package cl.group.dispacher.controller;

import cl.group.dispacher.ws.tarifacion.*;
import io.swagger.annotations.*;
import org.springframework.http.ResponseEntity;
import org.springframework.validation.annotation.Validated;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import javax.validation.Valid;
import java.util.List;

@Validated
@Api(value = "Tarifacion", description = "Consultar Coberturas")
public interface TarifacionApi {


    @ApiOperation(value = "Este método devuelve al cliente ecommerce la cobertura de los servicios que dispone en Correos Chile.", nickname = "consultarGet", notes = "", tags={ "tarifacion-api-controller", })
    @ApiResponses(value = {
            @ApiResponse(code = 200, message = "válido"),
            @ApiResponse(code = 400, message = "Petición incorrecta"),
            @ApiResponse(code = 401, message = "Unauthorized"),
            @ApiResponse(code = 403, message = "Forbidden"),
            @ApiResponse(code = 404, message = "Not Found") })
    @RequestMapping(value = "/consultaCobertura",
            produces = { "application/json" },
            method = RequestMethod.POST)
    ResponseEntity<List<ServicioTO>> consultaCobertura(@ApiParam(value = "", required = true) @Valid @RequestBody CoberturaTO cobertura)  throws Exception;


    @ApiOperation(value = "Este método devuelve al cliente ecommerce la cobertura de un servicio específico que dispone en Correos Chile.", nickname = "consultarGet", notes = "", tags={ "tarifacion-api-controller", })
    @ApiResponses(value = {
            @ApiResponse(code = 200, message = "válido"),
            @ApiResponse(code = 400, message = "Petición incorrecta"),
            @ApiResponse(code = 401, message = "Unauthorized"),
            @ApiResponse(code = 403, message = "Forbidden"),
            @ApiResponse(code = 404, message = "Not Found") })
    @RequestMapping(value = "/consultaCoberturaPorProducto",
            produces = { "application/json" },
            method = RequestMethod.POST)
    ResponseEntity<ServicioTO> consultaCoberturaPorProducto(@ApiParam(value = "", required = true) @Valid @RequestBody CoberturaProductoTO cobertura)  throws Exception;


    @ApiOperation(value = "Este método devuelve al cliente ecommerce los productos existentes en Correos Chile.", nickname = "consultarGet", notes = "", tags={ "tarifacion-api-controller", })
    @ApiResponses(value = {
            @ApiResponse(code = 200, message = "válido"),
            @ApiResponse(code = 400, message = "Petición incorrecta"),
            @ApiResponse(code = 401, message = "Unauthorized"),
            @ApiResponse(code = 403, message = "Forbidden"),
            @ApiResponse(code = 404, message = "Not Found") })
    @RequestMapping(value = "/consultaProductosPorCliente",
            produces = { "application/json" },
            method = RequestMethod.POST)
    ResponseEntity<ArrayOfProductoTO> consultaProductosPorCliente() throws Exception;
}
