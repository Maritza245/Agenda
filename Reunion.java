package co.edu.uniquindio.poo;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class Reunion {
    private String descripcion;
    private String fecha;
    private String hora;
    private List<String> asistentes;

    public Reunion(String descripcion, String fecha, String hora) {
        this.descripcion = descripcion;
        this.fecha = fecha;
        this.hora = hora;
        this.asistentes = new ArrayList<>();
    }

    public String getDescripcion() {
        return descripcion;
    }

    public void setDescripcion(String descripcion) {
        this.descripcion = descripcion;
    }

    public String getFecha() {
        return fecha;
    }

    public void setFecha(String fecha) {
        this.fecha = fecha;
    }

    public String getHora() {
        return hora;
    }

    public void setHora(String hora) {
        this.hora = hora;
    }

    @Override
    public String toString() {
        return "La reunión está confirmada por: \n" +
               "Lista de asistentes: " + asistentes + "\n" +
               "Descripción: " + descripcion + "\n" +
               "Fecha: " + fecha + "\n" +
               "Hora: " + hora + "\n";
    }

    // Método para asignar un contacto como asistente
    public boolean asignarAsistente(String contacto) {
        if (!asistentes.contains(contacto)) {
            asistentes.add(contacto);
            return true;
        }
        return false;
    }

    // Método para eliminar un asistente
    public boolean eliminarAsistente(Contacto contacto) {
        Iterator<String> iterator = asistentes.iterator();
        while (iterator.hasNext()) {
            String asistente = iterator.next();
            if (asistente.equalsIgnoreCase(contacto.getNombre())) {
                iterator.remove();
                return true;
            }
        }
        return false;
    }
    // Método para mostrar los asistentes
    public void mostrarAsistentes() {
        System.out.println(toString());
        System.out.println("Lista de asistentes:");
        for (String asistente : asistentes) {
            System.out.println(asistente);
}
}
}
