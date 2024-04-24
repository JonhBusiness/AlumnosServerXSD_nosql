//
// Este archivo ha sido generado por Eclipse Implementation of JAXB v3.0.0 
// Visite https://eclipse-ee4j.github.io/jaxb-ri 
// Todas las modificaciones realizadas en este archivo se perderán si se vuelve a compilar el esquema de origen. 
// Generado el: 2024.04.24 a las 10:12:02 AM CST 
//


package com.company.generated;

import jakarta.xml.bind.annotation.XmlAccessType;
import jakarta.xml.bind.annotation.XmlAccessorType;
import jakarta.xml.bind.annotation.XmlElement;
import jakarta.xml.bind.annotation.XmlRootElement;
import jakarta.xml.bind.annotation.XmlType;


/**
 * <p>Clase Java para anonymous complex type.
 * 
 * <p>El siguiente fragmento de esquema especifica el contenido que se espera que haya en esta clase.
 * 
 * <pre>
 * &lt;complexType&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="alumnos" type="{http://school.com/gen}listaAlumnos"/&gt;
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
    "alumnos"
})
@XmlRootElement(name = "getListaAlumnosResponse")
public class GetListaAlumnosResponse {

    @XmlElement(required = true)
    protected ListaAlumnos alumnos;

    /**
     * Obtiene el valor de la propiedad alumnos.
     * 
     * @return
     *     possible object is
     *     {@link ListaAlumnos }
     *     
     */
    public ListaAlumnos getAlumnos() {
        return alumnos;
    }

    /**
     * Define el valor de la propiedad alumnos.
     * 
     * @param value
     *     allowed object is
     *     {@link ListaAlumnos }
     *     
     */
    public void setAlumnos(ListaAlumnos value) {
        this.alumnos = value;
    }

}
