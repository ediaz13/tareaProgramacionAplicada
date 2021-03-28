package pkgHerenciaMultiple;

public class Madre {
    private String colorOjos;
    private String colorCabello;
    private String cancion;

    public void setColorOjos(String ojos){
        this.colorOjos=ojos;
    }
    public String getColorOjos(){
        return this.colorOjos;
    }
    public void setColorCabello(String cabello){
        this.colorCabello=cabello;
    }
    public String getColorCabello(){
        return this.colorCabello;
    }
    public void setCancion(String cancion){
        this.cancion=cancion;
    }
    public String cantar(){
        return this.cancion;
    }

}
