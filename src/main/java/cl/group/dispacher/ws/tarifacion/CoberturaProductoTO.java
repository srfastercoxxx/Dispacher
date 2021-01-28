
package cl.group.dispacher.ws.tarifacion;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Clase Java para CoberturaProductoTO complex type.
 * 
 * <p>El siguiente fragmento de esquema especifica el contenido que se espera que haya en esta clase.
 * 
 * <pre>
 * &lt;complexType name="CoberturaProductoTO">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="ExtensionData" type="{http://tempuri.org/}ExtensionDataObject" minOccurs="0"/>
 *         &lt;element name="CodigoPostalDestinatario" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="CodigoPostalRemitente" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="CodigoServicio" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="ComunaDestino" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="ComunaRemitente" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="ImporteReembolso" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="ImporteValorAsegurado" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="Kilos" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="NumeroTotalPieza" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="PaisDestinatario" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="PaisRemitente" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="TipoPortes" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="Volumen" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "CoberturaProductoTO", propOrder = {
    "extensionData",
    "codigoPostalDestinatario",
    "codigoPostalRemitente",
    "codigoServicio",
    "comunaDestino",
    "comunaRemitente",
    "importeReembolso",
    "importeValorAsegurado",
    "kilos",
    "numeroTotalPieza",
    "paisDestinatario",
    "paisRemitente",
    "tipoPortes",
    "volumen"
})
public class CoberturaProductoTO {

    @XmlElement(name = "ExtensionData")
    protected ExtensionDataObject extensionData;
    @XmlElement(name = "CodigoPostalDestinatario")
    protected String codigoPostalDestinatario;
    @XmlElement(name = "CodigoPostalRemitente")
    protected String codigoPostalRemitente;
    @XmlElement(name = "CodigoServicio")
    protected String codigoServicio;
    @XmlElement(name = "ComunaDestino")
    protected String comunaDestino;
    @XmlElement(name = "ComunaRemitente")
    protected String comunaRemitente;
    @XmlElement(name = "ImporteReembolso")
    protected String importeReembolso;
    @XmlElement(name = "ImporteValorAsegurado")
    protected String importeValorAsegurado;
    @XmlElement(name = "Kilos")
    protected String kilos;
    @XmlElement(name = "NumeroTotalPieza")
    protected String numeroTotalPieza;
    @XmlElement(name = "PaisDestinatario")
    protected String paisDestinatario;
    @XmlElement(name = "PaisRemitente")
    protected String paisRemitente;
    @XmlElement(name = "TipoPortes")
    protected String tipoPortes;
    @XmlElement(name = "Volumen")
    protected String volumen;

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
     * Obtiene el valor de la propiedad codigoPostalDestinatario.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getCodigoPostalDestinatario() {
        return codigoPostalDestinatario;
    }

    /**
     * Define el valor de la propiedad codigoPostalDestinatario.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setCodigoPostalDestinatario(String value) {
        this.codigoPostalDestinatario = value;
    }

    /**
     * Obtiene el valor de la propiedad codigoPostalRemitente.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getCodigoPostalRemitente() {
        return codigoPostalRemitente;
    }

    /**
     * Define el valor de la propiedad codigoPostalRemitente.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setCodigoPostalRemitente(String value) {
        this.codigoPostalRemitente = value;
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
     * Obtiene el valor de la propiedad comunaRemitente.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getComunaRemitente() {
        return comunaRemitente;
    }

    /**
     * Define el valor de la propiedad comunaRemitente.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setComunaRemitente(String value) {
        this.comunaRemitente = value;
    }

    /**
     * Obtiene el valor de la propiedad importeReembolso.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getImporteReembolso() {
        return importeReembolso;
    }

    /**
     * Define el valor de la propiedad importeReembolso.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setImporteReembolso(String value) {
        this.importeReembolso = value;
    }

    /**
     * Obtiene el valor de la propiedad importeValorAsegurado.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getImporteValorAsegurado() {
        return importeValorAsegurado;
    }

    /**
     * Define el valor de la propiedad importeValorAsegurado.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setImporteValorAsegurado(String value) {
        this.importeValorAsegurado = value;
    }

    /**
     * Obtiene el valor de la propiedad kilos.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getKilos() {
        return kilos;
    }

    /**
     * Define el valor de la propiedad kilos.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setKilos(String value) {
        this.kilos = value;
    }

    /**
     * Obtiene el valor de la propiedad numeroTotalPieza.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getNumeroTotalPieza() {
        return numeroTotalPieza;
    }

    /**
     * Define el valor de la propiedad numeroTotalPieza.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setNumeroTotalPieza(String value) {
        this.numeroTotalPieza = value;
    }

    /**
     * Obtiene el valor de la propiedad paisDestinatario.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getPaisDestinatario() {
        return paisDestinatario;
    }

    /**
     * Define el valor de la propiedad paisDestinatario.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setPaisDestinatario(String value) {
        this.paisDestinatario = value;
    }

    /**
     * Obtiene el valor de la propiedad paisRemitente.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getPaisRemitente() {
        return paisRemitente;
    }

    /**
     * Define el valor de la propiedad paisRemitente.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setPaisRemitente(String value) {
        this.paisRemitente = value;
    }

    /**
     * Obtiene el valor de la propiedad tipoPortes.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getTipoPortes() {
        return tipoPortes;
    }

    /**
     * Define el valor de la propiedad tipoPortes.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setTipoPortes(String value) {
        this.tipoPortes = value;
    }

    /**
     * Obtiene el valor de la propiedad volumen.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getVolumen() {
        return volumen;
    }

    /**
     * Define el valor de la propiedad volumen.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setVolumen(String value) {
        this.volumen = value;
    }

}
