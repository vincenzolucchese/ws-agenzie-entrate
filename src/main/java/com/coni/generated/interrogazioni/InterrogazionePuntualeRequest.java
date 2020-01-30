//
// Questo file è stato generato dall'architettura JavaTM per XML Binding (JAXB) Reference Implementation, v2.3.0 
// Vedere <a href="https://javaee.github.io/jaxb-v2/">https://javaee.github.io/jaxb-v2/</a> 
// Qualsiasi modifica a questo file andrà persa durante la ricompilazione dello schema di origine. 
// Generato il: 2020.01.30 alle 12:33:58 PM CET 
//


package com.coni.generated.interrogazioni;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Classe Java per interrogazionePuntualeRequest complex type.
 * 
 * <p>Il seguente frammento di schema specifica il contenuto previsto contenuto in questa classe.
 * 
 * <pre>
 * &lt;complexType name="interrogazionePuntualeRequest"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="opzionale1" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="opzionale2" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="opzionale3" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="pincode" type="{http://www.w3.org/2001/XMLSchema}string"/&gt;
 *         &lt;element name="Proprietario" type="{http://interrogazionepuntuale.p730.sanita.finanze.it}ProprietarioType" minOccurs="0"/&gt;
 *         &lt;element name="idDocumentoFiscale" type="{http://interrogazionepuntuale.p730.sanita.finanze.it}IdDocumentoFiscaleType"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "interrogazionePuntualeRequest", propOrder = {
    "opzionale1",
    "opzionale2",
    "opzionale3",
    "pincode",
    "proprietario",
    "idDocumentoFiscale"
})
public class InterrogazionePuntualeRequest {

    protected String opzionale1;
    protected String opzionale2;
    protected String opzionale3;
    @XmlElement(required = true)
    protected String pincode;
    @XmlElement(name = "Proprietario")
    protected ProprietarioType proprietario;
    @XmlElement(required = true)
    protected IdDocumentoFiscaleType idDocumentoFiscale;

    /**
     * Recupera il valore della proprietà opzionale1.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getOpzionale1() {
        return opzionale1;
    }

    /**
     * Imposta il valore della proprietà opzionale1.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setOpzionale1(String value) {
        this.opzionale1 = value;
    }

    /**
     * Recupera il valore della proprietà opzionale2.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getOpzionale2() {
        return opzionale2;
    }

    /**
     * Imposta il valore della proprietà opzionale2.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setOpzionale2(String value) {
        this.opzionale2 = value;
    }

    /**
     * Recupera il valore della proprietà opzionale3.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getOpzionale3() {
        return opzionale3;
    }

    /**
     * Imposta il valore della proprietà opzionale3.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setOpzionale3(String value) {
        this.opzionale3 = value;
    }

    /**
     * Recupera il valore della proprietà pincode.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getPincode() {
        return pincode;
    }

    /**
     * Imposta il valore della proprietà pincode.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setPincode(String value) {
        this.pincode = value;
    }

    /**
     * Recupera il valore della proprietà proprietario.
     * 
     * @return
     *     possible object is
     *     {@link ProprietarioType }
     *     
     */
    public ProprietarioType getProprietario() {
        return proprietario;
    }

    /**
     * Imposta il valore della proprietà proprietario.
     * 
     * @param value
     *     allowed object is
     *     {@link ProprietarioType }
     *     
     */
    public void setProprietario(ProprietarioType value) {
        this.proprietario = value;
    }

    /**
     * Recupera il valore della proprietà idDocumentoFiscale.
     * 
     * @return
     *     possible object is
     *     {@link IdDocumentoFiscaleType }
     *     
     */
    public IdDocumentoFiscaleType getIdDocumentoFiscale() {
        return idDocumentoFiscale;
    }

    /**
     * Imposta il valore della proprietà idDocumentoFiscale.
     * 
     * @param value
     *     allowed object is
     *     {@link IdDocumentoFiscaleType }
     *     
     */
    public void setIdDocumentoFiscale(IdDocumentoFiscaleType value) {
        this.idDocumentoFiscale = value;
    }

}
