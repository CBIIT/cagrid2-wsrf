
package org.oasis_open.docs.wsrf._2004._06.wsrf_ws_servicegroup_1_2_draft_01;

import java.io.Serializable;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlRootElement;
import javax.xml.bind.annotation.XmlType;
import org.xmlsoap.schemas.ws._2004._03.addressing.EndpointReferenceType;


/**
 * <p>Java class for anonymous complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType>
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element ref="{http://docs.oasis-open.org/wsrf/2004/06/wsrf-WS-ServiceGroup-1.2-draft-01.xsd}ServiceGroupEPR"/>
 *         &lt;element ref="{http://docs.oasis-open.org/wsrf/2004/06/wsrf-WS-ServiceGroup-1.2-draft-01.xsd}MemberEPR"/>
 *         &lt;element ref="{http://docs.oasis-open.org/wsrf/2004/06/wsrf-WS-ServiceGroup-1.2-draft-01.xsd}Content"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "", propOrder = {
    "serviceGroupEPR",
    "memberEPR",
    "content"
})
@XmlRootElement(name = "ServiceGroupEntryRP")
public class ServiceGroupEntryRP
    implements Serializable
{

    @XmlElement(name = "ServiceGroupEPR", required = true)
    protected EndpointReferenceType serviceGroupEPR;
    @XmlElement(name = "MemberEPR", required = true)
    protected EndpointReferenceType memberEPR;
    @XmlElement(name = "Content", required = true)
    protected Object content;

    /**
     * Gets the value of the serviceGroupEPR property.
     * 
     * @return
     *     possible object is
     *     {@link EndpointReferenceType }
     *     
     */
    public EndpointReferenceType getServiceGroupEPR() {
        return serviceGroupEPR;
    }

    /**
     * Sets the value of the serviceGroupEPR property.
     * 
     * @param value
     *     allowed object is
     *     {@link EndpointReferenceType }
     *     
     */
    public void setServiceGroupEPR(EndpointReferenceType value) {
        this.serviceGroupEPR = value;
    }

    /**
     * Gets the value of the memberEPR property.
     * 
     * @return
     *     possible object is
     *     {@link EndpointReferenceType }
     *     
     */
    public EndpointReferenceType getMemberEPR() {
        return memberEPR;
    }

    /**
     * Sets the value of the memberEPR property.
     * 
     * @param value
     *     allowed object is
     *     {@link EndpointReferenceType }
     *     
     */
    public void setMemberEPR(EndpointReferenceType value) {
        this.memberEPR = value;
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
