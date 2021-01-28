
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
 *         &lt;element name="consultaProductosPorClienteResult" type="{http://tempuri.org/}ArrayOfProductoTO" minOccurs="0"/>
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
    "consultaProductosPorClienteResult"
})
@XmlRootElement(name = "consultaProductosPorClienteResponse")
public class ConsultaProductosPorClienteResponse {

    protected ArrayOfProductoTO consultaProductosPorClienteResult;

    /**
     * Obtiene el valor de la propiedad consultaProductosPorClienteResult.
     * 
     * @return
     *     possible object is
     *     {@link ArrayOfProductoTO }
     *     
     */
    public ArrayOfProductoTO getConsultaProductosPorClienteResult() {
        return consultaProductosPorClienteResult;
    }

    /**
     * Define el valor de la propiedad consultaProductosPorClienteResult.
     * 
     * @param value
     *     allowed object is
     *     {@link ArrayOfProductoTO }
     *     
     */
    public void setConsultaProductosPorClienteResult(ArrayOfProductoTO value) {
        this.consultaProductosPorClienteResult = value;
    }

}
