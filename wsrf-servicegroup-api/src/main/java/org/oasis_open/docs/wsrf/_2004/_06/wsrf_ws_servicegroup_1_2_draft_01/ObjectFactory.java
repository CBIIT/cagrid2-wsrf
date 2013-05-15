
package org.oasis_open.docs.wsrf._2004._06.wsrf_ws_servicegroup_1_2_draft_01;

import javax.xml.bind.JAXBElement;
import javax.xml.bind.annotation.XmlElementDecl;
import javax.xml.bind.annotation.XmlRegistry;
import javax.xml.namespace.QName;
import org.xmlsoap.schemas.ws._2004._03.addressing.EndpointReferenceType;


/**
 * This object contains factory methods for each 
 * Java content interface and Java element interface 
 * generated in the org.oasis_open.docs.wsrf._2004._06.wsrf_ws_servicegroup_1_2_draft_01 package. 
 * <p>An ObjectFactory allows you to programatically 
 * construct new instances of the Java representation 
 * for XML content. The Java representation of XML 
 * content can consist of schema derived interfaces 
 * and classes representing the binding of schema 
 * type definitions, element declarations and model 
 * groups.  Factory methods for each of these are 
 * provided in this class.
 * 
 */
@XmlRegistry
public class ObjectFactory {

    private final static QName _EntryRemovalNotification_QNAME = new QName("http://docs.oasis-open.org/wsrf/2004/06/wsrf-WS-ServiceGroup-1.2-draft-01.xsd", "EntryRemovalNotification");
    private final static QName _ServiceGroupEPR_QNAME = new QName("http://docs.oasis-open.org/wsrf/2004/06/wsrf-WS-ServiceGroup-1.2-draft-01.xsd", "ServiceGroupEPR");
    private final static QName _UnsupportedMemberInterfaceFault_QNAME = new QName("http://docs.oasis-open.org/wsrf/2004/06/wsrf-WS-ServiceGroup-1.2-draft-01.xsd", "UnsupportedMemberInterfaceFault");
    private final static QName _AddRefusedFault_QNAME = new QName("http://docs.oasis-open.org/wsrf/2004/06/wsrf-WS-ServiceGroup-1.2-draft-01.xsd", "AddRefusedFault");
    private final static QName _Entry_QNAME = new QName("http://docs.oasis-open.org/wsrf/2004/06/wsrf-WS-ServiceGroup-1.2-draft-01.xsd", "Entry");
    private final static QName _Content_QNAME = new QName("http://docs.oasis-open.org/wsrf/2004/06/wsrf-WS-ServiceGroup-1.2-draft-01.xsd", "Content");
    private final static QName _AddResponse_QNAME = new QName("http://docs.oasis-open.org/wsrf/2004/06/wsrf-WS-ServiceGroup-1.2-draft-01.xsd", "AddResponse");
    private final static QName _EntryAdditionNotification_QNAME = new QName("http://docs.oasis-open.org/wsrf/2004/06/wsrf-WS-ServiceGroup-1.2-draft-01.xsd", "EntryAdditionNotification");
    private final static QName _MemberEPR_QNAME = new QName("http://docs.oasis-open.org/wsrf/2004/06/wsrf-WS-ServiceGroup-1.2-draft-01.xsd", "MemberEPR");
    private final static QName _ContentCreationFailedFault_QNAME = new QName("http://docs.oasis-open.org/wsrf/2004/06/wsrf-WS-ServiceGroup-1.2-draft-01.xsd", "ContentCreationFailedFault");

    /**
     * Create a new ObjectFactory that can be used to create new instances of schema derived classes for package: org.oasis_open.docs.wsrf._2004._06.wsrf_ws_servicegroup_1_2_draft_01
     * 
     */
    public ObjectFactory() {
    }

    /**
     * Create an instance of {@link ContentCreationFailedFaultType }
     * 
     */
    public ContentCreationFailedFaultType createContentCreationFailedFaultType() {
        return new ContentCreationFailedFaultType();
    }

    /**
     * Create an instance of {@link ServiceGroupModificationNotificationType }
     * 
     */
    public ServiceGroupModificationNotificationType createServiceGroupModificationNotificationType() {
        return new ServiceGroupModificationNotificationType();
    }

    /**
     * Create an instance of {@link ServiceGroupEntryRP }
     * 
     */
    public ServiceGroupEntryRP createServiceGroupEntryRP() {
        return new ServiceGroupEntryRP();
    }

    /**
     * Create an instance of {@link MembershipContentRule }
     * 
     */
    public MembershipContentRule createMembershipContentRule() {
        return new MembershipContentRule();
    }

    /**
     * Create an instance of {@link EntryType }
     * 
     */
    public EntryType createEntryType() {
        return new EntryType();
    }

    /**
     * Create an instance of {@link AddRefusedFaultType }
     * 
     */
    public AddRefusedFaultType createAddRefusedFaultType() {
        return new AddRefusedFaultType();
    }

