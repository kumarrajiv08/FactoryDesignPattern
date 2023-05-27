package Computer;

public abstract class Computer {
    public abstract String getRam();
    public abstract String getSSD();
    public abstract String getCPU();

    public String toString(){
        return "RAM: " + getRam() + " SSD: " + getSSD() + " CPU: " + getCPU();
    }


}
