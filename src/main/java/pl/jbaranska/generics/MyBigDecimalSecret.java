package pl.jbaranska.generics;

import java.math.BigDecimal;

public class MyBigDecimalSecret {
    private BigDecimal mySecret;

    @Override
    public String toString() {
        return "MyBigDecimalSecret{" +
                "mySecret=" + mySecret +
                '}';
    }

    public BigDecimal getMySecret() {
        return mySecret;
    }

    public MyBigDecimalSecret(BigDecimal mySecret) {
        this.mySecret = mySecret;
    }
}
