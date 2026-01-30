public class Computer implements Comparable<Computer> {
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

    public int compareTo(Computer c) {
        if (this.capRAM < c.capRAM) {
            return -1;
        }
        else if (this.capRAM == c.capRAM) {
            return 0;
        } else
            return 1;
        }

    public String toString() {
        return "Computer[ marca: " + marca + ", processore: " + processore + ", capacità della RAM: " + capRAM + " ]";
    }
}



