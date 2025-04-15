
public class BatteryMode implements PowerMode {
    private int batteryPercentage;
    private boolean isCharging;

    public BatteryMode(int batteryPercentage, boolean isCharging) {
        this.batteryPercentage = batteryPercentage;
        this.isCharging = isCharging;
    }

    @Override
    public void displayPowerStatus() {
        if (isCharging) {
            System.out.println("Battery is charging: " + batteryPercentage + "% charged.");
        } else {
            System.out.println("Battery is at: " + batteryPercentage + "%.");
        }
    }
}