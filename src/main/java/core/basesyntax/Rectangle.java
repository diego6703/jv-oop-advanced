package core.basesyntax;

public class Rectangle  extends FigureWithBottomAndHeigh {

    public Rectangle(String color, double bottom, double heigh ) {
        super(color, bottom ,heigh);
        area = getArea();
    }

    @Override
    public double getArea() {
        return bottom * heigh;
    }

    @Override
    public void draw() {
        System.out.println("Figure: rectangle, area: " + area + " sq. units, bottom: " + bottom + " units, heigh: " + heigh + " color: " + color);
    }
}
