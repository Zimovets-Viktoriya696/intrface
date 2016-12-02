/**
 * Created by Vika on 02.12.16.
 */
public class Maime {

        public static void main(String[] args) {
            Food banana = new Banana();
            Food fish = new Fish();

            Animal monkey = new Monkey();
            monkey.GetName();
            monkey.Feed(fish);

            Animal shark = new Shark();
            shark.GetName();
            shark.Feed(fish);
        }
    }


