package no.bjonnhy;

import java.io.Serializable;
import java.math.BigDecimal;

public class Quantity<Q extends Quantity, U extends Unit> implements Serializable {

    private static final long serialVersionUID = -9000608810227353935L;

    private final BigDecimal amount;
    private final U unit;

    Quantity(BigDecimal amount, U unit) {
        this.amount = amount;
        this.unit = unit;
    }

    public BigDecimal getAmount() {
        return amount;
    }

    public U getUnit() {
        return unit;
    }

    public void setUnit(U unit) {
        throw new UnsupportedOperationException("Quantities can't change");
    }

    public void setAmount(BigDecimal amount) {
        throw new UnsupportedOperationException("Quantities can't change");
    }
}
