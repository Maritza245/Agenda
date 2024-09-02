package co.edu.uniquindio.poo;

/**
 * Hello world!
 *
 */
public class App {
    public static void main(String[] args) {
    
                // Creación de contactos
        Contacto sofia = new Contacto("Sofia", "Amor", "B/Gribraltar M a #18", "390845908", "sc@gmail.com");
        Contacto ana = new Contacto("Sofia", "Anita", "B/La Cecilia M p #01", "390845908", "ana@gmail.com");
        Contacto daniela = new Contacto("Daniela", "Peque", "B/Gribraltar M g #56", "350234567", "daniela@gmail.com");
        Contacto juan = new Contacto("Juan", "Coco", "B/Las Americas M b #45", "330897655", "juan@gmail.com");
        Contacto jorge = new Contacto("Jorge", "Monito", "B/Yulima M c #35", "32289578412", "jorge@gmail.com");
        Contacto amparo = new Contacto("Amparo", "Comadre", "B/Calima M g #28", "3200055489", "amparo@gmail.com");
        
        Contacto.mostrarMensaje(juan.toString());
        Contacto.mostrarMensaje(sofia.toString());
        Contacto.mostrarMensaje(ana.toString());
        Contacto.mostrarMensaje(daniela.toString());
        Contacto.mostrarMensaje(jorge.toString());
        Contacto.mostrarMensaje(amparo.toString());
 
            // Creación de reuniones
        Reunion reunion1 = new Reunion("Fiesta sorpresa", "13/05/2024", "3:00 PM");
        Reunion reunion2 = new Reunion("Fiesta Navidad", "24/12/2024", "9:00 PM");
        Reunion reunion3 = new Reunion("Fiesta sorpresa", "13/05/2024", "3:00 PM");
       

            // Asignar contactos como asistentes a las reuniones
        reunion1.asignarAsistente("Jorge");
        reunion2.asignarAsistente("Daniela");
        reunion3.asignarAsistente("Juan");
    
            
            // Mostrar asistentes después de la eliminación
            reunion1.mostrarAsistentes();
            reunion2.mostrarAsistentes();
            reunion3.mostrarAsistentes();

    
            // Crear grupos
        Grupo grupoAmigos = new Grupo("Amigos", "Universidad");
        Grupo grupoTrabajo = new Grupo("Trabajo", "Laboral");
        Grupo grupoFamilia = new Grupo("Familia", "Familiar");
    
            // Agregar contactos a grupos
        grupoAmigos.agregarContacto(ana);
        grupoAmigos.agregarContacto(daniela);
        grupoTrabajo.agregarContacto(juan);
        grupoTrabajo.agregarContacto(jorge);
        grupoFamilia.agregarContacto(sofia);
        grupoFamilia.agregarContacto(amparo);
    
            // Mostrar contactos en cada grupo
        System.out.println("Contactos en el grupo Amigos:");
            for (Contacto contacto : grupoAmigos.getListaContacto()) {
                System.out.println(contacto.getNombre());
            }
    
        System.out.println("Contactos en el grupo Trabajo:");
            for (Contacto contacto : grupoTrabajo.getListaContacto()) {
                System.out.println(contacto.getNombre());
            }
    
        System.out.println("Contactos en el grupo Familia:");
            for (Contacto contacto : grupoFamilia.getListaContacto()) {
                System.out.println(contacto.getNombre());
            }
    
            //Eliminar contacto 
        grupoAmigos.eliminarContacto(daniela);
        grupoTrabajo.eliminarContacto(jorge);
    
            // Mostrar contactos en el grupo después de la eliminación
        System.out.println("Contactos en el grupo 'Amigos' después de eliminar 'Daniela':");
            for (Contacto contacto : grupoAmigos.getListaContacto()) {
                System.out.println(contacto.getNombre());
            }
    
        System.out.println("Contactos en el grupo 'Trabajo' después de eliminar 'Jorge':");
            for (Contacto contacto : grupoTrabajo.getListaContacto()) {
                System.out.println(contacto.getNombre());
            }
    
        System.out.println("Contactos en el grupo 'Amigos' después de eliminar 'Amparo':");
            for (Contacto contacto : grupoFamilia.getListaContacto()) {
                System.out.println(contacto.getNombre());
            }

         //verificar y mostrar estudiante 
         Contacto[] contactos = {sofia, ana, daniela, juan, jorge, amparo};

         String nombre = "Ana";
         String telefono = "395908";
         boolean existe = Contacto.validacionNumeroTelefono(nombre, telefono, contactos);
         if (existe) {
             Contacto.mostrarMensaje("El contacto " + nombre + " y " + telefono + " ya existe.");
         } else {
             Contacto.mostrarMensaje("El contacto " + nombre + " y " + telefono + " no existe.");
         }
     }
    
}


    

    

   