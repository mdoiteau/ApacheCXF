
package the.md.project.wsproject;

import javax.xml.bind.JAXBElement;
import javax.xml.bind.annotation.XmlElementDecl;
import javax.xml.bind.annotation.XmlRegistry;
import javax.xml.namespace.QName;


/**
 * This object contains factory methods for each 
 * Java content interface and Java element interface 
 * generated in the the.md.project.wsproject package. 
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

    private final static QName _CheckTransaction_QNAME = new QName("http://wsProject.project.md.the/", "checkTransaction");
    private final static QName _CheckTransactionResponse_QNAME = new QName("http://wsProject.project.md.the/", "checkTransactionResponse");

    /**
     * Create a new ObjectFactory that can be used to create new instances of schema derived classes for package: the.md.project.wsproject
     * 
     */
    public ObjectFactory() {
    }

    /**
     * Create an instance of {@link CheckTransaction }
     * 
     */
    public CheckTransaction createCheckTransaction() {
        return new CheckTransaction();
    }

    /**
     * Create an instance of {@link CheckTransactionResponse }
     * 
     */
    public CheckTransactionResponse createCheckTransactionResponse() {
        return new CheckTransactionResponse();
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link CheckTransaction }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://wsProject.project.md.the/", name = "checkTransaction")
    public JAXBElement<CheckTransaction> createCheckTransaction(CheckTransaction value) {
        return new JAXBElement<CheckTransaction>(_CheckTransaction_QNAME, CheckTransaction.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link CheckTransactionResponse }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://wsProject.project.md.the/", name = "checkTransactionResponse")
    public JAXBElement<CheckTransactionResponse> createCheckTransactionResponse(CheckTransactionResponse value) {
        return new JAXBElement<CheckTransactionResponse>(_CheckTransactionResponse_QNAME, CheckTransactionResponse.class, null, value);
    }

}
