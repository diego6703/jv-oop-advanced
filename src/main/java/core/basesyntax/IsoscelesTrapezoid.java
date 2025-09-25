package core.basesyntax;

public class IsoscelesTrapezoid extends FigureWithBottomAndHeigh {
    private double top;

    public IsoscelesTrapezoid(String color, double bottom, double heigh, double top) {
        super(color, bottom, heigh);
        this.top = top;
        area = getArea();
    }

    @Override
    public double getArea() {
        return (bottom + top) * heigh / Constant.DIVISION_FOR_AREA;
    }

    @Override
    public void draw() {
        System.out.println("Figure: isosceles trapezoid, area: " + area + " sq. units, bottom: "
                + bottom + " units, heigh: " + heigh + " top: " + top + " color: " + color);
    }
}
