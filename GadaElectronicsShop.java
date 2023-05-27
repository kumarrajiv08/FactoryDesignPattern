import Computer.Computer;
import Factory.ComputerFactory;

public class GadaElectronicsShop {
    public static void main(String[] args) {
        ComputerFactory factory = new ComputerFactory();
        Computer computer = factory.getComputer("Gaming","16 GB", "556 GB","2.4 GHz");
        System.out.println(computer);

    }
}
