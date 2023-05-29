package main;

public class Cookie {
    private String name; // cookie name
    private double value; // cookie price
    private int quantity; // quantity of cookies
    private String flavor; // flavor of cookie

    // Constructor
    public Cookie() {
        this.name = name;
        this.value = value;
        this.quantity = quantity;
        this.flavor = flavor;
    }

    // Getters to the cookie infos
    public double getValue() {
        return value;
    }

    public int getQuantity() {
        return quantity;
    }

    // Setters to modify infos
    public void setName(String name) {
        this.name = name;
    }

    public void setValue(double value) {
        this.value = value;
    }

    public void setQuantity(int quantity) {
        this.quantity = quantity;
    }

    public void setFlavor(String flavor) {
        this.flavor = flavor;
    }
}
