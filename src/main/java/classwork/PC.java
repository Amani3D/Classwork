package classwork;

public class PC {

    private Case cAse;
    private Motherboard motherboard;
    private Monitor monitor;

    private Case getCase() {
        return this.cAse;
    }

    private Motherboard getMotherboard() {
        return this.motherboard;
    }

    private Monitor getMonitor() {
        return this.monitor;
    }

    public PC(Case cAse, Motherboard motherboard, Monitor monitor) {
        this.cAse = cAse;
        this.motherboard = motherboard;
        this.monitor = monitor;
    }

    public void loadProgram() {
        System.out.println();
    }

    public void pressPowerButton() {
        System.out.println();
    }

    private void drawLogo() {
        drawPixel();
    }

    public void powerUp() {
        cAse.pressPowerButton();
        drawLogo();
        motherboard.loadProgram("Windows 10");
    }

    public void description() {
        System.out.println(cAse.toString() + motherboard.toString() + monitor.toString());
    }

    private void drawPixel() {
        monitor.drawPixelAt(120, 45, "Green");
    }

    @Override
    public String toString() {
        return "PC{" +
                "cAse=" + cAse +
                ", motherboard=" + motherboard +
                ", monitor=" + monitor +
                '}';
    }
}

