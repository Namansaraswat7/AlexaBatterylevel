import java.util.Arrays;

public class AlexaFactory {

    public Alexa createAlexaDevice(String name) {
        switch (name) {
            case "Echo Dot":
                return new Alexa(
                        "Echo Dot",
                        Arrays.asList(InputType.VOICE),
                        Arrays.asList(OutputType.SOUND),
                        new BatteryMode(80, false)
                );
            case "Amazon Echo":
                return new Alexa(
                        "Amazon Echo",
                        Arrays.asList(InputType.VOICE),
                        Arrays.asList(OutputType.SOUND),
                        new PlugInMode()
                );
            case "Echo Show":
                return new Alexa(
                        "Echo Show",
                        Arrays.asList(InputType.VOICE, InputType.TYPING),
                        Arrays.asList(OutputType.SOUND, OutputType.DISPLAY),
                        new BatteryMode(50, true)
                );
            default:
                throw new IllegalArgumentException("Unknown device type: " + name);
        }
    }
}