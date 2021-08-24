
package com.example.demowsdltest.test1;

import javax.xml.bind.JAXBElement;
import javax.xml.bind.annotation.XmlElementDecl;
import javax.xml.bind.annotation.XmlRegistry;
import javax.xml.namespace.QName;


/**
 * This object contains factory methods for each 
 * Java content interface and Java element interface 
 * generated in the com.example.demowsdltest.test1 package. 
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

    private final static QName _MTPURCHASEOUTREQ_QNAME = new QName("http://www.weaver.com/create_purchase_sender", "MT_PURCHASE_OUT_REQ");
    private final static QName _MTPURCHASEOUTRES_QNAME = new QName("http://www.weaver.com/create_purchase_sender", "MT_PURCHASE_OUT_RES");

    /**
     * Create a new ObjectFactory that can be used to create new instances of schema derived classes for package: com.example.demowsdltest.test1
     * 
     */
    public ObjectFactory() {
    }

    /**
     * Create an instance of {@link DTPURCHASEOUTREQ }
     * 
     */
    public DTPURCHASEOUTREQ createDTPURCHASEOUTREQ() {
        return new DTPURCHASEOUTREQ();
    }

    /**
     * Create an instance of {@link DTPURCHASEOUTRES }
     * 
     */
    public DTPURCHASEOUTRES createDTPURCHASEOUTRES() {
        return new DTPURCHASEOUTRES();
    }

    /**
     * Create an instance of {@link DTPURCHASEOUTREQ.TITEM }
     * 
     */
    public DTPURCHASEOUTREQ.TITEM createDTPURCHASEOUTREQTITEM() {
        return new DTPURCHASEOUTREQ.TITEM();
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link DTPURCHASEOUTREQ }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://www.weaver.com/create_purchase_sender", name = "MT_PURCHASE_OUT_REQ")
    public JAXBElement<DTPURCHASEOUTREQ> createMTPURCHASEOUTREQ(DTPURCHASEOUTREQ value) {
        return new JAXBElement<DTPURCHASEOUTREQ>(_MTPURCHASEOUTREQ_QNAME, DTPURCHASEOUTREQ.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link DTPURCHASEOUTRES }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://www.weaver.com/create_purchase_sender", name = "MT_PURCHASE_OUT_RES")
    public JAXBElement<DTPURCHASEOUTRES> createMTPURCHASEOUTRES(DTPURCHASEOUTRES value) {
        return new JAXBElement<DTPURCHASEOUTRES>(_MTPURCHASEOUTRES_QNAME, DTPURCHASEOUTRES.class, null, value);
    }

}
