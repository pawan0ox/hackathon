package service_center;

public class Service_center {
    int capacity;
    String available_car;
    protected String Available_bike;

    public Service_center(int capacity, String available_car, String getAvailable_bike) {
        this.capacity = capacity;
        this.available_car = available_car;
        this.Available_bike = getAvailable_bike;
    }

    public Service_center() {

    }

    public int getCapacity() {
        return capacity;
    }

    public void setCapacity(int capacity) {
        this.capacity = capacity;
    }

    public String getAvailable_car() {
        return available_car;
    }

    public void setAvailable_car(String available_car) {
        this.available_car = available_car;
    }

    public String getGetAvailable_bike() {
        return Available_bike;
    }

    public void setGetAvailable_bike(String getAvailable_bike) {
        this.Available_bike = getAvailable_bike;
    }
}
