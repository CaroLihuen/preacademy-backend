package main.serie.models;

public class Episodio {
    private String titulo;
    private String descripcion;
    private boolean visto;
    private int calificacion;

    public Episodio(String nuevoTitulo,String nuevaDescripcion, boolean nuevaVista, int nuevaCalificacion ){
    this.titulo=nuevoTitulo;
    this.descripcion=nuevaDescripcion;
    this.visto=nuevaVista;
    this.calificacion=nuevaCalificacion;
    }

    public Episodio(String nuevoTitulo,String nuevaDescripcion, boolean nuevaVista){
    this.titulo=nuevoTitulo;
    this.descripcion=nuevaDescripcion;
    this.visto=nuevaVista;
    this.calificacion=(-1);
    }
}
