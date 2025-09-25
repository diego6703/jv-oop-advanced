package core.basesyntax;

import java.util.Random;

public class FigureSupplier {
    private final Random rg = new Random();
    private final ColorSupplier cs = new ColorSupplier();

    public Figure getRandomFigure() {
        int randomNumber = rg.nextInt(Constant.NUMBER_OF_FIGURES);
        switch (randomNumber) {
            case 0: {
                return new Circle(cs.getRandomColor(), rg.nextDouble());
            }
            case 1: {
                return new Rectangle(cs.getRandomColor(), rg.nextDouble(), rg.nextDouble());
            }
            case 2: {
                return new RightTriangle(cs.getRandomColor(), rg.nextDouble(), rg.nextDouble());
            }
            case 3: {
                return new Square(cs.getRandomColor(), rg.nextDouble(), rg.nextDouble());
            }
            default: {
                return new IsoscelesTrapezoid(cs.getRandomColor(),rg.nextDouble(),
                        rg.nextDouble(), rg.nextDouble());
            }
        }
    }

    public Figure getDefaultFigure() {
        return new Circle(Colors.WHITE.name(), Constant.DEFAULT_CIRCLE_RADIUS);
    }
}
