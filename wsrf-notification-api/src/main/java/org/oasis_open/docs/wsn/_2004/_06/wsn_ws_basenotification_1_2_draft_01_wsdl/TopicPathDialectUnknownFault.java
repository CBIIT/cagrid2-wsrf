
package org.oasis_open.docs.wsn._2004._06.wsn_ws_basenotification_1_2_draft_01_wsdl;

import javax.xml.ws.WebFault;


/**
 * This class was generated by Apache CXF 2.6.3
 * 2013-04-11T11:06:15.659-04:00
 * Generated source version: 2.6.3
 */

@WebFault(name = "TopicPathDialectUnknownFault", targetNamespace = "http://docs.oasis-open.org/wsn/2004/06/wsn-WS-BaseNotification-1.2-draft-01.xsd")
public class TopicPathDialectUnknownFault extends Exception {
    
    private org.oasis_open.docs.wsn._2004._06.wsn_ws_basenotification_1_2_draft_01.TopicPathDialectUnknownFaultType topicPathDialectUnknownFault;

    public TopicPathDialectUnknownFault() {
        super();
    }
    
    public TopicPathDialectUnknownFault(String message) {
        super(message);
    }
    
    public TopicPathDialectUnknownFault(String message, Throwable cause) {
        super(message, cause);
    }

    public TopicPathDialectUnknownFault(String message, org.oasis_open.docs.wsn._2004._06.wsn_ws_basenotification_1_2_draft_01.TopicPathDialectUnknownFaultType topicPathDialectUnknownFault) {
        super(message);
        this.topicPathDialectUnknownFault = topicPathDialectUnknownFault;
    }

    public TopicPathDialectUnknownFault(String message, org.oasis_open.docs.wsn._2004._06.wsn_ws_basenotification_1_2_draft_01.TopicPathDialectUnknownFaultType topicPathDialectUnknownFault, Throwable cause) {
        super(message, cause);
        this.topicPathDialectUnknownFault = topicPathDialectUnknownFault;
    }

    public org.oasis_open.docs.wsn._2004._06.wsn_ws_basenotification_1_2_draft_01.TopicPathDialectUnknownFaultType getFaultInfo() {
        return this.topicPathDialectUnknownFault;
    }
}