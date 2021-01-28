
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
 *         &lt;element name="consultaCoberturaResult" type="{http://tempuri.org/}ArrayOfServicioTO" minOccurs="0"/>
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
    "consultaCoberturaResult"
})
@XmlRootElement(name = "consultaCoberturaResponse")
public class ConsultaCoberturaResponse {

    protected ArrayOfServicioTO consultaCoberturaResult;

    /**
     * Obtiene el valor de la propiedad consultaCoberturaResult.
     * 
     * @return
     *     possible object is
     *     {@link ArrayOfServicioTO }
     *     
     */
    public ArrayOfServicioTO getConsultaCoberturaResult() {
        return consultaCoberturaResult;
    }

    /**
     * Define el valor de la propiedad consultaCoberturaResult.
     * 
     * @param value
     *     allowed object is
     *     {@link ArrayOfServicioTO }
     *     
     */
    public void setConsultaCoberturaResult(ArrayOfServicioTO value) {
        this.consultaCoberturaResult = value;
    }

}
