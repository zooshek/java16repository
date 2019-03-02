package pl.jbaranska.null_handeling;

import java.util.Optional;

public class Computer {
    private GraphicsCard graphicsCard;

    @Override
    public String toString() {
        return "Computer{" +
                "graphicsCard=" + graphicsCard +
                '}';
    }

    public Computer(GraphicsCard graphicsCard) {
        this.graphicsCard = graphicsCard;
    }

    public Optional<GraphicsCard> getGraphicsCard()
    {
        return Optional.ofNullable(graphicsCard);
    }
}
