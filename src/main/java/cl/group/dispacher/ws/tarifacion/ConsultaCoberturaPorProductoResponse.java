
package cl.group.dispacher.ws.tarifacion;

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
 *         &lt;element name="consultaCoberturaPorProductoResult" type="{http://tempuri.org/}ServicioTO" minOccurs="0"/>
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
    "consultaCoberturaPorProductoResult"
})
@XmlRootElement(name = "consultaCoberturaPorProductoResponse")
public class ConsultaCoberturaPorProductoResponse {

    protected ServicioTO consultaCoberturaPorProductoResult;

    /**
     * Obtiene el valor de la propiedad consultaCoberturaPorProductoResult.
     * 
     * @return
     *     possible object is
     *     {@link ServicioTO }
     *     
     */
    public ServicioTO getConsultaCoberturaPorProductoResult() {
        return consultaCoberturaPorProductoResult;
    }

    /**
     * Define el valor de la propiedad consultaCoberturaPorProductoResult.
     * 
     * @param value
     *     allowed object is
     *     {@link ServicioTO }
     *     
     */
    public void setConsultaCoberturaPorProductoResult(ServicioTO value) {
        this.consultaCoberturaPorProductoResult = value;
    }

}
