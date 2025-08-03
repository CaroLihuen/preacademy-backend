package main.segunda_evaluacion.src.main.java.sprint.segunda_evaluacion.utils;

public class GeneradorID {
    private static long turnoId = 1;
    private static long profesionalId = 1;
    private static long pacienteId = 1;

    public static synchronized Long generarTurnoId(){
        return turnoId++;
    }

    public static synchronized Long generarProfesionalId(){
        return profesionalId++;
    }

    public static synchronized Long generarPacienteId(){
        return pacienteId++;
    }
}
