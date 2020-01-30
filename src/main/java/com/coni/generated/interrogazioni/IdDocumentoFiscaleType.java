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
import javax.xml.bind.annotation.XmlSchemaType;
import javax.xml.bind.annotation.XmlType;
import javax.xml.datatype.XMLGregorianCalendar;


/**
 * <p>Classe Java per IdDocumentoFiscaleType complex type.
 * 
 * <p>Il seguente frammento di schema specifica il contenuto previsto contenuto in questa classe.
 * 
 * <pre>
 * &lt;complexType name="IdDocumentoFiscaleType"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="pIva" type="{http://interrogazionepuntuale.p730.sanita.finanze.it}String11Type"/&gt;
 *         &lt;element name="dataEmissione" type="{http://interrogazionepuntuale.p730.sanita.finanze.it}DataMinType"/&gt;
 *         &lt;element name="numDocumentoFiscale"&gt;
 *           &lt;complexType&gt;
 *             &lt;complexContent&gt;
 *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *                 &lt;sequence&gt;
 *                   &lt;element name="dispositivo" type="{http://interrogazionepuntuale.p730.sanita.finanze.it}Int3Type"/&gt;
 *                   &lt;element name="numDocumento" type="{http://interrogazionepuntuale.p730.sanita.finanze.it}NumDocType"/&gt;
 *                 &lt;/sequence&gt;
 *               &lt;/restriction&gt;
 *             &lt;/complexContent&gt;
 *           &lt;/complexType&gt;
 *         &lt;/element&gt;
 *       &lt;/sequence&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "IdDocumentoFiscaleType", propOrder = {
    "pIva",
    "dataEmissione",
    "numDocumentoFiscale"
})
public class IdDocumentoFiscaleType {

    @XmlElement(required = true)
    protected String pIva;
    @XmlElement(required = true)
    @XmlSchemaType(name = "date")
    protected XMLGregorianCalendar dataEmissione;
    @XmlElement(required = true)
    protected IdDocumentoFiscaleType.NumDocumentoFiscale numDocumentoFiscale;

    /**
     * Recupera il valore della proprietà pIva.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getPIva() {
        return pIva;
    }

    /**
     * Imposta il valore della proprietà pIva.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setPIva(String value) {
        this.pIva = value;
    }

    /**
     * Recupera il valore della proprietà dataEmissione.
     * 
     * @return
     *     possible object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public XMLGregorianCalendar getDataEmissione() {
        return dataEmissione;
    }

    /**
     * Imposta il valore della proprietà dataEmissione.
     * 
     * @param value
     *     allowed object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public void setDataEmissione(XMLGregorianCalendar value) {
        this.dataEmissione = value;
    }

    /**
     * Recupera il valore della proprietà numDocumentoFiscale.
     * 
     * @return
     *     possible object is
     *     {@link IdDocumentoFiscaleType.NumDocumentoFiscale }
     *     
     */
    public IdDocumentoFiscaleType.NumDocumentoFiscale getNumDocumentoFiscale() {
        return numDocumentoFiscale;
    }

    /**
     * Imposta il valore della proprietà numDocumentoFiscale.
     * 
     * @param value
     *     allowed object is
     *     {@link IdDocumentoFiscaleType.NumDocumentoFiscale }
     *     
     */
    public void setNumDocumentoFiscale(IdDocumentoFiscaleType.NumDocumentoFiscale value) {
        this.numDocumentoFiscale = value;
    }


    /**
     * <p>Classe Java per anonymous complex type.
     * 
     * <p>Il seguente frammento di schema specifica il contenuto previsto contenuto in questa classe.
     * 
     * <pre>
     * &lt;complexType&gt;
     *   &lt;complexContent&gt;
     *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
     *       &lt;sequence&gt;
     *         &lt;element name="dispositivo" type="{http://interrogazionepuntuale.p730.sanita.finanze.it}Int3Type"/&gt;
     *         &lt;element name="numDocumento" type="{http://interrogazionepuntuale.p730.sanita.finanze.it}NumDocType"/&gt;
     *       &lt;/sequence&gt;
     *     &lt;/restriction&gt;
     *   &lt;/complexContent&gt;
     * &lt;/complexType&gt;
     * </pre>
     * 
     * 
     */
    @XmlAccessorType(XmlAccessType.FIELD)
    @XmlType(name = "", propOrder = {
        "dispositivo",
        "numDocumento"
    })
    public static class NumDocumentoFiscale {

        protected int dispositivo;
        @XmlElement(required = true)
        protected String numDocumento;

        /**
         * Recupera il valore della proprietà dispositivo.
         * 
         */
        public int getDispositivo() {
            return dispositivo;
        }

        /**
         * Imposta il valore della proprietà dispositivo.
         * 
         */
        public void setDispositivo(int value) {
            this.dispositivo = value;
        }

        /**
         * Recupera il valore della proprietà numDocumento.
         * 
         * @return
         *     possible object is
         *     {@link String }
         *     
         */
        public String getNumDocumento() {
            return numDocumento;
        }

        /**
         * Imposta il valore della proprietà numDocumento.
         * 
         * @param value
         *     allowed object is
         *     {@link String }
         *     
         */
        public void setNumDocumento(String value) {
            this.numDocumento = value;
        }

    }

}
