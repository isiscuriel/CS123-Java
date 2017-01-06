public class TruckT extends VehicleT {

    private double load;
    private double towing;

    public TruckT()
    {
        load = 0;
        towing = 0;
    }
    public TruckT(double initialLoad, double initialTowing)
    {
        load = initialLoad;
        towing = initialTowing;
    }
    public void setLoad(double newLoad)
    {
        load = newLoad;
    }
    public void setTowing(double newTowing)
    {
        towing = newTowing;
    }
    public double getLoad()
    {
        return load;
    }
    public double getTowing()
    {
        return towing;
    }
    public void writeOutput()
    {
        super.writeOutput();
        System.out.println("Load: " + load);
        System.out.println("Towing: " + towing);
    }
    public boolean hasSameLoad(Truck otherTruck)
    {
        return(this.load == (otherTruck.load));
    }
    public boolean hasSameTowing(Truck otherTruck)
    {
        return this.towing == (otherTruck.towing);
    }
}