package classwork;

public class Motherboard {

    private String model;
    private String manufacturer;
    private int ramSlots;
    private int cardSlots;
    private String bios;

    public String getBios() {
        return bios;
    }

    public int getCardSlots() {
        return cardSlots;
    }

    public int getRamSlots() {
        return ramSlots;
    }

    public String getManufacturer() {
        return manufacturer;
    }

    public String getModel() {
        return model;
    }

    public Motherboard(String model, String manufacturer, int ramSlots, int cardSlots, String bios) {
       this.model = model;
       this.manufacturer = manufacturer;
       this.ramSlots = ramSlots;
       this.cardSlots = cardSlots;
       this.bios = bios;
    }

    public void loadProgram(String programName) {
        System.out.println(programName + " is now loading...");
    }

    @Override
    public String toString() {
        return "Motherboard{" +
                "model='" + model + '\'' +
                ", manufacturer='" + manufacturer + '\'' +
                ", ramSlots=" + ramSlots +
                ", cardSlots=" + cardSlots +
                ", bios='" + bios + '\'' +
                '}';
    }
}
