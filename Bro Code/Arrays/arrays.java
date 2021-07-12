package Arrays;
import java.util.ArrayList;

public class arrays {
    public static void main(String[] args) {
        ArrayList<String> food = new ArrayList<String>();

        food.add("chicken");
        System.out.println(food);
        food.add("hamburger");
        System.out.println(food);
        food.add("hotdog");
        System.out.println(food);
        food.set(0, "sushi");
        System.out.println(food);
        food.remove(2);
        System.out.println(food);
        food.clear();
        System.out.println(food);

    }
}
