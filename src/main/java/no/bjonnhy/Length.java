package no.bjonnhy;

import java.math.BigDecimal;

public class Length extends Quantity<Length, LengthUnit> {

    private Length(BigDecimal amount, LengthUnit unit) {
        super(amount, unit);
    }

    public static Length of(BigDecimal amount, LengthUnit unit) {
        return new Length(amount, unit);
    }
}
