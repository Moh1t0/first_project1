package org.javaacademy.core.homework.homework2.office;

public class Office {

    public void wokrDay(Boss boss, Manager manager, Security security, Secretary secretary){
        boss.callManager(manager);
        manager.scream();
        security.askMoney();
        secretary.solutionProblem(boss,manager,security);
    }
}
