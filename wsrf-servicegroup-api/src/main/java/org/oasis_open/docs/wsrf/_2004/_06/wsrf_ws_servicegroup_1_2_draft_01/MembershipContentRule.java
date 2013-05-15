
package org.oasis_open.docs.wsrf._2004._06.wsrf_ws_servicegroup_1_2_draft_01;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlAttribute;
import javax.xml.bind.annotation.XmlRootElement;
import javax.xml.bind.annotation.XmlType;
import javax.xml.namespace.QName;


/**
 * <p>Java class for anonymous complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType>
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;attribute name="MemberInterface" type="{http://www.w3.org/2001/XMLSchema}QName" />
 *       &lt;attribute name="ContentElements" use="required" type="{http://docs.oasis-open.org/wsrf/2004/06/wsrf-WS-ServiceGroup-1.2-draft-01.xsd}ContentElementsType" />
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "")
@XmlRootElement(name = "MembershipContentRule")
public class MembershipContentRule
    implements Serializable
{

    @XmlAttribute(name = "MemberInterface")
    protected QName memberInterface;
    @XmlAttribute(name = "ContentElements", required = true)
    protected List<QName> contentElements;

    /**
     * Gets the value of the memberInterface property.
     * 
     * @return
     *     possible object is
     *     {@link QName }
     *     
     */
    public QName getMemberInterface() {
        return memberInterface;
    }

    /**
     * Sets the value of the memberInterface property.
     * 
     * @param value
     *     allowed object is
     *     {@link QName }
     *     
     */
    public void setMemberInterface(QName value) {
        this.memberInterface = value;
    }

    /**
     * Gets the value of the contentElements property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the contentElements property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getContentElements().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link QName }
     * 
     * 
     */
    public List<QName> getContentElements() {
        if (contentElements == null) {
            contentElements = new ArrayList<QName>();
        }
        return this.contentElements;
    }

}
