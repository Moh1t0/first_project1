package org.javaacademy.core.homework.homework2.office;

public class Secretary {

    public void solutionProblem(Boss boss,Manager manager,Security security){
        System.out.println(boss.getName() + " не волнуйтесь,"
                + manager.getName() + " всё успеет." + security.getName() + " - подождите!");
    }
}
//"{Имя босса} не волнуйтесь, {имя менеджера} все успеет. {имя охранника} - подождите!"