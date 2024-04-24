/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.example.student.repo;

import com.company.generated.AlumnoInfo;
import com.company.generated.OperationStatus;
import com.example.student.model.Alumno;
import jakarta.annotation.PostConstruct;
import java.util.HashMap;
import java.util.Map;
import org.springframework.stereotype.Component;

@Component
public class AlumnoRepository {

    private static final Map<String, Alumno> alumnos = new HashMap<>();

    @PostConstruct
    public void initData() {
        Alumno a = new Alumno();
        a.setNif("1111111H");
        a.setNombre("pepa");
        a.setApellidos("Hermnegilda Gomez");
        a.setEmail("pepa@jmail.com");

        Alumno b = new Alumno();
        b.setNif("2222222H");
        b.setNombre("pepe");
        b.setApellidos("Dolores Fuertes");
        b.setEmail("pepe@hoxmail.com");

        alumnos.put(a.getNif(), a);
        alumnos.put(b.getNif(), b);

    }

    public Alumno addAlumno(AlumnoInfo alumnoInfo) {
        Alumno newA = new Alumno();
        newA.setNif(alumnoInfo.getNif());
        newA.setNombre(alumnoInfo.getNombre());
        newA.setApellidos(alumnoInfo.getApellidos());
        newA.setEmail(alumnoInfo.getEmail());
        alumnos.put(newA.getNif(), newA);
        return newA;
    }

    public Alumno findAlumno(String nif) {
        return alumnos.get(nif);
    }

    public OperationStatus delete(String nif) {
        try {
            Alumno removedAlumno = alumnos.remove(nif);
            if (removedAlumno != null) {
                return OperationStatus.SUCCESS; // El alumno fue encontrado y eliminado exitosamente
            } else {
                return OperationStatus.FAIL; // No se encontró ningún alumno con el NIF dado
            }
        } catch (Exception e) {
            return OperationStatus.FAIL; // Se produjo una excepción durante la eliminación
        }
    }

    public Map<String, Alumno> getAlumnos() {
        return alumnos;
    }

}
