package Car;

import java.math.BigDecimal;
import java.time.LocalDate;

public class Car {

    private Long id;
    private String  marka, model, color;
    private BigDecimal price;
    private LocalDate year;
    private double volume;

    public Car() {
    }

    public Car(Long id, String marka, String model, String color, BigDecimal price,LocalDate year, double volume) {
        this.id = id;
        this.marka = marka;
        this.model = model;
        this.color = color;
        this.price = price;
        this.year = year;
        this.volume = volume;
    }

    public LocalDate getYear() {
        return year;
    }

    public void setYear(LocalDate year) {
        this.year = year;
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getMarka() {
        return marka;
    }

    public void setMarka(String marka) {
        this.marka = marka;
    }

    public String getModel() {
        return model;
    }

    public void setModel(String model) {
        this.model = model;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public BigDecimal getPrice() {
        return price;
    }

    public void setPrice(BigDecimal price) {
        this.price = price;
    }

    public double getVolume() {
        return volume;
    }

    public void setVolume(double volume) {
        this.volume = volume;
    }

    @Override
    public String toString() {
        return "Car " +
                "\nid: " + id +
                "\nmarka: " + marka +
                "\nmodel: " + model +
                "\ncolor: " + color +
                "\nprice: " + price +
                "\nyear: " + year +
                "\nvolume: " + volume;
    }
}
