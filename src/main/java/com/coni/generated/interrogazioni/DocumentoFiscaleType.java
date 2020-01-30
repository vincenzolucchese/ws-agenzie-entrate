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
import javax.xml.bind.annotation.XmlSchemaType;
import javax.xml.bind.annotation.XmlType;
import javax.xml.datatype.XMLGregorianCalendar;


/**
 * <p>Classe Java per DocumentoFiscaleType complex type.
 * 
 * <p>Il seguente frammento di schema specifica il contenuto previsto contenuto in questa classe.
 * 
 * <pre>
 * &lt;complexType name="DocumentoFiscaleType"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="idDocumentoFiscale" type="{http://interrogazionepuntuale.p730.sanita.finanze.it}IdDocumentoFiscaleType" minOccurs="0"/&gt;
 *         &lt;element name="dataPagamento" type="{http://interrogazionepuntuale.p730.sanita.finanze.it}DataMinType" minOccurs="0"/&gt;
 *         &lt;element name="totaliVociSpesa" maxOccurs="unbounded" minOccurs="0"&gt;
 *           &lt;complexType&gt;
 *             &lt;complexContent&gt;
 *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *                 &lt;sequence&gt;
 *                   &lt;element name="tipoSpesa" type="{http://www.w3.org/2001/XMLSchema}string"/&gt;
 *                   &lt;element name="importo" type="{http://www.w3.org/2001/XMLSchema}double"/&gt;
 *                 &lt;/sequence&gt;
 *               &lt;/restriction&gt;
 *             &lt;/complexContent&gt;
 *           &lt;/complexType&gt;
 *         &lt;/element&gt;
 *         &lt;element name="totaliVociSpesaRimborsate" maxOccurs="unbounded" minOccurs="0"&gt;
 *           &lt;complexType&gt;
 *             &lt;complexContent&gt;
 *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *                 &lt;sequence&gt;
 *                   &lt;element name="tipoSpesa" type="{http://www.w3.org/2001/XMLSchema}string"/&gt;
 *                   &lt;element name="importo" type="{http://www.w3.org/2001/XMLSchema}double"/&gt;
 *                 &lt;/sequence&gt;
 *               &lt;/restriction&gt;
 *             &lt;/complexContent&gt;
 *           &lt;/complexType&gt;
 *         &lt;/element&gt;
 *         &lt;element name="protocollo" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="nomeFile" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="dataInvio" type="{http://interrogazionepuntuale.p730.sanita.finanze.it}DataMinType" minOccurs="0"/&gt;
 *         &lt;element name="tipoInvio" type="{http://interrogazionepuntuale.p730.sanita.finanze.it}String1Type" minOccurs="0"/&gt;
 *         &lt;element name="listaErroriDocumento" minOccurs="0"&gt;
 *           &lt;complexType&gt;
 *             &lt;complexContent&gt;
 *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *                 &lt;sequence&gt;
 *                   &lt;element name="errore" maxOccurs="unbounded"&gt;
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
@XmlType(name = "DocumentoFiscaleType", propOrder = {
    "idDocumentoFiscale",
    "dataPagamento",
    "totaliVociSpesa",
    "totaliVociSpesaRimborsate",
    "protocollo",
    "nomeFile",
    "dataInvio",
    "tipoInvio",
    "listaErroriDocumento"
})
public class DocumentoFiscaleType {

    protected IdDocumentoFiscaleType idDocumentoFiscale;
    @XmlSchemaType(name = "date")
    protected XMLGregorianCalendar dataPagamento;
    protected List<DocumentoFiscaleType.TotaliVociSpesa> totaliVociSpesa;
    protected List<DocumentoFiscaleType.TotaliVociSpesaRimborsate> totaliVociSpesaRimborsate;
    protected String protocollo;
    protected String nomeFile;
    @XmlSchemaType(name = "date")
    protected XMLGregorianCalendar dataInvio;
    protected String tipoInvio;
    protected DocumentoFiscaleType.ListaErroriDocumento listaErroriDocumento;

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

    /**
     * Recupera il valore della proprietà dataPagamento.
     * 
     * @return
     *     possible object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public XMLGregorianCalendar getDataPagamento() {
        return dataPagamento;
    }

    /**
     * Imposta il valore della proprietà dataPagamento.
     * 
     * @param value
     *     allowed object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public void setDataPagamento(XMLGregorianCalendar value) {
        this.dataPagamento = value;
    }

    /**
     * Gets the value of the totaliVociSpesa property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the totaliVociSpesa property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getTotaliVociSpesa().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link DocumentoFiscaleType.TotaliVociSpesa }
     * 
     * 
     */
    public List<DocumentoFiscaleType.TotaliVociSpesa> getTotaliVociSpesa() {
        if (totaliVociSpesa == null) {
            totaliVociSpesa = new ArrayList<DocumentoFiscaleType.TotaliVociSpesa>();
        }
        return this.totaliVociSpesa;
    }

    /**
     * Gets the value of the totaliVociSpesaRimborsate property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the totaliVociSpesaRimborsate property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getTotaliVociSpesaRimborsate().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link DocumentoFiscaleType.TotaliVociSpesaRimborsate }
     * 
     * 
     */
    public List<DocumentoFiscaleType.TotaliVociSpesaRimborsate> getTotaliVociSpesaRimborsate() {
        if (totaliVociSpesaRimborsate == null) {
            totaliVociSpesaRimborsate = new ArrayList<DocumentoFiscaleType.TotaliVociSpesaRimborsate>();
        }
        return this.totaliVociSpesaRimborsate;
    }

    /**
     * Recupera il valore della proprietà protocollo.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getProtocollo() {
        return protocollo;
    }

    /**
     * Imposta il valore della proprietà protocollo.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setProtocollo(String value) {
        this.protocollo = value;
    }

    /**
     * Recupera il valore della proprietà nomeFile.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getNomeFile() {
        return nomeFile;
    }

    /**
     * Imposta il valore della proprietà nomeFile.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setNomeFile(String value) {
        this.nomeFile = value;
    }

    /**
     * Recupera il valore della proprietà dataInvio.
     * 
     * @return
     *     possible object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public XMLGregorianCalendar getDataInvio() {
        return dataInvio;
    }

    /**
     * Imposta il valore della proprietà dataInvio.
     * 
     * @param value
     *     allowed object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public void setDataInvio(XMLGregorianCalendar value) {
        this.dataInvio = value;
    }

    /**
     * Recupera il valore della proprietà tipoInvio.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getTipoInvio() {
        return tipoInvio;
    }

    /**
     * Imposta il valore della proprietà tipoInvio.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setTipoInvio(String value) {
        this.tipoInvio = value;
    }

    /**
     * Recupera il valore della proprietà listaErroriDocumento.
     * 
     * @return
     *     possible object is
     *     {@link DocumentoFiscaleType.ListaErroriDocumento }
     *     
     */
    public DocumentoFiscaleType.ListaErroriDocumento getListaErroriDocumento() {
        return listaErroriDocumento;
    }

    /**
     * Imposta il valore della proprietà listaErroriDocumento.
     * 
     * @param value
     *     allowed object is
     *     {@link DocumentoFiscaleType.ListaErroriDocumento }
     *     
     */
    public void setListaErroriDocumento(DocumentoFiscaleType.ListaErroriDocumento value) {
        this.listaErroriDocumento = value;
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
     *         &lt;element name="errore" maxOccurs="unbounded"&gt;
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
        "errore"
    })
    public static class ListaErroriDocumento {

        @XmlElement(required = true)
        protected List<DocumentoFiscaleType.ListaErroriDocumento.Errore> errore;

        /**
         * Gets the value of the errore property.
         * 
         * <p>
         * This accessor method returns a reference to the live list,
         * not a snapshot. Therefore any modification you make to the
         * returned list will be present inside the JAXB object.
         * This is why there is not a <CODE>set</CODE> method for the errore property.
         * 
         * <p>
         * For example, to add a new item, do as follows:
         * <pre>
         *    getErrore().add(newItem);
         * </pre>
         * 
         * 
         * <p>
         * Objects of the following type(s) are allowed in the list
         * {@link DocumentoFiscaleType.ListaErroriDocumento.Errore }
         * 
         * 
         */
        public List<DocumentoFiscaleType.ListaErroriDocumento.Errore> getErrore() {
            if (errore == null) {
                errore = new ArrayList<DocumentoFiscaleType.ListaErroriDocumento.Errore>();
            }
            return this.errore;
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
        public static class Errore {

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
     *         &lt;element name="tipoSpesa" type="{http://www.w3.org/2001/XMLSchema}string"/&gt;
     *         &lt;element name="importo" type="{http://www.w3.org/2001/XMLSchema}double"/&gt;
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
        "tipoSpesa",
        "importo"
    })
    public static class TotaliVociSpesa {

        @XmlElement(required = true)
        protected String tipoSpesa;
        protected double importo;

        /**
         * Recupera il valore della proprietà tipoSpesa.
         * 
         * @return
         *     possible object is
         *     {@link String }
         *     
         */
        public String getTipoSpesa() {
            return tipoSpesa;
        }

        /**
         * Imposta il valore della proprietà tipoSpesa.
         * 
         * @param value
         *     allowed object is
         *     {@link String }
         *     
         */
        public void setTipoSpesa(String value) {
            this.tipoSpesa = value;
        }

        /**
         * Recupera il valore della proprietà importo.
         * 
         */
        public double getImporto() {
            return importo;
        }

        /**
         * Imposta il valore della proprietà importo.
         * 
         */
        public void setImporto(double value) {
            this.importo = value;
        }

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
     *         &lt;element name="tipoSpesa" type="{http://www.w3.org/2001/XMLSchema}string"/&gt;
     *         &lt;element name="importo" type="{http://www.w3.org/2001/XMLSchema}double"/&gt;
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
        "tipoSpesa",
        "importo"
    })
    public static class TotaliVociSpesaRimborsate {

        @XmlElement(required = true)
        protected String tipoSpesa;
        protected double importo;

        /**
         * Recupera il valore della proprietà tipoSpesa.
         * 
         * @return
         *     possible object is
         *     {@link String }
         *     
         */
        public String getTipoSpesa() {
            return tipoSpesa;
        }

        /**
         * Imposta il valore della proprietà tipoSpesa.
         * 
         * @param value
         *     allowed object is
         *     {@link String }
         *     
         */
        public void setTipoSpesa(String value) {
            this.tipoSpesa = value;
        }

        /**
         * Recupera il valore della proprietà importo.
         * 
         */
        public double getImporto() {
            return importo;
        }

        /**
         * Imposta il valore della proprietà importo.
         * 
         */
        public void setImporto(double value) {
            this.importo = value;
        }

    }

}
