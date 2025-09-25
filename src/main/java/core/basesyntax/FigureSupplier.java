package core.basesyntax;

import java.util.Random;

public class FigureSupplier {
    private final Random rg = new Random();
    private final ColorSupplier cs = new ColorSupplier();

    public Figure getRandomFigure() {
        int randomNumber = rg.nextInt(Constant.NUMBER_OF_FIGURES);
        String randomColor = cs.getRandomColor();
        double randomDouble = Constant.MIN_DIMENTION
                + rg.nextDouble(Constant.MAX_DIMENTION - Constant.MIN_DIMENTION);
        switch (randomNumber) {
            case 0: {
                return new Circle(randomColor, randomDouble);
            }
            case 1: {
                return new Rectangle(randomColor, randomDouble, randomDouble);
            }
            case 2: {
                return new RightTriangle(randomColor, randomDouble, randomDouble);
            }
            case 3: {
                return new Square(randomColor, randomDouble);
            }
            default: {
                return new IsoscelesTrapezoid(randomColor,randomDouble,
                        randomDouble, randomDouble);
            }
        }
    }

    public Figure getDefaultFigure() {
        return new Circle(Constant.DEFAULT_COLOR, Constant.DEFAULT_CIRCLE_RADIUS);
    }
}
