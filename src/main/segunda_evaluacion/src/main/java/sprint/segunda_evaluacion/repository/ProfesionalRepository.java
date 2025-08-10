package sprint.segunda_evaluacion.repository;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import org.springframework.stereotype.Repository;

import sprint.segunda_evaluacion.model.Profesional;

@Repository
public class ProfesionalRepository {
    private final Map<Long, Profesional> profesional = new HashMap<>();

    public Profesional save(Profesional profesional){
        return profesional;
    }

    public List<Profesional> findAll(){
        return new ArrayList<>(profesional.values());
    }
}
