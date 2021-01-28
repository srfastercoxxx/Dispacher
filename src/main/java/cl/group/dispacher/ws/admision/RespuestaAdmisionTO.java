
package cl.group.dispacher.ws.admision;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Clase Java para RespuestaAdmisionTO complex type.
 * 
 * <p>El siguiente fragmento de esquema especifica el contenido que se espera que haya en esta clase.
 * 
 * <pre>
 * &lt;complexType name="RespuestaAdmisionTO">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="ExtensionData" type="{http://tempuri.org/}ExtensionDataObject" minOccurs="0"/>
 *         &lt;element name="CodigoSucursal" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="NombreSucursal" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="Cuartel" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="Sector" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="SDP" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="Movil" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="AbreviaturaCentro" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="CodigoDelegacionDestino" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="NombreDelegacionDestino" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="DireccionDestino" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="CodigoEncaminamiento" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="GrabarEnvio" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="NumeroEnvio" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="ComunaDestino" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="AbreviaturaServicio" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="IdTransaccional" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="CodigoAdmision" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "RespuestaAdmisionTO", propOrder = {
    "extensionData",
    "codigoSucursal",
    "nombreSucursal",
    "cuartel",
    "sector",
    "sdp",
    "movil",
    "abreviaturaCentro",
    "codigoDelegacionDestino",
    "nombreDelegacionDestino",
    "direccionDestino",
    "codigoEncaminamiento",
    "grabarEnvio",
    "numeroEnvio",
    "comunaDestino",
    "abreviaturaServicio",
    "idTransaccional",
    "codigoAdmision"
})
public class RespuestaAdmisionTO {

    @XmlElement(name = "ExtensionData")
    protected ExtensionDataObject extensionData;
    @XmlElement(name = "CodigoSucursal")
    protected String codigoSucursal;
    @XmlElement(name = "NombreSucursal")
    protected String nombreSucursal;
    @XmlElement(name = "Cuartel")
    protected String cuartel;
    @XmlElement(name = "Sector")
    protected String sector;
    @XmlElement(name = "SDP")
    protected String sdp;
    @XmlElement(name = "Movil")
    protected String movil;
    @XmlElement(name = "AbreviaturaCentro")
    protected String abreviaturaCentro;
    @XmlElement(name = "CodigoDelegacionDestino")
    protected String codigoDelegacionDestino;
    @XmlElement(name = "NombreDelegacionDestino")
    protected String nombreDelegacionDestino;
    @XmlElement(name = "DireccionDestino")
    protected String direccionDestino;
    @XmlElement(name = "CodigoEncaminamiento")
    protected String codigoEncaminamiento;
    @XmlElement(name = "GrabarEnvio")
    protected String grabarEnvio;
    @XmlElement(name = "NumeroEnvio")
    protected String numeroEnvio;
    @XmlElement(name = "ComunaDestino")
    protected String comunaDestino;
    @XmlElement(name = "AbreviaturaServicio")
    protected String abreviaturaServicio;
    @XmlElement(name = "IdTransaccional")
    protected String idTransaccional;
    @XmlElement(name = "CodigoAdmision")
    protected String codigoAdmision;

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
     * Obtiene el valor de la propiedad codigoSucursal.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getCodigoSucursal() {
        return codigoSucursal;
    }

