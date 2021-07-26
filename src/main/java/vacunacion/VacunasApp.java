package vacunacion;

import vacunacion.model.CentroVacunacion;
import vacunacion.model.Persona;
import vacunacion.model.Usuario;

import java.util.ArrayList;
import java.util.List;

public class VacunasApp {
    private static VacunasApp instance;
    private final int maxVacunados = 22935533;


    private List<CentroVacunacion> centrosVacunacion = new ArrayList<>();
    private List<Usuario> usuarios = new ArrayList<>();

    public static VacunasApp getInstance() {
        if (instance == null) {
            instance = new VacunasApp();
        }
        return instance;
    }

    public void addCentroVacunacion(CentroVacunacion centroVacunacion) {
        this.centrosVacunacion.add(centroVacunacion);
    }

    public void removeCentroVacunacion(CentroVacunacion centroVacunacion) {
        this.centrosVacunacion.remove(centroVacunacion);
    }

    public void addUsuario(Usuario usuario) {
        this.usuarios.add(usuario);
    }

    public Usuario getUsuario(String username) {
        for (Usuario usuario : usuarios) {
            if (usuario.username == username) {
                return usuario;
            }
        }
        return null;
    }

    public double getAvanceVacunacion() {
        double count = 0;
        for (CentroVacunacion centroVacunacion : centrosVacunacion) {
            count += centroVacunacion.getPersonasVacunadas();
        }
        return count / maxVacunados * 100;
    }

    public double getCoberturaVacunacion() {
        double count = 0;
        for (CentroVacunacion centroVacunacion : centrosVacunacion) {
            count += centroVacunacion.getPersonasVacunadasCompleto();
        }
        return count / maxVacunados * 100;
    }

    public Integer getCentrosVacunacion() {
        return this.centrosVacunacion.size();
    }

    public Integer getTotalPersonasVacunadasParcial() {
        int count = 0;
        for (CentroVacunacion centroVacunacion : centrosVacunacion) {
            count += centroVacunacion.getPersonasVacunadasParcial();
        }
        return count;
    }

    public Integer getTotalPersonasVacunadasCompleto() {
        int count = 0;
        for (CentroVacunacion centroVacunacion : centrosVacunacion) {
            count += centroVacunacion.getPersonasVacunadasCompleto();
        }
        return count;
    }

//    public Integer getTotalPersonasVacunadasRango(int rango) {
//
//    }
}
