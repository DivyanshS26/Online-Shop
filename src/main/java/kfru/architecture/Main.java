package kfru.architecture;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
        Shop shop = new Shop();
        Product product1 = shop.buyProduct("Pen");
        Product product2 = shop.buyProduct("Notebook");
        double bill1 = shop.checkout(product1);
        double bill2 = shop.checkout(product2);
        System.out.println(product1.name + " - $" + bill1);
        System.out.println(product2.name + " - $" + bill2);
    }
}