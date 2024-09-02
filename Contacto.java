package co.edu.uniquindio.poo;
import java.util.LinkedList;

public class Contacto {
    private String nombre;
    private String alias;
    private String direccion;
    private String telefono;
    private String email;
    private LinkedList<Contacto> contactos;
    private LinkedList<Grupo> grupos;

    public Contacto(String nombre, String alias, String direccion, String telefono, String email) {
        this.nombre = nombre;
        this.alias = alias;
        this.direccion = direccion;
        this.telefono = telefono;
        this.email = email;
        this.contactos = new LinkedList<>();
        this.grupos = new LinkedList<>(); 
        assert !nombre.isBlank();
        assert !alias.isBlank();
        assert !direccion.isBlank();
        assert !telefono.isBlank();
        assert email.contains("@");

    }

    public LinkedList<Contacto> getContactos() {
        return contactos;
    }

    public void setContactos(LinkedList<Contacto> contactos) {
        this.contactos = contactos;
    }

    public LinkedList<Grupo> getGrupos() {
        return grupos;
    }

    public void setGrupos(LinkedList<Grupo> grupos) {
        this.grupos = grupos;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getAlias() {
        return alias;
    }

    public void setAlias(String alias) {
        this.alias = alias;
    }

    public String getDireccion() {
        return direccion;
    }

    public void setDireccion(String direccion) {
        this.direccion = direccion;
    }

    public String getTelefono() {
        return telefono;
    }

    public void setTelefono(String telefono) {
        this.telefono = telefono;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    @Override
    public String toString() {
        return "El contacto con\n" +
                "Nombre: " + nombre + "\n" +
                "Alias: " + alias + "\n" +
                "Dirección: " + direccion + "\n" +
                "Teléfono: " + telefono + "\n" +
                "Email: " + email + "\n" ;
    }

// Validar nombre y teléfono si ya existe
public static boolean validacionNumeroTelefono(String nombre, String telefono, Contacto[] contactos) {
    for (Contacto contacto : contactos) {
        // Se utiliza OR 
        if (contacto.getNombre().equalsIgnoreCase(nombre)|| contacto.getTelefono().equals(telefono)) {
            return true;
        }
    }
    return false;
}
    

    public static void mostrarMensaje(String mensaje) {
        System.out.println(mensaje);
    }

    public void agregarGrupo(Grupo grupo) {
        if (!grupos.contains(grupo)) {
            grupos.add(grupo);
        }
    }
    public void agregarContactos (Contacto contacto){
        contactos.add(contacto);

}}

