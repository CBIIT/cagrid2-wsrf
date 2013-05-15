package org.oasis_open.docs.wsn._2004._06.wsn_ws_basenotification_1_2_draft_01_wsdl;

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
 * 2013-04-11T11:06:15.783-04:00
 * Generated source version: 2.6.3
 * 
 */
@WebService(targetNamespace = "http://docs.oasis-open.org/wsn/2004/06/wsn-WS-BaseNotification-1.2-draft-01.wsdl", name = "SubscriptionManager")
@XmlSeeAlso({org.oasis_open.docs.wsn._2004._06.wsn_ws_basenotification_1_2_draft_01.ObjectFactory.class, org.xmlsoap.schemas.ws._2004._03.addressing.ObjectFactory.class, org.oasis_open.docs.wsrf._2004._06.wsrf_ws_resourceproperties_1_2_draft_01.ObjectFactory.class, org.oasis_open.docs.wsrf._2004._06.wsrf_ws_basefaults_1_2_draft_01.ObjectFactory.class, org.oasis_open.docs.wsrf._2004._06.wsrf_ws_resourcelifetime_1_2_draft_01.ObjectFactory.class})
public interface SubscriptionManager {

    @RequestWrapper(localName = "ResumeSubscription", targetNamespace = "http://docs.oasis-open.org/wsn/2004/06/wsn-WS-BaseNotification-1.2-draft-01.xsd", className = "org.oasis_open.docs.wsn._2004._06.wsn_ws_basenotification_1_2_draft_01.ResumeSubscription")
    @WebMethod(operationName = "ResumeSubscription", action = "http://docs.oasis-open.org/wsn/2004/06/wsn-WS-BaseNotification/ResumeSubscription")
    @ResponseWrapper(localName = "ResumeSubscriptionResponse", targetNamespace = "http://docs.oasis-open.org/wsn/2004/06/wsn-WS-BaseNotification-1.2-draft-01.xsd", className = "org.oasis_open.docs.wsn._2004._06.wsn_ws_basenotification_1_2_draft_01.ResumeSubscriptionResponse")
    public void resumeSubscription() throws ResumeFailedFault, ResourceUnknownFault;

    @RequestWrapper(localName = "SetTerminationTime", targetNamespace = "http://docs.oasis-open.org/wsrf/2004/06/wsrf-WS-ResourceLifetime-1.2-draft-01.xsd", className = "org.oasis_open.docs.wsrf._2004._06.wsrf_ws_resourcelifetime_1_2_draft_01.SetTerminationTime")
    @WebMethod(operationName = "SetTerminationTime", action = "http://docs.oasis-open.org/wsrf/2004/06/wsrf-WS-ResourceLifetime/SetTerminationTime")
    @ResponseWrapper(localName = "SetTerminationTimeResponse", targetNamespace = "http://docs.oasis-open.org/wsrf/2004/06/wsrf-WS-ResourceLifetime-1.2-draft-01.xsd", className = "org.oasis_open.docs.wsrf._2004._06.wsrf_ws_resourcelifetime_1_2_draft_01.SetTerminationTimeResponse")
    public void setTerminationTime(
        @WebParam(name = "RequestedTerminationTime", targetNamespace = "http://docs.oasis-open.org/wsrf/2004/06/wsrf-WS-ResourceLifetime-1.2-draft-01.xsd")
        java.util.Calendar requestedTerminationTime,
        @WebParam(mode = WebParam.Mode.OUT, name = "NewTerminationTime", targetNamespace = "http://docs.oasis-open.org/wsrf/2004/06/wsrf-WS-ResourceLifetime-1.2-draft-01.xsd")
        javax.xml.ws.Holder<java.util.Calendar> newTerminationTime,
        @WebParam(mode = WebParam.Mode.OUT, name = "CurrentTime", targetNamespace = "http://docs.oasis-open.org/wsrf/2004/06/wsrf-WS-ResourceLifetime-1.2-draft-01.xsd")
        javax.xml.ws.Holder<java.util.Calendar> currentTime
    ) throws org.oasis_open.docs.wsrf._2004._06.wsrf_ws_resourcelifetime_1_2_draft_01_wsdl.ResourceUnknownFault, org.oasis_open.docs.wsrf._2004._06.wsrf_ws_resourcelifetime_1_2_draft_01_wsdl.TerminationTimeChangeRejectedFault, org.oasis_open.docs.wsrf._2004._06.wsrf_ws_resourcelifetime_1_2_draft_01_wsdl.UnableToSetTerminationTimeFault;

