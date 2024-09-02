package co.edu.uniquindio.poo;

import java.util.LinkedList;

public class Grupo {

    private String nombre;
    private String categoria;
    private LinkedList<Contacto> listaContacto;
    private static final int MIN_CONTACTOS = 5;

    public Grupo(String nombre, String categoria) {
        this.nombre = nombre;
        this.categoria = categoria;
        this.listaContacto = new LinkedList<>();
    }

    public static int getMinContactos() {
        return MIN_CONTACTOS;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getCategoria() {
        return categoria;
    }

    public void setCategoria(String categoria) {
        this.categoria = categoria;
    }

    public LinkedList<Contacto> getListaContacto() {
        return listaContacto;
    }

    public void setListaContacto(LinkedList<Contacto> listaContacto) {
        this.listaContacto = listaContacto;
    }

    @Override
    public String toString() {
        return "El grupo tiene incluidos estos contactos:\n" +
                "Nombre: " + nombre + "\n" +
                "Categoría: " + categoria + "\n" +
                "Lista de Contactos: " + listaContacto + "\n";
    }

    // Agregar un contacto
    public boolean agregarContacto(Contacto contacto) {
        if (listaContacto.contains(contacto)) {
            return false; // Ya existe el contacto en la lista
        }
        boolean agregado = listaContacto.add(contacto);
        if (agregado) {
            contacto.agregarGrupo(this);
            return true;
        }
        return false;
    }

    // Eliminar un contacto por nombre
    public void eliminarContacto(String nombre) {
        for (Contacto contacto : listaContacto) {
            if (contacto.getNombre().equals(nombre)) {
                listaContacto.remove(contacto);
                break;
            }
        }
    }

    // Eliminar un contacto por objeto
    public void eliminarContacto(Contacto contacto) {
        listaContacto.remove(contacto);
    }

    public int getNumeroContacto() {
        return listaContacto.size();
    }
}

