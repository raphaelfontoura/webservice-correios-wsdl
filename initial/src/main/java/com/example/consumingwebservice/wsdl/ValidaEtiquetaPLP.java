//
// This file was generated by the JavaTM Architecture for XML Binding(JAXB) Reference Implementation, v2.3.0 
// See <a href="https://javaee.github.io/jaxb-v2/">https://javaee.github.io/jaxb-v2/</a> 
// Any modifications to this file will be lost upon recompilation of the source schema. 
// Generated on: 2023.03.08 at 02:42:54 PM BRT 
//


package com.example.consumingwebservice.wsdl;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for validaEtiquetaPLP complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="validaEtiquetaPLP"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="numeroEtiqueta" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="idPlp" type="{http://www.w3.org/2001/XMLSchema}long" minOccurs="0"/&gt;
 *         &lt;element name="usuario" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="senha" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "validaEtiquetaPLP", propOrder = {
    "numeroEtiqueta",
    "idPlp",
    "usuario",
    "senha"
})
public class ValidaEtiquetaPLP {

    protected String numeroEtiqueta;
    protected Long idPlp;
    protected String usuario;
    protected String senha;

    /**
     * Gets the value of the numeroEtiqueta property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getNumeroEtiqueta() {
        return numeroEtiqueta;
    }

    /**
     * Sets the value of the numeroEtiqueta property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setNumeroEtiqueta(String value) {
        this.numeroEtiqueta = value;
    }

    /**
     * Gets the value of the idPlp property.
     * 
     * @return
     *     possible object is
     *     {@link Long }
     *     
     */
    public Long getIdPlp() {
        return idPlp;
    }

    /**
     * Sets the value of the idPlp property.
     * 
     * @param value
     *     allowed object is
     *     {@link Long }
     *     
     */
    public void setIdPlp(Long value) {
        this.idPlp = value;
    }

    /**
     * Gets the value of the usuario property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getUsuario() {
        return usuario;
    }

    /**
     * Sets the value of the usuario property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setUsuario(String value) {
        this.usuario = value;
    }

    /**
     * Gets the value of the senha property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getSenha() {
        return senha;
    }

    /**
     * Sets the value of the senha property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setSenha(String value) {
        this.senha = value;
    }

}
