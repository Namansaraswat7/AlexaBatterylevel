public class AlexaController {

    public static void main(String[] args) {
        AlexaFactory factory = new AlexaFactory();

        // Create Echo Dot
        Alexa echoDot = factory.createAlexaDevice("Echo Dot");
        System.out.println("Device: " + echoDot.getName());
        System.out.println("Inputs: " + echoDot.getInputTypes());
        System.out.println("Outputs: " + echoDot.getOutputTypes());
        echoDot.displayBatteryStatus();

        // Create Echo Show
        Alexa amazonEcho = factory.createAlexaDevice("Amazon Echo");
        System.out.println("\nDevice: " + amazonEcho.getName());
        System.out.println("Inputs: " + amazonEcho.getInputTypes());
        System.out.println("Outputs: " + amazonEcho.getOutputTypes());
        amazonEcho.displayBatteryStatus();

        Alexa echoShow = factory.createAlexaDevice("Echo Show");
        System.out.println("\nDevice: " + echoShow.getName());
        System.out.println("Inputs: " + echoShow.getInputTypes());
        System.out.println("Outputs: " + echoShow.getOutputTypes());
        echoShow.displayBatteryStatus();
    }
    }


