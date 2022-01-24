package games.phone;

public class Phone {
    public static void main(String[] args) {
        String numbers[][] = {
                {"Tom", "331-3452"},
                {"Mary", "049-4421"},
                {"Nikola", "954-1122"},
                {"Kite", "552-4452"}
        };
        int i;
        if (args.length != 1) {
            System.out.println("Предполагается использование Java Phone <имя>");
        } else {
            for (i = 0; i < numbers.length; i++) {
                if (numbers[i][0].equals(args[0])) {
                    System.out.println(numbers[i][0] + ": " +
                                        numbers[i][1]);
                    break;
                }
            }
            if (i == numbers.length) {
                System.out.println("Имя не найдено");
            }
        }
    }
}
