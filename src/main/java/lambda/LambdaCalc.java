package lambda;

public class LambdaCalc {
    public static void main(String[] args) {

        Operationable operationable = (x, y) -> x + y;
        int result = operationable.calculate(10, 20);
        System.out.println(result);

        Operationable operation2 = (int x, int y) -> x + y;
//      При написании самого лямбда-выражения тип параметров разрешается не указывать:
        Operationable operationable1 = (x, y) -> x + y;

    }

}

interface Operationable {
    int calculate(int x, int y);
}