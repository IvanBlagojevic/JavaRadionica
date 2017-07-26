package m1;

import java.util.HashMap;
import java.util.Map.Entry;

import m2.Aeroplane;
import m2.Car;
import m2.Vehicle;

public class Main {

    public static void main(String[] args) {

	Car c = new Car();
	Car c1 = new Car();
	Aeroplane a = new Aeroplane();
	Aeroplane a1 = new Aeroplane();
	Aeroplane a2 = new Aeroplane();

	HashMap<Integer, Object> vehicles = new HashMap<Integer, Object>();
	vehicles.put(1, c);
	vehicles.put(2, c1);
	vehicles.put(3, a);
	vehicles.put(4, a1);
	vehicles.put(5, a2);

	for (Object o : vehicles.values()) {
	   System.out.println(((Vehicle) o).getVehicleType());

	}

	for (int key : vehicles.keySet()) {
	    System.out.println(key + " " + vehicles.get(key).toString());

	}

	vehicles.remove(5);

	for (Entry<Integer, Object> entry : vehicles.entrySet()) {
	    System.out.println(entry.getKey() + " " + entry.getValue());

	}
	
	System.out.println("Ivan");

    }

}
