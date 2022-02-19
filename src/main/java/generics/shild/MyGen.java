package generics.shild;

public class MyGen<T, V> {
    T ob1;
    V ob2;

    public MyGen(T ob1, V ob2) {
        this.ob1 = ob1;
        this.ob2 = ob2;
    }

    void showTypes() {
        System.out.println("Type T is: " + ob1.getClass().getName());
        System.out.println("Type V is: " + ob1.getClass().getName());
    }

    T getOb1() {
        return ob1;
    }

    V getOb2() {
        return ob2;
    }

    public static void main(String[] args) {
        MyGen<String, Integer> myGen = new MyGen<>("The first arg in my Generic", 12);

        myGen.showTypes();

        String valueStrFromMyGen = myGen.getOb1();
        System.out.println("valueStrFromMyGen = " + valueStrFromMyGen);

        int valueIntFromMyGen = myGen.getOb2();
        System.out.println("valueIntFromMyGen = " + valueIntFromMyGen);

    }

}
