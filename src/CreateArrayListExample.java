import java.util.ArrayList;
import java.util.List;

public class CreateArrayListExample {

    public static void main(String[] args) {

        List<String> animals = new ArrayList<>();


        animals.add("Lion");
        animals.add("Tiger");
        animals.add("Cat");
        animals.add("Dog");

        System.out.println(animals);


        animals.add(2, "Elephant");
        System.out.println(animals);
    }
}

