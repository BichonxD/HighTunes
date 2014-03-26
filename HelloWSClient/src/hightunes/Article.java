
package hightunes;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlSchemaType;
import javax.xml.bind.annotation.XmlType;
import javax.xml.datatype.XMLGregorianCalendar;


/**
 * <p>Java class for article complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="article">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="cle" type="{http://www.w3.org/2001/XMLSchema}int"/>
 *         &lt;element name="dateDisponibilite" type="{http://www.w3.org/2001/XMLSchema}dateTime" minOccurs="0"/>
 *         &lt;element name="description" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="prix" type="{http://www.w3.org/2001/XMLSchema}float"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "article", propOrder = {
    "cle",
    "dateDisponibilite",
    "description",
    "prix"
})
public class Article {

    protected int cle;
    @XmlSchemaType(name = "dateTime")
    protected XMLGregorianCalendar dateDisponibilite;
    protected String description;
    protected float prix;

    /**
     * Gets the value of the cle property.
     * 
     */
    public int getCle() {
        return cle;
    }

    /**
     * Sets the value of the cle property.
     * 
     */
    public void setCle(int value) {
        this.cle = value;
    }

    /**
     * Gets the value of the dateDisponibilite property.
     * 
     * @return
     *     possible object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public XMLGregorianCalendar getDateDisponibilite() {
        return dateDisponibilite;
    }

    /**
     * Sets the value of the dateDisponibilite property.
     * 
     * @param value
     *     allowed object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public void setDateDisponibilite(XMLGregorianCalendar value) {
        this.dateDisponibilite = value;
    }

    /**
     * Gets the value of the description property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getDescription() {
        return description;
    }

    /**
     * Sets the value of the description property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setDescription(String value) {
        this.description = value;
    }

    /**
     * Gets the value of the prix property.
     * 
     */
    public float getPrix() {
        return prix;
    }

    /**
     * Sets the value of the prix property.
     * 
     */
    public void setPrix(float value) {
        this.prix = value;
    }

}
