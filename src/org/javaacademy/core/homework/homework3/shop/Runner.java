package org.javaacademy.core.homework.homework3.shop;

public class Runner {
    public static void main(String[] args) {

        Customer customer = new Customer("Юрий");
        Shop shop = new Shop(true, true, 2);
        customer.checkShop(shop);
    }
}
