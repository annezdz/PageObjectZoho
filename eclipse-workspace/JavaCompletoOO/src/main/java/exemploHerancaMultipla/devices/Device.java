package exemploHerancaMultipla.devices;

public abstract class Device {

    private String serialNumber;

    public Device(String serialNumber) {
        this.serialNumber = serialNumber;
    }

    public String getSerialNumber() {
        return serialNumber;
    }

    public abstract void processDoc(String doc);
}
