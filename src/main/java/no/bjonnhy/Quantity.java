package no.bjonnhy;

import java.math.BigDecimal;

public class Quantity<Q extends Quantity, U extends Unit> {

    private final BigDecimal amount;
    private final U unit;

    Quantity(BigDecimal amount, U unit) {
        this.amount = amount;
        this.unit = unit;
    }
}
