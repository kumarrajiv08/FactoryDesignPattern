package Computer;

public class Laptop extends Computer{

    private final String RAM;
    private final String SSD;
    private final String CPU;

    public Laptop(String ram, String ssd, String cpu) {
        RAM = ram;
        SSD = ssd;
        CPU = cpu;
    }

    @Override
    public String getRam() {
        return RAM;
    }

    @Override
    public String getSSD() {
        return SSD;
    }

    @Override
    public String getCPU() {
        return CPU;
    }
}
