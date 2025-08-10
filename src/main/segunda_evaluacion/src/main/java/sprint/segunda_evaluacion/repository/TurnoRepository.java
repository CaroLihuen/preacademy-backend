package sprint.segunda_evaluacion.repository;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Optional;

import org.springframework.stereotype.Repository;
import sprint.segunda_evaluacion.model.Turno;
import sprint.segunda_evaluacion.utils.GeneradorID;

@Repository
public class TurnoRepository {
    private final Map<Long, Turno> turno = new HashMap<>();

    public Turno save(Turno turno){
        return turno;
    }
    
    public List<Turno> findAll(){
        return new ArrayList<>(turno.values());
    }

    /*public Optional<Turno> findByDate(LocalDate fecha){
        return Optional.ofNullable(turno.get(fecha));
    }*/

    public void deleteById(Long id){
        turno.remove(id);
    }

}
