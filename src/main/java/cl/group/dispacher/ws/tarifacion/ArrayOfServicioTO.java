
package cl.group.dispacher.ws.tarifacion;

import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Clase Java para ArrayOfServicioTO complex type.
 * 
 * <p>El siguiente fragmento de esquema especifica el contenido que se espera que haya en esta clase.
 * 
 * <pre>
 * &lt;complexType name="ArrayOfServicioTO">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="ServicioTO" type="{http://tempuri.org/}ServicioTO" maxOccurs="unbounded" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "ArrayOfServicioTO", propOrder = {
    "servicioTO"
})
public class ArrayOfServicioTO {

    @XmlElement(name = "ServicioTO", nillable = true)
    protected List<ServicioTO> servicioTO;

    /**
     * Gets the value of the servicioTO property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the servicioTO property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getServicioTO().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link ServicioTO }
     * 
     * 
     */
    public List<ServicioTO> getServicioTO() {
        if (servicioTO == null) {
            servicioTO = new ArrayList<ServicioTO>();
        }
        return this.servicioTO;
    }

}
