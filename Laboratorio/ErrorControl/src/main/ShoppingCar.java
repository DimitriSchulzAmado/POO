package main;

import exceptions.NumeroNegativoException;
import java.util.ArrayList;

public class ShoppingCar {
    /*
        Discount coupon doesn't exist without being in the shopping cart, so it needs a composition
     */
    private DiscountCupom cupom; // Discount Cupom
    private ArrayList<Cookie> cookies = new ArrayList<>(); // Array list to store cookies

    // Constructor class
    public ShoppingCar() {
        cupom = new DiscountCupom();
    }

    public void addCookies(Cookie cookie){
        /*
            Method to add cookies in shoppingCar
         */
        try{
            // Checking the amount of cookies
            if(cookie.getQuantity()<=0){
                throw new NumeroNegativoException();
            }else{
                cookies.add(cookie);
                System.out.println("++ ADDED COOKIES ++");
            }
        }catch(NumeroNegativoException e){
            System.out.println(e.fillInStackTrace());
        }
    }

    public double totalSum(){
        // Local variable to work with the total value of cookies
        double shoppingTotalValue = 0;
        // First we need to check if there is a discount cupom in that cart
        if(cookies.size()==0){
            System.out.println("DON'T EXISTS COOKIES IN SHOPPINGCAR !!!!");
        }else{
            // Cycling through all the cookies that were added to the cart
            for (int i = 0; i < cookies.size(); i++) {
                shoppingTotalValue += (cookies.get(i).getValue()*cookies.get(i).getQuantity()); // sum of values
            }
            // Checks if the value of the discount coupon is greater than 0, so it calculates the value in another way
            if(cupom.getValor() > 0){
                shoppingTotalValue = totalSumWithDiscount(shoppingTotalValue,cupom.getValor());
            }
        }
        return shoppingTotalValue;
    }

    private double totalSumWithDiscount(double total, double discount){
        // Local variable to store the total value with discount of the establishment
        double totalValue = total - discount;

        return totalValue;
    }

    // Getter e setter para o cupom de discount
    public DiscountCupom getCupom() {
        return cupom;
    }

    public void setCupom(DiscountCupom cupom) {
        this.cupom = cupom;
    }
}
