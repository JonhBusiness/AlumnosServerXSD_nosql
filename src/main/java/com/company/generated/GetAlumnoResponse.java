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
 *         &lt;element name="alumnoInfo" type="{http://school.com/gen}alumnoInfo"/&gt;
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
    "alumnoInfo"
})
@XmlRootElement(name = "getAlumnoResponse")
public class GetAlumnoResponse {

    @XmlElement(required = true)
    protected AlumnoInfo alumnoInfo;

    /**
     * Obtiene el valor de la propiedad alumnoInfo.
     * 
     * @return
     *     possible object is
     *     {@link AlumnoInfo }
     *     
     */
    public AlumnoInfo getAlumnoInfo() {
        return alumnoInfo;
    }

    /**
     * Define el valor de la propiedad alumnoInfo.
     * 
     * @param value
     *     allowed object is
     *     {@link AlumnoInfo }
     *     
     */
    public void setAlumnoInfo(AlumnoInfo value) {
        this.alumnoInfo = value;
    }

}
