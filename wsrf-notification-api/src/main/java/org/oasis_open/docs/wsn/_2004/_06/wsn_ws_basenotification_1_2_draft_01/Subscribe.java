
package org.oasis_open.docs.wsn._2004._06.wsn_ws_basenotification_1_2_draft_01;

import java.io.Serializable;
import java.util.Calendar;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlRootElement;
import javax.xml.bind.annotation.XmlSchemaType;
import javax.xml.bind.annotation.XmlType;
import javax.xml.bind.annotation.adapters.XmlJavaTypeAdapter;
import org.oasis_open.docs.wsrf._2004._06.wsrf_ws_resourceproperties_1_2_draft_01.QueryExpressionType;
import org.w3._2001.xmlschema.Adapter1;
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
 *         &lt;element name="ConsumerReference" type="{http://schemas.xmlsoap.org/ws/2004/03/addressing}EndpointReferenceType"/>
 *         &lt;element name="TopicExpression" type="{http://docs.oasis-open.org/wsn/2004/06/wsn-WS-BaseNotification-1.2-draft-01.xsd}TopicExpressionType"/>
 *         &lt;element name="UseNotify" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/>
 *         &lt;element name="Precondition" type="{http://docs.oasis-open.org/wsrf/2004/06/wsrf-WS-ResourceProperties-1.2-draft-01.xsd}QueryExpressionType" minOccurs="0"/>
 *         &lt;element name="Selector" type="{http://docs.oasis-open.org/wsrf/2004/06/wsrf-WS-ResourceProperties-1.2-draft-01.xsd}QueryExpressionType" minOccurs="0"/>
 *         &lt;element name="SubscriptionPolicy" type="{http://www.w3.org/2001/XMLSchema}anyType" minOccurs="0"/>
 *         &lt;element name="InitialTerminationTime" type="{http://www.w3.org/2001/XMLSchema}dateTime" minOccurs="0"/>
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
    "consumerReference",
    "topicExpression",
    "useNotify",
    "precondition",
    "selector",
    "subscriptionPolicy",
    "initialTerminationTime"
})
@XmlRootElement(name = "Subscribe")
public class Subscribe
    implements Serializable
{

    @XmlElement(name = "ConsumerReference", required = true)
    protected EndpointReferenceType consumerReference;
    @XmlElement(name = "TopicExpression", required = true)
    protected TopicExpressionType topicExpression;
    @XmlElement(name = "UseNotify", defaultValue = "true")
    protected Boolean useNotify;
    @XmlElement(name = "Precondition")
    protected QueryExpressionType precondition;
    @XmlElement(name = "Selector")
    protected QueryExpressionType selector;
    @XmlElement(name = "SubscriptionPolicy")
    protected Object subscriptionPolicy;
    @XmlElement(name = "InitialTerminationTime", type = String.class)
    @XmlJavaTypeAdapter(Adapter1 .class)
    @XmlSchemaType(name = "dateTime")
    protected Calendar initialTerminationTime;

    /**
     * Gets the value of the consumerReference property.
     * 
     * @return
     *     possible object is
     *     {@link EndpointReferenceType }
     *     
     */
    public EndpointReferenceType getConsumerReference() {
        return consumerReference;
    }

    /**
     * Sets the value of the consumerReference property.
     * 
     * @param value
     *     allowed object is
     *     {@link EndpointReferenceType }
     *     
     */
    public void setConsumerReference(EndpointReferenceType value) {
        this.consumerReference = value;
    }

    /**
     * Gets the value of the topicExpression property.
     * 
     * @return
     *     possible object is
     *     {@link TopicExpressionType }
     *     
     */
    public TopicExpressionType getTopicExpression() {
        return topicExpression;
    }

    /**
     * Sets the value of the topicExpression property.
     * 
     * @param value
     *     allowed object is
     *     {@link TopicExpressionType }
     *     
     */
    public void setTopicExpression(TopicExpressionType value) {
        this.topicExpression = value;
    }

    /**
     * Gets the value of the useNotify property.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isUseNotify() {
        return useNotify;
    }

    /**
     * Sets the value of the useNotify property.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setUseNotify(Boolean value) {
        this.useNotify = value;
    }

    /**
     * Gets the value of the precondition property.
     * 
     * @return
     *     possible object is
     *     {@link QueryExpressionType }
     *     
     */
    public QueryExpressionType getPrecondition() {
        return precondition;
    }

    /**
     * Sets the value of the precondition property.
     * 
     * @param value
     *     allowed object is
     *     {@link QueryExpressionType }
     *     
     */
    public void setPrecondition(QueryExpressionType value) {
        this.precondition = value;
    }

    /**
     * Gets the value of the selector property.
     * 
     * @return
     *     possible object is
     *     {@link QueryExpressionType }
     *     
     */
    public QueryExpressionType getSelector() {
        return selector;
    }

    /**
     * Sets the value of the selector property.
     * 
     * @param value
     *     allowed object is
     *     {@link QueryExpressionType }
     *     
     */
    public void setSelector(QueryExpressionType value) {
        this.selector = value;
    }

    /**
     * Gets the value of the subscriptionPolicy property.
     * 
     * @return
     *     possible object is
     *     {@link Object }
     *     
     */
    public Object getSubscriptionPolicy() {
        return subscriptionPolicy;
    }

    /**
     * Sets the value of the subscriptionPolicy property.
     * 
     * @param value
     *     allowed object is
     *     {@link Object }
     *     
     */
    public void setSubscriptionPolicy(Object value) {
        this.subscriptionPolicy = value;
    }

    /**
     * Gets the value of the initialTerminationTime property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public Calendar getInitialTerminationTime() {
        return initialTerminationTime;
    }

    /**
     * Sets the value of the initialTerminationTime property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setInitialTerminationTime(Calendar value) {
        this.initialTerminationTime = value;
    }

}
