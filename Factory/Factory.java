package Factory;

import Computer.Computer;

public interface Factory {

    Computer getComputer(String type, String ram, String hdd, String cpu);
}
