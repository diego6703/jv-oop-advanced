package core.basesyntax;

import java.util.Random;

public class ColorSupplier {
    private final Random rg = new Random();
    private static final Colors[] colors = Colors.values();

    public String getRandomColor() {
        return colors[rg.nextInt(Constant.NUMBER_OF_COLORS)].name();
    }
}
