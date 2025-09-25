package core.basesyntax;

public class Square extends FigureWithBottomAndHeigh {

    public Square(String color, double bottom, double heigh) {
        super(color, bottom, heigh);
        area = getArea();
    }

    @Override
    public double getArea() {
        return bottom * bottom;
    }

    @Override
    public void draw() {
        System.out.println("Figure: square, area: " + area + " sq. units, bottom: " +
                bottom + " units, heigh: " + heigh + " color: " + color);
    }
}
