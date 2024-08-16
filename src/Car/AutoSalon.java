package Car;

import java.util.Arrays;

public class AutoSalon {

    private Long id;
    private String autoName;
    private Car[] cars;

    public AutoSalon() {
    }

    public AutoSalon(Long id, String autoName, Car[] cars) {
        this.id = id;
        this.autoName = autoName;
        this.cars = cars;
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getAutoName() {
        return autoName;
    }

    public void setAutoName(String autoName) {
        this.autoName = autoName;
    }

    public Car[] getCars() {
        return cars;
    }

    public void setCars(Car[] cars) {
        this.cars = cars;
    }

    @Override
    public String toString() {
        return "AutoSalon" +
                "\nid: " + id +
                "\nautoName: " + autoName +
                "\ncars: " + Arrays.toString(cars) ;
    }

    public void addCar(Car car){
        int newSize = cars.length + 1;
        cars = Arrays.copyOf(cars,newSize);
        cars[newSize - 1] = car;


    }
    public void getAllCar(){
        for (Car car : cars) {
            System.out.println(car);

        }
    }
    public Car getCartById(Long carId){for (Car car : cars) {
            if(car.getId().equals(carId)){
                return car;
            }
        }return null;
    }
    public void deleteCar(Long carId){
        for (int i = 0; i < cars.length; i++) {
            if(cars[i].getId().equals(carId)){
                cars[i] = cars[cars.length - 1];
                cars = Arrays.copyOf(cars,cars.length - 1);
                break;
            }
        }
    }
    public void updateCar(Long carId, Car newCar){
        for (int i = 0; i < cars.length; i++) {
            if(cars[i].getId().equals(carId)){
                cars[i] = newCar;
                break;
            }

        }
    }
}
