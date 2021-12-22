package december.octobre;

import java.util.HashMap;
import java.util.Map;
import java.util.Objects;

public class EqualsAnHashCodeLearn {
    int a;
    int b;
    int c;

    public EqualsAnHashCodeLearn(int a, int b) {
        this.a = a;
        this.b = b;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        EqualsAnHashCodeLearn that = (EqualsAnHashCodeLearn) o;
        return this.a == that.a && this.b == that.b;
    }

    @Override
    public int hashCode() {
        return Objects.hash(a, b);
    }
}

class Test {
    public static void main(String[] args) {
        EqualsAnHashCodeLearn first = new EqualsAnHashCodeLearn(2, 2);
        EqualsAnHashCodeLearn second = new EqualsAnHashCodeLearn(1, 1);

        System.out.println(first.equals(second));

        Map<EqualsAnHashCodeLearn, String> map = new HashMap<>();

        map.put(first, "EPAM");
        map.put(second, "Luxot");


        System.out.println(map.get(first));
        System.out.println(map.get(second));
    }
}