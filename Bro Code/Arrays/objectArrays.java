package Arrays;
public class objectArrays {
    public static void main(String[] args) {
        // int[] numbers = new int[3];
        // char[] characters = new char[4];
        // String[] strings = new String[5];
        // System.out.println(numbers + " " + characters.toString() + " " + strings)
        
        Food[] refrigirator = new Food[3];

        Food food1 = new Food("Chicken");
        Food food2 = new Food("Avo");
        Food food3 = new Food("Lettuce");

        refrigirator[0] = food1;
        refrigirator[1] = food2;
        refrigirator[2] = food3;

        System.out.println(refrigirator[0].name);
    }
}
