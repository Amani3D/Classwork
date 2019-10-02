package classwork;

public class Monitor {

    private String model;
    private String manufacturer;
    private String size;
    private String nativeResolution;

    public String getNativeResolution() {
        return nativeResolution;
    }

    public String getSize() {
        return size;
    }

    public String getManufacturer() {
        return manufacturer;
    }

    public String getModel() {
        return model;
    }

    public Monitor(String model, String manufacturer, String size, String nativeResolution) {
        this.model = model;
        this.manufacturer = manufacturer;
        this.size = size;
        this.nativeResolution = nativeResolution;
    }

    public void drawPixelAt(int x, int y, String color) {
        System.out.println("Drawing pixel at " + x + "," + y + " " + "in color " + color);
    }

    @Override
    public String toString() {
        return "Monitor{" +
                "model='" + model + '\'' +
                ", manufacturer='" + manufacturer + '\'' +
                ", size='" + size + '\'' +
                ", nativeResolution='" + nativeResolution + '\'' +
                '}';
    }
}
