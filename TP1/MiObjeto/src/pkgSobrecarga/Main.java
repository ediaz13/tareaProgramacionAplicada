package pkgSobrecarga;

public class Main {
    public static void main(String[] args) {
        Sobrecarga S=new Sobrecarga();
        S.SetData(5);

        Sobrecarga S1=new Sobrecarga();
        S1.SetData(6, "Juan");

        Sobrecarga S2=new Sobrecarga();
        S2.SetData(8, "Pepe", "Lacarra 1001 CABA");


        System.out.println("Datos objeto 1: "+S.getEdad()+"\n");
        System.out.println("Datos objeto 2: "+S1.getEdad()+" "+S1.getNombre()+"\n");
        System.out.println("Datos objeto 3: "+S2.getEdad()+" "+S2.getNombre()+" "+S2.getDireccion()+"\n");

    }
}
