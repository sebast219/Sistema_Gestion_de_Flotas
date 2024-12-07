//sustitucion de liskov (lsp)
//la clase derivadas tendran que ser sustituidas por las clases base 
//sin tener que modificar el comportamiento esperado

public class Vehicle {
    private String model;
    private String licensePlate;
}

//(subclase de Vehicle)

// Subclase de Vehicle
public class ElectricVehicle extends Vehicle {
    private int batteryLevel;

    // aqui sobreescribimos el método getBatteryLevel para ElectricVehicle
    @Override
    public int getBatteryLevel() {
        return batteryLevel;
    }

    // este es el constructor
    public ElectricVehicle(int batteryLevel) {
        this.batteryLevel = batteryLevel;
    }
    
    public class Main {
        public static void main(String[] args) {
            Vehicle myCar = new ElectricVehicle(80); 
            System.out.println("Battery level: " + myCar.getBatteryLevel());
        }
}

// Podemos sustituir ElectricVehicle por un objeto Vehicle sin problemas