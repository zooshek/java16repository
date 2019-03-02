package pl.jbaranska.null_handeling;

import javax.crypto.Cipher;
import java.util.Optional;

public class GraphicsCard {
    private Chipset chipset;

    public GraphicsCard(Chipset chipset) {
        this.chipset = chipset;
    }


    public Optional<Chipset> getChipset()
    {
        return Optional.ofNullable(chipset);
    }

    @Override
    public String toString() {
        return "GraphicsCard{" +
                "chipset=" + chipset +
                '}';
    }
}
