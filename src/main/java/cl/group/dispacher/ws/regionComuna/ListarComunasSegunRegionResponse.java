
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
 *         &lt;element name="listarComunasSegunRegionResult" type="{http://tempuri.org/}ArrayOfComunaTO" minOccurs="0"/>
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
    "listarComunasSegunRegionResult"
})
@XmlRootElement(name = "listarComunasSegunRegionResponse")
public class ListarComunasSegunRegionResponse {

    protected ArrayOfComunaTO listarComunasSegunRegionResult;

    /**
     * Obtiene el valor de la propiedad listarComunasSegunRegionResult.
     * 
     * @return
     *     possible object is
     *     {@link ArrayOfComunaTO }
     *     
     */
    public ArrayOfComunaTO getListarComunasSegunRegionResult() {
        return listarComunasSegunRegionResult;
    }

    /**
     * Define el valor de la propiedad listarComunasSegunRegionResult.
     * 
     * @param value
     *     allowed object is
     *     {@link ArrayOfComunaTO }
     *     
     */
    public void setListarComunasSegunRegionResult(ArrayOfComunaTO value) {
        this.listarComunasSegunRegionResult = value;
    }

}
