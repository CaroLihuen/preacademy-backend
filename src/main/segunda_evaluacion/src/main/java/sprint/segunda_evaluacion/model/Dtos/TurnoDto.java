package sprint.segunda_evaluacion.model.Dtos;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;

import sprint.segunda_evaluacion.model.Paciente;
import sprint.segunda_evaluacion.model.Profesional;

public class TurnoDto {
    private List<Paciente> paciente = new ArrayList<>();
    private List<Profesional> profesional = new ArrayList<>();
    private LocalDate fecha;

    public TurnoDto(List<Paciente> paciente, List<Profesional> profesional, LocalDate fecha){
        this.paciente= paciente;
        this.profesional= profesional;
        this.fecha = fecha;
    }

    public List<Paciente> getPaciente() {
        return paciente;
    }

    public void setPaciente(List<Paciente> paciente) {
        this.paciente = paciente;
    }

    public List<Profesional> getProfesional() {
        return profesional;
    }

    public void setProfesional(List<Profesional> profesional) {
        this.profesional = profesional;
    }

    public LocalDate getFecha() {
        return fecha;
    }

    public void setFecha(LocalDate fecha) {
        this.fecha = fecha;
    }

    
}
