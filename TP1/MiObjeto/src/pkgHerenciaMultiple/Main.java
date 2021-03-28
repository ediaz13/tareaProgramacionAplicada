package pkgHerenciaMultiple;

public class Main {
    public static void main(String[] args) {
        Hija H = new Hija("Marrones","Castaño","Tenis","La mordidita (Ricky Martin)");
        System.out.println("El objeto Hija tiene ojos " + H.getColorOjos() +
                " cabello "+ H.getColorCabello() +
                " su deporte es " + H.HacerDeporte() +
                " su cancion favorita es " + H.cantar());

    }
}
