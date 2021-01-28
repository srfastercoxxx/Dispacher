
package cl.group.dispacher.ws.admision;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Clase Java para AdmisionTO complex type.
 * 
 * <p>El siguiente fragmento de esquema especifica el contenido que se espera que haya en esta clase.
 * 
 * <pre>
 * &lt;complexType name="AdmisionTO">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="ExtensionData" type="{http://tempuri.org/}ExtensionDataObject" minOccurs="0"/>
 *         &lt;element name="CodigoAdmision" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="ClienteRemitente" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="CentroRemitente" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="NombreRemitente" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="DireccionRemitente" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="PaisRemitente" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="CodigoPostalRemitente" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="ComunaRemitente" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="RutRemitente" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="PersonaContactoRemitente" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="TelefonoContactoRemitente" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="ClienteDestinatario" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="CentroDestinatario" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="NombreDestinatario" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="DireccionDestinatario" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="PaisDestinatario" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="CodigoPostalDestinatario" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="ComunaDestinatario" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="RutDestinatario" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="PersonaContactoDestinatario" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="TelefonoContactoDestinatario" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="CodigoServicio" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="NumeroTotalPiezas" type="{http://www.w3.org/2001/XMLSchema}int"/>
 *         &lt;element name="Kilos" type="{http://www.w3.org/2001/XMLSchema}double"/>
 *         &lt;element name="Volumen" type="{http://www.w3.org/2001/XMLSchema}double"/>
 *         &lt;element name="NumeroReferencia" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="ImporteReembolso" type="{http://www.w3.org/2001/XMLSchema}long"/>
 *         &lt;element name="ImporteValorDeclarado" type="{http://www.w3.org/2001/XMLSchema}long"/>
 *         &lt;element name="TipoPortes" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="Observaciones" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="Observaciones2" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="EmailDestino" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="TipoMercancia" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="DevolucionConforme" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="NumeroDocumentos" type="{http://www.w3.org/2001/XMLSchema}long"/>
 *         &lt;element name="PagoSeguro" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "AdmisionTO", propOrder = {
    "extensionData",
    "codigoAdmision",
    "clienteRemitente",
    "centroRemitente",
    "nombreRemitente",
    "direccionRemitente",
    "paisRemitente",
    "codigoPostalRemitente",
    "comunaRemitente",
    "rutRemitente",
    "personaContactoRemitente",
    "telefonoContactoRemitente",
    "clienteDestinatario",
    "centroDestinatario",
    "nombreDestinatario",
    "direccionDestinatario",
    "paisDestinatario",
    "codigoPostalDestinatario",
    "comunaDestinatario",
    "rutDestinatario",
    "personaContactoDestinatario",
    "telefonoContactoDestinatario",
    "codigoServicio",
    "numeroTotalPiezas",
    "kilos",
    "volumen",
    "numeroReferencia",
    "importeReembolso",
    "importeValorDeclarado",
    "tipoPortes",
    "observaciones",
    "observaciones2",
    "emailDestino",
    "tipoMercancia",
    "devolucionConforme",
    "numeroDocumentos",
    "pagoSeguro"
})
public class AdmisionTO {

    @XmlElement(name = "ExtensionData")
    protected ExtensionDataObject extensionData;
    @XmlElement(name = "CodigoAdmision")
    protected String codigoAdmision;
    @XmlElement(name = "ClienteRemitente")
    protected String clienteRemitente;
    @XmlElement(name = "CentroRemitente")
    protected String centroRemitente;
    @XmlElement(name = "NombreRemitente")
    protected String nombreRemitente;
    @XmlElement(name = "DireccionRemitente")
    protected String direccionRemitente;
    @XmlElement(name = "PaisRemitente")
    protected String paisRemitente;
    @XmlElement(name = "CodigoPostalRemitente")
    protected String codigoPostalRemitente;
    @XmlElement(name = "ComunaRemitente")
    protected String comunaRemitente;
    @XmlElement(name = "RutRemitente")
    protected String rutRemitente;
    @XmlElement(name = "PersonaContactoRemitente")
    protected String personaContactoRemitente;
    @XmlElement(name = "TelefonoContactoRemitente")
    protected String telefonoContactoRemitente;
    @XmlElement(name = "ClienteDestinatario")
    protected String clienteDestinatario;
    @XmlElement(name = "CentroDestinatario")
    protected String centroDestinatario;
    @XmlElement(name = "NombreDestinatario")
    protected String nombreDestinatario;
    @XmlElement(name = "DireccionDestinatario")
    protected String direccionDestinatario;
    @XmlElement(name = "PaisDestinatario")
    protected String paisDestinatario;
    @XmlElement(name = "CodigoPostalDestinatario")
    protected String codigoPostalDestinatario;
    @XmlElement(name = "ComunaDestinatario")
    protected String comunaDestinatario;
    @XmlElement(name = "RutDestinatario")
    protected String rutDestinatario;
    @XmlElement(name = "PersonaContactoDestinatario")
    protected String personaContactoDestinatario;
    @XmlElement(name = "TelefonoContactoDestinatario")
    protected String telefonoContactoDestinatario;
    @XmlElement(name = "CodigoServicio")
    protected String codigoServicio;
    @XmlElement(name = "NumeroTotalPiezas")
    protected int numeroTotalPiezas;
    @XmlElement(name = "Kilos")
    protected double kilos;
    @XmlElement(name = "Volumen")
    protected double volumen;
    @XmlElement(name = "NumeroReferencia")
    protected String numeroReferencia;
    @XmlElement(name = "ImporteReembolso")
    protected long importeReembolso;
    @XmlElement(name = "ImporteValorDeclarado")
    protected long importeValorDeclarado;
    @XmlElement(name = "TipoPortes")
    protected String tipoPortes;
    @XmlElement(name = "Observaciones")
    protected String observaciones;
    @XmlElement(name = "Observaciones2")
    protected String observaciones2;
    @XmlElement(name = "EmailDestino")
    protected String emailDestino;
    @XmlElement(name = "TipoMercancia")
    protected String tipoMercancia;
    @XmlElement(name = "DevolucionConforme")
    protected String devolucionConforme;
    @XmlElement(name = "NumeroDocumentos")
    protected long numeroDocumentos;
    @XmlElement(name = "PagoSeguro")
    protected String pagoSeguro;

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

