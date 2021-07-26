package vacunacion.model;

import java.util.ArrayList;
import java.util.List;

public class CentroVacunacion {
    Integer id;
    String ciudad;
    String departamento;

    private List<Persona> personasVacunadas = new ArrayList<>();

    public Integer getPersonasVacunadas() {
        return personasVacunadas.size();
    }

    public Integer getPersonasVacunadasParcial() {
        int count = 0;
        for (Persona persona : personasVacunadas) {
            if (persona.dosis == 1) {
                count += 1;
            }
        }
        return count;
    }

    public Integer getPersonasVacunadasCompleto() {
        int count = 0;
        for (Persona persona : personasVacunadas) {
            if (persona.dosis == 2) {
                count += 1;
            }
        }
        return count;
    }

    public Integer getPersonasVacunadasRango(int min, int max) {
        int count = 0;
        for (Persona persona : personasVacunadas) {
            if (persona.edad >= min && persona.edad <= max)
                count += 1;
        }
        return count;
    }
}
