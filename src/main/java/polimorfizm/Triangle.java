package polimorfizm;

public class Triangle extends TwoDShape {
    private String style;

    public Triangle() {
        super();
        this.style = "none";
    }

    public Triangle(String style, double width, double height) {
        super(width, height, "Треугольник");
        this.style = style;
    }

    public Triangle(Triangle obj) {
        super(obj);
        this.style = obj.style;
    }

    @Override
    double area() {
        return getWidth() * getHeight() / 2;
    }

    void showStyle() {
        System.out.println("Треугольник " + style);
    }

}
