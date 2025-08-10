package sprint.segunda_evaluacion.repository;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Optional;

import org.springframework.stereotype.Repository;

import sprint.segunda_evaluacion.model.Paciente;

@Repository
public class PacienteRepository {
    private final Map<Long, Paciente> paciente = new HashMap<>();

    public Paciente save(Paciente paciente){
        return paciente;
    }

    public Optional<Paciente> findById(Long id){
        return Optional.ofNullable(paciente.get(id));
    }

    public List<Paciente> findAll(){
        return new ArrayList<>(paciente.values());
    }

    public void deleteById(Long id){
        paciente.remove(id);
    }
}
