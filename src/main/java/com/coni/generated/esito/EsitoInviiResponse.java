//
// Questo file è stato generato dall'architettura JavaTM per XML Binding (JAXB) Reference Implementation, v2.3.0 
// Vedere <a href="https://javaee.github.io/jaxb-v2/">https://javaee.github.io/jaxb-v2/</a> 
// Qualsiasi modifica a questo file andrà persa durante la ricompilazione dello schema di origine. 
// Generato il: 2020.01.30 alle 12:36:59 PM CET 
//


package com.coni.generated.esito;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Classe Java per EsitoInviiResponse complex type.
 * 
 * <p>Il seguente frammento di schema specifica il contenuto previsto contenuto in questa classe.
 * 
 * <pre>
 * &lt;complexType name="EsitoInviiResponse"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="DatiOutputRichiesta" type="{http://esitoinvio.p730.sanita.sogei.it/}datiOutput" minOccurs="0"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "EsitoInviiResponse", propOrder = {
    "datiOutputRichiesta"
})
public class EsitoInviiResponse {

    @XmlElement(name = "DatiOutputRichiesta")
    protected DatiOutput datiOutputRichiesta;

    /**
     * Recupera il valore della proprietà datiOutputRichiesta.
     * 
     * @return
     *     possible object is
     *     {@link DatiOutput }
     *     
     */
    public DatiOutput getDatiOutputRichiesta() {
        return datiOutputRichiesta;
    }

    /**
     * Imposta il valore della proprietà datiOutputRichiesta.
     * 
     * @param value
     *     allowed object is
     *     {@link DatiOutput }
     *     
     */
    public void setDatiOutputRichiesta(DatiOutput value) {
        this.datiOutputRichiesta = value;
    }

}
