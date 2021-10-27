import java.util.HashSet;
import java.util.Random;
import java.util.Set;

public class SetHere {
    public static void main(String[] args) {

        Set<Integer> set = new HashSet<>();
        Random random = new Random();
        for (int i = 0; i < 20; i++) {

            set.add(random.nextInt(200));
        }

        for (int text : set )
        {
            System.out.println(text);
        }
    }


}