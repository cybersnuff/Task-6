package web.model;

import java.util.ArrayList;
import java.util.List;

public class Car {

    private String model;
    private String colour;
    private int yearCreate;
    public static List<Car> carList;


    static {

        carList = new ArrayList<>();

        carList.add(new Car("BMW", "Black", 2019));
        carList.add(new Car("Lada", "Red", 2020));
        carList.add(new Car("Reno", "Green", 2010));
        carList.add(new Car("Toyota", "Yellow", 1997));
        carList.add(new Car("Kia", "White", 2023));
    }

    public Car(String model, String colour, int yearCreate) {
        this.model = model;
        this.colour = colour;
        this.yearCreate = yearCreate;
    }

    public String getModel() {
        return model;
    }

    public void setModel(String model) {
        this.model = model;
    }

    public String getColour() {
        return colour;
    }

    public void setColour(String colour) {
        this.colour = colour;
    }

    public int getYearCreate() {
        return yearCreate;
    }

    public void setYearCreate(int yearCreate) {
        this.yearCreate = yearCreate;
    }
}
