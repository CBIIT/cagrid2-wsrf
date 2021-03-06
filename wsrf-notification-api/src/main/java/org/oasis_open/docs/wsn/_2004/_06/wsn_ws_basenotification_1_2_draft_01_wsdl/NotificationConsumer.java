package org.oasis_open.docs.wsn._2004._06.wsn_ws_basenotification_1_2_draft_01_wsdl;

import javax.jws.Oneway;
import javax.jws.WebMethod;
import javax.jws.WebParam;
import javax.jws.WebService;
import javax.xml.bind.annotation.XmlSeeAlso;
import javax.xml.ws.RequestWrapper;

/**
 * This class was generated by Apache CXF 2.6.3
 * 2013-04-11T11:06:15.791-04:00
 * Generated source version: 2.6.3
 * 
 */
@WebService(targetNamespace = "http://docs.oasis-open.org/wsn/2004/06/wsn-WS-BaseNotification-1.2-draft-01.wsdl", name = "NotificationConsumer")
@XmlSeeAlso({org.oasis_open.docs.wsn._2004._06.wsn_ws_basenotification_1_2_draft_01.ObjectFactory.class, org.xmlsoap.schemas.ws._2004._03.addressing.ObjectFactory.class, org.oasis_open.docs.wsrf._2004._06.wsrf_ws_resourceproperties_1_2_draft_01.ObjectFactory.class, org.oasis_open.docs.wsrf._2004._06.wsrf_ws_basefaults_1_2_draft_01.ObjectFactory.class, org.oasis_open.docs.wsrf._2004._06.wsrf_ws_resourcelifetime_1_2_draft_01.ObjectFactory.class})
public interface NotificationConsumer {

    @Oneway
    @RequestWrapper(localName = "Notify", targetNamespace = "http://docs.oasis-open.org/wsn/2004/06/wsn-WS-BaseNotification-1.2-draft-01.xsd", className = "org.oasis_open.docs.wsn._2004._06.wsn_ws_basenotification_1_2_draft_01.Notify")
    @WebMethod(operationName = "Notify", action = "http://docs.oasis-open.org/wsn/2004/06/wsn-WS-BaseNotification/Notify")
    public void notify(
        @WebParam(name = "NotificationMessage", targetNamespace = "http://docs.oasis-open.org/wsn/2004/06/wsn-WS-BaseNotification-1.2-draft-01.xsd")
        java.util.List<org.oasis_open.docs.wsn._2004._06.wsn_ws_basenotification_1_2_draft_01.NotificationMessageHolderType> notificationMessage
    );
}
