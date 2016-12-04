import java.util.ArrayList;
import java.util.List;

/**
 * Created by Vika on 02.12.16.
 */
public class Maime {

        public static void main(String[] args) {
            Food banana = new Banana();
            Food fish = new Fish();

            Animal monkey = new Monkey("monkay");
            Animal shark = new Shark("shark");
            Animal cat = new Cat("cat");
            Animal lion = new Lion("leon");

            List<Animal> listOfAnimals = new ArrayList<Animal>();
           // listOfAnimals.add(monkey);
          //  listOfAnimals.add(shark);
            listOfAnimals.add(cat);
            listOfAnimals.add(lion);

            for (int i = 0; i < listOfAnimals.size()-1; i++) {
                listOfAnimals.get(i).GetName();
                IKick canKickThisAnimal = (IKick) listOfAnimals.get(i);
                if (canKickThisAnimal != null) {canKickThisAnimal.Kick();}
                else {
                    System.out.println("not");}
            }




        }
    }


