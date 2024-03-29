
package cl.group.dispacher.ws.normalizacion;

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
 *         &lt;element name="normalizarDireccionResult" type="{http://tempuri.org/}DireccionNormalizadaTO" minOccurs="0"/>
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
    "normalizarDireccionResult"
})
@XmlRootElement(name = "normalizarDireccionResponse")
public class NormalizarDireccionResponse {

    protected DireccionNormalizadaTO normalizarDireccionResult;

    /**
     * Obtiene el valor de la propiedad normalizarDireccionResult.
     * 
     * @return
     *     possible object is
     *     {@link DireccionNormalizadaTO }
     *     
     */
    public DireccionNormalizadaTO getNormalizarDireccionResult() {
        return normalizarDireccionResult;
    }

    /**
     * Define el valor de la propiedad normalizarDireccionResult.
     * 
     * @param value
     *     allowed object is
     *     {@link DireccionNormalizadaTO }
     *     
     */
    public void setNormalizarDireccionResult(DireccionNormalizadaTO value) {
        this.normalizarDireccionResult = value;
    }

}