    /**
     * Obtiene el valor de la propiedad clienteRemitente.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getClienteRemitente() {
        return clienteRemitente;
    }

    /**
     * Define el valor de la propiedad clienteRemitente.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setClienteRemitente(String value) {
        this.clienteRemitente = value;
    }

    /**
     * Obtiene el valor de la propiedad centroRemitente.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getCentroRemitente() {
        return centroRemitente;
    }

    /**
     * Define el valor de la propiedad centroRemitente.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setCentroRemitente(String value) {
        this.centroRemitente = value;
    }

    /**
     * Obtiene el valor de la propiedad nombreRemitente.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getNombreRemitente() {
        return nombreRemitente;
    }

    /**
     * Define el valor de la propiedad nombreRemitente.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setNombreRemitente(String value) {
        this.nombreRemitente = value;
    }

    /**
     * Obtiene el valor de la propiedad direccionRemitente.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getDireccionRemitente() {
        return direccionRemitente;
    }

    /**
     * Define el valor de la propiedad direccionRemitente.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setDireccionRemitente(String value) {
        this.direccionRemitente = value;
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
     * Obtiene el valor de la propiedad rutRemitente.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getRutRemitente() {
        return rutRemitente;
    }

    /**
     * Define el valor de la propiedad rutRemitente.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setRutRemitente(String value) {
        this.rutRemitente = value;
    }

    /**
     * Obtiene el valor de la propiedad personaContactoRemitente.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getPersonaContactoRemitente() {
        return personaContactoRemitente;
    }

    /**
     * Define el valor de la propiedad personaContactoRemitente.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setPersonaContactoRemitente(String value) {
        this.personaContactoRemitente = value;
    }

    /**
     * Obtiene el valor de la propiedad telefonoContactoRemitente.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getTelefonoContactoRemitente() {
        return telefonoContactoRemitente;
    }

    /**
     * Define el valor de la propiedad telefonoContactoRemitente.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setTelefonoContactoRemitente(String value) {
        this.telefonoContactoRemitente = value;
    }

    /**
     * Obtiene el valor de la propiedad clienteDestinatario.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getClienteDestinatario() {
        return clienteDestinatario;
    }

    /**
     * Define el valor de la propiedad clienteDestinatario.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setClienteDestinatario(String value) {
        this.clienteDestinatario = value;
    }

    /**
     * Obtiene el valor de la propiedad centroDestinatario.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getCentroDestinatario() {
        return centroDestinatario;
    }

    /**
     * Define el valor de la propiedad centroDestinatario.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setCentroDestinatario(String value) {
        this.centroDestinatario = value;
    }

    /**
     * Obtiene el valor de la propiedad nombreDestinatario.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getNombreDestinatario() {
        return nombreDestinatario;
    }

    /**
     * Define el valor de la propiedad nombreDestinatario.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setNombreDestinatario(String value) {
        this.nombreDestinatario = value;
    }

    /**
     * Obtiene el valor de la propiedad direccionDestinatario.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getDireccionDestinatario() {
        return direccionDestinatario;
    }

    /**
     * Define el valor de la propiedad direccionDestinatario.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setDireccionDestinatario(String value) {
        this.direccionDestinatario = value;
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
     * Obtiene el valor de la propiedad comunaDestinatario.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getComunaDestinatario() {
        return comunaDestinatario;
    }

    /**
     * Define el valor de la propiedad comunaDestinatario.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setComunaDestinatario(String value) {
        this.comunaDestinatario = value;
    }

    /**
     * Obtiene el valor de la propiedad rutDestinatario.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getRutDestinatario() {
        return rutDestinatario;
    }

    /**
     * Define el valor de la propiedad rutDestinatario.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setRutDestinatario(String value) {
        this.rutDestinatario = value;
    }

    /**
     * Obtiene el valor de la propiedad personaContactoDestinatario.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getPersonaContactoDestinatario() {
        return personaContactoDestinatario;
    }

    /**
     * Define el valor de la propiedad personaContactoDestinatario.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setPersonaContactoDestinatario(String value) {
        this.personaContactoDestinatario = value;
    }

    /**
     * Obtiene el valor de la propiedad telefonoContactoDestinatario.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getTelefonoContactoDestinatario() {
        return telefonoContactoDestinatario;
    }

    /**
     * Define el valor de la propiedad telefonoContactoDestinatario.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setTelefonoContactoDestinatario(String value) {
        this.telefonoContactoDestinatario = value;
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
     * Obtiene el valor de la propiedad numeroTotalPiezas.
     * 
     */
    public int getNumeroTotalPiezas() {
        return numeroTotalPiezas;
    }

