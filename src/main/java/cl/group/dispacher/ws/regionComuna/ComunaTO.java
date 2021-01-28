
package cl.group.dispacher.ws.regionComuna;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Clase Java para ComunaTO complex type.
 * 
 * <p>El siguiente fragmento de esquema especifica el contenido que se espera que haya en esta clase.
 * 
 * <pre>
 * &lt;complexType name="ComunaTO">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="ExtensionData" type="{http://tempuri.org/}ExtensionDataObject" minOccurs="0"/>
 *         &lt;element name="Auxiliar1" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="Auxiliar2" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="Auxiliar3" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="Iata" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="NombreComuna" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="Region" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "ComunaTO", propOrder = {
    "extensionData",
    "auxiliar1",
    "auxiliar2",
    "auxiliar3",
    "iata",
    "nombreComuna",
    "region"
})
public class ComunaTO {

    @XmlElement(name = "ExtensionData")
    protected ExtensionDataObject extensionData;
    @XmlElement(name = "Auxiliar1")
    protected String auxiliar1;
    @XmlElement(name = "Auxiliar2")
    protected String auxiliar2;
    @XmlElement(name = "Auxiliar3")
    protected String auxiliar3;
    @XmlElement(name = "Iata")
    protected String iata;
    @XmlElement(name = "NombreComuna")
    protected String nombreComuna;
    @XmlElement(name = "Region")
    protected String region;

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
     * Obtiene el valor de la propiedad auxiliar1.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getAuxiliar1() {
        return auxiliar1;
    }

    /**
     * Define el valor de la propiedad auxiliar1.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setAuxiliar1(String value) {
        this.auxiliar1 = value;
    }

    /**
     * Obtiene el valor de la propiedad auxiliar2.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getAuxiliar2() {
        return auxiliar2;
    }

    /**
     * Define el valor de la propiedad auxiliar2.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setAuxiliar2(String value) {
        this.auxiliar2 = value;
    }

    /**
     * Obtiene el valor de la propiedad auxiliar3.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getAuxiliar3() {
        return auxiliar3;
    }

    /**
     * Define el valor de la propiedad auxiliar3.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setAuxiliar3(String value) {
        this.auxiliar3 = value;
    }

    /**
     * Obtiene el valor de la propiedad iata.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getIata() {
        return iata;
    }

    /**
     * Define el valor de la propiedad iata.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setIata(String value) {
        this.iata = value;
    }

    /**
     * Obtiene el valor de la propiedad nombreComuna.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getNombreComuna() {
        return nombreComuna;
    }

    /**
     * Define el valor de la propiedad nombreComuna.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setNombreComuna(String value) {
        this.nombreComuna = value;
    }

    /**
     * Obtiene el valor de la propiedad region.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getRegion() {
        return region;
    }

    /**
     * Define el valor de la propiedad region.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setRegion(String value) {
        this.region = value;
    }

}
