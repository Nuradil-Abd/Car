import Car.AutoSalon;
import Car.Car;

import java.math.BigDecimal;
import java.time.LocalDate;

public class Main {
    public static void main(String[] args) {

        Car[] cars = new Car[]{
                new Car(1L,"Kia","k5","black", BigDecimal.valueOf(35000), LocalDate.of(2020,12,1), 2.5),
                new Car(2L,"Chevrolet","Malibu","black", BigDecimal.valueOf(28000),LocalDate.of(2022,9,15), 1.7),
                new Car(3L,"BMW","m3","Blue", BigDecimal.valueOf(38000),LocalDate.of(2018,10,16), 3.5),
                new Car(4L,"Mercedes-benz","w123","white-red", BigDecimal.valueOf(10000),LocalDate.of(1982,5,22), 3.0),
                new Car(5L,"Toyota","camry","black", BigDecimal.valueOf(20000),LocalDate.of(2016,6,3), 2.5),
        };

        AutoSalon autoSalon = new AutoSalon(1L,"Tulpar", cars);
        autoSalon.getAllCar();
        System.out.println("~~~~~~~~~~~~~~~~~~~~~~~~~~~");


        autoSalon.addCar(new Car(6L,"Kia","morning","white", BigDecimal.valueOf(8000),LocalDate.of(2018,3,8), 1.0));
        autoSalon.getAllCar();
        System.out.println("~~~~~~~~~~~~~~~~~~~~~~~~~~~");

        autoSalon.deleteCar(4L);
        autoSalon.getAllCar();
        System.out.println("~~~~~~~~~~~~~~~~~~~~~~~~~~~");


        autoSalon.updateCar(3L,new Car(3L,"Mercedes-benz","w124","white", BigDecimal.valueOf(8000),LocalDate.of(1999,11,8), 2.3));
        autoSalon.getAllCar();
        System.out.println("~~~~~~~~~~~~~~~~~~~~~~~~~~~");

        System.out.println(autoSalon.getCartById(2L));


    }
}