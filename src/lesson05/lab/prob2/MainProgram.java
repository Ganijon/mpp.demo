package lesson05.lab.prob2;

import java.util.ArrayList;

public class MainProgram {

    static private ArrayList<Area> list;

    public static void main(String[] args) {

        list = new ArrayList<>();
        list.add(new Rectangle(10, 12));
        list.add(new Circle(12));
        list.add(new Triangle(10, 12));
        double sum = 0.0;
        for (int i = 0; i < list.size(); i++) {
            sum += list.get(i).computeArea();
        }
        System.out.println("Sum of all areas:" + sum);
    }

}
