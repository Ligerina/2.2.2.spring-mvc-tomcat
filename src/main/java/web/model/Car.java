package web.model;

public class Car {

    private int id;
    private String nameOfModel;
    private int year;
    private int price;
    private int mileage;

    public Car(int id, String nameOfModel, int year, int price, int mileage) {
        this.id = id;
        this.nameOfModel = nameOfModel;
        this.year = year;
        this.price = price;
        this.mileage = mileage;
    }


    public Car() {

    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getNameOfModel() {
        return nameOfModel;
    }

    public void setNameOfModel(String nameOfModel) {
        this.nameOfModel = nameOfModel;
    }

    public int getYear() {
        return year;
    }

    public void setYear(int year) {
        this.year = year;
    }

    public int getPrice() {
        return price;
    }

    public void setPrice(int price) {
        this.price = price;
    }

    public int getMileage() {
        return mileage;
    }

    public void setMileage(int mileage) {
        this.mileage = mileage;
    }

}
