
import java.util.List;

public class Alexa {

    private String name;
    private List<InputType> inputTypes;
    private List<OutputType> outputTypes;
    private PowerMode powerMode;

    public Alexa(String name, List<InputType> inputTypes, List<OutputType> outputTypes, PowerMode powerMode) {
        this.name = name;
        this.inputTypes = inputTypes;
        this.outputTypes = outputTypes;
        this.powerMode = powerMode;
    }

    public void displayBatteryStatus() {
        powerMode.displayPowerStatus();
    }

    public List<InputType> getInputTypes() {
        return inputTypes;
    }

    public List<OutputType> getOutputTypes() {
        return outputTypes;
    }

    public String getName() {
        return name;
    }
}