    @RequestWrapper(localName = "Destroy", targetNamespace = "http://docs.oasis-open.org/wsrf/2004/06/wsrf-WS-ResourceLifetime-1.2-draft-01.xsd", className = "org.oasis_open.docs.wsrf._2004._06.wsrf_ws_resourcelifetime_1_2_draft_01.Destroy")
    @WebMethod(operationName = "Destroy", action = "http://docs.oasis-open.org/wsrf/2004/06/wsrf-WS-ResourceLifetime/Destroy")
    @ResponseWrapper(localName = "DestroyResponse", targetNamespace = "http://docs.oasis-open.org/wsrf/2004/06/wsrf-WS-ResourceLifetime-1.2-draft-01.xsd", className = "org.oasis_open.docs.wsrf._2004._06.wsrf_ws_resourcelifetime_1_2_draft_01.DestroyResponse")
    public void destroy() throws org.oasis_open.docs.wsrf._2004._06.wsrf_ws_resourcelifetime_1_2_draft_01_wsdl.ResourceUnknownFault, org.oasis_open.docs.wsrf._2004._06.wsrf_ws_resourcelifetime_1_2_draft_01_wsdl.ResourceNotDestroyedFault;

    @SOAPBinding(parameterStyle = SOAPBinding.ParameterStyle.BARE)
    @WebResult(name = "GetResourcePropertyResponse", targetNamespace = "http://docs.oasis-open.org/wsrf/2004/06/wsrf-WS-ResourceProperties-1.2-draft-01.xsd", partName = "GetResourcePropertyResponse")
    @WebMethod(operationName = "GetResourceProperty", action = "http://docs.oasis-open.org/wsrf/2004/06/wsrf-WS-ResourceProperties/GetResourceProperty")
    public org.oasis_open.docs.wsrf._2004._06.wsrf_ws_resourceproperties_1_2_draft_01.GetResourcePropertyResponse getResourceProperty(
        @WebParam(partName = "GetResourcePropertyRequest", name = "GetResourceProperty", targetNamespace = "http://docs.oasis-open.org/wsrf/2004/06/wsrf-WS-ResourceProperties-1.2-draft-01.xsd")
        javax.xml.namespace.QName getResourcePropertyRequest
    ) throws org.oasis_open.docs.wsrf._2004._06.wsrf_ws_resourceproperties_1_2_draft_01_wsdl.ResourceUnknownFault, org.oasis_open.docs.wsrf._2004._06.wsrf_ws_resourceproperties_1_2_draft_01_wsdl.InvalidResourcePropertyQNameFault;

    @RequestWrapper(localName = "PauseSubscription", targetNamespace = "http://docs.oasis-open.org/wsn/2004/06/wsn-WS-BaseNotification-1.2-draft-01.xsd", className = "org.oasis_open.docs.wsn._2004._06.wsn_ws_basenotification_1_2_draft_01.PauseSubscription")
    @WebMethod(operationName = "PauseSubscription", action = "http://docs.oasis-open.org/wsn/2004/06/wsn-WS-BaseNotification/PauseSubscription")
    @ResponseWrapper(localName = "PauseSubscriptionResponse", targetNamespace = "http://docs.oasis-open.org/wsn/2004/06/wsn-WS-BaseNotification-1.2-draft-01.xsd", className = "org.oasis_open.docs.wsn._2004._06.wsn_ws_basenotification_1_2_draft_01.PauseSubscriptionResponse")
    public void pauseSubscription() throws ResourceUnknownFault, PauseFailedFault;
}
