
package cl.group.dispacher.ws.regionComuna;

import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Clase Java para ArrayOfRegionTO complex type.
 * 
 * <p>El siguiente fragmento de esquema especifica el contenido que se espera que haya en esta clase.
 * 
 * <pre>
 * &lt;complexType name="ArrayOfRegionTO">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="RegionTO" type="{http://tempuri.org/}RegionTO" maxOccurs="unbounded" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "ArrayOfRegionTO", propOrder = {
    "regionTO"
})
public class ArrayOfRegionTO {

    @XmlElement(name = "RegionTO", nillable = true)
    protected List<RegionTO> regionTO;

    /**
     * Gets the value of the regionTO property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the regionTO property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getRegionTO().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link RegionTO }
     * 
     * 
     */
    public List<RegionTO> getRegionTO() {
        if (regionTO == null) {
            regionTO = new ArrayList<RegionTO>();
        }
        return this.regionTO;
    }

}
