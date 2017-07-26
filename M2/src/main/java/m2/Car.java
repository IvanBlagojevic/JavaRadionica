package m2;

import m3.VehicleType;

public class Car implements Vehicle {
    
    private VehicleType vehicleType;
    
    public Car () {
	
	this.vehicleType = VehicleType.LAND;
    }

    public String getVehicleType() {
	return vehicleType.toString();
    }

    public int getVehicleTypePosition() {
	return vehicleType.getPosition();
    }
    
    @Override
    public String toString() {
	return "Car";
    }

}
