package core.basesyntax;

public abstract class FigureWithBottomAndHeigh extends Figure{
    protected double bottom;
    protected double heigh;

    public FigureWithBottomAndHeigh(String color, double bottom, double heigh) {
        super(color);
        this.bottom = bottom;
        this.heigh = heigh;
    }

}
