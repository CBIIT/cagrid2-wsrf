
package org.oasis_open.docs.wsrf._2004._06.wsrf_ws_servicegroup_1_2_draft_01;

import java.io.Serializable;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlSeeAlso;
import javax.xml.bind.annotation.XmlType;
import org.xmlsoap.schemas.ws._2004._03.addressing.EndpointReferenceType;


/**
 * <p>Java class for ServiceGroupModificationNotificationType complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="ServiceGroupModificationNotificationType">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="ServiceGroupEntryEPR" type="{http://schemas.xmlsoap.org/ws/2004/03/addressing}EndpointReferenceType"/>
 *         &lt;element name="MemberServiceEPR" type="{http://schemas.xmlsoap.org/ws/2004/03/addressing}EndpointReferenceType"/>
 *         &lt;element name="Content" type="{http://www.w3.org/2001/XMLSchema}anyType" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "ServiceGroupModificationNotificationType", propOrder = {
    "serviceGroupEntryEPR",
    "memberServiceEPR",
    "content"
})
@XmlSeeAlso({
    ServiceGroupRemovalNotificationType.class
})
public class ServiceGroupModificationNotificationType
    implements Serializable
{

    @XmlElement(name = "ServiceGroupEntryEPR", required = true, nillable = true)
    protected EndpointReferenceType serviceGroupEntryEPR;
    @XmlElement(name = "MemberServiceEPR", required = true)
    protected EndpointReferenceType memberServiceEPR;
    @XmlElement(name = "Content")
    protected Object content;

    /**
     * Gets the value of the serviceGroupEntryEPR property.
     * 
     * @return
     *     possible object is
     *     {@link EndpointReferenceType }
     *     
     */
    public EndpointReferenceType getServiceGroupEntryEPR() {
        return serviceGroupEntryEPR;
    }

    /**
     * Sets the value of the serviceGroupEntryEPR property.
     * 
     * @param value
     *     allowed object is
     *     {@link EndpointReferenceType }
     *     
     */
    public void setServiceGroupEntryEPR(EndpointReferenceType value) {
        this.serviceGroupEntryEPR = value;
    }

    /**
     * Gets the value of the memberServiceEPR property.
     * 
     * @return
     *     possible object is
     *     {@link EndpointReferenceType }
     *     
     */
    public EndpointReferenceType getMemberServiceEPR() {
        return memberServiceEPR;
    }

    /**
     * Sets the value of the memberServiceEPR property.
     * 
     * @param value
     *     allowed object is
     *     {@link EndpointReferenceType }
     *     
     */
    public void setMemberServiceEPR(EndpointReferenceType value) {
        this.memberServiceEPR = value;
    }

    /**
     * Gets the value of the content property.
     * 
     * @return
     *     possible object is
     *     {@link Object }
     *     
     */
    public Object getContent() {
        return content;
    }

    /**
     * Sets the value of the content property.
     * 
     * @param value
     *     allowed object is
     *     {@link Object }
     *     
     */
    public void setContent(Object value) {
        this.content = value;
    }

}
