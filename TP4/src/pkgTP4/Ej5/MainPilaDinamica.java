package pkgTP4.Ej5;

public class MainPilaDinamica {
    public static void main(String[] args) {
        PilaBicicletas pila = new PilaBicicletas();

        Bicicleta biciPaseo = new BicicletaPaseo("Azul", 12, 12);
        Bicicleta biciCarrera = new BicicletaCarrera("Rojo", 12, 12);
        Bicicleta biciMountain = new BicicletaMountain("Amarillo", 12, 12);


        pila.Poner(biciPaseo);
        pila.Poner(biciCarrera);
        pila.Poner(biciMountain);

        while(!pila.EstaVacia()) {
            Bicicleta p = pila.Sacar();
            if (p.getClass().getName().contains("BicicletaPaseo")) {
                System.out.println(p.getColor() + " " + p.getPesoCuadro() + " " + ((BicicletaPaseo)p).getCapacCanasta() + ((BicicletaPaseo) p).getMarcha());
            } else if (p.getClass().getName().contains("BicicletaCarrera")) {
                System.out.println(p.getColor() + " " + p.getPesoCuadro() + " " + ((BicicletaCarrera)p).getCapacCantimplora() + ((BicicletaCarrera) p).getMarcha());
            } else if (p.getClass().getName().contains("BicicletaMountain")) {
                System.out.println(p.getColor() + " " + p.getPesoCuadro() + " " + ((BicicletaMountain)p).getCapacAmortiguacion() + ((BicicletaMountain) p).getMarcha());
            }

            System.out.println(pila.Sacar());
        }
    }
}
