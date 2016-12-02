/**
 * Created by Vika on 21.11.16.
 */
public abstract class Animal {

    abstract void GetName();
    abstract void Feed(Food food);
}

abstract class Food{

}

class Banana extends Food{}

class Fish extends Food{}

class Monkey extends Animal{


    void GetName() {
        System.out.println(Monkey.class);
    }


    void Feed(Food food) {
        if (food instanceof Banana){
            System.out.println("ням-ням");
        }
        else {
            System.out.println("я не змей");}
    }
}

class Shark extends   Animal{

    @Override
    void GetName() {
        System.out.println(Shark.class);
    }

    @Override
    void Feed(Food food) {
        if (food instanceof Fish){
            System.out.println("какая вкусная рыба");
        }
        else {
            System.out.println("Я не обязяна");}
    }
}


interface domestication{

    void go();
    void sleep();

}

