import java.io.*;
import java.util.ArrayList;
import java.util.List;

/**
 * Created by Vika on 02.12.16.
 */
public class Maime {
public static void meth(){
    try {
        InputStream inStream = new FileInputStream("D://intrface//source.txt");
        OutputStream outStream = new FileOutputStream("D://intrface//result.txt");

        while (inStream.available() > 0)
        {
            int data = inStream.read(); //читаем один байт из потока для чтения
            outStream.write(data); //записываем прочитанный байт в другой поток.
        }
        inStream.close(); //закрываем потоки
        outStream.close();
    }
    catch (FileNotFoundException e){
        System.out.println("не найден файл");}
    catch (IOException e){
        System.out.println("не знаю");}



}
    public static void main(String[] args) {

        meth();
            Food banana = new Banana();
            Food fish = new Fish();

            Animal monkey = new Monkey("monkay");
            Animal shark = new Shark("shark");
            Animal cat = new Cat("cat");
            Animal lion = new Lion("leon");

            List<Animal> listOfAnimals = new ArrayList<Animal>();
            listOfAnimals.add(monkey);
            listOfAnimals.add(shark);
            listOfAnimals.add(cat);
            listOfAnimals.add(lion);

            for (int i = 0; i < listOfAnimals.size(); i++) {
                listOfAnimals.get(i).GetName();
                try {
                    IKick canKickThisAnimal = (IKick) listOfAnimals.get(i);
                    if (canKickThisAnimal != null) {
                        canKickThisAnimal.Kick();}
                    // System.out.println("интерфейс");}
                    else {
                        System.out.println("not");}
                }
                catch (ClassCastException e){
                    System.out.println("искючение");}

            }




        }
    }


