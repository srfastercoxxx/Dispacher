
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
 *         &lt;element name="listarTodasLasRegionesResult" type="{http://tempuri.org/}ArrayOfRegionTO" minOccurs="0"/>
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
    "listarTodasLasRegionesResult"
})
@XmlRootElement(name = "listarTodasLasRegionesResponse")
public class ListarTodasLasRegionesResponse {

    protected ArrayOfRegionTO listarTodasLasRegionesResult;

    /**
     * Obtiene el valor de la propiedad listarTodasLasRegionesResult.
     * 
     * @return
     *     possible object is
     *     {@link ArrayOfRegionTO }
     *     
     */
    public ArrayOfRegionTO getListarTodasLasRegionesResult() {
        return listarTodasLasRegionesResult;
    }

    /**
     * Define el valor de la propiedad listarTodasLasRegionesResult.
     * 
     * @param value
     *     allowed object is
     *     {@link ArrayOfRegionTO }
     *     
     */
    public void setListarTodasLasRegionesResult(ArrayOfRegionTO value) {
        this.listarTodasLasRegionesResult = value;
    }

}
