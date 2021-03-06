
package org.oasis_open.docs.wsn._2004._06.wsn_ws_basenotification_1_2_draft_01_wsdl;

/**
 * Please modify this class to meet your needs
 * This class is not complete
 */

import java.io.File;
import java.net.MalformedURLException;
import java.net.URL;
import javax.xml.namespace.QName;
import org.oasis_open.docs.wsn._2004._06.wsn_ws_basenotification_1_2_draft_01_wsdl.service.WSBaseNotificationService;
import javax.jws.WebMethod;
import javax.jws.WebParam;
import javax.jws.WebResult;
import javax.jws.WebService;
import javax.jws.soap.SOAPBinding;
import javax.xml.bind.annotation.XmlSeeAlso;
import javax.xml.ws.RequestWrapper;
import javax.xml.ws.ResponseWrapper;

/**
 * This class was generated by Apache CXF 2.6.3
 * 2013-04-11T11:06:15.526-04:00
 * Generated source version: 2.6.3
 * 
 */
public final class NotificationProducer_NotificationProducerPort_Client {

    private static final QName SERVICE_NAME = new QName("http://docs.oasis-open.org/wsn/2004/06/wsn-WS-BaseNotification-1.2-draft-01.wsdl/service", "WS-BaseNotificationService");

    private NotificationProducer_NotificationProducerPort_Client() {
    }

    public static void main(String args[]) throws java.lang.Exception {
        URL wsdlURL = WSBaseNotificationService.WSDL_LOCATION;
        if (args.length > 0 && args[0] != null && !"".equals(args[0])) { 
            File wsdlFile = new File(args[0]);
            try {
                if (wsdlFile.exists()) {
                    wsdlURL = wsdlFile.toURI().toURL();
                } else {
                    wsdlURL = new URL(args[0]);
                }
            } catch (MalformedURLException e) {
                e.printStackTrace();
            }
        }
      
        WSBaseNotificationService ss = new WSBaseNotificationService(wsdlURL, SERVICE_NAME);
        NotificationProducer port = ss.getNotificationProducerPort();  
        
        {
        System.out.println("Invoking getCurrentMessage...");
        org.oasis_open.docs.wsn._2004._06.wsn_ws_basenotification_1_2_draft_01.GetCurrentMessage _getCurrentMessage_getCurrentMessageRequest = null;
        try {
            org.oasis_open.docs.wsn._2004._06.wsn_ws_basenotification_1_2_draft_01.GetCurrentMessageResponse _getCurrentMessage__return = port.getCurrentMessage(_getCurrentMessage_getCurrentMessageRequest);
            System.out.println("getCurrentMessage.result=" + _getCurrentMessage__return);

        } catch (ResourceUnknownFault e) { 
            System.out.println("Expected exception: ResourceUnknownFault has occurred.");
            System.out.println(e.toString());
        } catch (InvalidTopicExpressionFault e) { 
            System.out.println("Expected exception: InvalidTopicExpressionFault has occurred.");
            System.out.println(e.toString());
        } catch (NoCurrentMessageOnTopicFault e) { 
            System.out.println("Expected exception: NoCurrentMessageOnTopicFault has occurred.");
            System.out.println(e.toString());
        } catch (TopicNotSupportedFault e) { 
            System.out.println("Expected exception: TopicNotSupportedFault has occurred.");
            System.out.println(e.toString());
        }
            }
        {
        System.out.println("Invoking getResourceProperty...");
        javax.xml.namespace.QName _getResourceProperty_getResourcePropertyRequest = new javax.xml.namespace.QName("", "");
        try {
            org.oasis_open.docs.wsrf._2004._06.wsrf_ws_resourceproperties_1_2_draft_01.GetResourcePropertyResponse _getResourceProperty__return = port.getResourceProperty(_getResourceProperty_getResourcePropertyRequest);
            System.out.println("getResourceProperty.result=" + _getResourceProperty__return);

        } catch (org.oasis_open.docs.wsrf._2004._06.wsrf_ws_resourceproperties_1_2_draft_01_wsdl.ResourceUnknownFault e) { 
            System.out.println("Expected exception: ResourceUnknownFault has occurred.");
            System.out.println(e.toString());
        } catch (org.oasis_open.docs.wsrf._2004._06.wsrf_ws_resourceproperties_1_2_draft_01_wsdl.InvalidResourcePropertyQNameFault e) { 
            System.out.println("Expected exception: InvalidResourcePropertyQNameFault has occurred.");
            System.out.println(e.toString());
        }
            }
        {
        System.out.println("Invoking subscribe...");
        org.xmlsoap.schemas.ws._2004._03.addressing.EndpointReferenceType _subscribe_consumerReference = null;
        org.oasis_open.docs.wsn._2004._06.wsn_ws_basenotification_1_2_draft_01.TopicExpressionType _subscribe_topicExpression = null;
        java.lang.Boolean _subscribe_useNotify = null;
        org.oasis_open.docs.wsrf._2004._06.wsrf_ws_resourceproperties_1_2_draft_01.QueryExpressionType _subscribe_precondition = null;
        org.oasis_open.docs.wsrf._2004._06.wsrf_ws_resourceproperties_1_2_draft_01.QueryExpressionType _subscribe_selector = null;
        java.lang.Object _subscribe_subscriptionPolicy = new java.lang.Object();
        java.util.Calendar _subscribe_initialTerminationTime = null;
        try {
            org.xmlsoap.schemas.ws._2004._03.addressing.EndpointReferenceType _subscribe__return = port.subscribe(_subscribe_consumerReference, _subscribe_topicExpression, _subscribe_useNotify, _subscribe_precondition, _subscribe_selector, _subscribe_subscriptionPolicy, _subscribe_initialTerminationTime);
            System.out.println("subscribe.result=" + _subscribe__return);

        } catch (ResourceUnknownFault e) { 
            System.out.println("Expected exception: ResourceUnknownFault has occurred.");
            System.out.println(e.toString());
        } catch (SubscribeCreationFailedFault e) { 
            System.out.println("Expected exception: SubscribeCreationFailedFault has occurred.");
            System.out.println(e.toString());
        } catch (InvalidTopicExpressionFault e) { 
            System.out.println("Expected exception: InvalidTopicExpressionFault has occurred.");
            System.out.println(e.toString());
        } catch (TopicPathDialectUnknownFault e) { 
            System.out.println("Expected exception: TopicPathDialectUnknownFault has occurred.");
            System.out.println(e.toString());
        } catch (TopicNotSupportedFault e) { 
            System.out.println("Expected exception: TopicNotSupportedFault has occurred.");
            System.out.println(e.toString());
        }
            }

        System.exit(0);
    }

}
