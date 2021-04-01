package pkgTP3.Ej1;

public class Main {
    public static void main(String[] args) {
        /*
        ReproductorMP3 Obj1=new ReproductorMP3();
        Obj1.setCancion("Tomando mate en la paz");
        Obj1.setTiposArchivoLectura("PCM, Wav, Aiff. Compresión. Mp3, Ogg, Wma");
        Obj1.ChangeVolume(32);
        Obj1.ChangeIdioma("Español");
        Obj1.ChangeOutPutAV(1);

        ReproductorCD Obj2=new ReproductorCD();
        Obj2.setCancion("Amapola del 66");
        Obj2.setTipoBateria("AAA");
        Obj2.ChangeVolume(48);
        Obj2.ChangeIdioma("Ingles");
        Obj2.ChangeOutPutAV(2);

        TVLed Obj3=new TVLed();
        Obj3.setCantCanales(650);
        Obj3.ChangeVolume(25);
        Obj3.ChangeIdioma("Portugues");
        Obj3.ChangeOutPutAV(1);
         */

        ReproductorMP3 Obj1=new ReproductorMP3("Tomando mate en la paz", "PCM, Wav, Aiff. Compresión. Mp3, Ogg, Wma",32,"Español",1);
        ReproductorCD Obj2=new ReproductorCD("Amapola del 66",13,"ESP",13,"AAA");
        TVLed Obj3=new TVLed(13,"ESP",12,"1");
    }
}
