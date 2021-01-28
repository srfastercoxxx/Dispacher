
package cl.group.dispacher.ws.tarifacion;

import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Clase Java para ArrayOfConceptoTasacionTO complex type.
 * 
 * <p>El siguiente fragmento de esquema especifica el contenido que se espera que haya en esta clase.
 * 
 * <pre>
 * &lt;complexType name="ArrayOfConceptoTasacionTO">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="ConceptoTasacionTO" type="{http://tempuri.org/}ConceptoTasacionTO" maxOccurs="unbounded" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "ArrayOfConceptoTasacionTO", propOrder = {
    "conceptoTasacionTO"
})
public class ArrayOfConceptoTasacionTO {

    @XmlElement(name = "ConceptoTasacionTO", nillable = true)
    protected List<ConceptoTasacionTO> conceptoTasacionTO;

    /**
     * Gets the value of the conceptoTasacionTO property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the conceptoTasacionTO property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getConceptoTasacionTO().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link ConceptoTasacionTO }
     * 
     * 
     */
    public List<ConceptoTasacionTO> getConceptoTasacionTO() {
        if (conceptoTasacionTO == null) {
            conceptoTasacionTO = new ArrayList<ConceptoTasacionTO>();
        }
        return this.conceptoTasacionTO;
    }

}
