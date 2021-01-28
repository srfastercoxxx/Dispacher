
package cl.group.dispacher.ws.admision;

import javax.xml.bind.annotation.XmlRegistry;


/**
 * This object contains factory methods for each 
 * Java content interface and Java element interface 
 * generated in the cl.group.dispacher.ws.admision package. 
 * <p>An ObjectFactory allows you to programatically 
 * construct new instances of the Java representation 
 * for XML content. The Java representation of XML 
 * content can consist of schema derived interfaces 
 * and classes representing the binding of schema 
 * type definitions, element declarations and model 
 * groups.  Factory methods for each of these are 
 * provided in this class.
 * 
 */
@XmlRegistry
public class ObjectFactory {


    /**
     * Create a new ObjectFactory that can be used to create new instances of schema derived classes for package: cl.group.dispacher.ws.admision
     * 
     */
    public ObjectFactory() {
    }

    /**
     * Create an instance of {@link AdmitirEnvioResponse }
     * 
     */
    public AdmitirEnvioResponse createAdmitirEnvioResponse() {
        return new AdmitirEnvioResponse();
    }

    /**
     * Create an instance of {@link RespuestaAdmisionTO }
     * 
     */
    public RespuestaAdmisionTO createRespuestaAdmisionTO() {
        return new RespuestaAdmisionTO();
    }

    /**
     * Create an instance of {@link AdmitirEnvio }
     * 
     */
    public AdmitirEnvio createAdmitirEnvio() {
        return new AdmitirEnvio();
    }

    /**
     * Create an instance of {@link AdmisionTO }
     * 
     */
    public AdmisionTO createAdmisionTO() {
        return new AdmisionTO();
    }

    /**
     * Create an instance of {@link ExtensionDataObject }
     * 
     */
    public ExtensionDataObject createExtensionDataObject() {
        return new ExtensionDataObject();
    }

}
