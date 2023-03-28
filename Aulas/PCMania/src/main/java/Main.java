import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        Computer[] computers = new Computer[100];
        Client client = new Client();

        double total = 0;

        System.out.println("------ CLIENT DATA ------");
        System.out.println("Name: ");
        client.name = input.nextLine();
        System.out.println("CPF:");
        client.cpf = input.nextLong();
        input.nextLine();

        boolean flag = true;
        int i = 0;
        while (flag){
            System.out.println("------ What promotion do you want ------");
            System.out.println("1 - Promotion 1");
            System.out.println("2 - Promotion 2");
            System.out.println("3 - Promotion 3");
            System.out.println("0 - System Out");

            int option = input.nextInt();
            input.nextLine();
            switch (option){
                    case 0 -> {
                        flag = false;
                        break;
                    }
                    case 1 -> {
                        computers[i] = new Computer("Positivo", 2300F);
                        computers[i].mostraPCConfigs();
                        break;
                    }
                    case 2 -> {
                        computers[i] = new Computer("Acer", 5800F);
                        computers[i].mostraPCConfigs();
                        break;
                    }

                    case 3 -> {
                        computers[i] = new Computer("Vaio", 1800F);
                        computers[i].mostraPCConfigs();
                        break;
                    }
                    default -> {
                        System.out.println("Invalid Input");
                        break;
                    }
            }
            total = total + client.calculaTotalCompra(option);
            i++;
        }
        input.close();
        client.showAllBuy(total);
    }
}
