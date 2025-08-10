package sprint.segunda_evaluacion.model;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;

import sprint.segunda_evaluacion.utils.GeneradorID;

public class Turno {
    private Long id;
    private List<Paciente> paciente = new ArrayList<>();
    private List<Profesional> profesional = new ArrayList<>();
    private LocalDate fecha;

    public Turno(List<Paciente> paciente, List<Profesional> profesional, LocalDate fecha){
        this.id = GeneradorID.generarTurnoId();
        this.paciente= paciente;
        this.profesional= profesional;
        this.fecha = fecha;
    }

    public List<Paciente> getPaciente(){
        return paciente;
    }

    public List<Profesional> getProfesional(){
        return profesional;
    }

    public LocalDate getFecha(){
        return fecha;
    }

    public void SetPaciente(List<Paciente> nuevopaciente){
       paciente = nuevopaciente;
    }

    public void SetProfesional(List<Profesional> nuevoprofesional){
       profesional = nuevoprofesional;
    }

    public void SetFecha(LocalDate nuevafecha){
       fecha = nuevafecha;
    }
}
