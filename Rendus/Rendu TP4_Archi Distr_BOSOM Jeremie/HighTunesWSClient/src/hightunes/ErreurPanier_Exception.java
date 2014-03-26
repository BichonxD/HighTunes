
package hightunes;

import javax.xml.ws.WebFault;


/**
 * This class was generated by the JAX-WS RI.
 * JAX-WS RI 2.1.7-b01-
 * Generated source version: 2.1
 * 
 */
@WebFault(name = "ErreurPanier", targetNamespace = "http://HighTunes/")
public class ErreurPanier_Exception
    extends Exception
{

    /**
     * Java type that goes as soapenv:Fault detail element.
     * 
     */
    private ErreurPanier faultInfo;

    /**
     * 
     * @param message
     * @param faultInfo
     */
    public ErreurPanier_Exception(String message, ErreurPanier faultInfo) {
        super(message);
        this.faultInfo = faultInfo;
    }

    /**
     * 
     * @param message
     * @param faultInfo
     * @param cause
     */
    public ErreurPanier_Exception(String message, ErreurPanier faultInfo, Throwable cause) {
        super(message, cause);
        this.faultInfo = faultInfo;
    }

    /**
     * 
     * @return
     *     returns fault bean: hightunes.ErreurPanier
     */
    public ErreurPanier getFaultInfo() {
        return faultInfo;
    }

}
