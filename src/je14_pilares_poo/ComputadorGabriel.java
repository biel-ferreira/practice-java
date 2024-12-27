package je14_pilares_poo;

public class ComputadorGabriel {
    public static void main(String[] args) {
        MessageSystem messageSystem = null;

        String choosedApp = "telegram";
        
        if(choosedApp.equals("msn")) {
            messageSystem = new MSNMessenger();
        } else if (choosedApp.equals("fbm")) {
            messageSystem = new FacebookMessenger();
        } else {
            messageSystem = new TelegramMessenger();
        }

        messageSystem.sendMessage();
        messageSystem.receiveMessaage();

    }
}
