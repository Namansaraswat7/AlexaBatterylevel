public class PlugInMode implements PowerMode {

    @Override
    public void displayPowerStatus() {
        System.out.println("Device is plugged-in.");
    }
}