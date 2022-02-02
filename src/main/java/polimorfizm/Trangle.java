package polimorfizm;

public class Trangle extends TwoDShape {
    private String style;

    public Trangle() {
        super();
        this.style = "none";
    }

    public Trangle(String style, double widht, String name) {
        super();
        this.style = style;
    }

    public Trangle(TwoDShape obj, String style) {
        super(obj);
        this.style = style;
    }
}
