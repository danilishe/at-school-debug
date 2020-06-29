import java.util.*;

public class main {
    public static void main(String[] args) {
        System.out.println("Hello, World! ");
        System.out.println("Error");
        List<Integer> persons = new ArrayList<Integer>();
        for (int i = 0; i < 100; i++) {
            persons.add(getRandom());
            System.out.println(persons.add(getRandom()));
        }

        int billionare = 0;
        int defaults = 0;
        int regular = 0;
        for (Integer person : persons) {

            person += getRandom();
            if (person > 1_000_000_000 || person < 0) {
                billionare++;
            } else if (person > 0)
                regular++;
            else defaults++;
        }
        System.err.println("defaults = " + defaults);
        System.err.println("regular = :" + regular);
        System.err.println("billionare = " + billionare);
        System.err.println("regular + billionare+defaults = " + (regular + billionare + defaults));
        System.out.println("I feel power in my knowledge:)");
    }

    private static int getRandom() {
        return (int) (Math.random() * Integer.MAX_VALUE);
    }
}
