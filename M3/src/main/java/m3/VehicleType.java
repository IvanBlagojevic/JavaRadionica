package m3;

public enum VehicleType {

    LAND(1), SEA(2), AIR(3);

    int position;

    VehicleType(int position) {
	this.position = position;

    }
    
    public int getPosition() {
	return position;
    }

}
