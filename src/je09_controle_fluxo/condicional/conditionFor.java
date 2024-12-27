package je09_controle_fluxo.condicional;

public class conditionFor {
    public static void main(String[] args) {
        // printar os numeros

//        for (int i = 0; i < 7; i++) {
//            System.out.println(i);
//        }

        // printar os dias da semana

        String weekDays[] = {"Segunda", "Terça", "Quarta", "Quinta", "Sexta", "Sabado", "Domingo"};

//        for ( int i = 0; i < weekDays.length; i++) {
//            System.out.println(weekDays[i]);
//        }
//
//        for (String weekDay : weekDays) {
//            System.out.println(weekDay);
//        }

        // example for continue ( vou pular a quarta feira )

//        for (String weekDay : weekDays) {
//            if(weekDay == "Quarta") {
//                continue;
//            }
//            System.out.println(weekDay);
//        }

        // example for break ( vou parar na quarta )

//        for (String weekDay : weekDays) {
//            if(weekDay == "Quarta") {
//                break;
//            }
//            System.out.println(weekDay);
//        }
        int i = 0;
        while (i < weekDays.length) {
            System.out.println(weekDays[i]);
            i++;
        }

    }
}
