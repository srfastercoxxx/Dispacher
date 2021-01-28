
package cl.group.dispacher.ws.regionComuna;

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
 *         &lt;element name="listarTodasLasComunasResult" type="{http://tempuri.org/}ArrayOfComunaTO" minOccurs="0"/>
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
    "listarTodasLasComunasResult"
})
@XmlRootElement(name = "listarTodasLasComunasResponse")
public class ListarTodasLasComunasResponse {

    protected ArrayOfComunaTO listarTodasLasComunasResult;

    /**
     * Obtiene el valor de la propiedad listarTodasLasComunasResult.
     * 
     * @return
     *     possible object is
     *     {@link ArrayOfComunaTO }
     *     
     */
    public ArrayOfComunaTO getListarTodasLasComunasResult() {
        return listarTodasLasComunasResult;
    }

    /**
     * Define el valor de la propiedad listarTodasLasComunasResult.
     * 
     * @param value
     *     allowed object is
     *     {@link ArrayOfComunaTO }
     *     
     */
    public void setListarTodasLasComunasResult(ArrayOfComunaTO value) {
        this.listarTodasLasComunasResult = value;
    }

}
