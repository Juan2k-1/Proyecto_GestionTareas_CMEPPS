package CMEPPS.practicaScrum.models;

/**
 *
 * @author Juan Alberto Dominguez Vazquez
 */
public class Tarea
{
    private Long id;
    private String titulo;
    private String descripcion;
    private int prioridad;
    private int duracion;

    public Tarea(Long id, String titulo, String descripcion, int prioridad, int duracion) {
        this.id = id;
        this.titulo = titulo;
        this.descripcion = descripcion;
        this.prioridad = prioridad;
        this.duracion = duracion;
    }

    
    
    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getTitulo() {
        return titulo;
    }

    public void setTitulo(String titulo) {
        this.titulo = titulo;
    }

    public String getDescripcion() {
        return descripcion;
    }

    public void setDescripcion(String descripcion) {
        this.descripcion = descripcion;
    }

    public int getPrioridad() {
        return prioridad;
    }

    public void setPrioridad(int prioridad) {
        this.prioridad = prioridad;
    }

    public int getDuracion() {
        return duracion;
    }

    public void setDuracion(int duracion) {
        this.duracion = duracion;
    }

    
}
