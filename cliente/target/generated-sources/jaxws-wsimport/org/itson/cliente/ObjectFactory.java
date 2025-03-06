
package org.itson.cliente;

import javax.xml.namespace.QName;
import jakarta.xml.bind.JAXBElement;
import jakarta.xml.bind.annotation.XmlElementDecl;
import jakarta.xml.bind.annotation.XmlRegistry;


/**
 * This object contains factory methods for each 
 * Java content interface and Java element interface 
 * generated in the org.itson.cliente package. 
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

    private static final QName _Hello_QNAME = new QName("http://webservice.itson.org/", "hello");
    private static final QName _HelloResponse_QNAME = new QName("http://webservice.itson.org/", "helloResponse");
    private static final QName _ObtenerPersona_QNAME = new QName("http://webservice.itson.org/", "obtenerPersona");
    private static final QName _ObtenerPersonaResponse_QNAME = new QName("http://webservice.itson.org/", "obtenerPersonaResponse");
    private static final QName _Persona_QNAME = new QName("http://webservice.itson.org/", "persona");
    private static final QName _RegistrarPersona_QNAME = new QName("http://webservice.itson.org/", "registrarPersona");
    private static final QName _RegistrarPersonaResponse_QNAME = new QName("http://webservice.itson.org/", "registrarPersonaResponse");

    /**
     * Create a new ObjectFactory that can be used to create new instances of schema derived classes for package: org.itson.cliente
     * 
     */
    public ObjectFactory() {
    }

    /**
     * Create an instance of {@link Hello }
     * 
     * @return
     *     the new instance of {@link Hello }
     */
    public Hello createHello() {
        return new Hello();
    }

    /**
     * Create an instance of {@link HelloResponse }
     * 
     * @return
     *     the new instance of {@link HelloResponse }
     */
    public HelloResponse createHelloResponse() {
        return new HelloResponse();
    }

    /**
     * Create an instance of {@link ObtenerPersona }
     * 
     * @return
     *     the new instance of {@link ObtenerPersona }
     */
    public ObtenerPersona createObtenerPersona() {
        return new ObtenerPersona();
    }

    /**
     * Create an instance of {@link ObtenerPersonaResponse }
     * 
     * @return
     *     the new instance of {@link ObtenerPersonaResponse }
     */
    public ObtenerPersonaResponse createObtenerPersonaResponse() {
        return new ObtenerPersonaResponse();
    }

    /**
     * Create an instance of {@link Persona }
     * 
     * @return
     *     the new instance of {@link Persona }
     */
    public Persona createPersona() {
        return new Persona();
    }

    /**
     * Create an instance of {@link RegistrarPersona }
     * 
     * @return
     *     the new instance of {@link RegistrarPersona }
     */
    public RegistrarPersona createRegistrarPersona() {
        return new RegistrarPersona();
    }

    /**
     * Create an instance of {@link RegistrarPersonaResponse }
     * 
     * @return
     *     the new instance of {@link RegistrarPersonaResponse }
     */
    public RegistrarPersonaResponse createRegistrarPersonaResponse() {
        return new RegistrarPersonaResponse();
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link Hello }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link Hello }{@code >}
     */
    @XmlElementDecl(namespace = "http://webservice.itson.org/", name = "hello")
    public JAXBElement<Hello> createHello(Hello value) {
        return new JAXBElement<>(_Hello_QNAME, Hello.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link HelloResponse }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link HelloResponse }{@code >}
     */
    @XmlElementDecl(namespace = "http://webservice.itson.org/", name = "helloResponse")
    public JAXBElement<HelloResponse> createHelloResponse(HelloResponse value) {
        return new JAXBElement<>(_HelloResponse_QNAME, HelloResponse.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link ObtenerPersona }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link ObtenerPersona }{@code >}
     */
    @XmlElementDecl(namespace = "http://webservice.itson.org/", name = "obtenerPersona")
    public JAXBElement<ObtenerPersona> createObtenerPersona(ObtenerPersona value) {
        return new JAXBElement<>(_ObtenerPersona_QNAME, ObtenerPersona.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link ObtenerPersonaResponse }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link ObtenerPersonaResponse }{@code >}
     */
    @XmlElementDecl(namespace = "http://webservice.itson.org/", name = "obtenerPersonaResponse")
    public JAXBElement<ObtenerPersonaResponse> createObtenerPersonaResponse(ObtenerPersonaResponse value) {
        return new JAXBElement<>(_ObtenerPersonaResponse_QNAME, ObtenerPersonaResponse.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link Persona }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link Persona }{@code >}
     */
    @XmlElementDecl(namespace = "http://webservice.itson.org/", name = "persona")
    public JAXBElement<Persona> createPersona(Persona value) {
        return new JAXBElement<>(_Persona_QNAME, Persona.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link RegistrarPersona }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link RegistrarPersona }{@code >}
     */
    @XmlElementDecl(namespace = "http://webservice.itson.org/", name = "registrarPersona")
    public JAXBElement<RegistrarPersona> createRegistrarPersona(RegistrarPersona value) {
        return new JAXBElement<>(_RegistrarPersona_QNAME, RegistrarPersona.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link RegistrarPersonaResponse }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link RegistrarPersonaResponse }{@code >}
     */
    @XmlElementDecl(namespace = "http://webservice.itson.org/", name = "registrarPersonaResponse")
    public JAXBElement<RegistrarPersonaResponse> createRegistrarPersonaResponse(RegistrarPersonaResponse value) {
        return new JAXBElement<>(_RegistrarPersonaResponse_QNAME, RegistrarPersonaResponse.class, null, value);
    }

}
