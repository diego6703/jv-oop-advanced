package core.basesyntax;

public class RightTriangle extends FigureWithBottomAndHeigh {
    public RightTriangle(String color, double bottom, double heigh) {
        super(color, bottom, heigh);
        area = getArea();
    }

    @Override
    public double getArea() {
        return bottom * heigh / Constant.DIVISION_FOR_AREA;
    }

    @Override
    public void draw() {
        System.out.println("Figure: right triangle, area: " + area + " sq. units, bottom: "
                + bottom + " units, heigh: " + heigh + " color: " + color);
    }
}
