package vacunacion;

import org.junit.Test;
import vacunacion.model.Usuario;

public class VacunasAppTest {
    @Test public void mainTest() {
        var vacunasApp = VacunasApp.getInstance();
        Usuario usuario = new Usuario("admin");

    }
}
