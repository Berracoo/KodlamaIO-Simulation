package entities;

public class Course {
    private int id;

    private String name;

    private String description;

    private double price;

    public Course(int id, String name, String describtion, double price) { // we used that to create an object

        this.id = id;
        this.name = name;
        this.description = describtion;
        this.price = price;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getDescription() {
        return description;
    }

    public void setDescribtion(String describtion) {
        this.description = describtion;
    }

    public double getPrice() {
        return price;
    }

    public void setPrice(double price) {
        this.price = price;
    }


}