    /**
     * Define el valor de la propiedad numeroTotalPiezas.
     * 
     */
    public void setNumeroTotalPiezas(int value) {
        this.numeroTotalPiezas = value;
    }

    /**
     * Obtiene el valor de la propiedad kilos.
     * 
     */
    public double getKilos() {
        return kilos;
    }

    /**
     * Define el valor de la propiedad kilos.
     * 
     */
    public void setKilos(double value) {
        this.kilos = value;
    }

    /**
     * Obtiene el valor de la propiedad volumen.
     * 
     */
    public double getVolumen() {
        return volumen;
    }

    /**
     * Define el valor de la propiedad volumen.
     * 
     */
    public void setVolumen(double value) {
        this.volumen = value;
    }

    /**
     * Obtiene el valor de la propiedad numeroReferencia.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getNumeroReferencia() {
        return numeroReferencia;
    }

    /**
     * Define el valor de la propiedad numeroReferencia.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setNumeroReferencia(String value) {
        this.numeroReferencia = value;
    }

    /**
     * Obtiene el valor de la propiedad importeReembolso.
     * 
     */
    public long getImporteReembolso() {
        return importeReembolso;
    }

    /**
     * Define el valor de la propiedad importeReembolso.
     * 
     */
    public void setImporteReembolso(long value) {
        this.importeReembolso = value;
    }

    /**
     * Obtiene el valor de la propiedad importeValorDeclarado.
     * 
     */
    public long getImporteValorDeclarado() {
        return importeValorDeclarado;
    }

    /**
     * Define el valor de la propiedad importeValorDeclarado.
     * 
     */
    public void setImporteValorDeclarado(long value) {
        this.importeValorDeclarado = value;
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
     * Obtiene el valor de la propiedad observaciones.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getObservaciones() {
        return observaciones;
    }

    /**
     * Define el valor de la propiedad observaciones.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setObservaciones(String value) {
        this.observaciones = value;
    }

    /**
     * Obtiene el valor de la propiedad observaciones2.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getObservaciones2() {
        return observaciones2;
    }

    /**
     * Define el valor de la propiedad observaciones2.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setObservaciones2(String value) {
        this.observaciones2 = value;
    }

    /**
     * Obtiene el valor de la propiedad emailDestino.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getEmailDestino() {
        return emailDestino;
    }

    /**
     * Define el valor de la propiedad emailDestino.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setEmailDestino(String value) {
        this.emailDestino = value;
    }

    /**
     * Obtiene el valor de la propiedad tipoMercancia.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getTipoMercancia() {
        return tipoMercancia;
    }

    /**
     * Define el valor de la propiedad tipoMercancia.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setTipoMercancia(String value) {
        this.tipoMercancia = value;
    }

    /**
     * Obtiene el valor de la propiedad devolucionConforme.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getDevolucionConforme() {
        return devolucionConforme;
    }

    /**
     * Define el valor de la propiedad devolucionConforme.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setDevolucionConforme(String value) {
        this.devolucionConforme = value;
    }

    /**
     * Obtiene el valor de la propiedad numeroDocumentos.
     * 
     */
    public long getNumeroDocumentos() {
        return numeroDocumentos;
    }

    /**
     * Define el valor de la propiedad numeroDocumentos.
     * 
     */
    public void setNumeroDocumentos(long value) {
        this.numeroDocumentos = value;
    }

    /**
     * Obtiene el valor de la propiedad pagoSeguro.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getPagoSeguro() {
        return pagoSeguro;
    }

    /**
     * Define el valor de la propiedad pagoSeguro.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setPagoSeguro(String value) {
        this.pagoSeguro = value;
    }

}
