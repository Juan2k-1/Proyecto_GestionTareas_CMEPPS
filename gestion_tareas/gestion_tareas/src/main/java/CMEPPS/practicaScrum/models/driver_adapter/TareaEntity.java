/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package CMEPPS.practicaScrum.models.driver_adapter;

import CMEPPS.practicaScrum.models.Tarea;
import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import java.time.LocalDate;
import org.hibernate.generator.Generator;

/**
 *
 * @author alejandro
 */
@Entity
public class TareaEntity {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long id;
    
    @Column(name ="titulo", nullable = false)
    private String titulo;
    
    @Column(name = "descripcion" , nullable = false)
    private String descripcion;
    
    @Column(name = "prioridad", nullable = false)
    private int prioridad;
    
    @Column(name="duracion",nullable = false)
    private int duracion;

    public TareaEntity(Long id, String titulo, String descripcion, int prioridad, int duracion) {
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
    
    public Tarea toTarea(){
        return new Tarea(id, titulo, descripcion, prioridad, duracion);
    }
}
