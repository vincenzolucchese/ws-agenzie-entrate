//
// Questo file è stato generato dall'architettura JavaTM per XML Binding (JAXB) Reference Implementation, v2.3.0 
// Vedere <a href="https://javaee.github.io/jaxb-v2/">https://javaee.github.io/jaxb-v2/</a> 
// Qualsiasi modifica a questo file andrà persa durante la ricompilazione dello schema di origine. 
// Generato il: 2020.01.30 alle 12:33:58 PM CET 
//


package com.coni.generated.interrogazioni;

import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Classe Java per interrogazionePuntualeResponse complex type.
 * 
 * <p>Il seguente frammento di schema specifica il contenuto previsto contenuto in questa classe.
 * 
 * <pre>
 * &lt;complexType name="interrogazionePuntualeResponse"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="esitoChiamata" type="{http://www.w3.org/2001/XMLSchema}string"/&gt;
 *         &lt;element name="documentoFiscale" type="{http://interrogazionepuntuale.p730.sanita.finanze.it}DocumentoFiscaleType" minOccurs="0"/&gt;
 *         &lt;element name="listaMessaggi"&gt;
 *           &lt;complexType&gt;
 *             &lt;complexContent&gt;
 *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *                 &lt;sequence&gt;
 *                   &lt;element name="messaggio" maxOccurs="unbounded"&gt;
 *                     &lt;complexType&gt;
 *                       &lt;complexContent&gt;
 *                         &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *                           &lt;sequence&gt;
 *                             &lt;element name="codice" type="{http://www.w3.org/2001/XMLSchema}string"/&gt;
 *                             &lt;element name="descrizione" type="{http://www.w3.org/2001/XMLSchema}string"/&gt;
 *                             &lt;element name="tipo" type="{http://www.w3.org/2001/XMLSchema}string"/&gt;
 *                           &lt;/sequence&gt;
 *                         &lt;/restriction&gt;
 *                       &lt;/complexContent&gt;
 *                     &lt;/complexType&gt;
 *                   &lt;/element&gt;
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
@XmlType(name = "interrogazionePuntualeResponse", propOrder = {
    "esitoChiamata",
    "documentoFiscale",
    "listaMessaggi"
})
public class InterrogazionePuntualeResponse {

    @XmlElement(required = true)
    protected String esitoChiamata;
    protected DocumentoFiscaleType documentoFiscale;
    @XmlElement(required = true)
    protected InterrogazionePuntualeResponse.ListaMessaggi listaMessaggi;

    /**
     * Recupera il valore della proprietà esitoChiamata.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getEsitoChiamata() {
        return esitoChiamata;
    }

    /**
     * Imposta il valore della proprietà esitoChiamata.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setEsitoChiamata(String value) {
        this.esitoChiamata = value;
    }

    /**
     * Recupera il valore della proprietà documentoFiscale.
     * 
     * @return
     *     possible object is
     *     {@link DocumentoFiscaleType }
     *     
     */
    public DocumentoFiscaleType getDocumentoFiscale() {
        return documentoFiscale;
    }

    /**
     * Imposta il valore della proprietà documentoFiscale.
     * 
     * @param value
     *     allowed object is
     *     {@link DocumentoFiscaleType }
     *     
     */
    public void setDocumentoFiscale(DocumentoFiscaleType value) {
        this.documentoFiscale = value;
    }

    /**
     * Recupera il valore della proprietà listaMessaggi.
     * 
     * @return
     *     possible object is
     *     {@link InterrogazionePuntualeResponse.ListaMessaggi }
     *     
     */
    public InterrogazionePuntualeResponse.ListaMessaggi getListaMessaggi() {
        return listaMessaggi;
    }

    /**
     * Imposta il valore della proprietà listaMessaggi.
     * 
     * @param value
     *     allowed object is
     *     {@link InterrogazionePuntualeResponse.ListaMessaggi }
     *     
     */
    public void setListaMessaggi(InterrogazionePuntualeResponse.ListaMessaggi value) {
        this.listaMessaggi = value;
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
     *         &lt;element name="messaggio" maxOccurs="unbounded"&gt;
     *           &lt;complexType&gt;
     *             &lt;complexContent&gt;
     *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
     *                 &lt;sequence&gt;
     *                   &lt;element name="codice" type="{http://www.w3.org/2001/XMLSchema}string"/&gt;
     *                   &lt;element name="descrizione" type="{http://www.w3.org/2001/XMLSchema}string"/&gt;
     *                   &lt;element name="tipo" type="{http://www.w3.org/2001/XMLSchema}string"/&gt;
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
    @XmlType(name = "", propOrder = {
        "messaggio"
    })
    public static class ListaMessaggi {

        @XmlElement(required = true)
        protected List<InterrogazionePuntualeResponse.ListaMessaggi.Messaggio> messaggio;

        /**
         * Gets the value of the messaggio property.
         * 
         * <p>
         * This accessor method returns a reference to the live list,
         * not a snapshot. Therefore any modification you make to the
         * returned list will be present inside the JAXB object.
         * This is why there is not a <CODE>set</CODE> method for the messaggio property.
         * 
         * <p>
         * For example, to add a new item, do as follows:
         * <pre>
         *    getMessaggio().add(newItem);
         * </pre>
         * 
         * 
         * <p>
         * Objects of the following type(s) are allowed in the list
         * {@link InterrogazionePuntualeResponse.ListaMessaggi.Messaggio }
         * 
         * 
         */
        public List<InterrogazionePuntualeResponse.ListaMessaggi.Messaggio> getMessaggio() {
            if (messaggio == null) {
                messaggio = new ArrayList<InterrogazionePuntualeResponse.ListaMessaggi.Messaggio>();
            }
            return this.messaggio;
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
         *         &lt;element name="codice" type="{http://www.w3.org/2001/XMLSchema}string"/&gt;
         *         &lt;element name="descrizione" type="{http://www.w3.org/2001/XMLSchema}string"/&gt;
         *         &lt;element name="tipo" type="{http://www.w3.org/2001/XMLSchema}string"/&gt;
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
            "codice",
            "descrizione",
            "tipo"
        })
        public static class Messaggio {

            @XmlElement(required = true)
            protected String codice;
            @XmlElement(required = true)
            protected String descrizione;
            @XmlElement(required = true)
            protected String tipo;

            /**
             * Recupera il valore della proprietà codice.
             * 
             * @return
             *     possible object is
             *     {@link String }
             *     
             */
            public String getCodice() {
                return codice;
            }

            /**
             * Imposta il valore della proprietà codice.
             * 
             * @param value
             *     allowed object is
             *     {@link String }
             *     
             */
            public void setCodice(String value) {
                this.codice = value;
            }

            /**
             * Recupera il valore della proprietà descrizione.
             * 
             * @return
             *     possible object is
             *     {@link String }
             *     
             */
            public String getDescrizione() {
                return descrizione;
            }

            /**
             * Imposta il valore della proprietà descrizione.
             * 
             * @param value
             *     allowed object is
             *     {@link String }
             *     
             */
            public void setDescrizione(String value) {
                this.descrizione = value;
            }

            /**
             * Recupera il valore della proprietà tipo.
             * 
             * @return
             *     possible object is
             *     {@link String }
             *     
             */
            public String getTipo() {
                return tipo;
            }

            /**
             * Imposta il valore della proprietà tipo.
             * 
             * @param value
             *     allowed object is
             *     {@link String }
             *     
             */
            public void setTipo(String value) {
                this.tipo = value;
            }

        }

    }

}
