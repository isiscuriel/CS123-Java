public class VehicleT extends PersonT {

    String manufactName;
    int engine;



    public VehicleT()
    {
        manufactName = "no name yet";
        engine = 0;
    }
    public VehicleT(String initialManufactName, int initialEngine)
    {
        manufactName = initialManufactName;
        engine = initialEngine;
    }
    public void setManufactName(String newManufactName)
    {
        manufactName = newManufactName;
    }
    public void setEngine(int newEngine)
    {

        engine = newEngine;
    }
    public String getManufactName()
    {

        return manufactName;
    }
    public double getEngine()
    {
        return engine;
    }
    public void writeOutput()
    {
        super.writeOutput();
        System.out.println("Manufacturer: " + manufactName);
        System.out.println("Engine Cyclinders: " + engine);
    }
    public boolean hasSameManufactName(Vehicle otherVehicle)
    {
        return this.manufactName.equalsIgnoreCase(otherVehicle.manufactName);
    }
    public boolean hasSameEngine(Vehicle otherVehicle)
    {
        return this.engine == (otherVehicle.engine);
    }
}