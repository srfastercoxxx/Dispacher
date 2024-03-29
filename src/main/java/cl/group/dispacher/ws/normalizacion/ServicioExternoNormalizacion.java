
package cl.group.dispacher.ws.normalizacion;

import java.net.MalformedURLException;
import java.net.URL;
import javax.xml.namespace.QName;
import javax.xml.ws.Service;
import javax.xml.ws.WebEndpoint;
import javax.xml.ws.WebServiceClient;
import javax.xml.ws.WebServiceException;
import javax.xml.ws.WebServiceFeature;


/**
 * This class was generated by the JAX-WS RI.
 * JAX-WS RI 2.2.9-b130926.1035
 * Generated source version: 2.2
 * 
 */
@WebServiceClient(name = "ServicioExternoNormalizacion", targetNamespace = "http://tempuri.org/", wsdlLocation = "http://b2b.correos.cl/ServicioNormalizacionExterno/cch/ws/distribucionGeografica/externo/implementacion/ServicioExternoNormalizacion.asmx?WSDL")
public class ServicioExternoNormalizacion
    extends Service
{

    private final static URL SERVICIOEXTERNONORMALIZACION_WSDL_LOCATION;
    private final static WebServiceException SERVICIOEXTERNONORMALIZACION_EXCEPTION;
    private final static QName SERVICIOEXTERNONORMALIZACION_QNAME = new QName("http://tempuri.org/", "ServicioExternoNormalizacion");

    static {
        URL url = null;
        WebServiceException e = null;
        try {
            //url = new URL("http://apicert.correos.cl:8008/ServicioNormalizacionExterno/cch/ws/distribucionGeografica/externo/implementacion/ServicioExternoNormalizacion.asmx?WSDL");
            url = new URL("http://b2b.correos.cl/ServicioNormalizacionExterno/cch/ws/distribucionGeografica/externo/implementacion/ServicioExternoNormalizacion.asmx?WSDL");
        } catch (MalformedURLException ex) {
            e = new WebServiceException(ex);
        }
        SERVICIOEXTERNONORMALIZACION_WSDL_LOCATION = url;
        SERVICIOEXTERNONORMALIZACION_EXCEPTION = e;
    }

    public ServicioExternoNormalizacion() {
        super(__getWsdlLocation(), SERVICIOEXTERNONORMALIZACION_QNAME);
    }

    public ServicioExternoNormalizacion(WebServiceFeature... features) {
        super(__getWsdlLocation(), SERVICIOEXTERNONORMALIZACION_QNAME, features);
    }

    public ServicioExternoNormalizacion(URL wsdlLocation) {
        super(wsdlLocation, SERVICIOEXTERNONORMALIZACION_QNAME);
    }

    public ServicioExternoNormalizacion(URL wsdlLocation, WebServiceFeature... features) {
        super(wsdlLocation, SERVICIOEXTERNONORMALIZACION_QNAME, features);
    }

    public ServicioExternoNormalizacion(URL wsdlLocation, QName serviceName) {
        super(wsdlLocation, serviceName);
    }

    public ServicioExternoNormalizacion(URL wsdlLocation, QName serviceName, WebServiceFeature... features) {
        super(wsdlLocation, serviceName, features);
    }

    /**
     * 
     * @return
     *     returns ServicioExternoNormalizacionSoap
     */
    @WebEndpoint(name = "ServicioExternoNormalizacionSoap")
    public ServicioExternoNormalizacionSoap getServicioExternoNormalizacionSoap() {
        return super.getPort(new QName("http://tempuri.org/", "ServicioExternoNormalizacionSoap"), ServicioExternoNormalizacionSoap.class);
    }

    /**
     * 
     * @param features
     *     A list of {@link javax.xml.ws.WebServiceFeature} to configure on the proxy.  Supported features not in the <code>features</code> parameter will have their default values.
     * @return
     *     returns ServicioExternoNormalizacionSoap
     */
    @WebEndpoint(name = "ServicioExternoNormalizacionSoap")
    public ServicioExternoNormalizacionSoap getServicioExternoNormalizacionSoap(WebServiceFeature... features) {
        return super.getPort(new QName("http://tempuri.org/", "ServicioExternoNormalizacionSoap"), ServicioExternoNormalizacionSoap.class, features);
    }

    private static URL __getWsdlLocation() {
        if (SERVICIOEXTERNONORMALIZACION_EXCEPTION!= null) {
            throw SERVICIOEXTERNONORMALIZACION_EXCEPTION;
        }
        return SERVICIOEXTERNONORMALIZACION_WSDL_LOCATION;
    }

}
