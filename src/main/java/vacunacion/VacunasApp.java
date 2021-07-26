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

    public Integer getTotalPersonasVacunadasRango(int rango) {
        int count = 0;
        switch (rango) {
            case 1:
                for (CentroVacunacion centroVacunacion : centrosVacunacion) {
                    count += centroVacunacion.getPersonasVacunadasRango(18, 39);
                }
                break;
            case 2:
                for (CentroVacunacion centroVacunacion : centrosVacunacion) {
                    count += centroVacunacion.getPersonasVacunadasRango(40, 49);
                }
                break;
            case 3:
                for (CentroVacunacion centroVacunacion : centrosVacunacion) {
                    count += centroVacunacion.getPersonasVacunadasRango(50, 59);
                }
                break;
            case 4:
                for (CentroVacunacion centroVacunacion : centrosVacunacion) {
                    count += centroVacunacion.getPersonasVacunadasRango(60, 69);
                }
                break;
            case 5:
                for (CentroVacunacion centroVacunacion : centrosVacunacion) {
                    count += centroVacunacion.getPersonasVacunadasRango(70, 79);
                }
                break;
            case 6:
                for (CentroVacunacion centroVacunacion : centrosVacunacion) {
                    count += centroVacunacion.getPersonasVacunadasRango(80, 1000);
                }
                break;
            default:
                return 0;
        }
        return count;
    }
}
