package pl.javastart.task;

public class Main {

    public static void main(String[] args) {
        String product1Name, product2Name, product1Company, product2Company;
        double product1Cost, product2Cost;

        product1Name = "Mleko";
        product1Company = "Mlekowita";
        product1Cost = 2.5;

        product2Name = "Czekolada";
        product2Company = "Wedel";
        product2Cost = 2.19;

        System.out.println(product1Name + " " + product1Company + " " + product1Cost + "zł");
        System.out.println(product2Name + " " + product2Company + " " + product2Cost + "zł");
    }
}
