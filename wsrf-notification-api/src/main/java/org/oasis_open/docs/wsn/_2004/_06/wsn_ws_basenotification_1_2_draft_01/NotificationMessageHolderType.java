
package org.oasis_open.docs.wsn._2004._06.wsn_ws_basenotification_1_2_draft_01;

import java.io.Serializable;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;
import org.xmlsoap.schemas.ws._2004._03.addressing.EndpointReferenceType;


/**
 * <p>Java class for NotificationMessageHolderType complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="NotificationMessageHolderType">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="Topic" type="{http://docs.oasis-open.org/wsn/2004/06/wsn-WS-BaseNotification-1.2-draft-01.xsd}TopicExpressionType"/>
 *         &lt;element name="ProducerReference" type="{http://schemas.xmlsoap.org/ws/2004/03/addressing}EndpointReferenceType" minOccurs="0"/>
 *         &lt;element name="Message" type="{http://www.w3.org/2001/XMLSchema}anyType"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "NotificationMessageHolderType", propOrder = {
    "topic",
    "producerReference",
    "message"
})
public class NotificationMessageHolderType
    implements Serializable
{

    @XmlElement(name = "Topic", required = true)
    protected TopicExpressionType topic;
    @XmlElement(name = "ProducerReference")
    protected EndpointReferenceType producerReference;
    @XmlElement(name = "Message", required = true)
    protected Object message;

    /**
     * Gets the value of the topic property.
     * 
     * @return
     *     possible object is
     *     {@link TopicExpressionType }
     *     
     */
    public TopicExpressionType getTopic() {
        return topic;
    }

    /**
     * Sets the value of the topic property.
     * 
     * @param value
     *     allowed object is
     *     {@link TopicExpressionType }
     *     
     */
    public void setTopic(TopicExpressionType value) {
        this.topic = value;
    }

    /**
     * Gets the value of the producerReference property.
     * 
     * @return
     *     possible object is
     *     {@link EndpointReferenceType }
     *     
     */
    public EndpointReferenceType getProducerReference() {
        return producerReference;
    }

    /**
     * Sets the value of the producerReference property.
     * 
     * @param value
     *     allowed object is
     *     {@link EndpointReferenceType }
     *     
     */
    public void setProducerReference(EndpointReferenceType value) {
        this.producerReference = value;
    }

    /**
     * Gets the value of the message property.
     * 
     * @return
     *     possible object is
     *     {@link Object }
     *     
     */
    public Object getMessage() {
        return message;
    }

    /**
     * Sets the value of the message property.
     * 
     * @param value
     *     allowed object is
     *     {@link Object }
     *     
     */
    public void setMessage(Object value) {
        this.message = value;
    }

}
