package com.ggit;

import java.util.Random;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    private static Random random=new Random();
    private static int MAP_SIZE = 100;


    static void main() {
Animal animal = new Animal(new Vector2D(random.nextInt(MAP_SIZE), random.nextInt(MAP_SIZE) ));
   System.out.println("animal created at position " + animal.getPosition());
    }
}
