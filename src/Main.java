//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {//TIP Press <shortcut actionId="ShowIntentionActions"/> with your caret at the highlighted text
        // to see how IntelliJ IDEA suggests fixing it.
        System.out.println("Задание 1");
        var dog = 8.0;
        var cat = 3.6;
        var paper = 763789;
        System.out.println("var" + " " + "dog" + " " + "=" + " " + dog);
        System.out.println("var" + " " + "cat" + " " + "=" + " " + cat);
        System.out.println("var" + " " + "paper" + " " + "=" + " " + paper);

        System.out.println("Задание 2");
        dog = dog + 4;
        cat = cat + 4;
        paper = paper + 4;
        System.out.println("var" + " " + "dog" + " " + "=" + " " + dog);
        System.out.println("var" + " " + "cat" + " " + "=" + " " + cat);
        System.out.println("var" + " " + "paper" + " " + "=" + " " + paper);

        System.out.println("Задание 3");
        dog = dog - 3.5;
        cat = cat - 1.6;
        paper = paper - 7639;
        System.out.println("var" + " " + "dog" + " " + "=" + " " + dog);
        System.out.println("var" + " " + "cat" + " " + "=" + " " + cat);
        System.out.println("var" + " " + "paper" + " " + "=" + " " + paper);

        System.out.println("Задание 4");
        var friend = 19;
        System.out.println("var" + " " + "friend" + " " + "=" + " " + friend);
        friend = friend + 2;
        System.out.println("var" + " " + "friend" + " " + "=" + " " + friend);
        friend = (friend + 2) / 7;
        System.out.println("var" + " " + "friend" + " " + "=" + " " + friend);

        System.out.println("Задание 5");
        var frog = 3.5;
        System.out.println("var" + " " + "frog" + " " + "=" + " " + frog);
        frog = 3.5 * 10;
        System.out.println("var" + " " + "frog" + " " + "=" + " " + frog);
        frog = frog / 3.5;
        System.out.println("var" + " " + "frog" + " " + "=" + " " + frog);
        frog = frog + 4;
        System.out.println("var" + " " + "frog" + " " + "=" + " " + frog);

        System.out.println("Задание 6");
        var weightBoxer1 = 78.2;
        System.out.println("var" + " " + "weightBoxer1" + " " + "=" + " " + weightBoxer1);
        var weightBoxer2 = 82.7;
        System.out.println("var" + " " + "weightBoxer2" + " " + "=" + " " + weightBoxer2);
        var totalWeight = weightBoxer1 + weightBoxer2;
        System.out.println("var" + " " + "totalWeight" + " " + "=" + " " + totalWeight);
        var weightDifference = weightBoxer2 - weightBoxer1;
        System.out.println("var" + " " + "weightDifference" + " " + "=" + " " + weightDifference);

        System.out.println("Задание 7");
        System.out.println("var" + " " + "weightBoxer1" + " " + "=" + " " + weightBoxer1);
        System.out.println("var" + " " + "weightBoxer2" + " " + "=" + " " + weightBoxer2);
        var remainder = weightBoxer2 % weightBoxer1;
        System.out.println("var" + " " + "remainder" + " " + "=" + " " + remainder);

        System.out.println("Задание 8");
        var totalHours = 640;
        System.out.println("Всего часов работы" + " " + "=" + " " + totalHours);
        var workerHours = 8;
        System.out.println("1 работник" + " " + "=" + " " + workerHours + " " + "часов");
        var totalWorker = totalHours / workerHours;
        System.out.println("Всего работников в компании — " + " " + totalWorker + " " + "человек.");
        totalWorker = totalWorker + 94;
        var officeHours = totalHours / totalWorker;
        System.out.println("Если в компании работает" + " " + totalWorker + " " + "человека," + " " + "то всего" + " " + officeHours + " " + "часа работы может быть поделено между сотрудниками.");
    }
}