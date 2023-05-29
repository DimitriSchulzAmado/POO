package main;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        // Creating a shopping car
        ShoppingCar shoppingCar = new ShoppingCar();
        // Input data
        Scanner input = new Scanner(System.in);
        // While control flag
        boolean flag = true;

        // Interactive menu to allow the user to dynamically add information
        while(flag){
            // Options
            System.out.println("WELCOME TO MENU");
            System.out.println("1- Buy Cookies");
            System.out.println("2- Checkout");
            System.out.println("3- Out");
            System.out.println("Enter your option: ");
            
            int option=input.nextInt(); // User option input
            input.nextLine();
            switch(option){
                case 1:
                    // Creating and adding Cookies to the cart
                    Cookie cookie = new Cookie();
                    System.out.print("NAME: ");
                    cookie.setName(input.nextLine());
                    System.out.print("FLAVOR: ");
                    cookie.setFlavor(input.nextLine());
                    System.out.print("VALUE U$: ");
                    cookie.setValue(input.nextDouble());
                    System.out.print("QUANTITY: ");
                    cookie.setQuantity(input.nextInt());

                    // Add Cookie
                    shoppingCar.addCookies(cookie);
                    break;
                case 2:
                    // At the end of the purchase, we must confirm the value of the discount coupon.
                    System.out.print("VALOR CUPOM DE DESCONTO: ");
                    shoppingCar.getCupom().setValor(input.nextDouble());

                    // Calculating total value
                    double totalValue = shoppingCar.totalSum();
                    System.out.println("SHOPPING TOTAL VALUE: " + totalValue + " U$");
                    break;
                case 3:
                    flag = false;
                    break;
                default:
                    System.out.println("Invalid Option !!!");
                    break;
            }
        }
        input.close(); // Closing the data entry after using it
    }
}
