package Classes;
public class Human2 {
    public static void main(String[] args) {
        Human1 human = new Human1("Nick", 65, 79);
        Human1 human2 = new Human1("Pete", 70, 80);

        System.out.println(human.name);
        System.out.println(human.age);
        System.out.println(human2.name);

        human.eat();
        human2.drink();
    }
}
