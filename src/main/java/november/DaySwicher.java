package november;

public class DaySwicher {
    public static void main(String[] args) {

        String day = "Wednesday";

        switch (day) {
            case "Monday":
                System.out.println("Today is windy !");
                break;
            case "Thursday":
                System.out.println("Today is sunny !");
                break;
            case "Wednesday":
                System.out.println("Today is rainy!");
                break;
            default:
                System.out.println("Oooops, something wrong !");
        }

    }
}
