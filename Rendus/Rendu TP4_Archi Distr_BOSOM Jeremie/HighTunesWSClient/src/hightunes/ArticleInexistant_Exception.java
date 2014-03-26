
package hightunes;

import javax.xml.ws.WebFault;


/**
 * This class was generated by the JAX-WS RI.
 * JAX-WS RI 2.1.7-b01-
 * Generated source version: 2.1
 * 
 */
@WebFault(name = "ArticleInexistant", targetNamespace = "http://HighTunes/")
public class ArticleInexistant_Exception
    extends Exception
{

    /**
     * Java type that goes as soapenv:Fault detail element.
     * 
     */
    private ArticleInexistant faultInfo;

    /**
     * 
     * @param message
     * @param faultInfo
     */
    public ArticleInexistant_Exception(String message, ArticleInexistant faultInfo) {
        super(message);
        this.faultInfo = faultInfo;
    }

    /**
     * 
     * @param message
     * @param faultInfo
     * @param cause
     */
    public ArticleInexistant_Exception(String message, ArticleInexistant faultInfo, Throwable cause) {
        super(message, cause);
        this.faultInfo = faultInfo;
    }

    /**
     * 
     * @return
     *     returns fault bean: hightunes.ArticleInexistant
     */
    public ArticleInexistant getFaultInfo() {
        return faultInfo;
    }

}
