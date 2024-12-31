package je29_arrays;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;

public class Mapas {
    public static void main(String[] args) {
        Map <String, String> estadosBrasileiros = new HashMap();
        estadosBrasileiros.put("PI", "Piaui");
        estadosBrasileiros.put("SP", "Sao Paulo");
        estadosBrasileiros.put("RJ", "Rio de Janeiro");
        estadosBrasileiros.put("MG", "Minas Gerais");
        estadosBrasileiros.put("BA", "Bahia");

        Iterator <String> keysOfStates = estadosBrasileiros.keySet().iterator();

        while (keysOfStates.hasNext()) {
            String key = keysOfStates.next();
            String value = estadosBrasileiros.get(key);

            System.out.println(value);
        }

    }
}
