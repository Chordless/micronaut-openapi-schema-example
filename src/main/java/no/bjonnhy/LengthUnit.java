package no.bjonnhy;

import java.math.BigDecimal;

public enum LengthUnit implements Unit {
    Millimeter(BigDecimal.ONE, "mm"),
    Centimeter(BigDecimal.TEN, Millimeter, "cm"),
    Decimeter(BigDecimal.TEN, Centimeter, "dm"),
    Meter(BigDecimal.TEN, Decimeter, "m"),
    Kilometer(BigDecimal.valueOf(1000), Meter, "km");

    private final BigDecimal ratio;
    private final String suffix;

    LengthUnit(BigDecimal ratio, String suffix) {
        this.ratio = ratio;
        this.suffix = suffix;
    }

    LengthUnit(BigDecimal factor, LengthUnit base, String suffix) {
        this.ratio = factor.multiply(base.ratio);
        this.suffix = suffix;
    }

    @Override public BigDecimal ratio() {
        return ratio;
    }

    @Override public String suffix() {
        return suffix;
    }
}

