import java.sql.SQLOutput;

public class Client {
    String name;
    long cpf;

    public double calculaTotalCompra(int promotion){
        double sum = 0;
            if (promotion == 1){
                sum += 2300F;
            } else if (promotion == 2) {
                sum += 5800F;
            } else if (promotion == 3) {
                sum += 1800F;
            }
        return sum;
    }

    public void showAllBuy(double sum){
        System.out.println("------ PURCHASE ------");
        System.out.println("Client: " + this.name);
        System.out.println("CPF: " + this.cpf);
        System.out.println(" ");
        System.out.println("Total a pagar: R$" + sum);
    }
}
