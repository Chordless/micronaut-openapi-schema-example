package no.bjonnhy;

import java.math.BigDecimal;
import java.math.MathContext;

import static java.math.RoundingMode.HALF_UP;

public interface Unit {

    MathContext MATH_CONTEXT = new MathContext(16, HALF_UP);

    String name();

    BigDecimal ratio();

    String suffix();
}
