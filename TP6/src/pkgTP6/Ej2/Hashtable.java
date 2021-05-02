package pkgTP6.Ej2;

import java.util.Arrays;
import java.math.*;

public class Hashtable {
    int[] TablaHash;
    int tamanio,contador;

    public Hashtable(int tam){
        tamanio=tam;
        TablaHash=new int[tam];
        Arrays.fill(TablaHash, -1);
    }


    public void funcionHash(int[] vecElementos,int[] TablaHash){
        //Recorro el vector elementos para obtener los índices
        for(int i=0;i<vecElementos.length;i++){
            int elemento=Math.abs(vecElementos[i]);
            int indiceTablaHash=elemento%(tamanio);
            System.out.println("El indice es:"+ indiceTablaHash + " Para el elemento: " + elemento);

            while(TablaHash[indiceTablaHash]!=-1){
                indiceTablaHash++;
                System.out.println("Ocurrio una colision en el indice "+(indiceTablaHash-1)+" cambiar al indice "+(indiceTablaHash));
            }
            TablaHash[indiceTablaHash]=elemento;
        }
    }

    public int BuscarClave(int elemento){
        int indiceTablaHash=elemento % tamanio;
        while(TablaHash[indiceTablaHash]!=elemento && indiceTablaHash<tamanio){
            indiceTablaHash++;
        }
        if(indiceTablaHash<tamanio){
            System.out.println("El elemento " +elemento+" fue encontrado en el indice "+indiceTablaHash);
            return TablaHash[indiceTablaHash];
        }
        else
        {
            System.out.println("Elemento no encontrado");
            return 0;
        }
    }
}
