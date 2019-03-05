package pl.jbaranska.generics;

import java.math.BigDecimal;

public class ClassWithGenericMethod {
    private String maybeName;
    private Double maybeIncom;
    private BigDecimal hugeNumber;

    public ClassWithGenericMethod(String maybeName, Double maybeIncom, BigDecimal hugeNumber) {
        this.maybeName = validateType(maybeName);
        this.maybeIncom = validateType(maybeIncom);
        this.hugeNumber = validateType(hugeNumber);
    }
    private String validateString(String toCheck){
        if (toCheck ==null)
        {
            throw new  RuntimeException("Cannot be null");
        }
        return toCheck;
    }

    private Double validateDouble(Double toCheck){
        if (toCheck ==null)
    {
        throw new  RuntimeException("Cannot be null");
    }
        return toCheck;
    }
    private BigDecimal validateDouble(BigDecimal toCheck){
        if (toCheck ==null)
        {
            throw new  RuntimeException("Cannot be null");
        }
        return toCheck;
    }

    private<T> T validateType(T toCheck)
    {
        if (toCheck ==null)
        {
            throw new  RuntimeException("Cannot be null");
        }
        return toCheck;
    }
}
