package core.basesyntax;

public abstract class FigureWithBottomAndHeight extends Figure {
    protected double bottom;
    protected double height;

    public FigureWithBottomAndHeight(String color, double bottom, double height) {
        super(color);
        this.bottom = bottom;
        this.height = height;
    }

}
