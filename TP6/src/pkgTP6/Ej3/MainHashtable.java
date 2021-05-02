package pkgTP6.Ej3;

import java.util.Hashtable;
import java.util.Iterator;
import java.util.Map;
import java.util.Set;

public class MainHashtable {
    public static void main(String[] args) {
        Hashtable table = new Hashtable();
        table.put(1, "value1");
        table.put(2, "value2");
        table.put(3, "value3");

        String value="value2";
        System.out.println("Clave de valor 2: " + ObtieneClave(table,value));

    }

    public static int ObtieneClave(Hashtable table, String value){
        Set set = table.entrySet();
        int key=-1;
        Iterator it = set.iterator();
        while (it.hasNext()) {
            Map.Entry entry = (Map.Entry) it.next();

            if(value==entry.getValue()){
                key=(int)entry.getKey();
            }
        }

        return key;
    }

}
