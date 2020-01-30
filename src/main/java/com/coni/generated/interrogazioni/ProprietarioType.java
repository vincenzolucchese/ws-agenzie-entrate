//
// Questo file è stato generato dall'architettura JavaTM per XML Binding (JAXB) Reference Implementation, v2.3.0 
// Vedere <a href="https://javaee.github.io/jaxb-v2/">https://javaee.github.io/jaxb-v2/</a> 
// Qualsiasi modifica a questo file andrà persa durante la ricompilazione dello schema di origine. 
// Generato il: 2020.01.30 alle 12:33:58 PM CET 
//


package com.coni.generated.interrogazioni;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Classe Java per ProprietarioType complex type.
 * 
 * <p>Il seguente frammento di schema specifica il contenuto previsto contenuto in questa classe.
 * 
 * <pre>
 * &lt;complexType name="ProprietarioType"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="codiceRegione" type="{http://interrogazionepuntuale.p730.sanita.finanze.it}String3Type" minOccurs="0"/&gt;
 *         &lt;element name="codiceAsl" type="{http://interrogazionepuntuale.p730.sanita.finanze.it}String3Type" minOccurs="0"/&gt;
 *         &lt;element name="codiceSSA" type="{http://interrogazionepuntuale.p730.sanita.finanze.it}String6Type" minOccurs="0"/&gt;
 *         &lt;element name="cfProprietario" type="{http://interrogazionepuntuale.p730.sanita.finanze.it}CfType" minOccurs="0"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "ProprietarioType", propOrder = {
    "codiceRegione",
    "codiceAsl",
    "codiceSSA",
    "cfProprietario"
})
public class ProprietarioType {

    protected String codiceRegione;
    protected String codiceAsl;
    protected String codiceSSA;
    protected String cfProprietario;

    /**
     * Recupera il valore della proprietà codiceRegione.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getCodiceRegione() {
        return codiceRegione;
    }

    /**
     * Imposta il valore della proprietà codiceRegione.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setCodiceRegione(String value) {
        this.codiceRegione = value;
    }

    /**
     * Recupera il valore della proprietà codiceAsl.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getCodiceAsl() {
        return codiceAsl;
    }

    /**
     * Imposta il valore della proprietà codiceAsl.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setCodiceAsl(String value) {
        this.codiceAsl = value;
    }

    /**
     * Recupera il valore della proprietà codiceSSA.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getCodiceSSA() {
        return codiceSSA;
    }

    /**
     * Imposta il valore della proprietà codiceSSA.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setCodiceSSA(String value) {
        this.codiceSSA = value;
    }

    /**
     * Recupera il valore della proprietà cfProprietario.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getCfProprietario() {
        return cfProprietario;
    }

    /**
     * Imposta il valore della proprietà cfProprietario.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setCfProprietario(String value) {
        this.cfProprietario = value;
    }

}
