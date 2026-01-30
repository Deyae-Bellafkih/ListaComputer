public class Computer {
    private String marca;
    private String processore;
    private int capRAM;

    public Computer(String marca, String processore, int capRAM) {
        this.marca = marca;
        this.processore = processore;
        this.capRAM = capRAM;
    }
    public String getMarca() {
        return marca;
    }

    public String getProcessore() {
        return processore;
    }

    public int getCapRAM() {
        return capRAM;
    }
}
