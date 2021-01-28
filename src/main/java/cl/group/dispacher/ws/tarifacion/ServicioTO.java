
package cl.group.dispacher.ws.tarifacion;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Clase Java para ServicioTO complex type.
 * 
 * <p>El siguiente fragmento de esquema especifica el contenido que se espera que haya en esta clase.
 * 
 * <pre>
 * &lt;complexType name="ServicioTO">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="ExtensionData" type="{http://tempuri.org/}ExtensionDataObject" minOccurs="0"/>
 *         &lt;element name="CodigoServicio" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="ConceptosTasacion" type="{http://tempuri.org/}ArrayOfConceptoTasacionTO" minOccurs="0"/>
 *         &lt;element name="TotalTasacion" type="{http://tempuri.org/}TotalTasacionTO" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "ServicioTO", propOrder = {
    "extensionData",
    "codigoServicio",
    "conceptosTasacion",
    "totalTasacion"
})
public class ServicioTO {

    @XmlElement(name = "ExtensionData")
    protected ExtensionDataObject extensionData;
    @XmlElement(name = "CodigoServicio")
    protected String codigoServicio;
    @XmlElement(name = "ConceptosTasacion")
    protected ArrayOfConceptoTasacionTO conceptosTasacion;
    @XmlElement(name = "TotalTasacion")
    protected TotalTasacionTO totalTasacion;

    /**
     * Obtiene el valor de la propiedad extensionData.
     * 
     * @return
     *     possible object is
     *     {@link ExtensionDataObject }
     *     
     */
    public ExtensionDataObject getExtensionData() {
        return extensionData;
    }

    /**
     * Define el valor de la propiedad extensionData.
     * 
     * @param value
     *     allowed object is
     *     {@link ExtensionDataObject }
     *     
     */
    public void setExtensionData(ExtensionDataObject value) {
        this.extensionData = value;
    }

    /**
     * Obtiene el valor de la propiedad codigoServicio.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getCodigoServicio() {
        return codigoServicio;
    }

    /**
     * Define el valor de la propiedad codigoServicio.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setCodigoServicio(String value) {
        this.codigoServicio = value;
    }

    /**
     * Obtiene el valor de la propiedad conceptosTasacion.
     * 
     * @return
     *     possible object is
     *     {@link ArrayOfConceptoTasacionTO }
     *     
     */
    public ArrayOfConceptoTasacionTO getConceptosTasacion() {
        return conceptosTasacion;
    }

    /**
     * Define el valor de la propiedad conceptosTasacion.
     * 
     * @param value
     *     allowed object is
     *     {@link ArrayOfConceptoTasacionTO }
     *     
     */
    public void setConceptosTasacion(ArrayOfConceptoTasacionTO value) {
        this.conceptosTasacion = value;
    }

    /**
     * Obtiene el valor de la propiedad totalTasacion.
     * 
     * @return
     *     possible object is
     *     {@link TotalTasacionTO }
     *     
     */
    public TotalTasacionTO getTotalTasacion() {
        return totalTasacion;
    }

    /**
     * Define el valor de la propiedad totalTasacion.
     * 
     * @param value
     *     allowed object is
     *     {@link TotalTasacionTO }
     *     
     */
    public void setTotalTasacion(TotalTasacionTO value) {
        this.totalTasacion = value;
    }

}
