package org.javaacademy.core.homework.homework2.office;

public class Runner {
    public static void main(String[] args) {
        Boss boss = new Boss("Пётр Николаевич");
        Manager manager = new Manager("Володя");
        Security security = new Security("Петрович");
        Secretary secretary = new Secretary();
        Office office = new Office();

        office.wokrDay(boss,manager,security,secretary);
    }
}
