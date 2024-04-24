/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.example.student.endpoint;

import com.company.generated.AlumnoInfo;
import com.company.generated.CrearAlumnoRequest;
import com.company.generated.CrearAlumnoResponse;
import com.company.generated.EliminarAlumnoRequest;
import com.company.generated.EliminarAlumnoResponse;
import com.company.generated.GetAlumnoRequest;
import com.company.generated.GetAlumnoResponse;
import com.company.generated.GetListaAlumnosRequest;
import com.company.generated.GetListaAlumnosResponse;
import com.company.generated.ListaAlumnos;
import com.company.generated.OperationStatus;
import com.example.student.model.Alumno;
import com.example.student.repo.AlumnoRepository;
import java.util.ArrayList;
import java.util.List;
import java.util.Map;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.ws.server.endpoint.annotation.Endpoint;
import org.springframework.ws.server.endpoint.annotation.PayloadRoot;
import org.springframework.ws.server.endpoint.annotation.RequestPayload;
import org.springframework.ws.server.endpoint.annotation.ResponsePayload;

@Endpoint
public class AlumnoEndpoint {

    private static final String NAMESPACE_URI = "http://school.com/gen";

    @Autowired
    private AlumnoRepository alumnoRepository;

    @PayloadRoot(namespace = NAMESPACE_URI, localPart = "crearAlumnoRequest")
    @ResponsePayload
    public CrearAlumnoResponse createStudent(@RequestPayload CrearAlumnoRequest request) {
        CrearAlumnoResponse response = new CrearAlumnoResponse();

        Alumno alum = alumnoRepository.addAlumno(request.getAlumnoInfo());
        AlumnoInfo alumnoInf = new AlumnoInfo();
        alumnoInf.setNif(alum.getNif());
        alumnoInf.setNombre(alum.getNombre());
        alumnoInf.setApellidos(alum.getApellidos());
        alumnoInf.setEmail(alum.getEmail());
        response.setAlumnoInfo(alumnoInf);
        return response;
    }
    @PayloadRoot(namespace = NAMESPACE_URI, localPart = "getAlumnoRequest")
    @ResponsePayload
    public GetAlumnoResponse getStudent(@RequestPayload GetAlumnoRequest request) {
        GetAlumnoResponse response = new GetAlumnoResponse();

        Alumno alum = alumnoRepository.findAlumno(request.getNif());
        AlumnoInfo alumnoInf = new AlumnoInfo();
        alumnoInf.setNif(alum.getNif());
        alumnoInf.setNombre(alum.getNombre());
        alumnoInf.setApellidos(alum.getApellidos());
        alumnoInf.setEmail(alum.getEmail());

        response.setAlumnoInfo(alumnoInf);
        return response;
    }

    @PayloadRoot(namespace = NAMESPACE_URI, localPart = "getListaAlumnosRequest")
    @ResponsePayload
    public GetListaAlumnosResponse getStudents(@RequestPayload GetListaAlumnosRequest request) {
        GetListaAlumnosResponse response = new GetListaAlumnosResponse();

        Map<String, Alumno> alumnosMap = alumnoRepository.getAlumnos();
        List<Alumno> alumnosList = new ArrayList<>(alumnosMap.values());

        ListaAlumnos listaAlumnos = new ListaAlumnos();
        for (Alumno alumno : alumnosList) {
            AlumnoInfo alumnoInfo = new AlumnoInfo();
            alumnoInfo.setNif(alumno.getNif());
            alumnoInfo.setNombre(alumno.getNombre());
            alumnoInfo.setApellidos(alumno.getApellidos());
            alumnoInfo.setEmail(alumno.getEmail());

            listaAlumnos.getAlumno().add(alumnoInfo);
        }

        response.setAlumnos(listaAlumnos);
        return response;
    }
@PayloadRoot(namespace = NAMESPACE_URI, localPart = "eliminarAlumnoRequest")
    @ResponsePayload
    public EliminarAlumnoResponse deleteStudent(@RequestPayload EliminarAlumnoRequest request) {
        EliminarAlumnoResponse response = new EliminarAlumnoResponse();
        OperationStatus status = alumnoRepository.delete(request.getNif());
        response.setStatus(status);
        return response;
    }
}
