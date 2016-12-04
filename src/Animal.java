/**
 * Created by Vika on 21.11.16.
 */
public abstract class Animal {
    String name;
    Animal(String name){
    this.name = name;
    }
    abstract void GetName();
    abstract void Feed(Food food);
}

abstract class Food{

}

class Banana extends Food{}

class Fish extends Food{}

class Monkey extends Animal{


    Monkey(String name) {
        super(name);
    }

    void GetName() {
        System.out.println(name);
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

    Shark(String name) {
        super(name);
    }

    void GetName() {
        System.out.println(name);
    }


    void Feed(Food food) {
        if (food instanceof Fish){
            System.out.println("какая вкусная рыба");
        }
        else {
            System.out.println("Я не обязяна");}
    }
}

class Cat extends Animal implements ITame{


    Cat(String name) {
        super(name);
    }

    @Override
    void GetName() {
        System.out.println(name);
    }

    @Override
    void Feed(Food food) {
        if (food instanceof Fish){
            System.out.println("mrrrrrrr");
        }
    }


    @Override
    public void Tame() {
        System.out.println("приручил");
    }
}

class Lion extends Animal implements IKick{


    Lion(String name) {
        super(name);
    }

    @Override
    void GetName() {
        System.out.println(name);
    }

    @Override
    void Feed(Food food) {
        if (food instanceof Fish){
            System.out.println("It is good");
        }
    }

    @Override
    public void Kick() {
        System.out.println("ты не можешь меня приручить");
    }
}

interface IKick{
    void Kick();
}

interface ITame{
    void Tame();
}