    /**
     * Create an instance of {@link ServiceGroupRemovalNotificationType }
     * 
     */
    public ServiceGroupRemovalNotificationType createServiceGroupRemovalNotificationType() {
        return new ServiceGroupRemovalNotificationType();
    }

    /**
     * Create an instance of {@link UnsupportedMemberInterfaceFaultType }
     * 
     */
    public UnsupportedMemberInterfaceFaultType createUnsupportedMemberInterfaceFaultType() {
        return new UnsupportedMemberInterfaceFaultType();
    }

    /**
     * Create an instance of {@link ServiceGroupRP }
     * 
     */
    public ServiceGroupRP createServiceGroupRP() {
        return new ServiceGroupRP();
    }

    /**
     * Create an instance of {@link Add }
     * 
     */
    public Add createAdd() {
        return new Add();
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link ServiceGroupRemovalNotificationType }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://docs.oasis-open.org/wsrf/2004/06/wsrf-WS-ServiceGroup-1.2-draft-01.xsd", name = "EntryRemovalNotification")
    public JAXBElement<ServiceGroupRemovalNotificationType> createEntryRemovalNotification(ServiceGroupRemovalNotificationType value) {
        return new JAXBElement<ServiceGroupRemovalNotificationType>(_EntryRemovalNotification_QNAME, ServiceGroupRemovalNotificationType.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link EndpointReferenceType }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://docs.oasis-open.org/wsrf/2004/06/wsrf-WS-ServiceGroup-1.2-draft-01.xsd", name = "ServiceGroupEPR")
    public JAXBElement<EndpointReferenceType> createServiceGroupEPR(EndpointReferenceType value) {
        return new JAXBElement<EndpointReferenceType>(_ServiceGroupEPR_QNAME, EndpointReferenceType.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link UnsupportedMemberInterfaceFaultType }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://docs.oasis-open.org/wsrf/2004/06/wsrf-WS-ServiceGroup-1.2-draft-01.xsd", name = "UnsupportedMemberInterfaceFault")
    public JAXBElement<UnsupportedMemberInterfaceFaultType> createUnsupportedMemberInterfaceFault(UnsupportedMemberInterfaceFaultType value) {
        return new JAXBElement<UnsupportedMemberInterfaceFaultType>(_UnsupportedMemberInterfaceFault_QNAME, UnsupportedMemberInterfaceFaultType.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link AddRefusedFaultType }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://docs.oasis-open.org/wsrf/2004/06/wsrf-WS-ServiceGroup-1.2-draft-01.xsd", name = "AddRefusedFault")
    public JAXBElement<AddRefusedFaultType> createAddRefusedFault(AddRefusedFaultType value) {
        return new JAXBElement<AddRefusedFaultType>(_AddRefusedFault_QNAME, AddRefusedFaultType.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link EntryType }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://docs.oasis-open.org/wsrf/2004/06/wsrf-WS-ServiceGroup-1.2-draft-01.xsd", name = "Entry")
    public JAXBElement<EntryType> createEntry(EntryType value) {
        return new JAXBElement<EntryType>(_Entry_QNAME, EntryType.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link Object }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://docs.oasis-open.org/wsrf/2004/06/wsrf-WS-ServiceGroup-1.2-draft-01.xsd", name = "Content")
    public JAXBElement<Object> createContent(Object value) {
        return new JAXBElement<Object>(_Content_QNAME, Object.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link EndpointReferenceType }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://docs.oasis-open.org/wsrf/2004/06/wsrf-WS-ServiceGroup-1.2-draft-01.xsd", name = "AddResponse")
    public JAXBElement<EndpointReferenceType> createAddResponse(EndpointReferenceType value) {
        return new JAXBElement<EndpointReferenceType>(_AddResponse_QNAME, EndpointReferenceType.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link ServiceGroupModificationNotificationType }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://docs.oasis-open.org/wsrf/2004/06/wsrf-WS-ServiceGroup-1.2-draft-01.xsd", name = "EntryAdditionNotification")
    public JAXBElement<ServiceGroupModificationNotificationType> createEntryAdditionNotification(ServiceGroupModificationNotificationType value) {
        return new JAXBElement<ServiceGroupModificationNotificationType>(_EntryAdditionNotification_QNAME, ServiceGroupModificationNotificationType.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link EndpointReferenceType }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://docs.oasis-open.org/wsrf/2004/06/wsrf-WS-ServiceGroup-1.2-draft-01.xsd", name = "MemberEPR")
    public JAXBElement<EndpointReferenceType> createMemberEPR(EndpointReferenceType value) {
        return new JAXBElement<EndpointReferenceType>(_MemberEPR_QNAME, EndpointReferenceType.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link ContentCreationFailedFaultType }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://docs.oasis-open.org/wsrf/2004/06/wsrf-WS-ServiceGroup-1.2-draft-01.xsd", name = "ContentCreationFailedFault")
    public JAXBElement<ContentCreationFailedFaultType> createContentCreationFailedFault(ContentCreationFailedFaultType value) {
        return new JAXBElement<ContentCreationFailedFaultType>(_ContentCreationFailedFault_QNAME, ContentCreationFailedFaultType.class, null, value);
    }

}
