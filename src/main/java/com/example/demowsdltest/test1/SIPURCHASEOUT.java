
package com.example.demowsdltest.test1;

import javax.jws.WebMethod;
import javax.jws.WebParam;
import javax.jws.WebResult;
import javax.jws.WebService;
import javax.jws.soap.SOAPBinding;
import javax.xml.bind.annotation.XmlSeeAlso;


/**
 * This class was generated by the JAX-WS RI.
 * JAX-WS RI 2.2.9-b130926.1035
 * Generated source version: 2.2
 * 
 */
@WebService(name = "SI_PURCHASE_OUT", targetNamespace = "http://www.weaver.com/create_purchase_sender")
@SOAPBinding(parameterStyle = SOAPBinding.ParameterStyle.BARE)
@XmlSeeAlso({
    ObjectFactory.class
})
public interface SIPURCHASEOUT {


    /**
     * 
     * @param mtPURCHASEOUTREQ
     * @return
     *     returns com.example.demowsdltest.test1.DTPURCHASEOUTRES
     */
    @WebMethod(operationName = "SI_PURCHASE_OUT", action = "http://sap.com/xi/WebService/soap1.1")
    @WebResult(name = "MT_PURCHASE_OUT_RES", targetNamespace = "http://www.weaver.com/create_purchase_sender", partName = "MT_PURCHASE_OUT_RES")
    public DTPURCHASEOUTRES siPURCHASEOUT(
        @WebParam(name = "MT_PURCHASE_OUT_REQ", targetNamespace = "http://www.weaver.com/create_purchase_sender", partName = "MT_PURCHASE_OUT_REQ")
        DTPURCHASEOUTREQ mtPURCHASEOUTREQ);

}
