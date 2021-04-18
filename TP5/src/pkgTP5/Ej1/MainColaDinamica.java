package pkgTP5.Ej1;


import org.apache.commons.lang3.StringUtils;

public class MainColaDinamica {
    public static void main(String[] args) {
        ColaMedico cola = new ColaMedico();

        Medico medicoClinico = new MedicoClinico(32, "Tom Atte", "Clinico");
        Medico medicoGastroenterologo = new MedicoGastroenterologo(60, "Luis Ventura", "Gastroenterologo");
        Medico medicoPediatra = new MedicoPediatra(70, "Padre Grassi", "Pediatra");

        cola.insertar(medicoClinico);
        cola.insertar(medicoGastroenterologo);
        cola.insertar(medicoPediatra);

        while(!cola.estaVacia()) {
            Medico medico = cola.extraer();
            if (medico.getClass().getName().contains("MedicoClinico")) {
                System.out.println(medico.getEdad() + StringUtils.SPACE + medico.getNombre() + StringUtils.SPACE + ((MedicoClinico)medico).getEspClinico());
            } else if (medico.getClass().getName().contains("MedicoGastroenterologo")) {
                System.out.println(medico.getEdad() + StringUtils.SPACE + medico.getNombre() + StringUtils.SPACE + ((MedicoGastroenterologo)medico).getEspGastro());
            } else if (medico.getClass().getName().contains("MedicoPediatra")) {
                System.out.println(medico.getEdad() + StringUtils.SPACE + medico.getNombre() + StringUtils.SPACE + ((MedicoPediatra)medico).getEspPediatra());
            }
        }

    }
}
