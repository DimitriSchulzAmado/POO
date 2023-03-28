public class Computer {
    String brand; // marca
    float price; // preço
    OperatingSystem oSystem;
    BasicHardware bHardware;

    public Computer(String brand, float price) {
        oSystem = new OperatingSystem();
        bHardware = new BasicHardware();
        this.brand = brand;
        this.price = price;
    }

    public void mostraPCConfigs() {
        if (this.brand.equalsIgnoreCase("Positivo")) {
            bHardware.name = "Pentium Core i3 (2200 MHz) 8Gb of memory RAM";
            bHardware.capacity = 500;
            oSystem.name = "Linux Ubuntu ";
            oSystem.type = 32;

            System.out.println("----------- Promotion 1 -------------");
            System.out.println("Brand: " + this.brand);
            System.out.println("Price: R$" + this.price);
            System.out.println("Processor: " + bHardware.name + " " + bHardware.capacity + "Gb of HD");
            System.out.println("Operation System: " + oSystem.name  + " (" + oSystem.type + ")");
        }
        if (this.brand.equalsIgnoreCase("Acer")) {
            bHardware.name = "Pentium Core i5 (3370 Mhz) 16 Gb de Memória RAM";
            bHardware.capacity = 1000;
            oSystem.name = "Windows 8";
            oSystem.type = 64;

            System.out.println("----------- Promotion 2 -------------");
            System.out.println("Brand: " + this.brand);
            System.out.println("Price: R$" + this.price);
            System.out.println("Processor: " + bHardware.name + " " + bHardware.capacity + "Gb of HD");
            System.out.println("Operation System: " + oSystem.name + " (" + oSystem.type + ")");
        }

        if (this.brand.equalsIgnoreCase("Vaio")) {
            bHardware.name = "Pentium Core i7 (4500 Mhz) 32Gb of memory RAM";
            bHardware.capacity = 2000;
            oSystem.name = "Windows 10";
            oSystem.type = 64;

            System.out.println("----------- Promotion 3 -------------");
            System.out.println("Brand: " + this.brand);
            System.out.println("Price: R$" + this.price);
            System.out.println("Processor: " + bHardware.name + " " + bHardware.capacity + "Gb of HD");
            System.out.println("Operation System: " + oSystem.name + " (" + oSystem.type + ")");
        }
    }

    public void addMemorieUSB(MemorieUSB musb) {

        switch (this.brand) {
            case "Positivo" -> {
                musb.name = "Pen-Drive";
                musb.capacity = 16;
            }
            case "Acer" -> {
                musb.name = "Pen-Drive";
                musb.capacity = 32;
            }
            case "Vaio" -> {
                musb.name = "HD Externo";
                musb.capacity = 1;
            }
        }
    }
}
