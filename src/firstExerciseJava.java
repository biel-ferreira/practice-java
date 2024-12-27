import java.time.LocalDate;

public class firstExerciseJava {
    // Attributes
    Integer accountNumber = 34;
    Integer agenceNumber = 77;
    String clientName = "Gabriel Ferreira";
    LocalDate birthDay = LocalDate.parse("08/05/2000");
    Double accountBalance = 30000.45;

    // Methods
    Double getMoney (Integer accountNumber, Integer agenceNumber, Double value) {
        System.out.println("Voce vai sacar o valor de : " + value + " da conta: " + accountNumber + "com a agencia: " + agenceNumber);
        return value;
    }

    String transferMoneyToAnotherAccount (Integer accountNumberSend, Integer accountNumberReceive, Double amount) {
        return "Voce vai transferir o valor de : " + amount + " da conta: " + accountNumberSend + "para a conta: " + accountNumberReceive;
    }

    String cancelAccountWithJustification (Integer accountNumber, String justification) {
        return "Você cancelou a conta : " + accountNumber + "pela justificativa : " + justification;
    }

    Double consultExtractBetweenTwoDates (String dateOne, String dateTwo, Integer accountNumber) {
        return 31.3;
    }

    Double consultActualAmount (Integer accountNumber) {
        return 30000.45;
    }
}
