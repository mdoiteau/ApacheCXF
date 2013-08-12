package the.md.project.wsproject;

import javax.jws.WebMethod;
import javax.jws.WebParam;
import javax.jws.WebResult;
import javax.jws.WebService;
import javax.xml.bind.annotation.XmlSeeAlso;
import javax.xml.ws.RequestWrapper;
import javax.xml.ws.ResponseWrapper;

/**
 * This class was generated by Apache CXF 2.7.2
 * 2013-08-09T15:35:35.569+02:00
 * Generated source version: 2.7.2
 * 
 */
@WebService(targetNamespace = "http://wsProject.project.md.the/", name = "PayerEssenceWebservice")
@XmlSeeAlso({ObjectFactory.class})
public interface PayerEssenceWebservice {

    @WebResult(name = "return", targetNamespace = "")
    @RequestWrapper(localName = "checkTransaction", targetNamespace = "http://wsProject.project.md.the/", className = "the.md.project.wsproject.CheckTransaction")
    @WebMethod
    @ResponseWrapper(localName = "checkTransactionResponse", targetNamespace = "http://wsProject.project.md.the/", className = "the.md.project.wsproject.CheckTransactionResponse")
    public boolean checkTransaction(
        @WebParam(name = "cardNumber", targetNamespace = "")
        java.lang.String cardNumber,
        @WebParam(name = "price", targetNamespace = "")
        java.lang.Long price
    );
}
