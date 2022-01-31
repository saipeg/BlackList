package polimorfizm;


import lombok.Getter;
import lombok.Setter;

public class TwoDShape {
    @Getter
    @Setter
    private double width;
    @Getter
    @Setter
    private double height;
    @Getter
    private String name;


    public TwoDShape() {
        width = height = 0.0;
        name = "none";
    }

    public TwoDShape(double width, double height, String name) {
        this.width = width;
        this.height = height;
        this.name = name;
    }

    public TwoDShape(TwoDShape obj) {
        width = obj.width;
        height = obj.height;
        name = obj.name;
    }

    void showDim() {
        System.out.println("Ширина и высота - " + width + " и " + height);
    }

    double area() {
        System.out.println("Метод area() должен быть переопределен");
        return 0.0;
    }

}
