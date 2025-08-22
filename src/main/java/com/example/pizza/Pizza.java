package com.example.pizza;


public class Pizza {

    private long id;
    private String crust;
    private double price;
    private String size;
    private String toppings;
    private boolean hasCheese;

    public long getId() { return id; }
    public void setId(long id) { this.id = id; }
    public String getCrust() { return crust; }
    public void setCrust(String crust) { this.crust = crust; }
    public double getPrice() { return price; }
    public void setPrice(double price) { this.price = price; }
    public String getSize() { return size; }
    public void setSize(String size) { this.size = size; }
    public String getToppings() { return toppings; }
    public void setToppings(String toppings) { this.toppings = toppings; }
    public boolean isHasCheese() { return hasCheese; }
    public void setHasCheese(boolean hasCheese) { this.hasCheese = hasCheese; }

    public Pizza() {
        this("None", 0, "None", "None", false);
    }

    public Pizza(String crust, double price, String size, String toppings, boolean hasCheese) {
        this.crust = crust;
        this.price = price;
        this.size = size;
        this.toppings = toppings;
        this.hasCheese = hasCheese;
    }

    public Pizza(Pizza newPizza) {
        this.id = newPizza.id;
        this.crust = newPizza.crust;
        this.price = newPizza.price;
        this.size = newPizza.size;
        this.toppings = newPizza.toppings;
        this.hasCheese = newPizza.hasCheese;
    }
}
