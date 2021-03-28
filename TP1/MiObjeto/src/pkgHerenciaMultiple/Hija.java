package pkgHerenciaMultiple;

public class Hija extends Madre implements Padre {
    private String deporte;

    public Hija (String oj, String cab, String dep, String can){
        super.setColorOjos(oj);
        super.setColorCabello(cab);
        super.setCancion(can);
        this.deporte=dep;

    }

    @Override
    public String HacerDeporte(){
        return deporte;
    }

}
