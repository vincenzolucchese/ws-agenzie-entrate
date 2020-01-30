//
// Questo file è stato generato dall'architettura JavaTM per XML Binding (JAXB) Reference Implementation, v2.3.0 
// Vedere <a href="https://javaee.github.io/jaxb-v2/">https://javaee.github.io/jaxb-v2/</a> 
// Qualsiasi modifica a questo file andrà persa durante la ricompilazione dello schema di origine. 
// Generato il: 2020.01.30 alle 12:33:58 PM CET 
//


package com.coni.generated.interrogazioni;

import javax.xml.bind.JAXBElement;
import javax.xml.bind.annotation.XmlElementDecl;
import javax.xml.bind.annotation.XmlRegistry;
import javax.xml.namespace.QName;


/**
 * This object contains factory methods for each 
 * Java content interface and Java element interface 
 * generated in the com.coni.generated.interrogazioni package. 
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

    private final static QName _InterrogazionePuntualeRequest_QNAME = new QName("http://interrogazionepuntuale.p730.sanita.finanze.it", "interrogazionePuntualeRequest");
    private final static QName _InterrogazionePuntualeResponse_QNAME = new QName("http://interrogazionepuntuale.p730.sanita.finanze.it", "interrogazionePuntualeResponse");

    /**
     * Create a new ObjectFactory that can be used to create new instances of schema derived classes for package: com.coni.generated.interrogazioni
     * 
     */
    public ObjectFactory() {
    }

    /**
     * Create an instance of {@link DocumentoFiscaleType }
     * 
     */
    public DocumentoFiscaleType createDocumentoFiscaleType() {
        return new DocumentoFiscaleType();
    }

    /**
     * Create an instance of {@link DocumentoFiscaleType.ListaErroriDocumento }
     * 
     */
    public DocumentoFiscaleType.ListaErroriDocumento createDocumentoFiscaleTypeListaErroriDocumento() {
        return new DocumentoFiscaleType.ListaErroriDocumento();
    }

    /**
     * Create an instance of {@link IdDocumentoFiscaleType }
     * 
     */
    public IdDocumentoFiscaleType createIdDocumentoFiscaleType() {
        return new IdDocumentoFiscaleType();
    }

    /**
     * Create an instance of {@link InterrogazionePuntualeResponse }
     * 
     */
    public InterrogazionePuntualeResponse createInterrogazionePuntualeResponse() {
        return new InterrogazionePuntualeResponse();
    }

    /**
     * Create an instance of {@link InterrogazionePuntualeResponse.ListaMessaggi }
     * 
     */
    public InterrogazionePuntualeResponse.ListaMessaggi createInterrogazionePuntualeResponseListaMessaggi() {
        return new InterrogazionePuntualeResponse.ListaMessaggi();
    }

    /**
     * Create an instance of {@link InterrogazionePuntualeRequest }
     * 
     */
    public InterrogazionePuntualeRequest createInterrogazionePuntualeRequest() {
        return new InterrogazionePuntualeRequest();
    }

    /**
     * Create an instance of {@link ProprietarioType }
     * 
     */
    public ProprietarioType createProprietarioType() {
        return new ProprietarioType();
    }

    /**
     * Create an instance of {@link DocumentoFiscaleType.TotaliVociSpesa }
     * 
     */
    public DocumentoFiscaleType.TotaliVociSpesa createDocumentoFiscaleTypeTotaliVociSpesa() {
        return new DocumentoFiscaleType.TotaliVociSpesa();
    }

    /**
     * Create an instance of {@link DocumentoFiscaleType.TotaliVociSpesaRimborsate }
     * 
     */
    public DocumentoFiscaleType.TotaliVociSpesaRimborsate createDocumentoFiscaleTypeTotaliVociSpesaRimborsate() {
        return new DocumentoFiscaleType.TotaliVociSpesaRimborsate();
    }

    /**
     * Create an instance of {@link DocumentoFiscaleType.ListaErroriDocumento.Errore }
     * 
     */
    public DocumentoFiscaleType.ListaErroriDocumento.Errore createDocumentoFiscaleTypeListaErroriDocumentoErrore() {
        return new DocumentoFiscaleType.ListaErroriDocumento.Errore();
    }

    /**
     * Create an instance of {@link IdDocumentoFiscaleType.NumDocumentoFiscale }
     * 
     */
    public IdDocumentoFiscaleType.NumDocumentoFiscale createIdDocumentoFiscaleTypeNumDocumentoFiscale() {
        return new IdDocumentoFiscaleType.NumDocumentoFiscale();
    }

    /**
     * Create an instance of {@link InterrogazionePuntualeResponse.ListaMessaggi.Messaggio }
     * 
     */
    public InterrogazionePuntualeResponse.ListaMessaggi.Messaggio createInterrogazionePuntualeResponseListaMessaggiMessaggio() {
        return new InterrogazionePuntualeResponse.ListaMessaggi.Messaggio();
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link InterrogazionePuntualeRequest }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link InterrogazionePuntualeRequest }{@code >}
     */
    @XmlElementDecl(namespace = "http://interrogazionepuntuale.p730.sanita.finanze.it", name = "interrogazionePuntualeRequest")
    public JAXBElement<InterrogazionePuntualeRequest> createInterrogazionePuntualeRequest(InterrogazionePuntualeRequest value) {
        return new JAXBElement<InterrogazionePuntualeRequest>(_InterrogazionePuntualeRequest_QNAME, InterrogazionePuntualeRequest.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link InterrogazionePuntualeResponse }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link InterrogazionePuntualeResponse }{@code >}
     */
    @XmlElementDecl(namespace = "http://interrogazionepuntuale.p730.sanita.finanze.it", name = "interrogazionePuntualeResponse")
    public JAXBElement<InterrogazionePuntualeResponse> createInterrogazionePuntualeResponse(InterrogazionePuntualeResponse value) {
        return new JAXBElement<InterrogazionePuntualeResponse>(_InterrogazionePuntualeResponse_QNAME, InterrogazionePuntualeResponse.class, null, value);
    }

}
