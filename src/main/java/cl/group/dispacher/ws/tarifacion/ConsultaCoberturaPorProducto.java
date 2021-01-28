
package cl.group.dispacher.ws.tarifacion;

import cl.group.dispacher.ws.normalizacion.DireccionNormalizadaTO;
import cl.group.dispacher.ws.normalizacion.NormalizarDireccion;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlRootElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Clase Java para anonymous complex type.
 * 
 * <p>El siguiente fragmento de esquema especifica el contenido que se espera que haya en esta clase.
 * 
 * <pre>
 * &lt;complexType>
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="usuario" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="contrasena" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="consultaCobertura" type="{http://tempuri.org/}CoberturaProductoTO" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "", propOrder = {
    "usuario",
    "contrasena",
    "consultaCobertura"
})
@XmlRootElement(name = "consultaCoberturaPorProducto")
public class ConsultaCoberturaPorProducto {

    protected String usuario;
    protected String contrasena;
    protected CoberturaProductoTO consultaCobertura;

    /**
     * Obtiene el valor de la propiedad usuario.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getUsuario() {
        return usuario;
    }

    /**
     * Define el valor de la propiedad usuario.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setUsuario(String value) {
        this.usuario = value;
    }

    /**
     * Obtiene el valor de la propiedad contrasena.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getContrasena() {
        return contrasena;
    }

    /**
     * Define el valor de la propiedad contrasena.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setContrasena(String value) {
        this.contrasena = value;
    }

    /**
     * Obtiene el valor de la propiedad consultaCobertura.
     * 
     * @return
     *     possible object is
     *     {@link CoberturaProductoTO }
     *     
     */
    public CoberturaProductoTO getConsultaCobertura() {
        return consultaCobertura;
    }

    /**
     * Define el valor de la propiedad consultaCobertura.
     * 
     * @param value
     *     allowed object is
     *     {@link CoberturaProductoTO }
     *     
     */
    public void setConsultaCobertura(CoberturaProductoTO value) {
        this.consultaCobertura = value;
    }

    public static interface ITarifacionService {

        DireccionNormalizadaTO normalizarDireccion(NormalizarDireccion request) throws Exception;

    }
}
