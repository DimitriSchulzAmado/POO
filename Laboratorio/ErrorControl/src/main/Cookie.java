package main;

public class Cookie {
    private String name; // cookie name
    private double value; // cookie price
    private int quantity; // quantity of cookies
    private String flavor; // flavor of cookie

    // Constructor
    public Cookie(String name, double value, int quantity, String flavor) {
        this.name = name;
        this.value = value;
        this.quantity = quantity;
        this.flavor = flavor;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getQuantity() {
        return quantity;
    }

    public void setQuantity(int quantity) {
        this.quantity = quantity;
    }

    public String getFlavor() {
        return flavor;
    }

    public void setFlavor(String flavor) {
        this.flavor = flavor;
    }
}
