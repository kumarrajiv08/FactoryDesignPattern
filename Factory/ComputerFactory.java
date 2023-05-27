package Factory;


import Computer.Computer;
import Computer.GamingLaptop;
import Computer.Laptop;

public class ComputerFactory implements Factory {
    public Computer getComputer(String type, String ram, String hdd, String cpu){
        if("Normal".equalsIgnoreCase(type)) return new Laptop(ram,hdd,cpu);
        else if("Gaming".equalsIgnoreCase(type)) return new GamingLaptop(ram, hdd, cpu);

        return null;
    }

}
