
/**
 * Please modify this class to meet your needs
 * This class is not complete
 */

package org.oasis_open.docs.wsrf._2004._06.wsrf_ws_servicegroup_1_2_draft_01_wsdl;

import java.util.logging.Logger;
import javax.jws.WebMethod;
import javax.jws.WebParam;
import javax.jws.WebResult;
import javax.jws.WebService;
import javax.jws.soap.SOAPBinding;
import javax.xml.bind.annotation.XmlSeeAlso;

/**
 * This class was generated by Apache CXF 2.6.3
 * 2013-04-11T11:24:42.456-04:00
 * Generated source version: 2.6.3
 * 
 */

@javax.jws.WebService(
                      serviceName = "ServiceGroupService",
                      portName = "ServiceGroupEntryPort",
                      targetNamespace = "http://docs.oasis-open.org/wsrf/2004/06/wsrf-WS-ServiceGroup-1.2-draft-01.wsdl/service",
                      wsdlLocation = "/schema/org/cagrid/wsrf/servicegroup/WS-ServiceGroup_service.wsdl",
                      endpointInterface = "org.oasis_open.docs.wsrf._2004._06.wsrf_ws_servicegroup_1_2_draft_01_wsdl.ServiceGroupEntry")
                      
public class ServiceGroupEntryImpl implements ServiceGroupEntry {

    private static final Logger LOG = Logger.getLogger(ServiceGroupEntryImpl.class.getName());

    /* (non-Javadoc)
     * @see org.oasis_open.docs.wsrf._2004._06.wsrf_ws_servicegroup_1_2_draft_01_wsdl.ServiceGroupEntry#getResourceProperty(javax.xml.namespace.QName  getResourcePropertyRequest )*
     */
    public org.oasis_open.docs.wsrf._2004._06.wsrf_ws_resourceproperties_1_2_draft_01.GetResourcePropertyResponse getResourceProperty(javax.xml.namespace.QName getResourcePropertyRequest) throws org.oasis_open.docs.wsrf._2004._06.wsrf_ws_resourceproperties_1_2_draft_01_wsdl.ResourceUnknownFault , org.oasis_open.docs.wsrf._2004._06.wsrf_ws_resourceproperties_1_2_draft_01_wsdl.InvalidResourcePropertyQNameFault    { 
        LOG.info("Executing operation getResourceProperty");
        System.out.println(getResourcePropertyRequest);
        try {
            org.oasis_open.docs.wsrf._2004._06.wsrf_ws_resourceproperties_1_2_draft_01.GetResourcePropertyResponse _return = null;
            return _return;
        } catch (java.lang.Exception ex) {
            ex.printStackTrace();
            throw new RuntimeException(ex);
        }
        //throw new org.oasis_open.docs.wsrf._2004._06.wsrf_ws_resourceproperties_1_2_draft_01_wsdl.ResourceUnknownFault("ResourceUnknownFault...");
        //throw new org.oasis_open.docs.wsrf._2004._06.wsrf_ws_resourceproperties_1_2_draft_01_wsdl.InvalidResourcePropertyQNameFault("InvalidResourcePropertyQNameFault...");
    }

}
