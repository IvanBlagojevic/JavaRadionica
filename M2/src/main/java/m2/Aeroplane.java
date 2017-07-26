package m2;

import m3.VehicleType;

public class Aeroplane implements Vehicle {

    private VehicleType vehicleType;

    public Aeroplane() {
	this.vehicleType = VehicleType.AIR;
    }

    public String getVehicleType() {
	return vehicleType.toString();
    }

    public int getVehicleTypePosition() {
	return vehicleType.getPosition();
    }
    
    @Override
    public String toString() {
	return "Aeroplane";
    }

}
