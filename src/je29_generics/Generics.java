package je29_generics;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class Generics {
    public static void main(String[] args) {
        List <String> carros = new ArrayList();
        carros.add("HB20");
        carros.add("Bolt");
        carros.add("Onix");
        carros.add("Bora");

        Collections.sort(carros);
        Collections.reverse(carros);
        Collections.shuffle(carros);


        for(String car : carros) {
            System.out.println(car);
        }

    }
}
