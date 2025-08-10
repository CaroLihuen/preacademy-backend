package sprint.segunda_evaluacion.model.Dtos;

public class ProfesionalDto {
    private String nombreCompleto;
    private String especialidad;

    public ProfesionalDto(String nombreCompleto, String especialidad){
        this.nombreCompleto = nombreCompleto;
        this.especialidad = especialidad;
    }

    public String getNombreCompleto() {
        return nombreCompleto;
    }

    public void setNombreCompleto(String nombreCompleto) {
        this.nombreCompleto = nombreCompleto;
    }

    public String getEspecialidad() {
        return especialidad;
    }

    public void setEspecialidad(String especialidad) {
        this.especialidad = especialidad;
    }

    
}
