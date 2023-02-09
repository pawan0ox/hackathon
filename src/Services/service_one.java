package Services;

import service_center.branches;

import java.util.ArrayList;

public class service_one extends branches {
    String location="pokhara";
    public service_one(int capacity, String available_car, String Available_bike, ArrayList<branches> repairs) {
        super();
    }
    public void s1(){
        System.out.println("capacity\t repairs\t available_car\t available_vehicle\t");
        System.out.println(this.getCapacity() + "\t" + this.getRepairs() + "\t" + this.getAvailable_car() +"\t"+ this.Available_bike +"\t" + this.location);
    }
}
