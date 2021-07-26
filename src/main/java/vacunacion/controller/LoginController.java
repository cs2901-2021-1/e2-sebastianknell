package vacunacion.controller;

import vacunacion.VacunasApp;
import vacunacion.model.StringFormatter;
import vacunacion.model.Usuario;

public class LoginController {

    public static boolean login(String username, String password) {
        return password == StringFormatter.reverseString(username);
    }
}
