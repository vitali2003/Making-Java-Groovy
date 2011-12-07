
package mjg.calc.service;

import javax.jws.WebMethod;
import javax.jws.WebParam;
import javax.jws.WebResult;
import javax.jws.WebService;
import javax.xml.bind.annotation.XmlSeeAlso;
import javax.xml.ws.RequestWrapper;
import javax.xml.ws.ResponseWrapper;


/**
 * This class was generated by the JAX-WS RI.
 * JAX-WS RI 2.1.4-b01-
 * Generated source version: 2.1
 * 
 */
@WebService(name = "Calculator", targetNamespace = "http://service.calc.mjg/")
@XmlSeeAlso({
    ObjectFactory.class
})
public interface Calculator {


    /**
     * 
     * @param y
     * @param x
     * @return
     *     returns double
     */
    @WebMethod
    @WebResult(name = "sum", targetNamespace = "")
    @RequestWrapper(localName = "add", targetNamespace = "http://service.calc.mjg/", className = "mjg.calc.service.Add")
    @ResponseWrapper(localName = "addResponse", targetNamespace = "http://service.calc.mjg/", className = "mjg.calc.service.AddResponse")
    public double add(
        @WebParam(name = "x", targetNamespace = "")
        double x,
        @WebParam(name = "y", targetNamespace = "")
        double y);

    /**
     * 
     * @param y
     * @param x
     * @return
     *     returns double
     */
    @WebMethod
    @WebResult(name = "difference", targetNamespace = "")
    @RequestWrapper(localName = "subtract", targetNamespace = "http://service.calc.mjg/", className = "mjg.calc.service.Subtract")
    @ResponseWrapper(localName = "subtractResponse", targetNamespace = "http://service.calc.mjg/", className = "mjg.calc.service.SubtractResponse")
    public double subtract(
        @WebParam(name = "x", targetNamespace = "")
        double x,
        @WebParam(name = "y", targetNamespace = "")
        double y);

    /**
     * 
     * @param y
     * @param x
     * @return
     *     returns double
     */
    @WebMethod
    @WebResult(name = "product", targetNamespace = "")
    @RequestWrapper(localName = "multiply", targetNamespace = "http://service.calc.mjg/", className = "mjg.calc.service.Multiply")
    @ResponseWrapper(localName = "multiplyResponse", targetNamespace = "http://service.calc.mjg/", className = "mjg.calc.service.MultiplyResponse")
    public double multiply(
        @WebParam(name = "x", targetNamespace = "")
        double x,
        @WebParam(name = "y", targetNamespace = "")
        double y);

    /**
     * 
     * @param y
     * @param x
     * @return
     *     returns double
     */
    @WebMethod
    @WebResult(name = "quotient", targetNamespace = "")
    @RequestWrapper(localName = "divide", targetNamespace = "http://service.calc.mjg/", className = "mjg.calc.service.Divide")
    @ResponseWrapper(localName = "divideResponse", targetNamespace = "http://service.calc.mjg/", className = "mjg.calc.service.DivideResponse")
    public double divide(
        @WebParam(name = "x", targetNamespace = "")
        double x,
        @WebParam(name = "y", targetNamespace = "")
        double y);

}
