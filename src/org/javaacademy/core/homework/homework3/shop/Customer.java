package org.javaacademy.core.homework.homework3.shop;

/**
 * Покупатель
 */
public class Customer {
     private String name;

    public Customer(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }

    protected void checkShop(Shop shop) {
        if ((shop.isClearFloor() && shop.isWorkersHasBadge()) || (shop.isWorkersHasBadge()
                && shop.getCountWorkers() >= 2) || (shop.isClearFloor() && shop.getCountWorkers() >= 2))  {
            System.out.println(name + ": Магазин прошел проверку");
        } else {
            System.out.println(name + ": Магазин не прошел проверку!");
        }
    }
}