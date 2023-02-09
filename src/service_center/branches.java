package service_center;

import java.util.ArrayList;

public class branches extends Service_center{
    ArrayList<branches> repairs;

    public branches() {
        super();
        this.repairs = repairs;
    }

    public ArrayList<branches> getRepairs() {
        return repairs;
    }

    public void setRepairs(ArrayList<branches> repairs) {
        this.repairs = repairs;
    }

    public branches(int capacity, String available_car, String Available_bike) {
        super(capacity, available_car, Available_bike);
    }
    public void printformat(){
        System.out.println("capacity\t repairs\t available_car\t available_vehicle\t");
        System.out.println(this.capacity+ "\t" + this.repairs + "\t" + this.available_car +"\t"+ this.Available_bike );
    }
}