    /**
     * Define el valor de la propiedad codigoSucursal.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setCodigoSucursal(String value) {
        this.codigoSucursal = value;
    }

    /**
     * Obtiene el valor de la propiedad nombreSucursal.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getNombreSucursal() {
        return nombreSucursal;
    }

    /**
     * Define el valor de la propiedad nombreSucursal.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setNombreSucursal(String value) {
        this.nombreSucursal = value;
    }

    /**
     * Obtiene el valor de la propiedad cuartel.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getCuartel() {
        return cuartel;
    }

    /**
     * Define el valor de la propiedad cuartel.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setCuartel(String value) {
        this.cuartel = value;
    }

    /**
     * Obtiene el valor de la propiedad sector.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getSector() {
        return sector;
    }

    /**
     * Define el valor de la propiedad sector.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setSector(String value) {
        this.sector = value;
    }

    /**
     * Obtiene el valor de la propiedad sdp.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getSDP() {
        return sdp;
    }

    /**
     * Define el valor de la propiedad sdp.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setSDP(String value) {
        this.sdp = value;
    }

    /**
     * Obtiene el valor de la propiedad movil.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getMovil() {
        return movil;
    }

    /**
     * Define el valor de la propiedad movil.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setMovil(String value) {
        this.movil = value;
    }

    /**
     * Obtiene el valor de la propiedad abreviaturaCentro.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getAbreviaturaCentro() {
        return abreviaturaCentro;
    }

    /**
     * Define el valor de la propiedad abreviaturaCentro.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setAbreviaturaCentro(String value) {
        this.abreviaturaCentro = value;
    }

    /**
     * Obtiene el valor de la propiedad codigoDelegacionDestino.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getCodigoDelegacionDestino() {
        return codigoDelegacionDestino;
    }

    /**
     * Define el valor de la propiedad codigoDelegacionDestino.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setCodigoDelegacionDestino(String value) {
        this.codigoDelegacionDestino = value;
    }

    /**
     * Obtiene el valor de la propiedad nombreDelegacionDestino.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getNombreDelegacionDestino() {
        return nombreDelegacionDestino;
    }

    /**
     * Define el valor de la propiedad nombreDelegacionDestino.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setNombreDelegacionDestino(String value) {
        this.nombreDelegacionDestino = value;
    }

    /**
     * Obtiene el valor de la propiedad direccionDestino.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getDireccionDestino() {
        return direccionDestino;
    }

    /**
     * Define el valor de la propiedad direccionDestino.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setDireccionDestino(String value) {
        this.direccionDestino = value;
    }

    /**
     * Obtiene el valor de la propiedad codigoEncaminamiento.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getCodigoEncaminamiento() {
        return codigoEncaminamiento;
    }

    /**
     * Define el valor de la propiedad codigoEncaminamiento.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setCodigoEncaminamiento(String value) {
        this.codigoEncaminamiento = value;
    }

    /**
     * Obtiene el valor de la propiedad grabarEnvio.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getGrabarEnvio() {
        return grabarEnvio;
    }

    /**
     * Define el valor de la propiedad grabarEnvio.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setGrabarEnvio(String value) {
        this.grabarEnvio = value;
    }

    /**
     * Obtiene el valor de la propiedad numeroEnvio.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getNumeroEnvio() {
        return numeroEnvio;
    }

    /**
     * Define el valor de la propiedad numeroEnvio.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setNumeroEnvio(String value) {
        this.numeroEnvio = value;
    }

    /**
     * Obtiene el valor de la propiedad comunaDestino.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getComunaDestino() {
        return comunaDestino;
    }

    /**
     * Define el valor de la propiedad comunaDestino.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setComunaDestino(String value) {
        this.comunaDestino = value;
    }

    /**
     * Obtiene el valor de la propiedad abreviaturaServicio.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getAbreviaturaServicio() {
        return abreviaturaServicio;
    }

    /**
     * Define el valor de la propiedad abreviaturaServicio.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setAbreviaturaServicio(String value) {
        this.abreviaturaServicio = value;
    }

    /**
     * Obtiene el valor de la propiedad idTransaccional.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getIdTransaccional() {
        return idTransaccional;
    }

    /**
     * Define el valor de la propiedad idTransaccional.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setIdTransaccional(String value) {
        this.idTransaccional = value;
    }

    /**
     * Obtiene el valor de la propiedad codigoAdmision.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getCodigoAdmision() {
        return codigoAdmision;
    }

    /**
     * Define el valor de la propiedad codigoAdmision.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setCodigoAdmision(String value) {
        this.codigoAdmision = value;
    }

}
