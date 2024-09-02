/**
 * Clase para probar el funcionamiento del código
 * @author Área de programación UQ
 * @since 2023-08
 * 
 * Licencia GNU/GPL V3.0 (https://raw.githubusercontent.com/grid-uq/poo/main/LICENSE) 
 */
package co.edu.uniquindio.poo;

import static org.junit.jupiter.api.Assertions.assertThrows;
import static org.junit.jupiter.api.Assertions.assertTrue;
import java.util.logging.Logger;
import org.junit.jupiter.api.Test;

/**
 * Unit test for simple App.
 */
public class ContactoTest {
    private static final Logger LOG = Logger.getLogger(ContactoTest.class.getName());
   @Test
    public void validacionCorreo() {
        LOG.info("Iniciando test validacionCorreo");

        assertThrows(Throwable.class, ()->new Contacto("Sofia", "Amor", "B/Gribraltar M a #18", "390845908", "scgmail.com"));

        LOG.info("Finalizando test validacionCorreo");
    }

    @Test
        public void datosVacios() {
            LOG.info("Iniciando test datosVacios");

            assertThrows(Throwable.class, ()->new Contacto(" ", " ", " ", " ", " "));

            LOG.info("Finalizando test datosVacios");





    } 
}
